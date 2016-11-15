package mainpackage;

public class BaseItem {
	private String baseItem;
	private String minac;
	private String maxac;

	/**
	 * A constructor for the BaseItem class.
	 * @param name The name of the item, in string form.
	 * @param minac A string representing the minimum defensive value of the item.
	 * @param maxac A string representing the maximum defensive value of the item.
	 */
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
