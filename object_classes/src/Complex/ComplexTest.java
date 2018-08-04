package Complex;

import java.util.Scanner;

/**
 * @author Shubham Saxena
 *
 * This class is called by the main function
 */
public class ComplexTest {
	Scanner scanner = new Scanner(System.in);
	Complex complexNum1 = new Complex();
	Complex complexNum2 = new Complex();
	int realNum1,imaginaryNum1 ,imaginaryNum2, realNum2;
	
	
	/**
	 * This method is called initially by the main function
	 */
	public void start()
	{
		enterComplexNumber1();
		enterComplexNumber2();
		displayComplexNumbers();
		addComplexNumbers();
	}

	/**
	 * Entering the values of first complex number
	 */
	private void enterComplexNumber1() {
		System.out.println("Enter for complex number 1: ");
		realNum1 = scanner.nextInt();
		imaginaryNum1 = scanner.nextInt();
		
		complexNum1.setReal(realNum1);
		complexNum1.setImaginary(imaginaryNum1);
	}

	/**
	 * Entering the values of second complex number
	 */
	private void enterComplexNumber2() {
		System.out.println("Enter for complex number 2: ");
		realNum2 = scanner.nextInt();
		imaginaryNum2 = scanner.nextInt();
		
		complexNum2.setReal(realNum2);
		complexNum2.setImaginary(imaginaryNum2);
	}

	/**
	 * Displaying the complex numbers
	 */
	private void displayComplexNumbers() {
		String complexNumber1 = complexNum1.display();
		System.out.println("Complex number 1: "+complexNumber1);
		String complexNumber2 = complexNum2.display();
		System.out.println("Complex number 2: "+complexNumber2);
	}

	/**
	 * Adding the two complex number and displaying it
	 */
	private void addComplexNumbers() {
		Complex complexNum3 = new Complex();
		System.out.println("Sum is :    ");
		complexNum3 = complexNum3.sum(complexNum1,complexNum2);
		String complexNumber3 = complexNum3.display();
		System.out.println("Complex number 3: "+complexNumber3);
	}
	
}
