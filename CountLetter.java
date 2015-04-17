package tioapril;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountLetter {
	public static int countLetters(String line, char alphabet) {
		int count = 0;
		for (int i = 0; i <= line.length() - 1; i++) {
			if (line.charAt(i) == alphabet)
				count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				System.in));
		PrintWriter outputStream = null;
		Scanner input = new Scanner(System.in);

		try {
			outputStream = new PrintWriter(new FileOutputStream("par.txt"));

			System.out.println("Enter the paragraph: ");

			String paragraph;
			int j;

			paragraph = buffer.readLine();
			outputStream.println(paragraph);

			outputStream.close();
			System.out.println("The paragraph is written to par.txt");

			BufferedReader fileReader = new BufferedReader(new FileReader(
					new File("par.txt")));

			String allalphabet = "abcdefghijklmnopqrstuvwxyzöäåABCDEFGHIJKLMNOPQRSTUVWXYZÖÄÅ";
			String aLineInFile;

			System.out.println("Enter your letter: ");
			char alphabet = input.next().charAt(0);

			while ((aLineInFile = fileReader.readLine()) != null) {
				int numOfChar = countLetters(aLineInFile, alphabet);
				System.out.println("character ' " + alphabet + " ' appears: "
						+ numOfChar + " times ");
			}

		}

		catch (FileNotFoundException e) {
			System.out.println("Error opening the file par.txt");
		}

	}
}
