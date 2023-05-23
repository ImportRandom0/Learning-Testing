

public class Bear {
	
	private String Type;
	private int weight;
	private int height;
	
	public Bear(String T, int w, int h)
	{
		if (!T.equals("black") && !T.equals("brown") && !T.equals("polar") && !T.equals("panda") && !T.equals("bridgeland"))
		{
			Type = "Bridgeland";
		} else {
			Type = T;
		}
		weight = w;
		height = h;
	}
	
	public Bear()
	{
		Type = "Bridgeland";
		weight = 300;
		height = 7;
	}
	
	public String getType()
	{
		return Type;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public String toString() 
	{
		return Type + " "+ weight + " "+ height;
	}
}

