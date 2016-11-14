package mainpackage;

public class Affix {
	private Prefix prefix;
	private Suffix suffix;
	
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
