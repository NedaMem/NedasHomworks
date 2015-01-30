package Offsetfuntion;

import java.util.Scanner;
import java.time.*;
import java.time.zone.*;



public class OffsetGMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Offset =new Scanner(System.in);
		System.out.print("Enter The Time Zoneoffset To GMT: ");
		int num= Offset.nextInt();
		Offset.close();
		
		ZoneId id= ZoneId.of("Europe/Stockholm");
	    ZoneOffset off =ZoneOffset.ofHours(num);
    	ZonedDateTime time = ZonedDateTime.of(LocalDateTime.now(), id);
	   // ZonedDateTime time = ZonedDateTime.ofInstant(LocalDateTime.now(),off, id);
	    int Hour = time.getHour();
	    Hour= (Hour  + num + 24) % 24 ;
	    System.out.println(Hour + ":" + time.getMinute() + ":" + time.getSecond());
	    	
	}

	
}
