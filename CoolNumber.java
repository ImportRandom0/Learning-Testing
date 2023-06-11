/*
 */
import java.util.Scanner;

public class CoolNumber {
	
	public static void main (String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("input a number bigger than 10 but less than 100000 ");
		int input = key.nextInt();
		int Cool = 0;
		for (int i = 6; i < input; i ++)
		{
			if (i % 3 == 1 && i % 4 == 1 && i % 5 == 1 && i % 6 == 1)
			{
				Cool += 1;
			}
		}
		System.out.println("There are " + Cool + " cool numbers from 6 - " + input);
	}
}



