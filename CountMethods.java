


public class CountMethods {
	
	public static int counte (String Str) {
		int E = 0;
		for (int i = 0; i < Str.length(); i++)
		{
			if (Str.charAt(i) == 'e')
			{
				E += 1;
			}
		}
		return E;
	}
	
	public static int countWord (String Str, String Str2) {
		int Occur = 0;
		for (int i = 0; i < Str.length(); i++)
		{
			if (i == Str.length()-2){
				break;
			}
			String Subbing = Str.substring(i, i + Str2.length());
			if (Subbing.equals(Str2))
			{
				Occur += 1;
			}
		}
		return Occur;
	}
	
	public static boolean checkTwo(String Str, String Str2, String Str3) {
		int Occur1 = countWord(Str, Str3);
		int Occur2 = countWord(Str2, Str3);
		if (Occur1 == Occur2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

