package mainpackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ApplicationMain {
	
	public static void main(String[] args) throws FileNotFoundException {

		//NOTE: Both of these will currently return errors, since monstats.txt is not in the build
		//path. If it is added, then these will run.
		
		
		LootGenerator loot = new LootGenerator();
		File monstats = new File("src/mainpackage/data/large/monstats.txt");
		System.out.println(loot.pickMonster(monstats));

		
	
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
		
	}
}
