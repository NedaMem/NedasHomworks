package quadraticequation;
import java.math.*;
import java.util.Scanner;



public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		double d;
		double root1;
		double root2;
		
		Scanner input1 =new Scanner(System.in);
		System.out.print("Please enter a,b,c : ");
		 a=input1.nextDouble();
		 b=input1.nextDouble();
		 c=input1.nextDouble();
		 
		 d= ((b*b) - (4*a*c)) ;
		 if (d<0)
		 {
		System.out.print("The equation has no real roots")	;
		
		 } 
		 else if (d == 0)
		 {
			 double root3= -b/ (2*a);
			 System.out.print("The equation has two root  " + root3);
			 
		 }
		 else 
		 {
			 root1= (-b + Math.sqrt(d))/(2*a);
			 root2= (-b - Math.sqrt(d))/(2*a);
			 
			 System.out.print("The equation has two roots  " + root1 + " and " + root2);
		 }
		
		
		input1.close();
		

	}

}
