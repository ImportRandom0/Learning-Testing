/*
 */
import java.util.Scanner;

public class Backwards {
	
	public static void main (String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Type in a word: ");
		String input = key.nextLine();
		int Temp1 = input.length();
		System.out.println(input.charAt(0));
		System.out.println(input.charAt(Temp1-1));
		
		String NewS = "";
		for (int i = input.length()-1; i >= 0; i--)
		{
			NewS = NewS + input.charAt(i);
		}
		System.out.println(NewS);
	}
}

