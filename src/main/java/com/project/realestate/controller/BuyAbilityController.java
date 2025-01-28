package com.project.realestate.controller;

import com.project.realestate.dto.buyability.BuyAbilityReq;
import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.service.BuyAbilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/buy-ability")
public class BuyAbilityController {
    @Autowired
    private BuyAbilityService buyAbilityService;
    @PostMapping
    public ResponseEntity<?> calculate(@RequestBody BuyAbilityReq bodyReq) {
        GenericResponse resp = buyAbilityService.calculate(bodyReq);
        //System.out.println(buyAbility);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

}
