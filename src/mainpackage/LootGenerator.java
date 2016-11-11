package mainpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class LootGenerator {
	
	Parser parser = new Parser();
	Random rand = new Random();
	ArrayList<Monster> monsterList;
	
	public LootGenerator() {
		
	}
	
	public String pickMonster(File file) throws FileNotFoundException {
		monsterList = parser.listMonsters(file);
		int index = rand.nextInt(monsterList.size());
		Monster randomMonster = monsterList.get(index);
		return randomMonster.monsterClass;
		
	}
}
