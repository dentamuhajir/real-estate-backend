package com.project.realestate.service.impl;

import com.project.realestate.dto.buyability.BuyAbilityReq;
import com.project.realestate.dto.response.GenericResponse;
import com.project.realestate.service.BuyAbilityService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;

@Service
public class BuyAbilityServiceImpl implements BuyAbilityService {
    public static final DecimalFormat df = new DecimalFormat( "#.00" );
    @Override
    public void calculate(BuyAbilityReq r) {
        Double propertyPrice = r.getPropertyPrice();
        Double downPayment = r.getDownPayment();
        //BigDecimal loanAmount = propertyPrice.subtract(downPayment);
        Double loanAmount = propertyPrice - downPayment;
        Float monthlyInterestRate =  r.getAnnualInterestRate().floatValue() / (12 * 100) ;
        int totalLoanMonth = r.getLoanTenure() * 12;
        // EMI formula
        double monthlyEMI = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalLoanMonth)) / (Math.pow(1 + monthlyInterestRate, totalLoanMonth) - 1);

        // Affordable EMI
        double affordableEMI = r.getMonthlyIncome() * 0.4;

        // Check affordability
        boolean isAffordable = monthlyEMI <= affordableEMI;


        System.out.println("Loan Amount " + df.format(loanAmount));
        System.out.println(" Get Annual Interest Rate" + r.getAnnualInterestRate());
        System.out.println("Monthly Interest Rate " + monthlyInterestRate );
        System.out.println("Monthly EMI" + monthlyEMI);
        System.out.println("Affordable EMI %f" + df.format(affordableEMI));
        System.out.println("is Affordable" + isAffordable);
        //System.out.println("console log from service" + buyAbility);
    }
}
