import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class RandomNumGame {

	public static void main(String[] args) {
		// This is the declared variable of the range from 1 - randomRangeMax is set as.
		int randomRangeMax = 1000;
		// randomAnswer is what picks a random number as the answer.
		int randomAnswer = (int) (Math.random() * randomRangeMax + 1);
		// How many tries do I have set?
		int maxTries = 15;
		/*
		 * Just declared one to start. So that the first try would be one less of the
		 * maxTries otherwise placing zero would have led an extra guess.
		 */
		int num = 1;

		boolean matchNum = false;

		while (matchNum != true) {
			int remainingTries = maxTries - num;
			int result = 0;
			int inputNumber = 0;
			String inputString;

			inputString = JOptionPane.showInputDialog(null, "Guess a number between 1-" + randomRangeMax);

			inputNumber = Integer.parseInt(inputString);
			
			if (inputNumber > randomAnswer) {
				JOptionPane.showMessageDialog(null, inputNumber + " > X, is greater than the random number. \n"
						+ remainingTries + " tries remaining.");
			}
			if (inputNumber < randomAnswer) {
				JOptionPane.showMessageDialog(null, inputNumber + " < X, is less than the random number. \n"
						+ remainingTries + " tries remaining.");
			}
			if (inputNumber == randomAnswer) {
				JOptionPane.showMessageDialog(null, inputNumber + " correctly matches, you win!!!\n With "
						+ remainingTries + " tries remaining!");
				matchNum = true;
			}
			if (remainingTries == 0) {
				JOptionPane.showMessageDialog(null, inputNumber
						+ " is incorrect.  No more tries left, you lost.\nThe answer was : " + randomAnswer);
				matchNum = true;
			}
			// This is a debug cheat to ensure the program was working.
			// System.out.println(randomAnswer);
			num++;
		}
	}

}
