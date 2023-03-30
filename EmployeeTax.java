package com.cognizant.tax;

public class EmployeeTax {
	public static void main(String[] args) {
        Taxcalculator calculator1 = new Taxcalculator(25000, true);
        calculator1.calculateTax();
        calculator1.deductTax();
        calculator1.validateSalary();

        Taxcalculator calculator2 = new Taxcalculator(125000, true);
        calculator2.calculateTax();
        calculator2.deductTax();
        calculator2.validateSalary();
    }
}

