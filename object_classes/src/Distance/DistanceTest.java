package Distance;
import java.util.Scanner;


/**
 * @author Shubham Saxena
 * 
 * The class object is created in main function 
 */
public class DistanceTest {
	
	Scanner scanner = new Scanner(System.in);
	
	DistanceSum distance1=new DistanceSum();
	DistanceSum distance2=new DistanceSum();
	DistanceSum addDistance=new DistanceSum();

	/**
	 * The main function calls this method initially by using the DistanceTest object
	 */
	public void start(){
		inputFirstDistance();
		inputSecondDistance();
		addDistance();
	}

	/**
	 * This method takes input of first distance
	 */
	private void inputFirstDistance() {
		System.out.println("Enter the 1st distance in feet and inches...");
		int feet1 = scanner.nextInt();
		int inch1 = scanner.nextInt();
		distance1.set(feet1,inch1);
	}

	/**
	 * This method takes input of second Distance
	 */
	private void inputSecondDistance() {
		System.out.println("Enter the 2nd distance in feet and inches...");
		int feet2 = scanner.nextInt();
		int inch2 = scanner.nextInt();
		distance2.set(feet2,inch2);
	}

	/**
	 * This method adds two distance value
	 * Calls disp function to display
	 */
	private void addDistance() {
		addDistance=addDistance.add(distance1, distance2);
		addDistance.disp();
	}

}
