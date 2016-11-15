package mainpackage;

import java.util.Random;

public class Prefix {
	private String name;
	private String mod1code;
	private String mod1min;
	private String mod1max;

	/**
	 * A constructor for the prefix class.
	 * @param name A string representing what is added on to the item name.
	 * @param mod1code A string representing what stat the prefix modifies.
	 * @param mod1min A string representing the minimum modifier.
	 * @param mod1max A string representing the maximum modifier.
	 */
	public Prefix (String name, String mod1code, String mod1min, String mod1max) {
		this.name = name;
		this.mod1code = mod1code;
		this.mod1min = mod1min;
		this.mod1max = mod1max;

	}

	public String getMod1max() {
		return mod1max;
	}

	public String getMod1min() {
		return mod1min;
	}

	public String getMod1code() {
		return mod1code;
	}

	public String getName() {
		return name;
	}

	public String generateStats()  {
		int min = Integer.parseInt(mod1min);
		int max = Integer.parseInt(mod1max);
		Random rand = new Random();
		int stat = rand.nextInt(max - min + 1) + min;
		return "" + stat;

	}

}
