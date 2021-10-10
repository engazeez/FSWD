package methodExcution;

public class MethodExcution {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		MethodExcution b=new MethodExcution();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
	}
}

