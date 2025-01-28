package com.project.realestate.service;

import com.project.realestate.dto.buyability.BuyAbilityReq;
import com.project.realestate.dto.response.GenericResponse;

public interface BuyAbilityService {
    public void calculate(BuyAbilityReq request);
}
