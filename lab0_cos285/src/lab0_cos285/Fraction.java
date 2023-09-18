package lab0_cos285;

// Fraction Class
public class Fraction implements INumber{

	// Fields
	int numerator;
	int denominator;
	
	// Constructor
	public Fraction(int num, int den)
	{
		numerator = num;
		denominator = den;
	}
	
	// Methods
	// Addition Method
	// Colby Cormier 
	public Fraction plus(Fraction frac2)
	{
		// Create a new fraction object to be returned
		Fraction returnFrac = null;
		
		// First, check whether the denominators are equal. This is the easiest case of
		// fraction addition
		if(this.denominator == frac2.denominator)
		{
			// In this case, we can just add the numerators, and return the fractionValue
			returnFrac = new Fraction(this.numerator + frac2.numerator, this.denominator);
		}
		// If the denominators aren't the same, we need a different process
		// a/b + c/d = (a*d) + (b*c)/(b*d);
		else
		{
			returnFrac = new Fraction((this.numerator * frac2.denominator) + (frac2.numerator * this.denominator), 
					                   this.denominator * frac2.denominator);
		}
		
		// Return the fraction object
		return returnFrac;
	}
	
	// Methods
	// Addition Method
	// Colby Cormier 
	public Fraction minus(Fraction frac2)
	{
		// Create a new fraction object to be returned
		Fraction returnFrac = null;
		
		// First, check whether the denominators are equal. This is the easiest case of
		// fraction addition
		if(this.denominator == frac2.denominator)
		{
			// In this case, we can just add the numerators, and return the fractionValue
			returnFrac = new Fraction(this.numerator - frac2.numerator, this.denominator);
		}
		// If the denominators aren't the same, we need a different process
		// a/b + c/d = (a*d) + (b*c)/(b*d);
		else
		{
			returnFrac = new Fraction((this.numerator * frac2.denominator) - (frac2.numerator * this.denominator), 
					                   this.denominator * frac2.denominator);
		}
		
		// Return the fraction object
		return returnFrac;
	}
	
	/* minus the input
	// made by Nikan Kadkhodazadeh
	public double minus(double input)
	{
		//return (fractionValue - input);
		return 0.0;
	}
	
	//Divide method written by: Audrey 
	public double divide(double input) 
	{
		//return (fractionValue / input);
		return 0.0;
	}
	
	//mult method written by: Audrey
	public double multiply(double input) {
		//return (fractionValue * input);
		return 0.0;
	}*/

	// Print Method 
	// Colby Cormier
	public void print() 
	{
		System.out.println(numerator + "/" + denominator);
	}

	// Compare method 
	// Colby Cormier
	boolean hasSameValue (Fraction secondFrac) 
	{
		return ((this.numerator/this.denominator) == (secondFrac.numerator/secondFrac.denominator));
	}

	/*@Override
	public Object minus(Object input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object divide(Object input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object multiply(Object input) {
		// TODO Auto-generated method stub
		return null;
	}*/
}
