

public class Card {
	
	private String suit;
	private int number;
	private int value;
	
	public Card(String s, int CardN) {
		if (CardN == 11)
		{
			number = 11;
			value = 10;
		} else if (CardN == 12)
		{
			number = 12;
			value = 10;
		} else if (CardN == 13)
		{
			number = 13;
			value = 10;
		} else {
			number = CardN;
			value = CardN;
		}
		suit = s;
	}
	
	public String getsuit()
	{
		return suit;
	}
	
	public int getnumber()
	{
		return number;
	}
	
	public int getvalue()
	{
		return value;
	}
	
			
			
			
			
	public void setsuit(String s) {
		// The suit can only be clubs, diamonds, hearts, and spades.
		if (s.equals("clubs") || s.equals("diamonds") || s.equals("hearts") || s.equals("spades"))
		{
			suit = s;
		}
	}
	
	public void setnumber(int n)
	{
		// stores the number of the Card of that suit. 
		//Cards for 1-10 are straightforward because they will just be that number. 
		//We will also have Jack as the 11th card, a Queen is the 12th card, and the King is the 13th card.
		if (n > 0 && n < 14)
		{
			number = n;
		}
	}
	
	public void setvalue(int s)
	{
		if (s < 10 && s > 0)
		{
			value = s;
		}
	}
	
	public void tostring()
	{
		System.out.println(value);
		if (number == 11)
		{
			System.out.println("Jack");
		} else if (number == 12)
		{
			System.out.println("Queen");
		} else if (number == 13)
		{
			System.out.println("King");
		} else {
			System.out.println(number);
		}
		System.out.println(suit);
	}
}

