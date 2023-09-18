package lab0_cos285;

public class program1 {

	public static void main(String args[])
	{		
		// Creating the fraction array
		Fraction[] fractionArray = new Fraction[100];
		for(int i=0; i<fractionArray.length; i++)
		fractionArray[i] = new Fraction(i, i+1);
		
		findMax(fractionArray).print();
		findMin(fractionArray).print();
	}
	
	public static Fraction findMax(Fraction[] input)
	{
		Fraction maxFrac = null;
		
		for(int i = 0; i < input.length; i++)
		{
			if(maxFrac == null || maxFrac.compare(input[i]) == 1)
			{
				maxFrac = input[i];
			}
		}
		
		return maxFrac;
	}
	
	
	public static Fraction findMin(Fraction[] input)
	{
		Fraction minFrac = null;
		
		for(int i = 0; i < input.length; i++)
		{
			if(minFrac == null || minFrac.compare(input[i]) == -1)
			{
				minFrac = input[i];
			}
		}
		
		return minFrac;
	}
}
