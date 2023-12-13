import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
//Class for resource handling and game integration
public class Screen extends JPanel implements Runnable {
	//Class variables
	public Thread thread = new Thread(this);
	
	public static Image[] tileset_ground = new Image[100];
	public static Image[] tileset_air = new Image[100];
	public static Image[] tileset_res = new Image[100];
	public static Image[] tileset_enemy = new Image[100];
	
	public static int myWidth, myHeight;
	public static int coinage = 10, health = 100;
	public static int killed = 0, killsToWin = 0, level = 1, maxLevel = 3;
	public static int winTime = 4000, winFrame = 0;
	
	public static boolean isFirst = true;
	public static boolean isDebug = false;
	public static boolean isWin = false;
	
	public static Point mse = new Point(0, 0);
	
	public static Room room;
	public static Save save;
	public static Store store;
	
	public static Enemy[] enemies = new Enemy[1];
	
	public Screen(Frame frame) { //Class constructor
		frame.addMouseListener(new KeyHandle());
		frame.addMouseMotionListener(new KeyHandle());
		
		thread.start();
	}
	
	public static void hasWon() { //Method that checks if the player has won the level or game
		if(killed == killsToWin) {
			
			isWin = true;
			killed = 0;
			coinage = 0;
		}
	}
	
	public void define() { //Method that defines game map layout
		room = new Room();
		save = new Save();
		store = new Store();
			
		coinage = 10;
		health = 100;
		
		for(int i = 0; i < tileset_ground.length; i++) {
			tileset_ground[i] = new ImageIcon("res/tileset_ground.png").getImage();
			tileset_ground[i] = createImage(new FilteredImageSource(tileset_ground[i].getSource(), 
					new CropImageFilter(0, 26*i, 26, 26)));
		}
		
		for(int i = 0; i < tileset_air.length; i++) {
			tileset_air[i] = new ImageIcon("res/tileset_air.png").getImage();
			tileset_air[i] = createImage(new FilteredImageSource(tileset_air[i].getSource(), 
					new CropImageFilter(0, 26*i, 26, 26)));
		}
		
		tileset_res[0] = new ImageIcon("res/cell.png").getImage();
		tileset_res[1] = new ImageIcon("res/heart.png").getImage();
		tileset_res[2] = new ImageIcon("res/coin.png").getImage();
		
		tileset_enemy[0] = new ImageIcon("res/enemy.png").getImage();
		
		save.loadSave(new File("save/level" + level + ".td"));
		
		for(int i = 0; i < enemies.length; i++) {
			enemies[i] = new Enemy();
			enemies[i].spawnEnemy(0);
		}
	}
	
	public void paintComponent(Graphics g) { //Method that draws the borders of the game window
		if(isFirst) {
			myWidth = getWidth();
			myHeight = getHeight();
			define();
			
			isFirst = false;
		}
		
		g.setColor(new Color(70, 70, 70));
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(new Color(0, 0, 0));
		g.drawLine(room.block[0][0].x - 1, 0, room.block[0][0].x - 1, 
				room.block[room.worldHeight - 1][0].y + room.blockSize); //Drawing the left line.
		g.drawLine(room.block[0][room.worldWidth - 1].x + room.blockSize, 0, 
				room.block[0][room.worldWidth - 1].x + room.blockSize, 
				room.block[room.worldHeight - 1][0].y + room.blockSize); //Drawing the right line.
		g.drawLine(room.block[0][0].x, room.block[room.worldHeight - 1][0].y, //Drawing the bottom line. 
				room.block[0][room.worldWidth - 1].x + room.blockSize , 
				room.block[room.worldHeight - 1][0].y);
		
		room.draw(g); //Drawing the room.
		
		for(int i = 0; i < enemies.length; i++) {
			if(enemies[i].inGame) {
				enemies[i].draw(g);
			}
		}
		
		store.draw(g); //Drawing the store.
		
		if(health < 1) {
			g.setColor(new Color(240, 20, 20));
			g.fillRect(0, 0, myWidth, myHeight);
			g.setColor(new Color(255,255,255));
			g.setFont(new Font("Courier New", Font.BOLD, 14));
			g.drawString("GAME OVER!", 10, 20);
		}
		
		if(isWin) {
			g.setColor(new Color(255, 255, 255));
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(new Color(0, 0, 0));
			g.setFont(new Font("Courier New", Font.BOLD, 14));
			
			if(level == maxLevel) {
				g.drawString("YOU WON THE WHOLE GAME! PLEASE WAIT AND THE WINDOW WILL CLOSE.", 10, 20);
			} else {
				g.drawString("YOU WON! CONGRATULATIONS! PLEASE WAIT FOR THE NEXT LEVEL...", 10, 20);	
			}
		}
	}
	
	public int spawnTime = 2400, spawnFrame = 0; //Frame rate attributes
	
	public void enemySpawner() { //Method for spawning enemy units on game map
		if(spawnFrame >= spawnTime) {
			for(int i = 0; i < enemies.length; i++) {
				if(!enemies[i].inGame) {
					enemies[i].spawnEnemy(Value.enemyRed);
					break;
				}
			}
			spawnFrame = 0;
		} else {
			spawnFrame += 1;
		}
	}
	
	public void run() { //Checks if game window close conditions have been met (central game loop).
		while(true) {
			if(!isFirst && health > 0 && !isWin){
				room.physic();
				enemySpawner();
				for(int i = 0; i < enemies.length; i++) {
					if(enemies[i].inGame) {
						enemies[i].physic();
					}
				}
			} else {
				if(isWin) {
					if(winFrame >= winTime) {
						if(level == maxLevel) {
							System.exit(0);
						} else {
						level += 1;
						define();
						isWin = false;
						
						}
						
						winFrame = 0;
					} else {
						winFrame += 1;
					}
				}
			}		
			repaint();
			try {
				Thread.sleep(1);
			} catch(Exception e) { }
	
		}	
	}
}
