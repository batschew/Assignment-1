/*
 * Name: Evan Batsch
 * Class: IT 2045C 001
 * Date Written: Jan 10th 2018
 * Description: This class demonstrates the function of the InterestCalculator class.
 * Citations: n/a
 * Other: n/a
 */

package Assignment1;

public class Main {

	// Stub class, to be overwritten
	public static void main(String[] args) {
		// Declare and instantiate an object of the 'InterestCalculator' class
		InterestCalculator newCalculator = new InterestCalculator(7000, 0.05, 12, 10);
		
		// Demonstrate the 'getAmountAccumulated' method of the 'InterestCalculator' class
		System.out.println("Amount Accumulated: " + newCalculator.getAmountAccumulated());
	}

}
