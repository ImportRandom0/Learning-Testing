// Name:
// Period:
public class alarmMethods 
{
	public static String alarm(int day, boolean vacation)
	{
		if (vacation == true)
		{
			if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)
			{
				return "10:00";
			} 
			else 
			{
				return "off";
			}
		}
		else 
		{
			if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)
			{
				return "6:00";
			} 
			else 
			{
				return "10:00";
			}
		}
	}
}

