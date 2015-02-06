package Divisible;
import java.util.*;
public class DivisibleThreeSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			Scanner Input = new Scanner (System.in);
			System.out.print("Write a Number Please:  ");
			 n = Input.nextInt();
			 Input.close();
			 
			 for (int i=0 ; i<= n; i++)
			 {
				 if (i % 3 == 0 && i%7 == 0)
				 {
					 System.out.print("" + " ");
				 }
				 else
				 {
					 System.out.print(i + " ");
				 }
			 }
	}

}
