package AssingmentModifiers;

public class P {
	
	public String firstMethod() {
		//	public method	
		return "This is public method.";
	}	
 
	String secondMethod() {
		//	default method	
		return "This is default method.";
	}
	
	private String thirdMethod() {
		//	private method	
		return "This is private method.";
	}
	
	protected String fourthMethod() {
		//	protected method	
		return "This is protected method.";
	}
	
	public void main(String[] args) {
		
		// calling all M and N variables 
		M vars_m = new M();
		N vars_n = new N();
		
		System.out.println("=====( M variables )======");
		// im variabel not allowing to calling outside the M class
		System.out.println("Variable im: "+ vars_m.im);
		System.out.println("Variable lm: "+ vars_m.lm );
		System.out.println("Variable fm: "+ vars_m.fm);
		
		System.out.println("=====( N variables )======");
		System.out.println("Variable in: "+ vars_n.ln);
		System.out.println("Variable ln: "+ vars_n.in );
		System.out.println("Variable fn: "+ vars_n.dn);
	}
}
