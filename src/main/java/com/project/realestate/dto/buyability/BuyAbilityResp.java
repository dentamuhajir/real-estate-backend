package com.project.realestate.dto.buyability;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BuyAbilityResp {
    private double loanAmount;
    private double monthlyEMI;
    private double affordableEMI;
    private boolean isAffordable;
}
