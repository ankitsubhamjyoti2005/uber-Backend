package com.uber.app.services.impli;

import com.uber.app.dto.SignUpDTO;
import com.uber.app.dto.UserDTO;
import com.uber.app.dto.driverDTO;
import com.uber.app.services.AuthServices;

public class AuthServiceImpli implements AuthServices {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signUp(SignUpDTO signUpDTO) {
        return null;
    }

    @Override
    public driverDTO onboardNewDriver(String userId) {
        return null;
    }
}
