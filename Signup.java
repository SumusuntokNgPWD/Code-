package worthonehundred;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class Signup extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	
	public Signup() {
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 639, 500);
		frame.setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		frame.getContentPane().setLayout(null);
		
		JLabel login = new JLabel("Sign up Forms");
		login.setFont(new Font("Stencil", Font.PLAIN, 30));
		login.setBounds(188, 11, 221, 41);
		frame.getContentPane().add(login);
		
		JPanel panel = new JPanel();
		panel.setBounds(114, 63, 356, 334);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Email : ");
		lblNewLabel_2.setBounds(39, 223, 44, 17);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_2 = new JTextField();
		textField_2.setBounds(150, 223, 152, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password :");
		lblNewLabel.setBounds(39, 155, 89, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show password");
		rdbtnNewRadioButton.setBounds(145, 184, 130, 23);
		panel.add(rdbtnNewRadioButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(150, 154, 152, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Username : ");
		lblNewLabel_1.setBounds(39, 105, 89, 14);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_1 = new JTextField();
		textField_1.setBounds(150, 104, 152, 20);
		panel.add(textField_1);
		
		textField_1.setColumns(10);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Your name :");
		lblNewLabel_3.setBounds(39, 54, 76, 17);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setBounds(150, 54, 152, 20);
		panel.add(textField);
		
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Already have an account?");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(62, 281, 152, 14);
		panel.add(lblNewLabel_4);
		
		JButton login_2 = new JButton("Login here");
		login_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		login_2.setBounds(209, 278, 93, 23);
		panel.add(login_2);
		
		login_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
				 new Login(null);
				 
			}
		});
		
		
		
		frame.setVisible(true);
		
		
		
	}
	
	 /*private void Login() {
	        // Create an instance of the login page
	      Login log = new Login(null);

	        // Close the current main page
	        dispose();
	    } */


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
