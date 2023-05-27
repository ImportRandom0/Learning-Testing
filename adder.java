/*
 */

import java.util.Scanner;
public class adder {
	
	public static void main (String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("type in a positive whole number: ");
		int Input = key.nextInt();
		int Total = 0;
		Total += Input % 10;
		while (Input > 0)
		{
			Input = Input / 10;
			Total += Input % 10;
		}
		System.out.println("The sum of the digets is: " + Total);
	}
}

