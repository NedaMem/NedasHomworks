package Avragearray;
import java.util.*;

public class AvrageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double AVG;
		double sum=0;
		Scanner Arr= new Scanner(System.in);
		int[] array= new int[10];
		System.out.print("Enter 10 elements: ");
		
		for ( i=0; i <array.length;i++)
		{
			array[i]= Arr.nextInt();	
		}
		Arr.close();
		
		for (i=0; i<array.length ; i++)
		{
		sum += array[i];
		}
		AVG= sum /(array.length);
		
		System.out.print("The Avrage of elements is: " + AVG + "\n");
		
		for (i=0 ; i <array.length ; i++)
		{
			if (array[i] > AVG)
			{
				System.out.println( i + " is greather than " + AVG + "\n");
				
			}
			
		}
	
	}

}
