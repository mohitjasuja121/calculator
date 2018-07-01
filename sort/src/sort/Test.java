package sort;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class Test {

	private JFrame frame;
	private JTextField t1;
	double first;
	double second;
	String operation;
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
/** **/
	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 426, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("mohit's calculator");
		frame.setResizable(false);
		
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.BOLD, 22));
		t1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		t1.setBounds(10, 13, 388, 65);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		//..............row 1
		
		JButton r11 = new JButton("←");
		r11.setFont(new Font("Tahoma", Font.BOLD, 26));
		r11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((t1.getText().length())>0){
					StringBuilder st = new StringBuilder(t1.getText());
					st.deleteCharAt(t1.getText().length()-1);
					String back = st.toString();
					t1.setText(back);
				}
				
			}
		});
		r11.setBounds(10, 92, 97, 58);
		frame.getContentPane().add(r11);
		
		
		JButton r12 = new JButton("C");
		r12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t1.setText(null);
			}
		});
		r12.setFont(new Font("Tahoma", Font.BOLD, 26));
		r12.setBounds(107, 92, 97, 58);
		frame.getContentPane().add(r12);
		
		
		JButton r13 = new JButton("%");
		r13.setFont(new Font("Tahoma", Font.BOLD, 26));
		r13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(t1.getText());
				t1.setText("");
				operation = "%";
			}
		});
		r13.setBounds(204, 92, 97, 58);
		frame.getContentPane().add(r13);
		
		JButton r14 = new JButton("+");
		r14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(t1.getText());
				t1.setText("");
				operation = "+";
				
			}
		});
		r14.setFont(new Font("Tahoma", Font.BOLD, 26));
		r14.setBounds(301, 92, 97, 58);
		frame.getContentPane().add(r14);
		
	
		//................. row 2
		
		JButton r21 = new JButton("7");
		r21.setFont(new Font("Tahoma", Font.BOLD, 26));
		r21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = t1.getText() + r21.getText();
				t1.setText(num);
			}
		});
		r21.setBounds(10, 150, 97, 58);
		frame.getContentPane().add(r21);
		
		
		JButton r22 = new JButton("8");
		r22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = t1.getText() + r22.getText();
				t1.setText(num);
			}
		});
		r22.setFont(new Font("Tahoma", Font.BOLD, 26));
		r22.setBounds(107, 150, 97, 58);
		frame.getContentPane().add(r22);
		
		
		JButton r23 = new JButton("9");
		r23.setFont(new Font("Tahoma", Font.BOLD, 26));
		r23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = t1.getText() + r23.getText();
				t1.setText(num);
			}
		});
		r23.setBounds(204, 150, 97, 58);
		frame.getContentPane().add(r23);
		
		JButton r24 = new JButton("-");
		r24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(t1.getText());
				t1.setText("");
				operation = "-";
			}
		});
		r24.setFont(new Font("Tahoma", Font.BOLD, 26));
		r24.setBounds(301, 150, 97, 58);
		frame.getContentPane().add(r24);
		
		//................... row 3
		
		JButton r31 = new JButton("4");
		r31.setFont(new Font("Tahoma", Font.BOLD, 26));
		r31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = t1.getText() + r31.getText();
				t1.setText(num);
			}
		});
		r31.setBounds(10, 208, 97, 58);
		frame.getContentPane().add(r31);
		
		
		JButton r32 = new JButton("5");
		r32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = t1.getText() + r32.getText();
				t1.setText(num);
				
			}
		});
		r32.setFont(new Font("Tahoma", Font.BOLD, 26));
		r32.setBounds(107, 208, 97, 58);
		frame.getContentPane().add(r32);
		
		
		JButton r33 = new JButton("6");
		r33.setFont(new Font("Tahoma", Font.BOLD, 26));
		r33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = t1.getText() + r33.getText();
				t1.setText(num);
			}
		});
		r33.setBounds(204, 208, 97, 58);
		frame.getContentPane().add(r33);
		
		JButton r34 = new JButton("*");
		r34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(t1.getText());
				t1.setText("");
				operation = "*";
			}
		});
		r34.setFont(new Font("Tahoma", Font.BOLD, 26));
		r34.setBounds(301, 208, 97, 58);
		frame.getContentPane().add(r34);
		
		//..................... row 4
		
		JButton r41 = new JButton("1");
		r41.setFont(new Font("Tahoma", Font.BOLD, 26));
		r41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = t1.getText() + r41.getText();
				t1.setText(num);
			}
		});
		r41.setBounds(10, 266, 97, 58);
		frame.getContentPane().add(r41);
		
		
		JButton r42 = new JButton("2");
		r42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = t1.getText() + r42.getText();
				t1.setText(num);
			}
		});
		r42.setFont(new Font("Tahoma", Font.BOLD, 26));
		r42.setBounds(107, 266, 97, 58);
		frame.getContentPane().add(r42);
		
		
		JButton r43 = new JButton("3");
		r43.setFont(new Font("Tahoma", Font.BOLD, 26));
		r43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = t1.getText() + r43.getText();
				t1.setText(num);
			}
		});
		r43.setBounds(204, 266, 97, 58);
		frame.getContentPane().add(r43);
		
		JButton r44 = new JButton("/");
		r44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(t1.getText());
				t1.setText("");
				operation = "/";
			}
		});
		r44.setFont(new Font("Tahoma", Font.BOLD, 26));
		r44.setBounds(301, 266, 97, 58);
		frame.getContentPane().add(r44);
		
		//................. row 5
		
		JButton r51 = new JButton("0");
		r51.setFont(new Font("Tahoma", Font.BOLD, 26));
		r51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = t1.getText() + r51.getText();
				t1.setText(num);
			}
		});
		r51.setBounds(10, 324, 97, 58);
		frame.getContentPane().add(r51);
		
		
		JButton r52 = new JButton(".");
		r52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = t1.getText() + r52.getText();
				t1.setText(num);
			}
		});
		r52.setFont(new Font("Tahoma", Font.BOLD, 26));
		r52.setBounds(107, 324, 97, 58);
		frame.getContentPane().add(r52);
		
		
		JButton r53 = new JButton("±");
		r53.setFont(new Font("Tahoma", Font.BOLD, 26));
		r53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*	first = Double.parseDouble(t1.getText());
			    first = first * (-1);
				t1.setText(Double.toString(first));
				*/
				double op = Double.parseDouble(t1.getText());
				op = op*(-1);
				t1.setText(Double.toString(op));
			}
		});
		r53.setBounds(204, 324, 97, 58);
		frame.getContentPane().add(r53);
		
		JButton r54 = new JButton("=");
		r54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				second = Double.parseDouble(t1.getText());
				
				if(operation == "+"){
					result = first+second;
					ans = String.format("%.2f",result);
					t1.setText(ans);
				//	t1.setText(Double.toString(result));
					
				}
				else if(operation == "-"){
					result = first-second;
					t1.setText(Double.toString(result));
				}
				else if(operation == "*"){
					result = first*second;
					t1.setText(Double.toString(result));
				}
				else if(operation == "/"){
					result = first/second;
					t1.setText(Double.toString(result));
				}
				
				else if(operation == "%"){
					result = first/second;
					result = result*100;
					t1.setText(Double.toString(result));
				}
				
			}
		});
		r54.setFont(new Font("Tahoma", Font.BOLD, 26));
		r54.setBounds(301, 324, 97, 58);
		frame.getContentPane().add(r54);
		
	}
}
