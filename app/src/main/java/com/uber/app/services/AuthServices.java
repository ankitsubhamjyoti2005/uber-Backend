package com.uber.app.services;

import com.uber.app.dto.SignUpDTO;
import com.uber.app.dto.UserDTO;
import com.uber.app.dto.driverDTO;
import org.springframework.stereotype.Service;

@Service
public interface AuthServices {

    String login(String email,String password);
    UserDTO signUp(SignUpDTO signUpDTO);

    driverDTO onboardNewDriver(String userId);
}
