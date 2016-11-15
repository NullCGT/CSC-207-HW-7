package mainpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class LootGenerator {

	public Parser parser;
	Random rand = new Random();

	public LootGenerator() {
		parser = new Parser();
	}

	public Monster pickMonster(ArrayList<Monster> monsterList) {
		int index = rand.nextInt(monsterList.size());
		Monster randomMonster = monsterList.get(index);
		return randomMonster;

	}

	public String fetchTreasureClass(Monster monster)  {
		return monster.getTreasure();
	}

	private String generateBaseItemHelper(String chosenItem, ArrayList<String> itemsList, 
			Map<String, ArrayList<String>> treasureMap)  {
		if (treasureMap.get(chosenItem) != null) {
			itemsList = treasureMap.get(chosenItem);
			chosenItem = itemsList.get(rand.nextInt(3));
			return generateBaseItemHelper(chosenItem, itemsList, treasureMap);
		}
		else {
			return chosenItem;
		}
	}

	public String generateBaseItem(Monster monster, Map<String, ArrayList<String>> treasureMap) {
		ArrayList<String> itemsList = treasureMap.get(fetchTreasureClass(monster));
		String chosenItem = itemsList.get(rand.nextInt(3));
		return generateBaseItemHelper(chosenItem, itemsList, treasureMap);


	}

	//http://stackoverflow.com/questions/363681/generating-random-integers-in-a-specific-range
	public String generateBaseStats(String baseItem, ArrayList<BaseItem> baseItemList) {
		for(BaseItem item : baseItemList)  {
			if(baseItem.equals(item.getBaseItem()))  {
				int minac = Integer.parseInt(item.getMinac());
				int maxac = Integer.parseInt(item.getMaxac());
				int randomNum = rand.nextInt(maxac - minac + 1) + minac;
				return "" + randomNum;
			}
		}
		return "";
	}

	public Affix generateAffix(ArrayList<Prefix> prefixList, ArrayList<Suffix> suffixList) {
		Prefix prefix = null;
		Suffix suffix = null;
		int prefixChance = rand.nextInt(2);
		int suffixChance = rand.nextInt(2);
		
		if(prefixChance == 1) {
			int prefixIndex = rand.nextInt(prefixList.size() - 1);
			prefix = prefixList.get(prefixIndex);
		}
		if(suffixChance == 1) {
			int suffixIndex = rand.nextInt(suffixList.size() - 1);
			suffix = suffixList.get(suffixIndex);
		}
		
		return new Affix(prefix, suffix);
	}



}
