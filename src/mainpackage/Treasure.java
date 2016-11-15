package mainpackage;

import java.util.ArrayList;

public class Treasure {
	private String treasureClass;
	private ArrayList<String> items;

/**
 * A constructor for the Treasure class.
 * @param treasureClass A string representing the name of the treasure class.
 * @param items An ArrayList of strings representing the items associated with the treasure class.
 * 				These can also represent treasure classes in their own right.
 */
	public Treasure(String treasureClass, ArrayList<String> items) {
		this.treasureClass = treasureClass;
	}

	public String getTreasureClass() {
		return treasureClass;
	}

	public ArrayList<String> getItems() {
		return items;
	}

}
