package com.project.realestate.controller;

import com.project.realestate.dto.buyability.BuyAbilityReq;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/buy-ability")
public class BuyAbilityController {
    @PostMapping
    public ResponseEntity<?> calculate(@RequestBody BuyAbilityReq buyAbility) {
        System.out.println(buyAbility);
        return new ResponseEntity<>("passed", HttpStatus.OK);
    }

}
