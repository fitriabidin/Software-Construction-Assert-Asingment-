package assertassignment;

import java.util.Scanner;
public class ComputeLoan {

	public static void main(String[] args) {
		
		
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// ask user for annual interest rate
		System.out.print("Enter the annual interest rate. eg., 7.25 ( Must be a number & positive number ) : ");
		
		// Check the input by using assert and then get the interest rate.
		// The input must be a double data type and positive number.
		
		assert input.hasNextDouble()  : "The Annual Interest must be a number";
		double annualInterestRate = input.nextDouble();
        assert annualInterestRate > 0 : "The Annual Interest must be a positive number";
		
		// calculate the monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// ask user for the amount of years
		System.out.print("Enter the number of years as an integer, e.g., 5 ( Must be a number & positive number ) : ");
		
		// get the number and apply assert
		assert input.hasNextDouble()  : "Number of year must be a number";
		int numberOfYears = input.nextInt();
		assert numberOfYears > 0 : "Number of year must be a positive number";
		assert numberOfYears < 30 : "Number of year is above maximum. Must less than 30";
		 
		// ask the user for the loan amount
		System.out.print("Enter the loan amount, e.g., 120000 ( applied Loan must be a number and  above Rm2000 ) : ");
		
		// get the number
		assert input.hasNextDouble()  : "Amount of loan must be a number";
		double loanAmount = input.nextDouble();
		assert loanAmount > 2000 : "Loan must be above 2000";
		// calculate monthly payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		
		// calculate total payment
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		// print out the monthly payment
		System.out.println("The monthly payment is RM " + (int)(monthlyPayment * 100 / 100.0));
		
		// print out total payment
		System.out.println("The total payment is RM" + (int)(totalPayment * 100 / 100.0));

	}

}
