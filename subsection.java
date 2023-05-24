/*
 */
import java.util.Scanner;

public class subsection {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type a sentence");
		String next = keyboard.nextLine();
		System.out.println("Type a number (less than " + next.length() + ")");
		int next1 = keyboard.nextInt();
		if (next1 > next.length()) {
			System.out.println("Bad numbers!");
			System.exit(0);
		}
		System.out.println("Type a number (less than " + next.length() + ")");
		int next2 = keyboard.nextInt();
		if (next2 > next.length() || next1 > next2) {
			System.out.println("Bad numbers!");
			System.exit(0);
		}
		System.out.println("The letters are: " + next.substring(next1, next2));
	}
}

