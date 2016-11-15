package mainpackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ApplicationMain {

	public static void main(String[] args) throws FileNotFoundException {

		//NOTE: Both of these will currently return errors, since monstats.txt is not in the build
		//path. If it is added, then these will run.

/*
		LootGenerator loot = new LootGenerator();
		File monstats = new File("src/mainpackage/data/small/monstats.txt");
		File treasure = new File("src/mainpackage/data/small/TreasureClassEx.txt");
		File armor = new File("src/mainpackage/data/small/armor.txt");
		File prefixFile = new File("src/mainpackage/data/small/MagicPrefix.txt");
		File suffixFile = new File("src/mainpackage/data/small/MagicSuffix.txt");
		Monster randMonster = loot.pickMonster(monstats);
		System.out.println(randMonster.getMonsterClass());
		String baseItem = loot.generateBaseItem(randMonster, treasure);
		System.out.println(baseItem);

		System.out.println("Defense: " + loot.generateBaseStats(baseItem, armor));

		Affix affix = loot.generateAffix(prefixFile, suffixFile);
		if (affix.getPrefix() != null) {
			System.out.print("" + affix.getPrefix().getName());
		}
		
		System.out.print(" " + baseItem + " ");
		
		if (affix.getSuffix() != null) {
			System.out.print("" + affix.getSuffix().getName());
		}
		if (affix.getPrefix() != null) {
			System.out.println(affix.getPrefix().generateStats());
		}
		if (affix.getSuffix() != null) {
			System.out.println(affix.getSuffix().generateStats());
		}
*/

		LootGenerator loot = new LootGenerator();
		Parser parser = new Parser();
		
		File monstats = new File("src/mainpackage/data/small/monstats.txt");
		File treasure = new File("src/mainpackage/data/small/TreasureClassEx.txt");
		File armor = new File("src/mainpackage/data/small/armor.txt");
		File prefixFile = new File("src/mainpackage/data/small/MagicPrefix.txt");
		File suffixFile = new File("src/mainpackage/data/small/MagicSuffix.txt");
		
		parser.listBaseItems(armor);
		parser.listMonsters(monstats);
		parser.listPrefix(prefixFile);
		parser.listSuffix(suffixFile);
		parser.listTreasure(treasure);
		
		System.out.println("Welcome to JDiablo!\n");
		System.out.println("Fighting <Monster Name>...");
		System.out.println("You have slain <Monster Name>!");
		System.out.println("<Monster Name> dropped...\n");
		System.out.println("<complete item name>");
		System.out.println("<base item statistic>");
		System.out.println("<additional affix statistics>");
		System.out.println("");
		System.out.println("Fight again [y/n]?");
		

		/*
		Parser parser = new Parser();
		File file = new File("src/mainpackage/data/large/monstats.txt");
		ArrayList<Monster> monsters = parser.listMonsters(file);

		for (Monster mon : monsters) {
			System.out.println();
			System.out.println("monster " + mon.getMonsterClass());
			System.out.println("type " + mon.getType());
			System.out.println("level " + mon.getLevel());
			System.out.println("treasure " + mon.getTreasure());
		}
		 */
	}
}
