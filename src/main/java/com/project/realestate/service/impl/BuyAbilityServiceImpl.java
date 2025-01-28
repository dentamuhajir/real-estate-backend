package com.project.realestate.service.impl;

import com.project.realestate.dto.buyability.BuyAbilityReq;
import com.project.realestate.dto.buyability.BuyAbilityResp;
import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.service.BuyAbilityService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

@Service
public class BuyAbilityServiceImpl implements BuyAbilityService {
    public static final DecimalFormat df = new DecimalFormat( "#.00" );
    @Override
    public GenericResponse calculate(BuyAbilityReq req) {
        Double propertyPrice = req.getPropertyPrice();
        Double downPayment = req.getDownPayment();
        Double loanAmount = propertyPrice - downPayment;
        Float monthlyInterestRate =  req.getAnnualInterestRate().floatValue() / (12 * 100) ;
        int totalLoanMonth = req.getLoanTenure() * 12;
        // EMI formula
        double monthlyEMI = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalLoanMonth)) / (Math.pow(1 + monthlyInterestRate, totalLoanMonth) - 1);
        // Affordable EMI
        double affordableEMI = req.getMonthlyIncome() * 0.4;

        // Check affordability
        boolean isAffordable = monthlyEMI <= affordableEMI;

        BuyAbilityResp resp = BuyAbilityResp.builder()
                .loanAmount(loanAmount)
                .monthlyEMI(monthlyEMI)
                .affordableEMI(affordableEMI)
                .isAffordable(isAffordable)
                .build();

        return GenericResponse.builder()
                .status("success")
                .code(200)
                .data(resp)
                .build();
    }
}
