package Mostfrequently;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequently {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Arr= new Scanner(System.in);
		System.out.print("Enter the Array length :");
		int lenght= Arr.nextInt();
		
		int [] intarray = new int [lenght];
		System.out.print("Enter the " + lenght +" Array elements :");
		 
		
		for ( int i= 0; i< intarray.length ;i++)	
		{			
			intarray[i] = Arr.nextInt() ;
		}
		Arr.close();
		
		Arrays.sort(intarray);	
		
		System.out.println( "the popular elment is " + getPopularElement(intarray)[0] + " with the " + getPopularElement(intarray)[1]+ " Frequency");
	}
	
	public static int[] getPopularElement(int[] a)
	{
	  
	  int temC;
	  int popular[] = new int[2];
	  popular[0] = a[0];
	  popular[1] = 1;
	  int temp = 0;
	  for (int i = 0; i < (a.length - 1); i++)
	  {
	    temp = a[i];
	    temC = 0;
	    for (int j = 0; j < a.length; j++)
	    {
	      if (temp == a[j])
	        temC++;
	    }
	    if (temC > popular[1])
	    {
	      popular[0] = temp;
	      popular[1] = temC;
	    }
	    	   
	  }
	  return popular;
	}
}
