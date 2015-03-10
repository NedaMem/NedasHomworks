import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		
		int number, i, j, swap;
	    Scanner input = new Scanner(System.in);
	 
	    System.out.println("Input lenght of integers to sort");
	    number = input.nextInt();
	 
	    int array[] = new int[number];
	 
	    System.out.println("Enter " + number + " integers");
	 
	    for (i = 0; i < number; i++) 
	      array[i] = input.nextInt();
	    
	    input.close();
	    
	    
	    for (i = 0; i < ( number - 1 ); i++) {
	      for (j = 0; j < number - i - 1; j++) {
	        if (array[j] >  array[j+1])  // this is dependent on order that increasing or descending
	        {
	          swap = array[j];
	          array[j]  = array[j+1];
	          array[j+1] = swap;
	        }
	      }
	    }
	 
	    System.out.println("Sorted list of numbers");
	 
	    for (i = 0; i < number; i++) 
	      System.out.println(array[i]);
	}

}
