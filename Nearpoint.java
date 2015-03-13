package Nearestpoint;
import java.util.*;
public class Nearpoint {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter how many points you have : ");
		int lenght = input.nextInt();

		int Arr[] = new int[lenght];
		System.out.println("Enter " + lenght + " integers by pressing Enter key ");

		for (int i = 0; i < lenght; i++) {
			Arr[i] = input.nextInt();
		}
		input.close();


		int near = 0;
		int temp = 0;
	
		for (int i = 0; i < lenght ; i++) {
			for (int j = 0; j < lenght; j++) {
				
				if (!(Arr[i] == Arr[j])) {
					temp = Arr[i] - Arr[j];
					
					
					if (temp < 0)
						temp *= -1;
					
					if ((near == 0) || (temp < near))
						near = temp;
				}
			}
		}

		
		System.out.println("The Nearest Points Are :");

		for (int i = 0; i < lenght; i++) {
			for (int j = i; j < lenght; j++) {
				temp = Arr[i] - Arr[j];
				
				if (temp < 0)
					temp *= -1;

				if (temp == near) {
					System.out.print( "(" + Integer.toString(Arr[i]) + " , " + Integer.toString(Arr[j]) + ") & ");
					
				}

			}
		}
		
	}

}
