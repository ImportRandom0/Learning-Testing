

public class ArrayPractice {
	
	public static void main (String[] args) {
		int[] Numbers = new int[10];
		for (int i = 0; i < Numbers.length; i++)
		{
			Numbers[i] = (int)(Math.random() * 1000) + 1;
		}
		
		for (int i = 0; i < Numbers.length; i++)
		{
			System.out.println(Numbers[i]);
		}
		
		
		int[] Numbers2 = new int[1000];
		for (int i = 0; i < Numbers2.length; i++)
		{
			Numbers2[i] = (int)(Math.random() * 1000) + 1;
		}
		
		for (int i = 0; i < Numbers2.length; i++)
		{
			System.out.println(Numbers2[i]);
		}
	}
}

