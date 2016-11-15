package mainpackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ApplicationMain {

	public static void main(String[] args) throws FileNotFoundException {

		String answer = null;
		LootGenerator loot = new LootGenerator();
		Parser parser = new Parser();

		File monstats = new File("src/mainpackage/data/large/monstats.txt");
		File treasure = new File("src/mainpackage/data/large/TreasureClassEx.txt");
		File armor = new File("src/mainpackage/data/large/armor.txt");
		File prefixFile = new File("src/mainpackage/data/large/MagicPrefix.txt");
		File suffixFile = new File("src/mainpackage/data/large/MagicSuffix.txt");

		ArrayList<BaseItem> itemList = parser.listBaseItems(armor);
		ArrayList<Monster> monsterList = parser.listMonsters(monstats);
		ArrayList<Prefix> prefixList = parser.listPrefix(prefixFile);
		ArrayList<Suffix> suffixList = parser.listSuffix(suffixFile);
		Map<String, ArrayList<String>> treasureMap = parser.listTreasure(treasure);

		Scanner input = new Scanner(System.in);

		do {
			Monster randMonster = loot.pickMonster(monsterList);
			System.out.println("Fighting " + randMonster.getMonsterClass() + "...");
			System.out.println("You have slain " + randMonster.getMonsterClass() + "!");
			System.out.println(randMonster.getMonsterClass() + " dropped:");

			String baseItem = loot.generateBaseItem(randMonster, treasureMap);
			Affix affix = loot.generateAffix(prefixList, suffixList);
			if (affix.getPrefix() != null) {
				System.out.print("" + affix.getPrefix().getName());
			}
			System.out.print(" " + baseItem + " ");
			if (affix.getSuffix() != null) {
				System.out.print("" + affix.getSuffix().getName());
			}
			System.out.println();


			System.out.println(" Defense: " + loot.generateBaseStats(baseItem, itemList));


			if (affix.getPrefix() != null) {
				System.out.println(" " + affix.getPrefix().generateStats() + " " + affix.getPrefix().getMod1code());
			}
			if (affix.getSuffix() != null) {
				System.out.println(" " + affix.getSuffix().generateStats() + " " + affix.getSuffix().getMod1code());
			}
			System.out.println("");
			
			do {
				System.out.println("Do you want to play again [y/n]?");
				answer = input.next().toLowerCase();
			} while (!answer.equals("n") && !answer.equals("y"));
			
		} while (answer.equals("y"));
		input.close();
		return;
	}
}
