package Methods;
import java.util.*;

public class RevInteger {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		int number = 0;
		String quit;
		do{
			System.out.println("Please enter your number or q for exit");
			quit=input.nextLine();
			
	 	try{
			number=Integer.parseInt(quit);
			
	}	
	catch(NumberFormatException e)
		{
			System.out.print("Your are Quit");
		}
	System.out.println("THe reverse of number is : " + reveInteger( number));
		
		}while(!quit.equals("q"));
		input.close();
	}
	public static int reveInteger(int number)
	{
		int resultNumber = 0;
		while(number != 0)
		{
			resultNumber = resultNumber *  10 + number % 10;
	        number = number/10;
		}
		return resultNumber;
		
	}

}
