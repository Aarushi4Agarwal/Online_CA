package com.example.demo;
// IncomeTaxData.java
import javax.validation.constraints.*;

public class IncomeTaxData {
    @NotNull @Positive
    private Double grossSalary;

    @NotNull @PositiveOrZero
    private Double otherIncome;

    @PositiveOrZero
    private Double medicalInsurancePremium;

    @PositiveOrZero
    private Double expenditureDisabledDependent;

    @PositiveOrZero
    private Double expenditureSpecifiedDiseases;

    @PositiveOrZero
    private Double section80C;

    @PositiveOrZero
    private Double section80CCC;

    @PositiveOrZero
    private Double section80CCD1B;

    @PositiveOrZero
    private Double charitableDonations;

    @PositiveOrZero
    private Double scientificResearchDonations;

    @PositiveOrZero
    private Double politicalPartyDonations;

    @PositiveOrZero
    private Double interestEducationLoan;

    @PositiveOrZero
    private Double interestHouseLoan;

    @PositiveOrZero
    private Double interestElectricVehicle;

    @PositiveOrZero
    private Double interestSavingsAccount;

    @PositiveOrZero
    private Double interestSeniorCitizens;

    // Getters and Setters
    public Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(Double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public Double getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(Double otherIncome) {
        this.otherIncome = otherIncome;
    }

    public Double getMedicalInsurancePremium() {
        return medicalInsurancePremium;
    }

    public void setMedicalInsurancePremium(Double medicalInsurancePremium) {
        this.medicalInsurancePremium = medicalInsurancePremium;
    }

    public Double getExpenditureDisabledDependent() {
        return expenditureDisabledDependent;
    }

    public void setExpenditureDisabledDependent(Double expenditureDisabledDependent) {
        this.expenditureDisabledDependent = expenditureDisabledDependent;
    }

    public Double getExpenditureSpecifiedDiseases() {
        return expenditureSpecifiedDiseases;
    }

    public void setExpenditureSpecifiedDiseases(Double expenditureSpecifiedDiseases) {
        this.expenditureSpecifiedDiseases = expenditureSpecifiedDiseases;
    }

    public Double getSection80C() {
        return section80C;
    }

    public void setSection80C(Double section80C) {
        this.section80C = section80C;
    }

    public Double getSection80CCC() {
        return section80CCC;
    }

    public void setSection80CCC(Double section80CCC) {
        this.section80CCC = section80CCC;
    }

    public Double getSection80CCD1B() {
        return section80CCD1B;
    }

    public void setSection80CCD1B(Double section80CCD1B) {
        this.section80CCD1B = section80CCD1B;
    }

    public Double getCharitableDonations() {
        return charitableDonations;
    }

    public void setCharitableDonations(Double charitableDonations) {
        this.charitableDonations = charitableDonations;
    }

    public Double getScientificResearchDonations() {
        return scientificResearchDonations;
    }

    public void setScientificResearchDonations(Double scientificResearchDonations) {
        this.scientificResearchDonations = scientificResearchDonations;
    }

    public Double getPoliticalPartyDonations() {
        return politicalPartyDonations;
    }

    public void setPoliticalPartyDonations(Double politicalPartyDonations) {
        this.politicalPartyDonations = politicalPartyDonations;
    }

    public Double getInterestEducationLoan() {
        return interestEducationLoan;
    }

    public void setInterestEducationLoan(Double interestEducationLoan) {
        this.interestEducationLoan = interestEducationLoan;
    }

    public Double getInterestHouseLoan() {
        return interestHouseLoan;
    }

    public void setInterestHouseLoan(Double interestHouseLoan) {
        this.interestHouseLoan = interestHouseLoan;
    }

    public Double getInterestElectricVehicle() {
        return interestElectricVehicle;
    }

    public void setInterestElectricVehicle(Double interestElectricVehicle) {
        this.interestElectricVehicle = interestElectricVehicle;
    }

    public Double getInterestSavingsAccount() {
        return interestSavingsAccount;
    }

    public void setInterestSavingsAccount(Double interestSavingsAccount) {
        this.interestSavingsAccount = interestSavingsAccount;
    }

    public Double getInterestSeniorCitizens() {
        return interestSeniorCitizens;
    }

    public void setInterestSeniorCitizens(Double interestSeniorCitizens) {
        this.interestSeniorCitizens = interestSeniorCitizens;
    }
}
