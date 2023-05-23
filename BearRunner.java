


public class BearRunner {
	
	public static void main (String[] args) {
		Bear a = new Bear();
		System.out.println(a.toString());
		System.out.println(a.getType());
		System.out.println(a.getWeight());

		Bear b = new Bear("black", 50, 3);
		System.out.println(b.toString());

		Bear c = new Bear("sun", 75, 4);
		System.out.println(c.toString());
	}
}

