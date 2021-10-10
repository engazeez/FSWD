package methodOverloading;

public class MethodOverloading {
	
	public int calculate(int num1, int num2) 
	{
		return num1 + num2;
	}
	
	public float calculate(float radius)
	{
		return radius * (float)3.14;
	}
	
	public int calculate(float length, float width )
	{
		return (int)length * (int)width;
	}
	
}
