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
	
	// minus the inpuT
	// made by Nikan Kadkhodazadeh
	public double minus(double input)
	{
		return (fractionValue - input);
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
<<<<<<< HEAD
=======

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	

>>>>>>> branch 'main' of https://github.com/Cleeps/COS285-Lab0.git
	
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
