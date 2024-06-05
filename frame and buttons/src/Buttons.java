import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

class Buttons {
	JButton button = new JButton();
	Buttons() {
	button.setText("click me");
	button.setBounds(150, 150, 100, 100);
	button.setForeground(Color.ORANGE);
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(button, "button clicked");
		}
	});
}
}
