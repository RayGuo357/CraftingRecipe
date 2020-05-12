package main;

import java.util.*;

public class Items {
	
	private String name;
	private ArrayList<Items> requirements;
	
	public Items(String name) {
		this.name = name;
	}
	
	public Items(String name, ArrayList<Items> requirements) {
		this.name = name;
		this.requirements = requirements;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Items> getRequirements() {
		return requirements;
	}

}
