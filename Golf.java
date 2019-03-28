package groupProject;

import java.util.Scanner;

public class Golf {

	
	
	public static void main(String[] args) {
		
		Course course = new PebbleBrook();
		//Scanner scanner = new Scanner(System.in);
		String name;
		name = "John";
		//int[] playerScore = new int[18];
		Player player1 = new Player(name, course.getHoles());
		//Player player2 = new Player(name, playerScore);
		
		System.out.println(player1.getName());
		System.out.print(player1.getScore());

	}

}
