
import java.util.Scanner;


public class CardRunner {
	
	public static void Clear(int num)
	{
		for (int i = 0; i < num; i++)
		{
			System.out.println("");
		}
	}
	
	
	public static void main (String[] args) {
		Card[] Objs = new Card[52];
		for (int i = 0; i < Objs.length; i++)
		{
			String Suits[] = {"hearts", "diamonds", "spades", "clubs"};
			int rand = (int)(Math.random() * 4 - 1 + 1) + 1;
			String Suita = Suits[rand-1];
			int Numba = (int)(Math.random() * 13 - 1 + 1) + 1;
			Objs[i] = new Card(Suita, Numba);
		}
	
		
		
		
		
		int Over = 0;
		for (int i = 0; i < 6; i++)
		{
			int YourVal = 0;
			Card StartCard1 = Objs[(int)(Math.random() * (51 - 1) + 1)];
			YourVal += StartCard1.getvalue();
			
			String Name = "";
			if (StartCard1.getnumber() == 11)
			{
				Name = "Jack";
			} else if (StartCard1.getnumber() == 12)
			{
				Name = "Queen";
			} else if (StartCard1.getnumber() == 13)
			{
				Name = "King";
			} else {
				Name = String.valueOf(StartCard1.getvalue());
			}
			System.out.println("First card is: " + Name + " of " + StartCard1.getsuit());
				
			Card StartCard2 = Objs[(int)(Math.random() * 51 - 1 + 1) + 1];
			YourVal += StartCard2.getvalue();
			
			Name = "";
			if (StartCard2.getnumber() == 11)
			{
				Name = "Jack";
			} else if (StartCard2.getnumber() == 12)
			{
				Name = "Queen";
			} else if (StartCard2.getnumber() == 13)
			{
				Name = "King";
			} else {
				Name = String.valueOf(StartCard2.getvalue());
			}
			System.out.println("Second card is: " + Name + " of " + StartCard1.getsuit()); 
			boolean Alive = true;
			do {
				Scanner obj = new Scanner(System.in);
				System.out.print("Do you want to hit or stand?:");
				String Input = obj.nextLine();
				if (Input.equals("hit"))
				{
					Name = "";
					if (StartCard2.getnumber() == 11)
					{
						Name = "Jack";
					} else if (StartCard2.getnumber() == 12)
					{
						Name = "Queen";
					} else if (StartCard2.getnumber() == 13)
					{
						Name = "King";
					} else {
						Name = String.valueOf(StartCard2.getvalue());
					}
					Card HitCard = Objs[(int)(Math.random() * 51 - 1 + 1) + 1];
					YourVal += HitCard.getvalue();
					System.out.println("card is: " + Name + " of " + HitCard.getsuit()); 
					if (YourVal > 21)
					{
						Over += YourVal - 21;
						System.out.println("You loose!");
						try
						{
							Thread.sleep(5000);
						}
						catch(InterruptedException ex)
						{
							Thread.currentThread().interrupt();
						}
						Clear(10);
						Alive = false;
					} else if (YourVal == 21)
					{
						System.out.println("You win!");
						Alive = false;
						try
						{
							Thread.sleep(5000);
						}
						catch(InterruptedException ex)
						{
							Thread.currentThread().interrupt();
						}
						Clear(10);
					} 	
				} else {
					if (YourVal > 21)
					{
						Over += YourVal - 21;
						System.out.println("You loose!");
						try
						{
							Thread.sleep(5000);
						}
						catch(InterruptedException ex)
						{
							Thread.currentThread().interrupt();
						}
						Clear(10);
						Alive = false;
					} else if (YourVal == 21)
					{
						System.out.println("You win!");
						Alive = false;
						try
						{
							Thread.sleep(5000);
						}
						catch(InterruptedException ex)
						{
							Thread.currentThread().interrupt();
						}
						Clear(10);
					} else if (YourVal < 21)
					{
						System.out.println("You win!");
						Alive = false;
						try
						{
							Thread.sleep(5000);
						}
						catch(InterruptedException ex)
						{
							Thread.currentThread().interrupt();
						}
						Clear(10);
					}
				}
			} while (Alive == true);
		}
		System.out.println("You are " + Over + " points over!");
	}
}

