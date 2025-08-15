package com.java.Project.Calculator;
import java.util.Stack;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frame;
	private JTextField txtEnterValue;
	private JButton btnNewButton_2;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 312, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtEnterValue = new JTextField();
		txtEnterValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEnterValue.setBounds(21, 30, 258, 56);
		frame.getContentPane().add(txtEnterValue);
		txtEnterValue.setColumns(10);
		
		JButton btnNewButton_AC = new JButton("AC");
		btnNewButton_AC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEnterValue.setText(null);
			}
		});
		btnNewButton_AC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_AC.setForeground(new Color(255, 0, 0));
		btnNewButton_AC.setBounds(21, 107, 66, 56);
		frame.getContentPane().add(btnNewButton_AC);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtEnterValue.getText()+btnNewButton_1.getText();
				txtEnterValue.setText(number);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(21, 273, 66, 56);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtEnterValue.getText()+btnNewButton_0.getText();
				txtEnterValue.setText(number);
			}
		});
		btnNewButton_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_0.setBounds(21, 328, 66, 56);
		frame.getContentPane().add(btnNewButton_0);
		
		btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtEnterValue.getText()+btnNewButton_2.getText();
				txtEnterValue.setText(number);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(85, 273, 66, 56);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtEnterValue.getText()+btnNewButton_3.getText();
				txtEnterValue.setText(number);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(149, 273, 66, 56);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_div = new JButton("/");
		btnNewButton_div.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			        txtEnterValue.setText(txtEnterValue.getText() + "/");
			    }

		});
		btnNewButton_div.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_div.setBounds(213, 273, 66, 56);
		frame.getContentPane().add(btnNewButton_div);
		
		JButton btnNewButton_dot = new JButton(".");
		btnNewButton_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtEnterValue.getText()+btnNewButton_dot.getText();
				txtEnterValue.setText(number);
			}
		});
		btnNewButton_dot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_dot.setBounds(85, 328, 66, 56);
		frame.getContentPane().add(btnNewButton_dot);
		
		JButton btnNewButton_equal = new JButton("=");
		btnNewButton_equal.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String expression = txtEnterValue.getText();
		        String result = ExpressionEvaluator.evaluate(expression);
		        txtEnterValue.setText(result);
		    }
		});

		btnNewButton_equal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_equal.setBounds(149, 328, 66, 56);
		frame.getContentPane().add(btnNewButton_equal);
		
		JButton btnNewButton_percent = new JButton("%");
		btnNewButton_percent.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			        txtEnterValue.setText(txtEnterValue.getText() + "%");
			    }

		});
		btnNewButton_percent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_percent.setBounds(213, 328, 66, 56);
		frame.getContentPane().add(btnNewButton_percent);
		
		JButton btnNewButton_mul = new JButton("*");
		btnNewButton_mul.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			        txtEnterValue.setText(txtEnterValue.getText() + "*");
			    }

		});
		btnNewButton_mul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_mul.setBounds(213, 218, 66, 56);
		frame.getContentPane().add(btnNewButton_mul);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtEnterValue.getText()+btnNewButton_6.getText();
				txtEnterValue.setText(number);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_6.setBounds(149, 218, 66, 56);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtEnterValue.getText()+btnNewButton_5.getText();
				txtEnterValue.setText(number);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5.setBounds(85, 218, 66, 56);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtEnterValue.getText()+btnNewButton_4.getText();
				txtEnterValue.setText(number);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBounds(21, 218, 66, 56);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_sub = new JButton("-");
		btnNewButton_sub.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        txtEnterValue.setText(txtEnterValue.getText() + "-");
		    }
		});
		btnNewButton_sub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_sub.setBounds(213, 163, 66, 56);
		frame.getContentPane().add(btnNewButton_sub);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtEnterValue.getText()+btnNewButton_9.getText();
				txtEnterValue.setText(number);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_9.setBounds(149, 163, 66, 56);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtEnterValue.getText()+btnNewButton_8.getText();
				txtEnterValue.setText(number);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_8.setBounds(85, 163, 66, 56);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtEnterValue.getText()+btnNewButton_7.getText();
				txtEnterValue.setText(number);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_7.setBounds(21, 163, 66, 56);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_add = new JButton("+");
			btnNewButton_add.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        txtEnterValue.setText(txtEnterValue.getText() + "+");
			    }
			});
		btnNewButton_add.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_add.setBounds(213, 107, 66, 56);
		frame.getContentPane().add(btnNewButton_add);
		
		JButton btnNewButton_00 = new JButton("00");
		btnNewButton_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtEnterValue.getText()+btnNewButton_00.getText();
				txtEnterValue.setText(number);
			}
		});
		btnNewButton_00.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_00.setBounds(149, 107, 66, 56);
		frame.getContentPane().add(btnNewButton_00);
		
		JButton btnNewButton_clear = new JButton("C");
		btnNewButton_clear.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String currentText = txtEnterValue.getText();
		        if (currentText.length() > 0) {
		            txtEnterValue.setText(currentText.substring(0, currentText.length() - 1));
		        }
		    }
		});
		btnNewButton_clear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_clear.setBounds(85, 107, 66, 56);
		frame.getContentPane().add(btnNewButton_clear);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(87, 0, 118, 31);
		frame.getContentPane().add(lblNewLabel);
	}
}


class ExpressionEvaluator {
    public static String evaluate(String expression) {
        try {
            if (expression == null || expression.isEmpty()) return "0";
            expression = expression.replaceAll("\\s+", "");

            double result = parseExpression(expression);
            return String.format("%.2f", result);
        } catch (Exception e) {
            return "Error";
        }
    }

    private static double parseExpression(String expr) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int i = 0;
        while (i < expr.length()) {
            char ch = expr.charAt(i);

            if (Character.isDigit(ch) || ch == '.') {
                int j = i;
                while (j < expr.length() && (Character.isDigit(expr.charAt(j)) || expr.charAt(j) == '.')) j++;
                double number = Double.parseDouble(expr.substring(i, j));
                numbers.push(number);
                i = j;
            } else if (isOperator(ch)) {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    processTop(numbers, operators);
                }
                operators.push(ch);
                i++;
            } else {
                throw new RuntimeException("Invalid character: " + ch);
            }
        }

        while (!operators.isEmpty()) {
            processTop(numbers, operators);
        }

        return numbers.pop();
    }

    private static void processTop(Stack<Double> numbers, Stack<Character> operators) {
        double b = numbers.pop();
        double a = numbers.pop();
        char op = operators.pop();

        switch (op) {
            case '+': numbers.push(a + b); break;
            case '-': numbers.push(a - b); break;
            case '*': numbers.push(a * b); break;
            case '/': numbers.push(b != 0 ? a / b : Double.NaN); break;
            case '%': numbers.push(a % b); break;
            default: throw new RuntimeException("Unknown operator: " + op);
        }
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%';
    }

    private static int precedence(char op) {
        return (op == '+' || op == '-') ? 1 : 2;
    }
}