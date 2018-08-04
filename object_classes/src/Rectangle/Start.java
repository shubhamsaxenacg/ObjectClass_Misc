package Rectangle;
import java.util.Scanner;

/**
 * @author Shubham Saxena
 * 
 * Contains startMain function
 * This class is called by the main function by creating objects
 */
public class Start {
	
	/**
	 * This function gets the length and breadth
	 * Calculates the area and calling the comparing function 
	 */
	public void startMain()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length and Breadth.....");
		int length = scanner.nextInt();
		int breadth = scanner.nextInt();
		
		Rectangle rectangle = new Rectangle(length, breadth);
		
	//.....AREA
		int area = rectangle.area();
		System.out.println("Area of Rectangle is..."+area);
		
	//....COMPARE
		compareRectangle(rectangle);
		
		scanner.close();
	}
	
	
	
	/**
	 * Inputs the object of rectangle class
	 * uses .compare function
	 */
	private static void compareRectangle(Rectangle rectangle) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length and Breadth for second rectangle.....");
		int length = scanner.nextInt();
		int breadth = scanner.nextInt();
		
		Rectangle rectangleCompare = new Rectangle(length, breadth);
		
		boolean equal = rectangle.compare(rectangleCompare);
		if(equal)
		{
			System.out.println(".....Area is Equal...");
		}
		else 
			System.out.println(".....Area is Not Equal...");
		scanner.close();

	}
}
