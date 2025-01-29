package com.project.realestate.controller;


import com.project.realestate.dto.buyability.BuyAbilityReq;
import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.dto.user.RegisterReq;
import com.project.realestate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "register")
    public ResponseEntity<?> register(@RequestBody RegisterReq bodyReq) {
        return new ResponseEntity<>("", HttpStatus.OK);
    }

}
