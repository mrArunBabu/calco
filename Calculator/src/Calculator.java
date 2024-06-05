import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Calculator implements ActionListener {
	//set jframe global to access it on main function
	JFrame jf;
	
	//set displaylabel global to access it on main function
	JLabel displayLabel;
	
	//set function buttons global to access it on main function
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton sixButton;
	JButton fiveButton;
	JButton fourButton;
	JButton threeButton;
	JButton twoButton;
	JButton oneButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton multyButton;
	JButton minusButton;
	JButton addButton;
	JButton clearButton;
	String operator;
	//create a boolean to mark the button click
	boolean isOperatorClicked = false;
	
	//
	String oldValue;
	// Create method calculator
	public Calculator() {
		jf = new JFrame("Calculator");
		
		// set size of the window and the location on screen
		jf.setLayout(null);
		jf.setSize(550, 600);
		jf.setLocation(200, 100);
		
		
		//Make it visible
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create display
		
		displayLabel = new JLabel();
		
		// Add dimensions and location on screen to label 
		displayLabel.setBounds(30, 50, 480, 60);
		
		//Choose display background color
		displayLabel.setBackground(Color.gray);
		
		//set the label opaque
		displayLabel.setOpaque(true);
		
		//Set the alignment of the display text
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		//Choose the text color
		displayLabel.setForeground(Color.white);
		
		//Choose the font size and type
		displayLabel.setFont(new Font("Arial", Font.PLAIN, 40));
		
		jf.add(displayLabel);
		
		
		//add/create buttons
	
		sevenButton = new JButton("7");
		sevenButton.setBounds(30,130,80,80);
		// Change to desired font size
		sevenButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		// set button color
		sevenButton.setBackground(Color.GRAY);
		sevenButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(130,130,80,80);
		eightButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		eightButton.setBackground(Color.GRAY);
		eightButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		 nineButton = new JButton("9");
		nineButton.setBounds(230,130,80,80);
		nineButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		nineButton.setBackground(Color.GRAY);
		nineButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		 fourButton = new JButton("4");
		fourButton.setBounds(30,230,80,80);
		fourButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		fourButton.setBackground(Color.GRAY);
		fourButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		 fiveButton = new JButton("5");
		fiveButton.setBounds(130,230,80,80);
		fiveButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		fiveButton.setBackground(Color.GRAY);
		fiveButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		 sixButton = new JButton("6");
		sixButton.setBounds(230,230,80,80);
		sixButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		sixButton.setBackground(Color.GRAY);
		sixButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		 oneButton = new JButton("1");
		oneButton.setBounds(30,330,80,80);
		oneButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		oneButton.setBackground(Color.GRAY);
		oneButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		 twoButton = new JButton("2");
		twoButton.setBounds(130,330,80,80);
		twoButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		twoButton.setBackground(Color.GRAY);
		twoButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		 threeButton = new JButton("3");
		threeButton.setBounds(230,330,80,80);
		threeButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		threeButton.setBackground(Color.GRAY);
		threeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		 dotButton = new JButton(".");
		dotButton.setBounds(30,430,80,80);
		dotButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		dotButton.setBackground(Color.GRAY);
		dotButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		 zeroButton = new JButton("0");
		zeroButton.setBounds(130,430,80,80);
		zeroButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		zeroButton.setBackground(Color.GRAY);
		zeroButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		 equalButton = new JButton("=");
		equalButton.setBounds(230,430,80,80);
		equalButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		equalButton.setBackground(Color.GRAY);
		equalButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton = new JButton("/");
		divButton.setBounds(330,130,80,80);
		divButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		divButton.setBackground(Color.GRAY);
		divButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		 multyButton = new JButton("*");
		multyButton.setBounds(330,230,80,80);
		multyButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		multyButton.setBackground(Color.GRAY);
		multyButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		multyButton.addActionListener(this);
		jf.add(multyButton);
		
		 minusButton = new JButton("-");
		minusButton.setBounds(330,330,80,80);
		minusButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		minusButton.setBackground(Color.GRAY);
		minusButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		 addButton = new JButton("+");
		addButton.setBounds(330,430,80,80);
		addButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		addButton.setBackground(Color.GRAY);
		addButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		addButton.addActionListener(this);
		jf.add(addButton);
		
		clearButton = new JButton("C");
		clearButton.setBounds(430,430,80,80);
		clearButton.setFont(sevenButton.getFont().deriveFont(Font.BOLD, 60));
		clearButton.setBackground(Color.GRAY);
		clearButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		
		
		
	}
 //Create the Main  class to call the calculator constructor 
	
	public static void main(String[]arg) {
		 
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		if(e.getSource() == sevenButton) {
			if(isOperatorClicked == true) {
				displayLabel.setText("7");
				isOperatorClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
		} else if(e.getSource() == eightButton) {
			if(isOperatorClicked == true) {
				displayLabel.setText("8");
				isOperatorClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
		}else if(e.getSource() == nineButton) {
			if(isOperatorClicked == true) {
				displayLabel.setText("9");
				isOperatorClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
			
		}else if(e.getSource() == sixButton) {
			if(isOperatorClicked == true) {
				displayLabel.setText("6");
				isOperatorClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}else if(e.getSource() == fiveButton) {
			if(isOperatorClicked == true) {
				displayLabel.setText("5");
				isOperatorClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
			
		}else if(e.getSource() == fourButton) {
			if(isOperatorClicked == true) {
				displayLabel.setText("4");
				isOperatorClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
			
		}else if(e.getSource() == threeButton) {
			if(isOperatorClicked == true) {
				displayLabel.setText("3");
				isOperatorClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}else if(e.getSource() == twoButton) {
			if(isOperatorClicked == true) {
				displayLabel.setText("2");
				isOperatorClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}else if(e.getSource() == oneButton) {
			if(isOperatorClicked == true) {
				displayLabel.setText("1");
				isOperatorClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}else if(e.getSource() == zeroButton) {
			if(isOperatorClicked == true) {
				displayLabel.setText("0");
				isOperatorClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource() == dotButton) {
			if(isOperatorClicked == true) {
				displayLabel.setText(".");
				isOperatorClicked = false;
			} else {
				displayLabel.setText(displayLabel.getText()+".");
			}
			
		}else if (e.getSource() == equalButton) {
		    try {
		        String newValue = displayLabel.getText();
		        // Ensure oldValue is not null or empty
		        if (oldValue == null || oldValue.isEmpty()) {
		            displayLabel.setText("Error: Missing operand");
		            return;
		        }
		        
		        // Ensure newValue is not empty
		        if (newValue.isEmpty()) {
		            displayLabel.setText("Error: Missing operand");
		            return;
		        }

		        Float oldValueF = Float.parseFloat(oldValue);
		        Float newValueF = Float.parseFloat(newValue);

		        float result;
		        // Perform arithmetic operation based on the operator
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

		        // Update display with the result
		        displayLabel.setText(Float.toString(result));
		    } catch (NumberFormatException ex) {
		        displayLabel.setText("Error: Invalid input");
		    }
		

			    // Handle other button clicks...
			}else if(e.getSource() == divButton) {
			displayLabel.setText("/");
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
		}else if(e.getSource() == multyButton) {
			displayLabel.setText("*");
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
		}else if(e.getSource() == minusButton) {
			displayLabel.setText("-");
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
		}else if(e.getSource() == addButton) {
			displayLabel.setText("+");
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
		}else if(e.getSource() == clearButton) {
			displayLabel.setText("");
		}
		
		
		
	}
		
	}
