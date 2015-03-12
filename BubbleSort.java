import java.util.*;

public class BubbleSort {
	
	public static int Bubblesorting(int [] arr)
	{
		int n= arr.length;
	    int temp= 0;
	        for(int i =0;i< (n -1) ;i++)
	        {
	        	for (int j=0 ; j<(n-1)-i ; j++)
	        	{
	        		if(arr[j] > arr[j+1])
	        		{
	                temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;                   
	                
	        		}
	            }
	        }

	 return temp;
	}

	public static void main(String[] args) {
		
		int number, i ;
	    Scanner input = new Scanner(System.in);
	 
	    System.out.println("Input lenght of integers to sort");
	    number = input.nextInt();
	 
	    int array[] = new int[number];
	 
	    System.out.println("Enter " + number + " integers");
	 
	    for (i = 0; i < number; i++) 
	    {
	      array[i] = input.nextInt();
	    }
	    input.close();
	   
	BubbleSort.Bubblesorting(array);
	
	for ( int j: array)
	{
		  System.out.print(j + " ");
	}
	}

}
