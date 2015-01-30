package Convert;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner Galon= new Scanner(System.in);
		System.out.print("Please insert The Number Of Gallon: ");
		double gal= Galon.nextDouble();
		Galon.close();
		 System.out.print("The convert of Number To liters is :");
		 System.out.print(gal* 3.7854);
		
		
	}

}
