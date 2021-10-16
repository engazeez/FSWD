package customException;

public class CheckSalary{
	public static void checkSalary(int salary) throws SalaryException {
		if (salary < 2000)
			throw new SalaryException("you need to work hard");
		
		else if (salary < 5000 && salary > 2100)
			throw new SalaryException("your salary somehow good");
		
		else //(salary > 9000 && salary >5100)
			throw new SalaryException("your salary is very good");
		
	}
	public static void main(String args[]) {
		try {
			checkSalary(2500);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("rest of code ....");
	}

}



class SalaryException extends Exception{
	SalaryException(String s){
		super(s);
	}
}
