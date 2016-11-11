package mainpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class LootGenerator {
	
	public Parser parser;
	ArrayList<Monster> monsterList;
	
	public LootGenerator() {
		parser = new Parser();
	}
	
	public String pickMonster(File file) throws FileNotFoundException {
		monsterList = parser.listMonsters(file);
		Random rand = new Random();
		int index = rand.nextInt(monsterList.size());
		Monster randomMonster = monsterList.get(index);
		return randomMonster.getMonsterClass();
		
	}
}
