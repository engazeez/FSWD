package oops;

public class Monkey {	
	public String jump()
	{
		return "Use its hands and foots to jump";
	}
	
	public String bite()
	{
		return "Use its tooths to bite";
	}	
}

class Human extends Monkey {
	
	public String jump()
	{
		return "Use its foot to jump";
	}
	
	public String bite()
	{
		return "Human's tooths less size than Monkey's tooths";
	}
	
	public String eat()
	{
		return "This is eat method";
	}
	
	public String sleep()
	{
		return "This is sleep method";
	}
}

