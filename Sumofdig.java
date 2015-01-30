package SumofDigital;

import java.util.Scanner;

public class Sumofdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int b;
		Scanner sumofdig =new Scanner(System.in);
		System.out.println("Please Write Your Number: ");
		int num= sumofdig.nextInt();
		sumofdig.close();
		
		if (num < 0 || num >1000)
		{
			System.out.println("Please write a number between 0 and 1000");
		}
		else{
			
		while (num % 10 != 0)
		{
			
			b=num % 10;
			sum += b;
			num= num / 10;
		
			}
		System.out.print("The Sum of The Number of Your Num is :");
		System.out.print(sum);
		}
		
		
	}

}
