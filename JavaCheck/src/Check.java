import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Check extends JFrame implements KeyListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton;
    private JButton clrButton, eqlButton;
    private JPanel panel;

    private double num1, num2, result;
    private char operator;

    public Check() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(300, 50));
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setEditable(false);
        textField.addKeyListener(this);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton source = (JButton) e.getSource();
                    textField.setText(textField.getText() + source.getText());
                }
            });
            panel.add(numberButtons[i]);
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        functionButtons = new JButton[]{addButton, subButton, mulButton, divButton};

        for (JButton button : functionButtons) {
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton source = (JButton) e.getSource();
                    textField.setText(textField.getText() + source.getText());
                }
            });
            panel.add(button);
        }

        clrButton = new JButton("C");
        eqlButton = new JButton("=");

        clrButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        eqlButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String expression = textField.getText();
                String[] operands = expression.split("[\\+\\-\\*\\/]");
                num1 = Double.parseDouble(operands[0]);
                num2 = Double.parseDouble(operands[1]);
                operator = expression.charAt(operands[0].length());
                
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }

                textField.setText(String.valueOf(result));
            }
        });

        panel.add(clrButton);
        panel.add(eqlButton);

        add(textField, BorderLayout.NORTH);
        add(panel);

        setVisible(true);
        textField.requestFocus();
    }

    public void keyPressed(KeyEvent e) {
        char keyChar = e.getKeyChar();
        if (Character.isDigit(keyChar) || keyChar == '+' || keyChar == '-' || keyChar == '*' || keyChar == '/' || keyChar == KeyEvent.VK_BACK_SPACE) {
            textField.setText(textField.getText() + keyChar);
        } else if (keyChar == KeyEvent.VK_ENTER) {
            eqlButton.doClick();
        }
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new Check();
    }
}
