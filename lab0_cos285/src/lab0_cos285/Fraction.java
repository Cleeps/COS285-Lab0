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
	
	// minus the input
	// made by Nikan Kadkhodazadeh
	public double minus(double input)
	{
		return (fractionValue - input);
	}

	// divides the input
	// made by Nikan Kadkhodazadeh
	public double divide(double input)
	{
		return (fractionValue / input);
	}

	public double multiply(double input) 
	{
		return (fractionValue * input);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	

	
	public void print() 
	{
		System.out.println(fractionValue);
	}

	// Compare method 
	// Colby Cormier
	boolean hasSameValue (Fraction F) 
	{
		return (this.fractionValue == F.fractionValue);
	}
}
