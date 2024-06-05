import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AlphaNumericInputFrame extends JFrame {
    private JTextField textField;

    public AlphaNumericInputFrame() {
        setTitle("AlphaNumeric Input Frame");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(20);
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char inputChar = e.getKeyChar();
                if (!Character.isLetterOrDigit(inputChar)) {
                    e.consume(); // Prevents non-alphanumeric characters from being entered
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Not needed for this example
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Not needed for this example
            }
        });

        add(textField);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AlphaNumericInputFrame());
    }
}
