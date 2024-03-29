//Class for generating player character

package genesisblocks;

import java.awt.*;

public class Character extends DoubleRectangle {
	public double fallingSpeed = 1.2;
	public double movementSpeed = 0.5;
	public double jumpingSpeed = 1;
	
	public int jumpingHeight = 50, jumpingCount = 0;
	public int animation = 0;
	public int animationFrame = 0, animationTime = 30;
	
	public boolean isJumping = false;
	
	public Character(int width, int height) {
		setBounds((Component.pixel.width / 2) - (width / 2), (Component.pixel.height / 2) - (height / 2), width, height);
	}
	//Method handling player character physics
	public void tick() {
		if(!isJumping && !isCollidingWithBlock(new Point((int) (x + 2), (int) (y + (int) height)), new Point((int) (x + width - 2), (int)(y + height)))) {
			y += fallingSpeed;
			Component.sY += fallingSpeed;
		} else {
			if(Component.isJumping && !Inventory.isOpen) {
				isJumping = true;
			}
		}
		
		if(Component.isMoving && !Inventory.isOpen) {
			boolean canMove = false;
			
			if(Component.dir == movementSpeed) {
				
			canMove = isCollidingWithBlock(new Point((int) (x + width), (int) y), new Point((int) (x + width), (int) (y + (height - 2))));
		} else if(Component.dir == -movementSpeed) { 
				canMove = isCollidingWithBlock(new Point((int) x - 1, (int) y), new Point((int) x - 1, (int) (y + (height - 2))));
		}
			
			if(animationFrame >= animationTime) {
				if(animation > 1) {
					animation = 1;
					} else {
						animation +=1;
					}
				
				animationFrame = 0;
				} else {
				animationFrame += 1;
				}
			
			if(!canMove) {
				x += Component.dir;
				Component.sX += Component.dir;
			}
		} else {
			animation = 0;
		}
		
		if(isJumping) {
			if(!isCollidingWithBlock(new Point((int) (x + 2), (int) y), new Point((int) (x + width - 2), (int) y))) {
				if(jumpingCount >= jumpingHeight) {
					isJumping = false;
					jumpingCount = 0;
					} else {
						y -= jumpingSpeed;
						Component.sY -= jumpingSpeed;
						
						jumpingCount += 1;
						}
					} else {
						isJumping = false;
						jumpingCount = 0;
					}
				}
			}
	//Collision detection method
	public boolean isCollidingWithBlock(Point pt1, Point pt2) {
		for(int x = (int) (this.x / Tile.tileSize); x < (int) (this.x / Tile.tileSize + 3); x++) {
			for(int y = (int) (this.y / Tile.tileSize); y < (int) (this.y / Tile.tileSize + 3); y++) {
				if(x >= 0 && y >= 0 && x < Component.level.block.length && y < Component.level.block[0].length)
				if(Component.level.block[x][y].id != Tile.air) {
					if(Component.level.block[x][y].contains(pt1) || Component.level.block[x][y].contains(pt2)) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	//Graphics rendering
	public void render(Graphics g) {
		if(Component.dir == movementSpeed) {
		g.drawImage(Tile.tileset_terrain, (int) x - (int) Component.sX, (int) y - (int) Component.sY, (int) (x + width) - (int) Component.sX, (int) (y + height) - (int) Component.sY, /**/
				(Tile.character[0] * Tile.tileSize) + (Tile.tileSize * animation), Tile.character[1] * Tile.tileSize, 
				(Tile.character[0] * Tile.tileSize) + (Tile.tileSize * animation) + (int) width, Tile.character[1] * Tile.tileSize + (int) height, null);
		} else {
			g.drawImage(Tile.tileset_terrain, (int) x - (int) Component.sX, (int) y - (int) Component.sY, (int) (x + width) - (int) Component.sX, (int) (y + height) - (int) Component.sY, /**/
					(Tile.character[0] * Tile.tileSize) + (Tile.tileSize * animation) + (int) width, Tile.character[1] * Tile.tileSize, 
					(Tile.character[0] * Tile.tileSize) + (Tile.tileSize * animation), Tile.character[1] * Tile.tileSize + (int) height, null);
		}
	}

}
