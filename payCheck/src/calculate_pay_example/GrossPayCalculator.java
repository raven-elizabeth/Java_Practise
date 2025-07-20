// Declare package that this file is within
package calculate_pay_example;

import java.util.Objects;
import java.util.Scanner;

public class GrossPayCalculator {

    // This is the main method (starting point)
    public static void main(String[] args){
        // 1. Get employee hours worked
        System.out.println("How many hours did you work?");

        // Utility class to read user input
        Scanner scanner = new Scanner(System.in);
        float hoursWorked = scanner.nextInt();


        // 2. Get hourly pay rate: double is a datatype that can handle decimals
        System.out.println("What is your pay rate?");
        double payRate = scanner.nextDouble();

        // 3. Multiply hours worked by pay rate
        double grossPay = hoursWorked * payRate;

        // Adding pension...
        System.out.println("Do you contribute to your pension in your paycheck? (yes/no)");
        String paysPension = scanner.next();

        if (Objects.equals(paysPension, "yes")){
            System.out.println("What percentage of your pay do you contribute?");
            double pensionContribution = scanner.nextDouble();
            grossPay = grossPay * ((100 - pensionContribution)/100);
        }
        else if (Objects.equals(paysPension, "no")) {
            System.out.println("It is probably a good idea to opt in to pension contributions.");
        }
        else {
            System.out.println("Invalid response. Moving on...");
        }

        // Close scanner as nothing else needs to be read
        scanner.close();

        // 4. Display result
        System.out.println("Gross pay = " + grossPay);
    }
}

// Tax?