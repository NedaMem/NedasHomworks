package Methods;

import java.util.Scanner;

public class ISPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		int number = 0;
		
		String quit;
		
		do {
			System.out.println("Enter number: ");
			quit= input.nextLine();
			
			try {
				number= Integer.parseInt(quit);
			}
			catch (NumberFormatException e)
			{
				System.out.println("you are quit");
			}
			PrintPrimeNumbers(number);
			
		}while (quit.equals("q"));	
	}


	public static void PrintPrimeNumbers(int number) {
	
		int count = 0;
		int n=2;
		int found=0;
		while (count != number)
		{
			
			     if(isPrime(n))	
			       {
			    	++found;
			    	 if (found % 10 == 0)
			    		 
	                        System.out.println(n);
	                    else
	                        System.out.print(n+"  ");
			         count++; 
			       }
			     n++;
			     
		}
		
		} 
	public static boolean isPrime(int i)
	{
		
		for (int j = 2 ; j <= i/2; j++)
		{
			if (i % j == 0)
			
			 return false;
			
		}
		return true;
			
   	}
	}


