package Equalarray;

import java.util.*;

public class EqualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int len1;
		int len2;
		boolean variable = true;

		Scanner Arr1 = new Scanner(System.in);
		System.out.println("Enter Array1 Lenght: ");
		len1 = Arr1.nextInt();
		System.out.println("Enter Array2 lenght: ");
		len2 = Arr1.nextInt();

		if (len1 != len2) {
			System.out.print("You must write 2 equal lenght for arrays");
		}
		int[] intarray1 = new int[len1];
		System.out.print("Enter the array1 element: ");

		for (int i = 0; i < (intarray1.length); i++) {
			intarray1[i] = Arr1.nextInt();
		}

		int[] intarray2 = new int[len2];
		System.out.print("Enter the array2 elements");
		for (int j = 0; j < (intarray2.length); j++) {
			intarray2[j] = Arr1.nextInt();
		}

		for (int i = 0; i < len1; i++) {
			if (intarray1[i] != intarray2[i]) {
				variable = false;
				break;
			}
		}

		if (variable == true) {
			System.out.print("Array1 is equal to Array2");

		} else {
			System.out.print("Array1 is not equal to Array2");
		}
	}
}
