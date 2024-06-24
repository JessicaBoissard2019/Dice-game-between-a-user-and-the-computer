// Chapter 5 Game Zone exercise (page 159)

public class TwoDice2 {
	public static void main(String[] args) {

		// Variables and constants
		Die die1 = new Die();
		Die die2 = new Die();
		String outcome;

		// Processing phase
		if (die1.getDieValue() > die2.getDieValue()) {
			outcome = "The player wins the game!";
		} else {
			if (die1.getDieValue() < die2.getDieValue()) {
				outcome = "Sorry! the computer wins this time!";
			} else {
				outcome = "We have a tie game!";
			}
		}
		// Output phase
		System.out.println("Player die roll is: " + die1.getDieValue());
		System.out.println("Computer die roll is: " + die2.getDieValue());
		System.out.println(outcome);
	} // end of main
}// end of class block