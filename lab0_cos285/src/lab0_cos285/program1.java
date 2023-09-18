package lab0_cos285;

public class program1 {

	public static void main(String args[])
	{
		Fraction frac1 = new Fraction(2, 4);
		Fraction frac2 = new Fraction(1, 8);
		
		frac1.plus(frac2).print();
		frac1.minus(frac2).print();
	}
}
