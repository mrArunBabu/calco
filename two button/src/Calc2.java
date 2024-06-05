import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc2 extends JFrame implements ActionListener, KeyListener {
    JFrame frame = new JFrame();
    JLabel display;
    JButton sevenButton;
    JButton eightButton;
    JButton addButton;
    JButton minusButton;
    JButton equalButton;
    JButton clearButton;
    Float oldValue;
    Float newValue;
    String operator;

    Calc2() {

        // create frame
        frame.setSize(400, 500);
        frame.setLocation(800, 150);
        frame.setTitle("CALC");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a label to display operations
        display = new JLabel();
        display.setBounds(20, 20, 250, 50);
        display.setOpaque(true);
        frame.add(display);
        display.addKeyListener(this);
        display.setFocusable(true);
        display.requestFocusInWindow();

        // create number buttons
        sevenButton = new JButton("7");
        sevenButton.setBounds(40, 80, 80, 80);
        sevenButton.setBorder(null);
        frame.add(sevenButton);
        sevenButton.addActionListener(this);

        eightButton = new JButton("8");
        eightButton.setBounds(160, 80, 80, 80);
        eightButton.setBorder(null);
        frame.add(eightButton);
        eightButton.addActionListener(this);

        addButton = new JButton("+");
        addButton.setBounds(40, 180, 80, 80);
        addButton.setBorder(null);
        frame.add(addButton);
        addButton.addActionListener(this);

        minusButton = new JButton("-");
        minusButton.setBounds(160, 180, 80, 80);
        minusButton.setBorder(null);
        frame.add(minusButton);
        minusButton.addActionListener(this);

        equalButton = new JButton("=");
        equalButton.setBounds(40, 280, 80, 80);
        equalButton.setBorder(null);
        frame.add(equalButton);
        equalButton.addActionListener(this);

        clearButton = new JButton("C");
        clearButton.setBounds(160, 280, 80, 80);
        clearButton.setBorder(null);
        frame.add(clearButton);
        clearButton.addActionListener(this);

        frame.setVisible(true);
    }

    public static void main(String[] arg) {
        Calc2 newcalc = new Calc2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton) {
            display.setText(display.getText() + "7");
        } else if (e.getSource() == eightButton) {
            display.setText(display.getText() + "8");
        } else if (e.getSource() == addButton) {
            display.setText(display.getText() + "+");
            operator = "+";
        } else if (e.getSource() == minusButton) {
            display.setText(display.getText() + "-");
            operator = "-";
        } else if (e.getSource() == equalButton) {
            try {
                String expression = display.getText();
                String[] parts = expression.split("[-+]");
                if (parts.length != 2) {
                    display.setText("invalid expression");
                    return;
                }
                oldValue = Float.parseFloat(parts[0]);
                newValue = Float.parseFloat(parts[1]);
                float result;
                switch (operator) {
                    case "+":
                        result = oldValue + newValue;
                        break;
                    case "-":
                        result = oldValue - newValue;
                        break;
                    default:
                        display.setText("Invalid operator");
                        return;
                }
                display.setText(Float.toString(result));
            } catch (NumberFormatException ex) {
                display.setText("Invalid format");
            }
        } else if (e.getSource() == clearButton) {
            display.setText("");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char keyChar = e.getKeyChar();
        if (Character.isDigit(keyChar)) {
            display.setText(display.getText() + keyChar);
        } else if (keyChar == '+') {
            display.setText(display.getText() + "+");
            operator = "+";
        } else if (keyChar == '-') {
            display.setText(display.getText() + "-");
            operator = "-";
        } else if (keyChar == KeyEvent.VK_ENTER) {
            try {
                String expression = display.getText();
                String[] parts = expression.split("[-+]");
                if (parts.length != 2) {
                    display.setText("invalid expression");
                    return;
                }
                oldValue = Float.parseFloat(parts[0]);
                newValue = Float.parseFloat(parts[1]);
                float result;
                switch (operator) {
                    case "+":
                        result = oldValue + newValue;
                        break;
                    case "-":
                        result = oldValue - newValue;
                        break;
                    default:
                        display.setText("Invalid operator");
                        return;
                }
                display.setText(Float.toString(result));
            } catch (NumberFormatException ex) {
                display.setText("Invalid format");
            }
        } else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            String currentText = display.getText();
            if (!currentText.isEmpty()) {
                display.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
