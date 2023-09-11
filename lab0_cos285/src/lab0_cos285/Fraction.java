package lab0_cos285;

// Fraction Class
public class Fraction implements INumber{

	// Fields
	double fractionValue;
	
	// Constructor
	public Fraction(double value)
	{
		fractionValue = value;
	}
	
	// Methods
	public double plus(double input)
	{
		return (fractionValue + input);
	}

	@Override
	public Object plus(Object input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object minus(Object input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object divide(Object input) {
		// TODO Auto-generated method stub
		return null;
	}

	public double multiply(double input) 
	{
		return (fractionValue * input);
	}
	
	public void print() 
	{
		System.out.println(fractionValue);
	}
}
