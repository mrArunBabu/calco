import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator2 implements ActionListener {
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton, eightButton, nineButton, sixButton, fiveButton, fourButton, threeButton, twoButton,
            oneButton, dotButton, zeroButton, equalButton, divButton, multyButton, minusButton, addButton,
            clearButton;
    String operator;
    boolean isOperatorClicked = false;
    String oldValue;

    public Calculator2() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(550, 600);
        jf.setLocation(200, 100);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 480, 60);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
        sevenButton.setBackground(Color.GRAY);
        sevenButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        // Add the rest of the buttons similarly...

        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
        equalButton.setBackground(Color.GRAY);
        equalButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
        divButton.setBackground(Color.GRAY);
        divButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        divButton.addActionListener(this);
        jf.add(divButton);

        // Add the rest of the operator buttons similarly...

        clearButton = new JButton("C");
        clearButton.setBounds(430, 430, 80, 80);
        clearButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
        clearButton.setBackground(Color.GRAY);
        clearButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        clearButton.addActionListener(this);
        jf.add(clearButton);
    }

    public static void main(String[] arg) {
        new Calculator2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton) {
            handleNumericButton("7");
        } else if (e.getSource() == eightButton) {
            handleNumericButton("8");
        } else if (e.getSource() == nineButton) {
            handleNumericButton("9");
        } else if (e.getSource() == sixButton) {
            handleNumericButton("6");
        } else if (e.getSource() == fiveButton) {
            handleNumericButton("5");
        } else if (e.getSource() == fourButton) {
            handleNumericButton("4");
        } else if (e.getSource() == threeButton) {
            handleNumericButton("3");
        } else if (e.getSource() == twoButton) {
            handleNumericButton("2");
        } else if (e.getSource() == oneButton) {
            handleNumericButton("1");
        } else if (e.getSource() == zeroButton) {
            handleNumericButton("0");
        } else if (e.getSource() == dotButton) {
            handleDotButton();
        } else if (e.getSource() == equalButton) {
            calculateResult();
        } else if (e.getSource() == divButton) {
            handleOperator("/");
        } else if (e.getSource() == multyButton) {
            handleOperator("*");
        } else if (e.getSource() == minusButton) {
            handleOperator("-");
        } else if (e.getSource() == addButton) {
            handleOperator("+");
        } else if (e.getSource() == clearButton) {
            clearDisplay();
        }
    }

    private void handleNumericButton(String number) {
        if (isOperatorClicked) {
            displayLabel.setText(number);
            isOperatorClicked = false;
        } else {
            displayLabel.setText(displayLabel.getText() + number);
        }
    }

    private void handleDotButton() {
        if (!displayLabel.getText().contains(".")) {
            displayLabel.setText(displayLabel.getText() + ".");
        }
    }

    private void handleOperator(String op) {
        operator = op;
        oldValue = displayLabel.getText();
        isOperatorClicked = true;
    }

    private void calculateResult() {
        try {
            String newValue = displayLabel.getText();

            if (oldValue == null || oldValue.isEmpty() || newValue.isEmpty()) {
                displayLabel.setText("Error: Missing operand");
                return;
            }

            Float oldValueF = Float.parseFloat(oldValue);
            Float newValueF = Float.parseFloat(newValue);

            float result;
            switch (operator) {
                case "+":
                    result = oldValueF + newValueF;
                    break;
                case "-":
                    result = oldValueF - newValueF;
                    break;
                case "*":
                    result = oldValueF * newValueF;
                    break;
                case "/":
                    if (newValueF != 0) {
                        result = oldValueF / newValueF;
                    } else {
                        displayLabel.setText("Error: Division by zero");
                        return;
                    }
                    break;
                default:
                    displayLabel.setText("Error: Invalid operator");
                    return;
            }

            displayLabel.setText(Float.toString(result));
        } catch (NumberFormatException ex) {
            displayLabel.setText("Error: Invalid input");
        }
    }

    private void clearDisplay() {
        displayLabel.setText("");
    }
}
