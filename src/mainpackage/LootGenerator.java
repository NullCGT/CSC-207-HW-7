package mainpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class LootGenerator {

	public Parser parser;
	Random rand = new Random();

	/**
	 * Constructor for a new LootGenerator
	 */
	public LootGenerator() {
		parser = new Parser();
	}

	/**
	 * Picks a random monster from the monster list
	 * @param monsterList a list of the monsters parsed from the monster file
	 * @return Monster a Monster object
	 */
	public Monster pickMonster(ArrayList<Monster> monsterList) {
		int index = rand.nextInt(monsterList.size());
		Monster randomMonster = monsterList.get(index);
		return randomMonster;

	}

	/**
	 * Returns the treasure class of a monster
	 * @param monster a Monster object
	 * @return String representing the treasure class
	 */
	public String fetchTreasureClass(Monster monster)  {
		return monster.getTreasure();
	}

	/**
	 * Helper for the generateBaseItem method
	 * @param chosenItem a base item we are searching for
	 * @param itemsList array list containing the three possible item drops for a treasure class
	 * @param treasureMap a map of a treasure class and its three possible item drops
	 * @return String representing the base item dropped
	 */
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

	/**
	 * generates the base item that a monster drops
	 * @param monster a Monster object
	 * @param treasureMap a map of a treasure class and its three possible item drops
	 * @return String representing the base item dropped
	 */
	public String generateBaseItem(Monster monster, Map<String, ArrayList<String>> treasureMap) {
		ArrayList<String> itemsList = treasureMap.get(fetchTreasureClass(monster));
		String chosenItem = itemsList.get(rand.nextInt(3));
		return generateBaseItemHelper(chosenItem, itemsList, treasureMap);


	}

	
	/**
	 * computes the base stats for a given base item
	 * @param baseItem String containing the base item we are computing stats for
	 * @param baseItemList an array list of base items and their respective defensive stats
	 * @return String representing the stats for a given base item
	 * @cite http://stackoverflow.com/questions/363681/generating-random-integers-in-a-specific-range
	 */
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

	/**
	 * generates a prefix and suffix for our item
	 * @param prefixList a List containing all the prefixes and their respective additional stats
	 * @param suffixList a List containing all the suffixes and their respective additional stats
	 * @return Affix object
	 */
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
