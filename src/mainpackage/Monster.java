package mainpackage;
public class Monster {
	private String monsterClass;
	private String level;
	private String type;
	private String treasure;

	/**
	 * A constructor for the Monster class.
	 * @param monsterClass A string representing the name of the monster.
	 * @param type A string representing the type of the monster.
	 * @param level A string representing the level of the monster.
	 * @param treasure A string representing the treasure class of the monster.
	 */
	public Monster(String monsterClass, String type, String level, String treasure) {
		this.monsterClass = monsterClass;
		this.level = level;
		this.type = type;
		this.treasure = treasure;
	}

	public String getMonsterClass() {
		return monsterClass;
	}

	public String getLevel() {
		return level;
	}

	public String getType() {
		return type;
	}

	public String getTreasure() {
		return treasure;
	}


}
