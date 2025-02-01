package com.project.realestate.service.impl;

import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.dto.user.RegisterReq;
import com.project.realestate.model.User;
import com.project.realestate.repository.UserRepository;
import com.project.realestate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public GenericResponse register(RegisterReq req) {
        User checkEmailAlreadyExists = userRepository.findByEmail(req.getEmail());

        if(checkEmailAlreadyExists != null) {
            return GenericResponse.builder()
                    .code(HttpStatus.CONFLICT.value()) // 409
                    .status("Error")
                    .message("Email already registered")
                    .build();
        }

        if(!req.getPassword().equals(req.getConfirmPassword())) {
            return GenericResponse.builder()
                    .code(HttpStatus.UNAUTHORIZED.value()) // 401
                    .status("Error")
                    .message("Password does not match")
                    .build();
        }
        // Create Password Validation Helper / utils
        User user = new User();
        user.setFullName(req.getFullName());
        user.setEmail(req.getEmail());
        user.setAddress(req.getAddress());
        user.setPassword(req.getPassword());
        userRepository.save(user);

        return GenericResponse.builder()
                .code(200)
                .status("Success")
                .message("Data register saved successfully")
                .build();
    }
}
