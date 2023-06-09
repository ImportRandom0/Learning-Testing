/*
 */

import java.util.Scanner;

public class CountPairs {
	
	public static void main (String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("type a word: ");
		String Input = key.nextLine();
		
		int Pairs = 0;
		for (int i = 0; i < Input.length()-1; i++)
		{
			char CurrentChar = Input.charAt(i);
			if (CurrentChar == Input.charAt(i+1))
			{
				Pairs++;
			}
		}
		System.out.println("\"" + Input + "\" contains " + Pairs + " Pairs");
	}
}
