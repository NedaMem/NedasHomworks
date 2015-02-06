package DateTime ;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;
public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("The current date is " + current.getDayOfMonth() +
				"/" + current.getMonthValue() + "/" 
				+ current.getYear());
		
		System.out.println("The current time is " + current.getHour()+
				":" + current.getMinute() + ":" 
				+ current.getSecond());
		
		
 
     
     
     
    		 
     
	}

}
