
import javax.swing.JFrame;


public class Frame {
	JFrame frame = new JFrame();
	Frame() {
		frame.setSize(500, 500);
		frame.setLocation(300, 100);
		frame.setTitle("FRAME");
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		Buttons b = new Buttons();
		frame.add(b.button);
	}
	public static void main(String[]arg) {
		Frame newFrame = new Frame();
	}
	
		
	}
	
