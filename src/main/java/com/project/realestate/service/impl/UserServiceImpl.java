package com.project.realestate.service.impl;

import com.project.realestate.dto.user.RegisterReq;
import com.project.realestate.model.User;
import com.project.realestate.repository.UserRepository;
import com.project.realestate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void register(RegisterReq req) {
        User checkEmailAlreadyExists = userRepository.findByEmail(req.getEmail());

        System.out.println(checkEmailAlreadyExists);





    }
}
