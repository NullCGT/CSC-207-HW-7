package mainpackage;
public class Monster {
	private String monsterClass;
	private String level;
	private String type;
	private String treasure;


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
