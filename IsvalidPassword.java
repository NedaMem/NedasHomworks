package Methods;
import java.util.*;
public class IsvalidPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);  
	        System.out.print("Please enter a Password: ");  
	        String pass = input.next();  
	        
	        input.close();
	         
	        if (isValidPassword(pass)) 
	        {  
	            System.out.println("Valid Password");  
	        } 
	        else 
	        {  
	            System.out.println("Invalid Password");  
	        }  
	    }  
	
	
	
	public static boolean isValidPassword(String s) {  
	      
	        if (s.length() < 8) {   
	            return false;  
	        } 
	        else {      
	            
	            int counter = 1; 
	            char ch;  
	            for (int i = 0; i < s.length() ; i++) 
	            {  
	                ch = s.charAt(i);  
	                
	                if (!Character.isLetterOrDigit(ch)) 
	                {          
	                    return false;  
	                } 
	                else if (Character.isDigit(ch)) 
	                {  
	                    counter++;  
	                    if (counter < 2)   
	                    {     
	                        return false;  
	                    }     
	                }  
	            }  
	        }  
	        return true;  
	}

}
