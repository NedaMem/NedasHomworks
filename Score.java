package tioapril;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) throws IOException {
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter The File Name: ");
		String fileName= obj.nextLine();
		String data=readFile(fileName);
		System.out.print("The Score in the file " +data);
		obj.close();
		char dataArray[] = data.toCharArray();
		String str= "";
		int count=0,sum=0;
		
		for(int i=0; i<dataArray.length;i++)
		{
			if(dataArray[i]== ' ')
			{
				count++;
				str="";
				continue;
			}
			
			else{
				str= str+dataArray[i];
				sum += Integer.parseInt(str.trim());
				
			}
		}
		System.out.print("Sum of the Score: " + sum);
		System.out.print("\nThe Avrage is : " + (double)(sum/count));
	}

	public static String readFile(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));

		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			return sb.toString();

		} finally {
			br.close();

		}
	}
}
