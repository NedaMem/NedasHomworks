package therteenmars;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Loancalc {

	public static void main(String Args[]) {
		Scanner CONSOLE = new Scanner(System.in);
		double annualInterestRate = 0, rate = 0;
		int numOfYears = 0;
		while (true) {
			System.out.println("Enter loan amount: ");
			if (CONSOLE.hasNextDouble()) {
				annualInterestRate = CONSOLE.nextDouble();
				break;
			} else {
				System.out.println("Fail.");
			}
			return;
		}
		while (true) {
			System.out.println("Enter loan duration in years: ");
			if (CONSOLE.hasNextInt()) {
				numOfYears = CONSOLE.nextInt();
				break;
			} else {
				System.out.println("Fail.");
			}
			return;
		}
		rate = loanRate(annualInterestRate);
		
		System.out.println("Loan amount: " + twoPlaces(annualInterestRate));
		System.out.println("Loan duration in years: " + numOfYears);
		System.out.println("Loan Rate: " + rate + "%");
		
		
		double monthlypayment = loanMonthlyPayment(annualInterestRate,
				numOfYears, rate);
		double bal = annualInterestRate - monthlypayment;
		
		System.out.println("Monthly payment: "
				+ loanMonthlyPayment(annualInterestRate, numOfYears, rate));
		System.out.println("Total payment : "
				+ twoPlaces(loanTotalPayment(annualInterestRate,
						monthlypayment, rate, numOfYears)));
	}

	public static double loanMonthlyPayment(double loanAmount, int numOfYears,
			double loanRate) {
		return (loanAmount * loanRate)
				/ (1 - Math.pow((1 + loanRate), -numOfYears));
	}

	public static double balance(double bal, double loanRate) {
		return (bal + bal * loanRate / 12);
	}

	public static double loanTotalPayment(double loanAmount,
			double loanMonthlyPayment, double loanRate, int years) {
		double totalamount = 0;
		System.out.println("Month balance payment remaining");
		for (int i = 1; i <= years * 12; i++) {
			System.out.println(padtext(String.valueOf(i), 3) + " "
					+ padtext(twoPlaces(loanMonthlyPayment), 10));
			totalamount += loanMonthlyPayment;
		}
		return totalamount;
	}

	public static String twoPlaces(double d) {
		DecimalFormat df = new DecimalFormat("0.00");
		return df.format(d);
	}

	public static String padtext(String text, int length) {
		String str;
		str = text;
		for (int i = 0; i < length - text.length(); i++) {
			str += " ";
		}
		return str;
	}

	public static double loanRate(double loanAmount) {
		if (loanAmount >= 350000) {
			return 4.0;
		} else if (loanAmount >= 100000) {
			return 3.5;
		} else {
			return 3.0;
		}
	}
}