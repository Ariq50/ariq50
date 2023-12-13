import java.io.*;
import java.util.*;
//Class for loading level files that the program uses to determine layout of the game map
public class Save {
	public void loadSave(File loadPath) { //Method for loading level files
		try {
		Scanner loadScanner = new Scanner(loadPath);
		
		while(loadScanner.hasNext()) {
			Screen.killsToWin = loadScanner.nextInt();
			
			for(int y = 0; y < Screen.room.block.length; y++) {
				for(int x = 0; x < Screen.room.block[0].length; x++) {
					Screen.room.block[y][x].groundID = loadScanner.nextInt();
				}
			}
			for(int y = 0; y < Screen.room.block.length; y++) {
				for(int x = 0; x < Screen.room.block[0].length; x++) {
					Screen.room.block[y][x].airID = loadScanner.nextInt();
				}
			}
		}
		loadScanner.close();
		} catch(Exception e) { }
	}

}
