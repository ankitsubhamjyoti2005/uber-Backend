package com.uber.app.controllers;


import com.uber.app.dto.SignUpDTO;
import com.uber.app.dto.UserDTO;
import com.uber.app.services.AuthServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthServices authService;

    @PostMapping("/signup")
    UserDTO signUp(@RequestBody SignUpDTO signupDto) {
        return authService.signUp(signupDto);
    }

}
