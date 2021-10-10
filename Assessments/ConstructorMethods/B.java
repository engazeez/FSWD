package ConstructorMethods;
//Assignment #4

public class B extends Mrks{
	public float getPercentageFourSubjects(int sub1, int sub2, int sub3, int sub4)
	{
		return (sub1+sub2+sub3+sub4)/4;
	}

	public static void main(String[] args) 
	{
		Mrks eac = new B();
		System.out.println(eac.getPercentageFourSubjects(95, 85, 90, 93));
	}
}