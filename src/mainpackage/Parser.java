package mainpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Parser {

	/**
	 * A constructor for the parser class.
	 */
	public Parser () {
		
	}
	
	/**
	 * Creates a list of monsters parsed from the provided file.
	 * @param file A file full of monsters and their drop information.
	 * @return monsters, an ArrayList of monster classes parsed from the given file.
	 * @throws FileNotFoundException Throw this if an invalid file is provided.
	 */
	public ArrayList<Monster> listMonsters(File file) throws FileNotFoundException {
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		String monster = null;
		String type = null;
		String level = null;
		String treasure = null;
		Scanner scan = new Scanner(file);
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

	/**
	 * A method which creates a Map consisting of treasure classes and their associated items and
	 * treasure classes.
	 * @param file A file full of treasure classes and their associated items and treasure classes.
	 * @return treasures, a map consisting of treasures (keys) and their associated items and
	 * 		   treasure classes (values). Keys are in String form, and values in ArrayList
	 * 		   \<String\> form.
	 * @throws FileNotFoundException Throw this if an invalid file is provided.
	 */
	public Map<String, ArrayList<String>> listTreasure(File file) throws FileNotFoundException {
		Map<String, ArrayList<String>> treasures = new HashMap<String, ArrayList<String>>();
		String treasure = null;
		Scanner scan = new Scanner(file);
		scan.useDelimiter("\t|\r");
		while (scan.hasNext()) {
			treasure = scan.next();
			ArrayList<String> items = new ArrayList<String>();
			for (int i = 0; i < 3; i++) {
				items.add(scan.next());
			}
			treasures.put(treasure, items);
		}
		scan.close();
		return treasures;
	}

	/**
	 * Parses a file into a list of BaseItems.
	 * @param file A file full for items and their minimum and maximum acs.
	 * @return baseItems, an ArrayList of BaseItems.
	 * @throws FileNotFoundException Throw this if an invalid file is provided.
	 */
	public ArrayList<BaseItem> listBaseItems(File file) throws FileNotFoundException {
		ArrayList<BaseItem> baseItems = new ArrayList<BaseItem>();
		String baseItem = null;
		String minac = null;
		String maxac = null;
		Scanner scan = new Scanner(file);
		scan.useDelimiter("\t|\r");
		while (scan.hasNext()) {
			baseItem = scan.next();
			minac = scan.next();
			maxac = scan.next();
			baseItems.add(new BaseItem(baseItem, minac, maxac));
		}
		scan.close();
		return baseItems;
	}

	/**
	 * Parses a file into a list of Prefixes.
	 * @param file full of prefixes and information about their modifiers.
	 * @return prefixes, an ArrayList of Prefixes.
	 * @throws FileNotFoundException Throw this if an invalid file is provided.
	 */
	public ArrayList<Prefix> listPrefix(File file) throws FileNotFoundException  {
		ArrayList<Prefix> prefixes = new ArrayList<Prefix>();
		String name;
		String mod1code;
		String mod1min;
		String mod1max;
		Scanner scan = new Scanner(file);
		scan.useDelimiter("\t|\r");
		while (scan.hasNext()) {
			name = scan.next();
			mod1code = scan.next();
			mod1min = scan.next();
			mod1max = scan.next();
			prefixes.add(new Prefix(name, mod1code, mod1min, mod1max));
		}
		scan.close();
		return prefixes;
	}

	/** 
	 * Parses a file into a list of Suffixes.
	 * @param file a file full of suffixes and information about their modifiers.
	 * @return suffixes, an ArrayList of Suffixes.
	 * @throws FileNotFoundException Throw this if an invalid file is provided.
	 */
	public ArrayList<Suffix> listSuffix(File file) throws FileNotFoundException  {
		ArrayList<Suffix> suffixes = new ArrayList<Suffix>();
		String name;
		String mod1code;
		String mod1min;
		String mod1max;
		Scanner scan = new Scanner(file);
		scan.useDelimiter("\t|\r");
		while (scan.hasNext()) {
			name = scan.next();
			mod1code = scan.next();
			mod1min = scan.next();
			mod1max = scan.next();
			suffixes.add(new Suffix(name, mod1code, mod1min, mod1max));
		}
		scan.close();
		return suffixes;
	}


}


