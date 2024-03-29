import java.awt.*;

public class Block extends Rectangle {
	//Class variables
	public Rectangle towerSquare;
	public int towerSquareSize = 130;
	public int groundID;
	public int airID;
	public int loseTime = 100, loseFrame = 0;
	
	public int shotEnemy = -1;
	public boolean shooting = false;
	
	public Block(int x, int y, int width, int height, int groundID, int airID) { //Class constructor.
		setBounds(x, y, width, height);
		towerSquare = new Rectangle(x - (towerSquareSize/2), y - (towerSquareSize/2), 
				width + (towerSquareSize), height + (towerSquareSize));
		this.groundID = groundID;
		this.airID = airID;
	}
	
	public void draw(Graphics g) { //Draws game map.
		g.drawImage(Screen.tileset_ground[groundID], x, y, width, height, null);
		
		if(airID != Value.airAir) {
			g.drawImage(Screen.tileset_air[airID], x, y, width, height, null);
		}
	}
	
	public void physic() { //Detects enemy attackers and targets them with laser towers.
		if(shotEnemy != -1 && towerSquare.intersects(Screen.enemies[shotEnemy])){
			shooting = true;
		} else {
			shooting = false;
		}
		if(!shooting) {
			if(airID == Value.airTowerLaser) {
				for(int i = 0; i < Screen.enemies.length; i++) {
					if(Screen.enemies[i].inGame) {
						if(towerSquare.intersects(Screen.enemies[i])) {
							shooting = true;
							shotEnemy = i;
							}
						}
					}
				}
			}
		if(shooting) {
			if(loseFrame >= loseTime) {
				Screen.enemies[shotEnemy].loseHealth(1);
				
				loseFrame = 0;
			} else {
				loseFrame += 1;
			}
			
		if(Screen.enemies[shotEnemy].isDead()) {
			getMoney(Screen.enemies[shotEnemy].enemyID);
			
			shooting = false;
			shotEnemy = -1;
			
			Screen.killed += 1;
			
			Screen.hasWon();
		}
	}
}	
	
	public void getMoney(int enemyID) {	
			Screen.coinage += Value.deathReward[enemyID];  //Player gets money for killing enemy attackers.
			}
	
	public void fight(Graphics g) { //Draws laser from tower to enemy unit when unit is detected and attacked by tower
		if(Screen.isDebug) {
		if(airID == Value.airTowerLaser) {
			g.drawRect(towerSquare.x, towerSquare.y, towerSquare.width, towerSquare.height);
			}
		}
			if(shooting) {
				g.setColor(new Color(255, 0, 255));
				g.drawLine(x + (width/2), y + (height/2),
						Screen.enemies[shotEnemy].x + (Screen.enemies[shotEnemy].width/2), 
						Screen.enemies[shotEnemy].y + (Screen.enemies[shotEnemy].height/2));
			}
		}
	}	
