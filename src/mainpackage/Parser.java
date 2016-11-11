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
		int index = 0;
		while (scan.hasNext()) {
			index++;
			if (index == 1) {
				monster = scan.next();
			}
			else if (index == 2) {
				type = scan.next();
			}
			else if (index == 3) {
				level = scan.next();
			}
			else if (index == 4) {
				treasure = scan.next();
				index = 0;
				monsters.add(new Monster(monster, type, level, treasure));
			}
		}
		scan.close();
		return monsters;
	}
}
