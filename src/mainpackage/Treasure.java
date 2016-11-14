package mainpackage;

import java.util.ArrayList;

public class Treasure {
	private String treasureClass;
	private ArrayList<String> items;


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
