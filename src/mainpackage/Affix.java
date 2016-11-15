package mainpackage;

public class Affix {
	private Prefix prefix;
	private Suffix suffix;

	/**
	 * A constructor for the affix class.
	 * @param prefix This is the relevant prefix class of this affix.
	 * @param suffix This is the relevant suffix class of this affix.
	 */
	public Affix (Prefix prefix, Suffix suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}

	public Prefix getPrefix() {
		return prefix;
	}

	public Suffix getSuffix() {
		return suffix;
	}

}
