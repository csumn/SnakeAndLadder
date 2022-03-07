package com.bridgelabz;
public class SnakeAndLadder{
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args) {
		int playerPosition = 0;
		System.out.println("Initial position of player is : " +playerPosition);
		
		while(playerPosition<100) {
		int numberOnDie = RandomDieValue();
		System.out.println("Number on Die is : " +numberOnDie);
		int option = RandomOption();
		
		switch(option) {
		case LADDER :
			System.out.println("The option is Ladder " +LADDER );
			playerPosition+=numberOnDie;
			if (playerPosition>100)
				playerPosition=100;
			break;
		case SNAKE:
			System.out.println("The option is Snake " +SNAKE);
			playerPosition-=numberOnDie;
			if (playerPosition < 0)
				playerPosition = 0;
			break;
		default:
			System.out.println("No play");
			}
		System.out.println("Current Position of Player :  "+playerPosition);
		}
		System.out.println("player Won");		
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
