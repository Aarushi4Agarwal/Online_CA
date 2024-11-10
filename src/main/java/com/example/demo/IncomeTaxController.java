package com.example.demo;
// IncomeTaxController.java
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/api/income-tax")
@Validated
public class IncomeTaxController {

    @PostMapping("/calculate")
    public ResponseEntity<Map<String, Double>> calculateTax(@Valid @RequestBody IncomeTaxData data) {
        double totalIncome = data.getGrossSalary() + data.getOtherIncome();
        
        double totalDeductions = Math.min(data.getSection80C(), 150000) + Math.min(data.getSection80CCD1B(), 50000) +
                data.getSection80CCC() + data.getMedicalInsurancePremium() + data.getExpenditureDisabledDependent() +
                data.getExpenditureSpecifiedDiseases() + (data.getCharitableDonations() * 0.5) +
                (data.getScientificResearchDonations() * 0.5) + data.getPoliticalPartyDonations() +
                data.getInterestEducationLoan() + data.getInterestHouseLoan() +
                data.getInterestElectricVehicle() + data.getInterestSavingsAccount() + data.getInterestSeniorCitizens();

        double netTaxableIncome = totalIncome - totalDeductions;

        double tax = 0;
        if (netTaxableIncome > 250000) {
            if (netTaxableIncome <= 500000) {
                tax = (netTaxableIncome - 250000) * 0.05;
            } else if (netTaxableIncome <= 1000000) {
                tax = (250000 * 0.05) + (netTaxableIncome - 500000) * 0.2;
            } else {
                tax = (250000 * 0.05) + (500000 * 0.2) + (netTaxableIncome - 1000000) * 0.3;
            }
            if (netTaxableIncome <= 500000) {
                tax = Math.max(0, tax - 12500);
            }
            tax += tax * 0.04;
        }

        Map<String, Double> response = Map.of(
            "Net Taxable Income", netTaxableIncome,
            "Tax Before Cess", tax - (tax * 0.04),
            "Health and Education Cess", tax * 0.04,
            "Total Tax Payable", tax
        );

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
