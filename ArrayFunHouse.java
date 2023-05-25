public class ArrayFunHouse
{
	//getSum() will return the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] numArray, int start, int stop)
	{
		int Counter = 0;
		for (int i = start; i < stop; i++)
		{
			Counter += numArray[i];
		}
		return Counter;
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		int Total = 0;
		for (int i = 0; i < numArray.length; i++)
		{
			if (numArray[i] == val)
			{
				Total ++;
			}
		}
		return Total;
	}
	
	public static int lastIndexOf(int[] numArray, int val)
	{
		int Total = -1;
		for (int i = 0; i < numArray.length; i++)
		{
			if (numArray[i] == val)
			{
				Total = i;
			}
		}
		return Total;
	}

}
