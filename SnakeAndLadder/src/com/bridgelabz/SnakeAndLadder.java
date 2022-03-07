package com.bridgelabz;

public class SnakeAndLadder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int WINNING_POSITION = 100;

	public static void main(String[] args) {
		int playerOnePosition = 0, playerTwoPosition = 0;
		int count_Two = 0;
		int count_One = 0;
		System.out.println("Initial position of player_One is : " + playerOnePosition);
		System.out.println("Initial Position of player_two is : " + playerTwoPosition);
		int isPlayerOneTurn = 1;
		while (playerOnePosition < WINNING_POSITION && playerTwoPosition < WINNING_POSITION) {
			switch (isPlayerOneTurn) {
			case 1:
				int numberOnDie = RandomDieValue();
				System.out.println("Number on Die is : " + numberOnDie);
				int option = RandomOption();

				switch (option) {
				case LADDER:
					System.out.println("The option is Ladder " + LADDER);
					playerOnePosition += numberOnDie;
					if (playerOnePosition > WINNING_POSITION) {
						playerOnePosition -= numberOnDie;
						System.out.println("Current position is moving avove 100... Please roll the Die Next Time !!!!!");
					}
					count_One++;
					break;
				case SNAKE:
					System.out.println("The option is Snake " + SNAKE);
					playerOnePosition -= numberOnDie;
					if (playerOnePosition < 0)
						playerOnePosition = 0;
					break;
				default:
					System.out.println("No play");
				}
				System.out.println("Current Position of player_One :  " + playerOnePosition);
				if (playerOnePosition == WINNING_POSITION)
					System.out.println("Player One won the Game ..... has rolled  " + count_One + " times");
				else
					isPlayerOneTurn = 0;
				break;
			case 0:
				int numberOnDie2 = RandomDieValue();
				System.out.println("Number on Die is : " + numberOnDie2);
				int option2 = RandomOption();

				switch (option2) {
				case LADDER:
					System.out.println("The option is Ladder " + LADDER);
					playerTwoPosition += numberOnDie2;
					if (playerTwoPosition > WINNING_POSITION) {
						playerTwoPosition -= numberOnDie2;
						System.out.println("Current position is moving above 100... Please roll the Die Next Time !!!!!");
					}
					count_Two++;
					break;
				case SNAKE:
					System.out.println("The option is Snake " + SNAKE);
					playerTwoPosition -= numberOnDie2;
					if (playerTwoPosition < 0)
						playerTwoPosition = 0;
					break;
				default:
					System.out.println("No play");
				}
				System.out.println("Current Position of player_Two :  " + playerTwoPosition);
				if (playerTwoPosition == WINNING_POSITION)
					System.out.println("Player Two won the Game.... has rolled " + count_Two + " times ");
				else
					isPlayerOneTurn = 1;
			}
		}
	}

	private static int RandomOption() {
		int RandomOption = (int) Math.floor((Math.random() * 3));
		return RandomOption;
	}

	private static int RandomDieValue() {
		int RandomDieValue = (int) Math.floor((Math.random() * 6) + 1);
		return RandomDieValue;
	}
}
