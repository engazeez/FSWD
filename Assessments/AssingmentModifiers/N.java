package AssingmentModifiers;

public class N {
	// Declaring three variables with different data types
	protected long ln;
	public int in;
	double dn;

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
}
