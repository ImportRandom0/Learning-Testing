

public class  CipherRunner {
	
	public static void main (String[] args) {
		System.out.println(CipherMethods.shiftLetter('a', 3));
		System.out.println(CipherMethods.shiftLetter('a', -3));
		System.out.println(CipherMethods.shiftLetter('g', 6));
	
		System.out.println("");
		System.out.println(CipherMethods.caesarEncode("hello world", 3));
		System.out.println(CipherMethods.caesarEncode("i have a secret", 11));
		System.out.println(CipherMethods.caesarEncode("did you know that mr. garcia is nerdy?", 20));
		System.out.println("");
		System.out.println(CipherMethods.caesarDecode("z rd ylexip. pfl yrmv rep jertbj?", 17));
		System.out.println(CipherMethods.caesarDecode("qxf rb hxda mjh pxrwp?", 9));
		System.out.println(CipherMethods.caesarDecode("what is happening?", 26));
		System.out.println("");
		System.out.println(CipherMethods.caesarEncode("HELLO WORLD", 3));
		System.out.println(CipherMethods.caesarEncode("I have a secret", 11));
		System.out.println(CipherMethods.caesarEncode("Did you know that Mr. Garcia is nerdy?", 20));
		System.out.println("");
		System.out.println(CipherMethods.caesarDecode("Z rd ylexip. pfl yrmv rep jertbj?", 17));
		System.out.println(CipherMethods.caesarDecode("Qxf rb hxda mjh pxrwp?", 9));
		System.out.println(CipherMethods.caesarDecode("What is happening?", 26));
		System.out.println("");
		System.out.println(CipherMethods.mirrorcipher('a'));
		System.out.println(CipherMethods.mirrorcipher('b'));
	}
}

