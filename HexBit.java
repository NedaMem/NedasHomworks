package Hexbit;
import java.util.*;
import java.lang.*;

public class HexBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int Bit;
		int tem;
		int mask =1;
		
		
		Scanner Input= new Scanner(System.in);
		System.out.print(" Please enter a short number : ");
		num= Input.nextInt();
		for (int i=15;i >=0; i-- )
		{
			tem = num >> i;
			Bit = tem & mask;
			System.out.print(Bit);
			
		}
		
		
		
		
	}
}
