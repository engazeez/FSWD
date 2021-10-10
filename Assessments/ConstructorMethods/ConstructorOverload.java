package ConstructorMethods;

public class ConstructorOverload {
// Constructor Overload

	// Assingment # 3
	
	String name;
	char gender, section;
	int age, sub1, sub2, sub3;
	
	ConstructorOverload(int n1, int n2, int n3) 
	{
		sub1 = n1;
		sub2 = n2;
		sub3 = n3;
	}
	
	ConstructorOverload(int l2, int l3) 
	{
		sub2 = l2;
		sub3 = l3;
	}
	
	void display() 
	{
		int total_mark = sub1+sub2+sub3;
		float percentage = total_mark / 3;
		System.out.println(
				"Mark of Subject one: "+sub1+
				"\nMark of Subject two: "+sub2+
				"\nMark of Subject three: "+sub3
				);
		System.out.println("Total Mark = "+total_mark);
		System.out.println("Percentage = "+percentage+"\n");
	}
	
	public static void main (String args[]) 
	{
		ConstructorOverload s1 = new ConstructorOverload(10, 8, 6);
		ConstructorOverload s2 = new ConstructorOverload(6, 9, 5);
		ConstructorOverload s3 = new ConstructorOverload(10, 9);
		ConstructorOverload s4 = new ConstructorOverload(4, 7, 3);
	
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}
}
