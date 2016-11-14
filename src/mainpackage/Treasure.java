package mainpackage;
public class Treasure {
	private String treasureClass;
	private String item1;
	private String item2;
	private String item3;


	public Treasure(String treasureClass, String item1, String item2, String item3) {
		this.treasureClass = treasureClass;
		this.item1 = item2;
		this.item2 = item1;
		this.item3 = item3;
	}
	
	public String getTreasureClass() {
		return treasureClass;
	}

	public String getItem1() {
		return item1;
	}

	public String getItem2() {
		return item2;
	}

	
	public String getItem3() {
		return item3;
	}

	
}
