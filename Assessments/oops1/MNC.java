package oops1;

abstract public class MNC {
	abstract String method1();
	abstract String method2();
	MNC()
	{
		System.out.println("This is MNC Constroctor");
	}
}

abstract class Infosys extends MNC  {
	
	public String method1()
	{
		return "This is override abstact method1 in the parent class";
	}
}

class Hello extends Infosys{
	
	public String method1()
	{
		return "This is override abstact method1 in the Infosys class";
	}

	public String method2()
	{
		return "This is override abstact method2 in the parent class";
	}

	public String method3()
	{
		return "This new method in Hello class";
	}	
}
