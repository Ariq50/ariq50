import java.awt.*;

public class Room {
	//Class variables
	public int worldWidth = 12;
	public int worldHeight = 8;
	public int blockSize = 52;
	
	public Block[][] block;
	
	public Room() { //Class constructor
		define();
	}
	
	public void define() { //Defines game world dimensions
		block = new Block[worldHeight][worldWidth];
		
		for(int y = 0; y < block.length; y++) {
			for(int x = 0; x < block[0].length; x++) {
				block[y][x] = new Block((Screen.myWidth/2)- ((worldWidth *blockSize)/2) + (x * blockSize), 
						y * blockSize, blockSize, blockSize, Value.groundGrass, Value.airAir);			
			}
		}
	}
	
	public void physic() { //Defines bounds of tower range and calls associated method
		for(int y = 0; y < block.length; y++) {
			for(int x = 0; x < block[0].length; x++) {
				block[y][x].physic();
			}
		}
	}
	
	public void draw(Graphics g) { //Draws towers and calls their fight method
		for(int y = 0; y < block.length; y++) {
			for(int x = 0; x < block[0].length; x++) {
				block[y][x].draw(g);
			}	
		}
		
		for(int y = 0; y < block.length; y++) {
			for(int x = 0; x < block[0].length; x++) {
				block[y][x].fight(g);
			}	
		}
	}
}
