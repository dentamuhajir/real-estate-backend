package com.project.realestate.controller;


import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.dto.user.RegisterReq;
import com.project.realestate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "register")
    public ResponseEntity<?> register(@ModelAttribute RegisterReq bodyReq, @RequestParam("idCard")MultipartFile file) {
        //GenericResponse resp = userService.register(bodyReq);

        System.out.println("Username: " + bodyReq.getFullName());
        System.out.println("Email: " + bodyReq.getEmail());
        System.out.println("Password: " + bodyReq.getPassword());

        // Print file details
        if (!file.isEmpty()) {
            System.out.println("File Name: " + file.getOriginalFilename());
            System.out.println("File Size: " + file.getSize());
            System.out.println("File Type: " + file.getContentType());
        } else {
            System.out.println("No file uploaded.");
        }


        return new ResponseEntity<>("resp", HttpStatus.OK);
    }

}
