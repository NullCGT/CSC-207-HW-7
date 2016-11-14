package mainpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {

	public ArrayList<Monster> listMonsters(File file) throws FileNotFoundException {
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		String monster = null;
		String type = null;
		String level = null;
		String treasure = null;
		Scanner scan = new Scanner(file);
		//http://stackoverflow.com/questions/6244670/java-using-multiple-delimiters-in-a-scanner
		scan.useDelimiter("\t|\r");
		while (scan.hasNext()) {
			monster = scan.next();
			type = scan.next();
			level = scan.next();
			treasure = scan.next();
			monsters.add(new Monster(monster, type, level, treasure));
		}
		scan.close();
		return monsters;
	}
	
	public ArrayList<Treasure> listTreasure(File file) throws FileNotFoundException {
		ArrayList<Treasure> treasures = new ArrayList<Treasure>();
		String treasure = null;
		String item1 = null;
		String item2 = null;
		String item3 = null;
		Scanner scan = new Scanner(file);
		//http://stackoverflow.com/questions/6244670/java-using-multiple-delimiters-in-a-scanner
		scan.useDelimiter("\t|\r");
		while (scan.hasNext()) {
			treasure = scan.next();
			item1 = scan.next();
			item2 = scan.next();
			item3 = scan.next();
			treasures.add(new Treasure(treasure, item1, item2, item3));
		}
		scan.close();
		return treasures;
	}
}
