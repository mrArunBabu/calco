package calculator2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    private JFrame frame;
    private JTextField displayField;

    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalButton;
    private JButton clearButton;

    private String currentInput;
    private String previousInput;
    private char currentOperator;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 3, 3));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            buttonPanel.add(numberButtons[i]);
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        for (JButton button : operatorButtons) {
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        equalButton = new JButton("=");
        equalButton.addActionListener(this);
        buttonPanel.add(equalButton);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);

        currentInput = "";
        previousInput = "";
        currentOperator = '\0';
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String buttonText = source.getText();

        try {
            if (Character.isDigit(buttonText.charAt(0))) {
                currentInput += buttonText;
                displayField.setText(currentInput);
            } else if (buttonText.equals("C")) {
                currentInput = "";
                previousInput = "";
                currentOperator = '\0';
                displayField.setText("");
            } else if (buttonText.equals("=")) {
                if (!currentInput.isEmpty() && !previousInput.isEmpty()) {
                    float operand1 = Float.parseFloat(previousInput);
                    float operand2 = Float.parseFloat(currentInput);
                    float result = performOperation(operand1, operand2, currentOperator);
                    displayField.setText(String.valueOf(result));
                    currentInput = String.valueOf(result);
                    previousInput = "";
                    currentOperator = '\0';
                }
            } else {
                if (!currentInput.isEmpty()) {
                    previousInput = currentInput;
                    currentInput = "";
                    currentOperator = buttonText.charAt(0);
                }
            }
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            displayField.setText("Error: Invalid input");
        }
    }

    private float performOperation(float operand1, float operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    JOptionPane.showMessageDialog(frame, "Error: Division by zero", "Error", JOptionPane.ERROR_MESSAGE);
                    return 0;
                }
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
