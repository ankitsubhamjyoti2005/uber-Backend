package com.uber.app.services.impli;

import com.uber.app.dto.SignUpDTO;
import com.uber.app.dto.UserDTO;
import com.uber.app.dto.driverDTO;
import com.uber.app.entities.Users;
import com.uber.app.entities.enums.Roles;
import com.uber.app.exception.RuntimeConflictException;
import com.uber.app.repositories.UserRepository;
import com.uber.app.services.AuthServices;
import com.uber.app.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpli implements AuthServices {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final RiderService riderService;


    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signUp(SignUpDTO signUpDTO) {
        Users users = userRepository.findByEmail(signUpDTO.getEmail()).orElseThrow(null);
        if(users!=null){
            new RuntimeConflictException("user cannot be signup,User is already exist with email");
        }

        Users mappedusers = modelMapper.map(signUpDTO,Users.class);
        mappedusers.setRoles(Set.of(Roles.RIDER));
        Users savedUser = userRepository.save(mappedusers);

        //create user related entities
        riderService.createNewRider(savedUser);

        //TODO add wallet relate services

        return modelMapper.map(savedUser,UserDTO.class);
    }

    @Override
    public driverDTO onboardNewDriver(String userId) {
        return null;
    }
}
