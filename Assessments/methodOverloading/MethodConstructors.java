package methodOverloading;

public class MethodConstructors {
	
	int length;
	int width;
	float radius;
	String s;
	
	MethodConstructors()
	{
		System.out.println("Default\n\n");
	}
	MethodConstructors(int num)
	{
		this.length = num;
	}
	MethodConstructors(int num1, int num2, String n)
	{
		this.length = num1;
		this.width = num2;
		this.s = n;
	}
	MethodConstructors(float r)
	{
		this.radius = r;
	}
	MethodConstructors(int num1, int num2, float c)
	{
		this.length = num1;
		this.width = num2;
		float constant = c;
	}
	
	public void display(int a)
	{
		System.out.println("Length = "+ a + "\nArea of Square = "+ a * 4+"\n\n");
	}
	public void display(int a, int b, String c)
	{
		System.out.println("Length = "+ a + "\nWidth = "+ b + "\nArea of"+ c+" = "+ a * b+"\n\n");
	}
	public void display(float r)
	{
		System.out.println("Radius = "+ r + "\nArea of Circle = "+ r * r * 4+"\n\n");
	}
	
	public void display(float a, float b, float c)
	{
		System.out.println("Length = "+ a + "\nWidth = "+ b + "\nArea of Triangle = "+ c*a*b+"\n\n");
	}
	
	public static void main(String[] args) 
	{
	MethodConstructors s1 = new MethodConstructors();
	
	s1.display(5);
	s1.display(4, 3, "Rectangualr");
	s1.display((float)2.5);
	s1.display(2, 5, "Rhombus");
	s1.display(3, 5, (float)0.5);
	}
}
