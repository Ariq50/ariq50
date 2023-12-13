import java.awt.event.*;
import java.awt.*;
//Handles mouse input not covered by other classes
public class KeyHandle implements MouseMotionListener, MouseListener {

	
	public void mouseClicked(MouseEvent e) {
	
		
	}

	//Handles 'mousePressed' events within bounds of the tower store in game world
	public void mousePressed(MouseEvent e) {
		Screen.store.click(e.getButton());
	}

	
	public void mouseReleased(MouseEvent e) {
	
		
	}


	public void mouseEntered(MouseEvent e) {
		
		
	}

	
	public void mouseExited(MouseEvent e) {
	
		
	}

	//Handles 'mouseDragged' events within bounds of the game world
	public void mouseDragged(MouseEvent e) {
		Screen.mse = new Point((e.getX()) + ((Frame.size.width - Screen.myWidth)/2), 
				(e.getY()) - ((Frame.size.height - (Screen.myHeight)) - 
						(Frame.size.width - Screen.myWidth)/2));
	}

	//Handles mouseMoved events within bounds of the game world
	public void mouseMoved(MouseEvent e) {
		Screen.mse = new Point((e.getX()) - ((Frame.size.width - Screen.myWidth)/2), 
				(e.getY()) - ((Frame.size.height - (Screen.myHeight)) - 
						(Frame.size.width - Screen.myWidth)/2));
	}


}
