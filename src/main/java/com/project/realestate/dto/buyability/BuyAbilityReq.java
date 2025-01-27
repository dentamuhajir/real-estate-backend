package com.project.realestate.dto.buyability;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class BuyAbilityReq {
    private BigDecimal propertyPrice;
    private BigDecimal downPayment;
    private BigDecimal monthlyIncome;
    private Integer loanTenure;
    private Integer annualInterestRate;
}
