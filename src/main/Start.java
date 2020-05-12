package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Start {

	private static final String COMMA_DELIMITER = ",";
	
	public static HashMap<String, Items> fullRecipes = new HashMap<>();

	public static void main(String[] args) throws FileNotFoundException {
		
		String csvFile = "/Users/raymondmatthewguo/eclipse-workspace/CraftingRecipe/recipe.csv";
		
		Scanner scanner = new Scanner(new File(csvFile));
		
		while(scanner.hasNextLine()) {
			Items testMethod = parseItems(scanner.nextLine());
			fullRecipes.put(testMethod.getName(), testMethod);
		}
		
		for(Map.Entry<String, Items> entry : fullRecipes.entrySet()) {
			String key = entry.getKey();
			Items value = entry.getValue();
			
			System.out.println(value.getName());
		}
		
	}
	
	public static Items parseItems(String line) {
		Items result;
		HashMap<String, Items> requirements = new HashMap<>();
		HashMap<String, Integer> requirementAmt = new HashMap<>();
		
		Scanner scan = new Scanner(line);
		scan.useDelimiter(COMMA_DELIMITER);
		String name = scan.next();

		while (true) {
			String rName = scan.next();
			if (rName.equals("0") || rName.equals(" 0")) break;
			
			int rAmount = scan.nextInt();
			if(fullRecipes.containsKey(rName)) {
				requirements.put(rName, fullRecipes.get(rName));
				requirementAmt.put(rName, rAmount);
			} else {
				requirements.put(rName, new Items(rName)); // Maybe not needed
				System.out.println(rName + ": Probably shouldn't reach this.");
			}
			
		}
		
		result = new Items(name, requirements);
		
		return result;
	}

}
