

import java.awt.Color;

import javax.swing.JFrame;

public class NewFrame{
	
	JFrame frame = new JFrame("window1");
	NewFrame(){ 
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.setLocation(200, 200);
		frame.setBackground(Color.BLACK);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[]arg) {
		new NewFrame();
	}	
	
	

}
