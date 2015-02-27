package Equalarray;

import java.util.Scanner;

public class Equalarraymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		int i;
		int len1;
		int len2;
		boolean variable = true;

		Scanner Arr1 = new Scanner(System.in);
		System.out.println("Enter Array1 Lenght: ");
		len1 = Arr1.nextInt();
		
		System.out.println("Enter Array2 lenght: ");
		len2 = Arr1.nextInt();
		
		int[] intarray1 = new int[len1];
		System.out.print("Enter the array1 element: ");

		for ( i = 0; i < (intarray1.length); i++) {
			intarray1[i] = Arr1.nextInt();
		}

		int[] intarray2 = new int[len2];
		System.out.print("Enter the array2 elements");
		for ( j = 0; j < (intarray2.length); j++) {
			intarray2[j] = Arr1.nextInt();
		}
		
		System.out.println(isEqual(intarray1, intarray2));
		
		
	}
	public static boolean isEqual(int [] arr1, int [] arr2)
	{
		for (int i=0 ; i <arr1.length ; i ++)
		
			if(arr1[i] != arr2[i])
			{
				return false;
			}
				return true;
		
	
		
	}
	

}
