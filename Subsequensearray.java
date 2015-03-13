package Subsequensearray;
import java.util.*;

public class Subsequensearray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter The Sizes of the array : ");
		int lenght = input.nextInt();

		int Array[] = new int[lenght];
		
		System.out.println("Enter " + lenght + " numbers for Array ");
		
		for (int i = 0; i < lenght; i++) {
			Array[i] = input.nextInt();
		}
		
		System.out.println("Enter a number which you want to check if its sum exist in the array: ");
		int s = input.nextInt();
		input.close();

		String result = "no";
		int sum = 0;
		
		for (int i = 0; i < lenght; i++)
		{  
			//if (Array[i] == s)
				//System.out.println("one element in the array is equal to your number");
			
			 if (Array[i] < s)
				for (int j = i; j < lenght; j++) 
			 	{
					if (sum < s)
						sum += Array[j];
					else if (sum == s) 
					{
						System.out.println("The sum exist in the array: ");
						
						for (int k = i; k < j; k++)
							System.out.println(Array[k]);
						
						result = "Yes";
						break;
					} 
					else 
					{ 
						sum = 0;
						break;
					}
				}
			
			sum = 0;
			
		}

			if (result == "No")
			System.out.println("There is no result in the list");

	}

}
