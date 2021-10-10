package oops;

public class Main {

	public static void main(String[] args)
	{
	
	Monkey obj = new Monkey();
	Monkey obj1 = new Human();
	Human obj2 = new Human();
	System.out.println(obj.jump());
	System.out.println(obj.bite());
	System.out.println(obj1.jump());
	System.out.println(obj1.bite());
	System.out.println(obj2.eat());
	System.out.println(obj2.sleep());
	}
}
