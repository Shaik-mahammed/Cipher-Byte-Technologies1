package mahaboob.com23CipherbyteTechnologies;

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int minRange = 1;
		int maxRange = 100;
		int randomNumber = (int) (Math.random() * (maxRange - minRange + 1) + minRange);
		int attempts = 0;

		System.out.println("Welcome to Guess the Number!");
		System.out.println("I have selected a number between " + minRange + " and " + maxRange + ".");
		System.out.println("Can you guess what it is?");

		while (true) {
			System.out.print("Enter your guess: ");
			int guess = scanner.nextInt();
			attempts++;

			if (guess == randomNumber) {
				System.out.println("Congratulations! You've guessed the number " + randomNumber + " correctly in "
						+ attempts + " attempts.");
				break;
			} else if (guess < randomNumber) {
				System.out.println("The number is higher than " + guess + ".");
			} else {
				System.out.println("The number is lower than " + guess + ".");
			}
		}

		scanner.close();
	}
}








