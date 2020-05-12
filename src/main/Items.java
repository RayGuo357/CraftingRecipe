package main;

import java.util.*;

public class Items {
	
	private String name;
	private int amount = 0;
	private HashMap<String, Items> requirements;
	private HashMap<String, Integer> requirementAmt;
	
	public Items(String name) {
		this.name = name;
	}
	
	public Items(String name, HashMap<String, Items> requirements) {
		this.name = name;
		this.requirements = requirements;
	}
	
	public String getName() {
		return name;
	}
	
	public void addAmount(int x) {
		amount += x;
		return;
	}
	
	public HashMap<String, Items> getRequirements() {
		return requirements;
	}

}
