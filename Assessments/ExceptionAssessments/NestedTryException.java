package ExceptionAssessments;

public class NestedTryException {
	public static void main(String[] args) {
		try {
			int l[] = new int[5];  // create new l variable with array which has five indexes
			checkException(l);     // call checkException method and pass l as arguments
			
		}  catch ( ArithmeticException  e) {
			System.out.println("1at exception: "+e.getLocalizedMessage());
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2nd exception: "+e.getLocalizedMessage());
			
		} catch (Exception e) {
			System.out.println("3rd exception: "+e.getLocalizedMessage());
			
		} finally {
			System.out.println("This block will excute");
		}
	}
		
	
	static void checkException(int lst[]) {
		
		try {
			lst[3] = 30/1;
			lst[5] = 1;
		}  finally {
			System.out.println("Finally inside method.");
		}
	}
}
