package com.project.realestate.dto.buyability;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BuyAbilityReq {
    private Double propertyPrice;
    private Double downPayment;
    private Double monthlyIncome;
    private Integer loanTenure;
    private Integer annualInterestRate;
}
