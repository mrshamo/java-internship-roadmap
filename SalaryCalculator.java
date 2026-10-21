import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter your Basic Salary: ");
        double basicSalary = input.nextDouble();

        System.out.print(" Enter Bonous percentage: ");
        double bonusPercentage = input.nextDouble();

        System.out.print(" Enter Tax percentage: ");
        double taxPercentage = input.nextDouble();

        double bonus = basicSalary * (bonusPercentage / 100);

        double tax = basicSalary * (taxPercentage / 100);
        double netSalary = basicSalary + bonus - tax;

        System.out.println(" Your Net Salary is: " + netSalary);
        System.out.println(" Your Bonus is: " + bonus);
        System.out.println(" Your Tax is: " + tax); 

    }
}
