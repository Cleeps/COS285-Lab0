package lab0_cos285;

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
	
}
