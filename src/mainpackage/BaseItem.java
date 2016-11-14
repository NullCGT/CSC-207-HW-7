package mainpackage;

public class BaseItem {
	private String baseItem;
	private String minac;
	private String maxac;
	
	public BaseItem(String name, String minac, String maxac)  {
		this.baseItem = name;
		this.minac = minac;
		this.maxac = maxac;
	}
	
	public String getBaseItem() {
		return baseItem;
	}

	public String getMinac() {
		return minac;
	}

	public String getMaxac() {
		return maxac;
	}

}
