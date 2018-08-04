package Complex;

/**
 * @author Shubham Saxena
 *
 * This class declares real and imaginary 
 */
public class Complex {
	private float real;
	private float imaginary;
	
	/**
	 * Getter and setters for real and imaginary
	 */
	public void setReal(float real) {
		this.real = real;
	}
	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}
	public float getReal()
	{
		return real;
	}
	public float getImaginary()
	{
		return imaginary;
	}
	
	/**
	 * Displays imaginary number using get function
	 */
	String display()
	{
		String imaginary = getReal()+":"+getImaginary()+"i";
		return imaginary;
	}
	
	/**
	 * @param num1
	 * @param num2
	 * @return
	 */
	Complex sum(Complex num1, Complex num2)
	{
		Complex num3 = new Complex();
		num3.real = num1.getReal()+num2.getReal();
		num3.imaginary = num1.getImaginary()+num2.getImaginary();
		return num3;
	}

	
}
