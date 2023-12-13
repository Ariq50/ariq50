import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
	//Class variables
	public static String title = "Garden Defender";
	public static Dimension size = new Dimension(700, 550);
	
	public Frame() { //Class constructor
		setTitle(title);
		setSize(size);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
	}
	
	public void init() { //Set dimensions of frame and adds screen to frame
		setLayout(new GridLayout(1, 1, 0, 0));
		
		Screen screen = new Screen(this);
		add(screen);
		
		setVisible(true);
	}
	
	public static void main(String args []) { //Main entry point for program
		Frame frame  = new Frame();
	}
	
	
}
