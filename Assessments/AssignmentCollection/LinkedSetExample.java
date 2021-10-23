package AssignmentCollection;
import java.util.*;

public class LinkedSetExample {
	public static void main(String[] args) {
		LinkedHashSet l1 = new LinkedHashSet();
		LinkedHashSet<Integer> l2 = new LinkedHashSet();
		
		// add two int
		l1.add(4);
		l1.add(5);
		
		// add two float
		l1.add(12.5f);
		l1.add(20.3f);
		
		// add two char
		l1.add("Abdulaziz");
		l1.add("Alsulami");
		
		// add two boolean
		l1.add(true);
		l1.add(false);
		
		System.out.println("Enter Number from 1 to 8: ");
		for (int i=0; i<8; i++) {
			Scanner scanner = new Scanner(System.in);
			l2.add(scanner.nextInt());
		}
		System.out.print("\nL1: "+l1+ "\n");
		System.out.print("L2: "+l2);
		
	}
}
