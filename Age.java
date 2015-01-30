package age;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner yourage= new Scanner(System.in);
		 System.out.print("Write your age please: ");
	     int age = yourage.nextInt();
	   yourage.close();
	     System.out.print("Your age after 10 years is : ");
         System.out.print(age+10);
	}

}
