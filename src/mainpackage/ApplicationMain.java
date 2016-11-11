package mainpackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ApplicationMain {
	
	public static void main(String[] args) throws FileNotFoundException {
		LootGenerator loot = new LootGenerator();
		File monstats = new File("monstats.txt");
		
		
		System.out.println(loot.pickMonster(monstats));
		
		
		/*
		Parser parser = new Parser();
		File file = new File("monstats.txt");
		ArrayList<Monster> monsters = parser.listMonsters(file);
		
		for (Monster mon : monsters) {
			System.out.println();
			System.out.println("monster " + mon.monsterClass);
			System.out.println("type " + mon.type);
			System.out.println("level " + mon.level);
			System.out.println("treasure " + mon.treasure);
		}
		*/
	}
}
