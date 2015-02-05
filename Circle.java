package Circle;
import java.math.*;
import java.util.*;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x;
       int y;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter two points: ");
       x= input.nextInt();
       y=input.nextInt();
      input.close();
      
       
       int Radius = 100;
       int answer = (x * x )+( y*y);
       
       if (answer < Radius) 
       {
    	   System.out.print("These point is inside of Circle");
       }
       else 
       {
    	   System.out.print("These points is outside of Circle");
       }
       
	}

}
