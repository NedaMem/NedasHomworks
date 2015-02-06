package ReversString;
import java.util.*;
import java.lang.*;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String NewSent= "";
		
		Scanner Sentence = new Scanner (System.in);
		System.out.println(" Please write your sentence: ");
		String Sent = Sentence.nextLine();
		Sentence.close();
		for (int i=Sent.length() -1; i>= 0; i--)
		{
		
			NewSent  += Sent.charAt(i);
		}
		System.out.print("The Reverse of Sentense is: " + NewSent);
		
	}

}
