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

	//plus method written by: 

	// Addition Method
	// Colby Cormier

	public double plus(double input)
	{
		return (fractionValue + input);
	}
	
	// minus the inpuT
	// made by Nikan Kadkhodazadeh
	public double minus(double input)
	{
		return (fractionValue - input);
	}
	
	//Divide method written by: Audrey 
	public double divide(double input) 
	{
		return (fractionValue / input);
	}
	
	//mult method written by: Audrey
	public double multiply(double input) {
		return (fractionValue * input);
	}

	// Print Method 
	// Colby Cormier
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
