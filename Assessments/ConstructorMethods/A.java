package ConstructorMethods;
//Assignment #4
public class A extends Mrks {
	public float getPercentageThreeSubjects(int sub1, int sub2, int sub3)
	{
		return (sub1+sub2+sub3)/3;
	}

	public static void main(String[] args) 
	{
		Mrks eac = new A();
		System.out.println(eac.getPercentageThreeSubjects(95, 85, 90));
	}
}
