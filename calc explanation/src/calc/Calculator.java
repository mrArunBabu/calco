package calc; // This line declares the package name where the Calculator class belongs to.

import javax.swing.BorderFactory; // Importing necessary classes from javax.swing package.
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener { // Class declaration for Calculator, implementing ActionListener interface.

    JFrame jf; // Declaration of JFrame object.
    JLabel displayLabel; // Declaration of JLabel object for displaying the calculator input/output.
    JButton sevenButton, eightButton, nineButton, sixButton, fiveButton, fourButton, threeButton, twoButton,
            oneButton, dotButton, zeroButton, equalButton, divButton, multyButton, minusButton, addButton,
            clearButton; // Declaration of JButton objects for numeric buttons, operators, and clear button.
    String operator; // Variable to store the selected operator.
    boolean isOperatorClicked = false; // Flag to track if an operator button has been clicked.
    String oldValue; // Variable to store the previous input value.

    public Calculator() { // Constructor for Calculator class.
        jf = new JFrame("Calculator"); // Creating a JFrame object with title "Calculator".
        jf.setLayout(null); // Setting layout to null for custom positioning of components.
        jf.setSize(550, 600); // Setting the size of the frame.
        jf.setLocation(200, 100); // Setting the location of the frame on the screen.
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting default close operation.

        displayLabel = new JLabel(); // Creating a JLabel object for the display.
        displayLabel.setBounds(30, 50, 480, 60); // Setting bounds for the display label.
        displayLabel.setBackground(Color.gray); // Setting background color.
        displayLabel.setOpaque(true); // Making background opaque.
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); // Setting text alignment to right.
        displayLabel.setForeground(Color.white); // Setting foreground color.
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 40)); // Setting font.
        jf.add(displayLabel); // Adding the display label to the frame.

        // Initializing and setting up numeric buttons...
        sevenButton = new JButton("7"); // Creating JButton object with label "7".
        sevenButton.setBounds(30, 130, 80, 80); // Setting bounds for the button.
        sevenButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60)); // Setting font and style.
        sevenButton.setBackground(Color.GRAY); // Setting background color.
        sevenButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5)); // Setting border.
        sevenButton.addActionListener(this); // Adding ActionListener to handle button click.
        jf.add(sevenButton); // Adding the button to the frame.

        // (Similar setup for other numeric buttons, operator buttons, and clear button)

        // Make the frame visible after adding components.
        jf.setVisible(true);
    }

    public static void main(String[] args) { // Main method to start the calculator.
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) { // ActionPerformed method to handle button clicks.
        // Handling each button click based on the source.
    }

    private void handleNumericButton(String number) { // Method to handle numeric button clicks.
        // Logic to handle numeric button clicks.
    }

    private void handleDotButton() { // Method to handle dot button click.
        // Logic to handle dot button click.
    }

    private void handleOperator(String op) { // Method to handle operator button clicks.
        // Logic to handle operator button clicks.
    }

    private void calculateResult() { // Method to calculate the result.
        // Logic to perform calculations.
    }

    private void clearDisplay() { // Method to clear the display.
        // Logic to clear the display.
    }
}
