/*
 */

import java.util.Scanner;
public class counter {
	
	public static void main (String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Write a number: ");
		int Input = key.nextInt();
		int Counter = 0;
		while (Input > 0)
		{
			Input = Input / 10;
			Counter ++;
		}
		System.out.println(Counter);
	}
}
