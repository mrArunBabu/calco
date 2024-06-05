package calculator3;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton, eightButton, nineButton, sixButton, fiveButton, fourButton, threeButton, twoButton,
            oneButton, dotButton, zeroButton, equalButton, divButton, multyButton, minusButton, addButton,
            clearButton;
    String operator;
    boolean isOperatorClicked = false;
    String oldValue;

    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(550, 600);
        jf.setLocation(200, 100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 480, 60);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(displayLabel);

        // Initialize numeric buttons...
        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
        sevenButton.setBackground(Color.GRAY);
        sevenButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.setFont(eightButton.getFont().deriveFont(Font.BOLD, 60));
        eightButton.setBackground(Color.GRAY);
        eightButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setFont(nineButton.getFont().deriveFont(Font.BOLD, 60));
        nineButton.setBackground(Color.GRAY);
        nineButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setFont(sixButton.getFont().deriveFont(Font.BOLD, 60));
        sixButton.setBackground(Color.GRAY);
        sixButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setFont(fiveButton.getFont().deriveFont(Font.BOLD, 60));
        fiveButton.setBackground(Color.GRAY);
        fiveButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setFont(fourButton.getFont().deriveFont(Font.BOLD, 60));
        fourButton.setBackground(Color.GRAY);
        fourButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setFont(threeButton.getFont().deriveFont(Font.BOLD, 60));
        threeButton.setBackground(Color.GRAY);
        threeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setFont(twoButton.getFont().deriveFont(Font.BOLD, 60));
        twoButton.setBackground(Color.GRAY);
        twoButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(oneButton.getFont().deriveFont(Font.BOLD, 60));
        oneButton.setBackground(Color.GRAY);
        oneButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setFont(zeroButton.getFont().deriveFont(Font.BOLD, 60));
        zeroButton.setBackground(Color.GRAY);
        zeroButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.setFont(dotButton.getFont().deriveFont(Font.BOLD, 60));
        dotButton.setBackground(Color.GRAY);
        dotButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.setFont(equalButton.getFont().deriveFont(Font.BOLD, 60));
        equalButton.setBackground(Color.GRAY);
        equalButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(divButton.getFont().deriveFont(Font.BOLD, 60));
        divButton.setBackground(Color.GRAY);
        divButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        divButton.addActionListener(this);
        jf.add(divButton);

        multyButton = new JButton("*");
        multyButton.setBounds(330, 230, 80, 80);
        multyButton.setFont(multyButton.getFont().deriveFont(Font.BOLD, 60));
        multyButton.setBackground(Color.GRAY);
        multyButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        multyButton.addActionListener(this);
        jf.add(multyButton);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        minusButton.setFont(minusButton.getFont().deriveFont(Font.BOLD, 60));
        minusButton.setBackground(Color.GRAY);
        minusButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        minusButton.addActionListener(this);
        jf.add(minusButton);

        addButton = new JButton("+");
        addButton.setBounds(330, 430, 80, 80);
        addButton.setFont(addButton.getFont().deriveFont(Font.BOLD, 60));
        addButton.setBackground(Color.GRAY);
        addButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        addButton.addActionListener(this);
        jf.add(addButton);
        clearButton = new JButton("C");
        clearButton.setBounds(430, 430, 80, 80);
        clearButton.setFont(clearButton.getFont().deriveFont(Font.BOLD, 60));
        clearButton.setBackground(Color.GRAY);
        clearButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        clearButton.addActionListener(this);
        jf.add(clearButton);

        // Make the frame visible after adding components
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
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
        } else if (e.getSource() == clearButton) {
            clearDisplay();
        } else if (e.getSource() == divButton) {
            handleOperator("/");
        } else if (e.getSource() == multyButton) {
            handleOperator("*");
        } else if (e.getSource() == minusButton) {
            handleOperator("-");
        } else if (e.getSource() == addButton) {
            handleOperator("+");
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
        displayLabel.setText(displayLabel.getText() + operator);
    }

    private void calculateResult() {
        try {
            String newValue = displayLabel.getText();
            if (oldValue == null || oldValue.isEmpty()) {
                displayLabel.setText("Error: Missing operand");
                return;
            }
            if (newValue.isEmpty()) {
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


