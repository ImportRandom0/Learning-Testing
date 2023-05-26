


public class CipherMethods {
	
	public static char  shiftLetter(char Character, int Number) {
		String characters = "abcdefghijklmnopqrstuvwxyz";
		boolean Differ = false;
		if (Character < 91 && Character > 64)
		{
			Character += 32;
			Differ = true;
		}
		if (Character > 122 || Character < 97)
		{
			return Character;
		}
		int Stored = Character;
		int NewChar = Stored + Number;
		
		if (Number + Stored < 97)
		{
			NewChar = Stored + Number + 26;
		}
		
		if (Number + Stored > 122)
		{
			NewChar = Stored + Number - 26;
		}
		
		if (Differ == true)
		{
			NewChar -= 32;
		}
		
		return (char)NewChar;
	}
	
	public static String caesarEncode(String Encode, int Shift)
	{
		String Final = "";
		for (int i = 0; i < Encode.length(); i++)
		{
			Final = Final + shiftLetter(Encode.charAt(i), Shift);
		}
		return Final;
	}
	
	public static String caesarDecode(String Encode, int Shift)
	{
		Shift = Shift - (Shift * 2);
		String Final = "";
		for (int i = 0; i < Encode.length(); i++)
		{
			Final = Final + shiftLetter(Encode.charAt(i), Shift);
		}
		return Final;
	}
	
	public static char  mirrorcipher(char Character) {
		int Number = 26;
		String characters = "abcdefghijklmnopqrstuvwxyz";
		String characters2 = "zyxwvutsrqponmlkjihgfedcba";
		int location = characters.indexOf(Character);
		return (char)characters2.charAt(location);
	}
}
