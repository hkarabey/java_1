package day08İf;

public class SalaryCalculator {
    public static void main(String[] args) {


    /*
    salary before tax
    state tax
    federal tax
    total tax
    salary after taz

hourly rate
weekly hours
state tax rate
federal tax rate

     */
int hourlyRate=50;
int weeklyRate=45;
double stateTaxRate=6.5,
    federalTaxRate=26.2;

//calculate salary before tax
    int salaryBeforeTax=hourlyRate*weeklyRate*52;
    double stateTax=salaryBeforeTax*stateTaxRate/100;
        System.out.println("Gross pay is = " + salaryBeforeTax);
        System.out.println("stateTax = " + stateTax);

        double federalTax=salaryBeforeTax*federalTaxRate/100;
        System.out.println("federalTax = " + federalTax);
        double totalTax=stateTax+federalTax;
        System.out.println("totalTax = " + totalTax);
        double salaryAfterTax=salaryBeforeTax-totalTax;
        System.out.println("net İncome = " + salaryAfterTax);

        }

    }

