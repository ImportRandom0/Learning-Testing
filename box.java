/* 
 */

import java.util.Scanner;
public class untitled {
	
	public static void main (String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Type a word: ");
		String Input = key.nextLine();
		
		int Leng = Input.length();
		while (Leng > 0)
		{
			Leng --;
			System.out.println(Input);
		}
		System.out.println("  ");
		for (int i = 0; i < Input.length(); i++)
		{
			System.out.println(Input);
		}
	}
}

