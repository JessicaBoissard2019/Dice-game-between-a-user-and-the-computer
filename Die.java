// Chapter 5 Game Zone exercise

public class Die 
{
	// Instance variables for this class
	private final int HIGHEST_DIE_VALUE = 6;
	private final int LOWEST_DIE_VALUE = 1;
	private int dieValue;

	// Custom constructor for the Die class
	public Die()
	{
		dieValue = (int) (Math.random() * HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	} // end of constructor method

	// Accessor (getter) method for this class
	public int getDieValue()
	{
		return dieValue;
	}
} // end of class block