/*
 */

import java.util.Scanner;
public class divisors {
	
	public static void main (String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Type a whole number: ");
		int Input = key.nextInt();
		int Temp = 1;
		String Final = "";
		while (Temp < Input)
		{
			if (Input % Temp == 0)
			{
				Final = Final + Temp + " ";
			}
			Temp ++;
		}
		System.out.println(Input + " the following divisors: " + Final);
		
		System.out.println("");
		
		int Counta = 0;
		String Final2 = "";
		for (int i = 1; i < Input; i++)
		{
			if (Input % i == 0)
			{
				Final2 = Final2 + i + " ";
			}
			Counta ++;
		}
		System.out.println(Input + " the following divisors: " + Final2);
	}
}

