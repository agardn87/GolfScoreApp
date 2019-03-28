package GolfScoreApp.groupProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	private ArrayList<Integer> score = new ArrayList<>();
	private String name=null;
	
	public Player(String n, ArrayList<Integer> s) {
		score = s;
		name= n;
	}

	public ArrayList<Integer> getScore() {
		return score;
	}

	public void setScore(ArrayList<Integer> score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
