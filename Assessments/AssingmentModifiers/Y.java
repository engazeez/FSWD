package AssingmentModifiers;

public class Y {
	
	public void main(String[] args) {
		// calling all M and N methods as well as X variables
		
		M method_m = new M();
		N method_n = new N();
		X var_x = new X();
		
		System.out.println("===== ( M Class )=====");
		System.out.println("First Method: "+ method_m.firstMethod());
		System.out.println("Second Method: "+ method_m.secondMethod());
		System.out.println("Third Method: "+ method_m.thirdMethod()); // Not allowing to calling thirdMethod method outside the M class
		System.out.println("Third Method: "+ method_m.fourthMethod());
		
		System.out.println("===== ( N Class )=====");
		System.out.println("First Method: "+ method_n.firstMethod());
		System.out.println("Second Method: "+ method_n.secondMethod());
		System.out.println("Third Method: "+ method_n.thirdMethod()); // Not allowing to calling thirdMethod method outside the N class 
		System.out.println("Third Method: "+ method_n.fourthMethod());
		
		System.out.println("===== ( X Class )=====");
		System.out.println("Variable im: "+ var_x.ix);	// Not allowing to calling ix variable outside the X class
		System.out.println("Variable lm: "+ var_x.lx);
		System.out.println("Variable fm: "+ var_x.fx);
		System.out.println("Variable fm: "+ var_x.cx);

	}
}
