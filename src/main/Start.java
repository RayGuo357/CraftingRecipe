package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Start {

	public static void main(String[] args) throws FileNotFoundException {
		
		String csvFile = "/Users/raymondmatthewguo/eclipse-workspace/CraftingRecipe/recipe.csv";
		
		ArrayList<Items> test = new ArrayList<>();
		
		Scanner scanner = new Scanner(new File(csvFile));
		
		while(scanner.hasNextLine()) {
			test.add(new Items(scanner.nextLine()));
		}
		
		for(int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i).getName());
		}
		
	}

}
