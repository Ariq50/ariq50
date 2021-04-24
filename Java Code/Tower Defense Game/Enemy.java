import java.awt.*;

public class Enemy extends Rectangle {
	public int xC, yC;
	public int health;
	public int healthSpace = 3, healthHeight = 6;
	public int enemySize = 52;
	public int enemyWalk = 0;
	public int upward = 0, downward = 1, right = 2, left = 3;
	public int direction = right;
	public int enemyID = Value.enemyAir;
	public boolean inGame = false;
	public boolean hasUpward = false;
	public boolean hasDownward = false;
	public boolean hasLeft = false;
	public boolean hasRight = false;
	
	public Enemy() {
		
	}
	public void spawnEnemy(int enemyID) {
		for(int y = 0; y < Screen.room.block.length; y++) {
			if(Screen.room.block[y][0].groundID == Value.groundDirt) {
				setBounds(Screen.room.block[y][0].x, Screen.room.block[y][0].y, enemySize, enemySize);
			xC = 0;
			yC = y;
			
			}
		}
		
		this.enemyID = enemyID;
		this.health = enemySize;
		
		inGame = true;
	}	
	public void deleteEnemy() {
		inGame = false;
		direction = right;
		enemyWalk = 0;
		
		Screen.room.block[0][0].getMoney(enemyID); //Gives player money amount associated with enemy unit.
	}
	
	public void loseHealth() {
		Screen.health -= 1;
	}
	
	public int walkFrame = 0, walkSpeed = 40;
	
	public void physic() { //Enemy waves path finding.
		if(walkFrame >= walkSpeed) {
			if(direction == right) {
				x += 1;
		} else if(direction == upward) {
				y -= 1;
		} else if(direction == downward) {
				y += 1;
		} else if(direction == left) {
			x -= 1;
	}
			
			enemyWalk += 1;
			
			if(enemyWalk == Screen.room.blockSize) {
				if(direction == right) {
						xC += 1;
						hasRight = true;
				} else if(direction == upward) {
						yC -= 1;
						hasUpward = true;
				} else if(direction == downward) {
						yC += 1;
						hasDownward = true;
				} else if(direction == left) {
					xC -= 1;
					hasLeft = true;
				}
				
			if(!hasUpward) {
				try {
				if(Screen.room.block[yC+1][xC].groundID == Value.groundDirt) {
					direction = downward;
					}
				} catch(Exception e) {	}
			}
			
			if(!hasDownward) {	
				try {
					if(Screen.room.block[yC-1][xC].groundID == Value.groundDirt) {
						direction = upward;
						}
					}catch(Exception e) {	}
				}
			
			if(!hasLeft) {
				try {
					if(Screen.room.block[yC][xC+1].groundID == Value.groundDirt) {
						direction = right;
						}
					}catch(Exception e) {	}
				}
			
			if(!hasRight) {
				try {
					if(Screen.room.block[yC][xC-1].groundID == Value.groundDirt) {
						direction = left;
						}
					}catch(Exception e) {	}
				}
			
			if(Screen.room.block[yC][xC].airID == Value.airGarden) {
				deleteEnemy();
				loseHealth();
			}
			
				hasUpward = false;
				hasDownward = false;
				hasLeft = false;
				hasRight = false;
				enemyWalk = 0;
		}
			
			walkFrame = 0;
		} else {
			walkFrame += 1;
		}
	} //End of path finding.

	public void loseHealth(int amo) {
		health -= amo;
		
		checkDeath();
	}
	
	public void checkDeath() {
		if(health <= 0) {
			deleteEnemy();
		}
	}
	
	public boolean isDead() {
		if(inGame) {
			return false;
		} else {
			return true;
		}
	}
	
	public void draw(Graphics g) {
		if(inGame) {
			g.drawImage(Screen.tileset_enemy[enemyID], x, y, width, height, null);
			//Enemy Health Bar.
			g.setColor(new Color(0, 0, 255));
			g.fillRect(x, y - (healthSpace + healthHeight), width, healthHeight);
			
			g.setColor(new Color(255, 0, 0));
			g.fillRect(x, y - (healthSpace + healthHeight), health, healthHeight);
			
			g.setColor(new Color(0, 0, 0));
			g.drawRect(x, y - (healthSpace + healthHeight), health - 1, healthHeight - 1);
			}
		}
	}
