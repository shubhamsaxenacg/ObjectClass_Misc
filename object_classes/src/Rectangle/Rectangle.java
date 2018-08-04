package Rectangle;

/**
 * @author Shubham Saxena
 *
 * Rectangle class contains getters and setters 
 */
public class Rectangle {
	
	private int length;
	private int breadth;
	
	/**
	 * @param length
	 * @param breadth
	 * This is a constructor
	 */
	public Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}


	
	/**
	 * Getters and setters
	 */
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	/**
	 * Calculating area and return area
	 */
	public int area()
	{
		int area = length * breadth;
		return area;
		
	}
	
	/**
	 * @param rectangleTwo
	 * Comparing the two rectangles area and return boolean
	 * @return
	 */
	public boolean compare(Rectangle rectangleTwo)
	{
		boolean equal = false;
		if(this.area()== rectangleTwo.area())
		{
			equal = true;
		}
		return equal;
	}
}
