package com.bridgelabz;
public class SnakeAndLadder{
	public static void main(String[] args) {
		int playerPosition = 0;
		int numberOnDie;
		System.out.println("Initial position of player is : " +playerPosition);
		numberOnDie = RandomDieValue();
		System.out.println("Number on Die is : " +numberOnDie);
	}

	private static int RandomDieValue() {
		int RandomValue = (int) Math.floor((Math.random() * 6) + 1);
		return RandomValue;
	}
}
