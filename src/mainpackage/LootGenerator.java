package mainpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class LootGenerator {

	public Parser parser;
	ArrayList<Monster> monsterList;
	ArrayList<Treasure> treasureList;

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
/*
	public String fetchTreasureClass(String monsterTreasure, File file) throws FileNotFoundException  {
		treasureList = parser.listTreasure(file);
		for (Treasure trs : treasureList) {
			String chosenTreasureClass = trs.getTreasureClass();
			String randomItem = "";
			if(monsterTreasure == chosenTreasureClass)  {
				Random rand1 = new Random();
				int index1 = rand1.nextInt(3);
				if (index1 == 1)  {randomItem = trs.getItem1();}
				if (index1 == 2)  {randomItem = trs.getItem2();}
				else {randomItem = trs.getItem3();}

				for (Treasure trs1 : treasureList)  {
					if(trs1.getTreasureClass() == randomItem)  {

						for (Treasure trs2 : treasureList) {
							if(monsterTreasure == trs2.getTreasureClass())  {
								Random rand2 = new Random();
								int index2 = rand2.nextInt(3);
								if (index2 == 1)  {randomItem = trs.getItem1();}
								if (index2 == 2)  {randomItem = trs.getItem2();}
								else {randomItem = trs.getItem3();}

							}

						}
					}
				}

			}
		}
	}
	*/
}
