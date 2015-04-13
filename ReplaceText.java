package ninthapril;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceText {

	public static void main(String[] args) throws IOException{
		
		String str;
		String oldtext = ""   ;
		
		try(BufferedReader reader = new BufferedReader (new FileReader("Test.txt"))){
			while((str= reader.readLine())!= null)
			{
				oldtext += str + "\r\n" ;
				
			}
			reader.close();
			String test= oldtext.replaceAll("Neda", "Arash");
			 FileWriter writer= new FileWriter("Test.txt");
			 writer.write(test);
			 writer.close();
			
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
	
	}
}

			