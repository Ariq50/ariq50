import java.awt.*;
//Class for drawing and handling laser tower store mechanics
public class Store {
	//Class variables
	public static int shopWidth = 8;
	public static int buttonSize = 52;
	public static int cellSpace = 2;
	public static int awayFromRoom = 29;
	public static int iconSize = 20;
	public static int iconSpace = 6;
	public static int iconTextY = 15;
	public static int itemIn = 4;
	public static int heldID = -1;
	public static int realID = 0;
	public static int[] buttonID = {Value.airTowerLaser, Value.airAir, Value.airAir, 
			Value.airAir, Value.airAir, Value.airAir, Value.airAir, Value.airTrashcan};
	public static int[] buttonPrice = {10, 0, 0, 0, 0, 0, 0, 0};
	
	public Rectangle[] button = new Rectangle[shopWidth];
	public Rectangle buttonHealth;
	public Rectangle buttonCoins;
	//Is the player holding a tower with the mouse cursor
	public boolean holdsItem = false;
	
	public Store() { //Class constructor
		define();
	}
	
	public void click(int mouseButton) { //Has the player clicked the mouse first key and selected a tower
		if(mouseButton == 1) {
			for(int i = 0; i < button.length; i++) {
				if(button[i].contains(Screen.mse)) {
					if(buttonID[i] != Value.airAir) {
						if(buttonID[i] == Value.airTrashcan) { //Delete item.
						holdsItem = false;
					} else {
						heldID = buttonID[i]; //Attaches item image to mouse cursor.
						realID = i;
						holdsItem = true;	
						}
					}
				}
			}
			if(holdsItem) { //Adjust player money for tower purchase and deploy tower
				if(Screen.coinage >= buttonPrice[realID]) {
					for(int y = 0; y < Screen.room.block.length; y++) {
						for(int x = 0; x < Screen.room.block[0].length; x++) {
								if(Screen.room.block[y][x].contains(Screen.mse)) {
									if(Screen.room.block[y][x].groundID != Value.groundDirt 
										&& Screen.room.block[y][x].airID == Value.airAir) {
										Screen.room.block[y][x].airID = heldID;
										Screen.coinage -= buttonPrice[realID];
								}
							}
						}
					}
				}
			}
		}
	}	
	public void define() { //Define store attributes
		for(int i = 0; i < button.length; i++) {
			button[i] = new Rectangle((Screen.myWidth/2) - ((shopWidth * (buttonSize + cellSpace))/2) 
					+ ((buttonSize + cellSpace) * i), (Screen.room.block[Screen.room.worldHeight - 1][0].y) 
					+ Screen.room.blockSize + cellSpace + awayFromRoom, buttonSize, buttonSize);
		}
		
		buttonHealth = new Rectangle(Screen.room.block[0][0].x - 1, button[0].y, iconSize, iconSize);
		buttonCoins = new Rectangle(Screen.room.block[0][0].x - 1, button[0].y + button[0].height - iconSize,
				iconSize, iconSize);
	}
	
	public void draw(Graphics g) { //Draw the tower store
		for(int i = 0; i < button.length; i++) {
				if(button[i].contains(Screen.mse)) {
					g.setColor(new Color(255, 255, 255, 100));
					g.fillRect(button[i].x, button[i].y, button[i].width, button[i].height);
				}
			g.drawImage(Screen.tileset_res[0], button[i].x, button[i].y, button[i].width, 
					button[i].height, null);
			if(buttonID[i] != Value.airAir) {
				g.drawImage(Screen.tileset_air[buttonID[i]], button[i].x + itemIn, button[i].y + itemIn, 
					button[i].width - (itemIn*2), button[i].height - (itemIn*2), null);
			if(buttonPrice[i] > 0) {
				g.setColor(new Color(255, 255, 255));
				g.setFont(new Font("Courier New", Font.BOLD, 14));
				g.drawString("$" + buttonPrice[i],button[i].x + itemIn, button[i].y + itemIn + 10);
				}	
			}
		}
		
		g.drawImage(Screen.tileset_res[1], buttonHealth.x, 
				buttonHealth.y, buttonHealth.width, buttonHealth.height, null);
		g.drawImage(Screen.tileset_res[2], buttonCoins.x, buttonCoins.y, 
				buttonCoins.width, buttonCoins.height, null);
		g.setFont(new Font("Courier New", Font.BOLD, 14));
		g.setColor(new Color(255, 255, 255));
		g.drawString("" + Screen.health, buttonHealth.x + buttonHealth.width + iconSpace, 
				buttonHealth.y + iconTextY);
		g.drawString("" + Screen.coinage, buttonCoins.x + buttonCoins.width + iconSpace, 
				buttonCoins.y + iconTextY);
		
		if(holdsItem) {
			g.drawImage(Screen.tileset_air[heldID], 
					Screen.mse.x - ((button[0].width - (itemIn *2))/2) + itemIn, 
					Screen.mse.y - ((button[0].width - (itemIn *2))/2) + itemIn,
					button[0].width - (itemIn *2), button[0].height - (itemIn*2), null);
		}
	}

}
