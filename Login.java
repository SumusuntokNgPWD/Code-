package worthonehundred;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;


public class Login implements ActionListener{
	
	
	
	
	JFrame frame = new JFrame();
	JButton button = new JButton("Login"); 
	JTextField username = new JTextField();
	JPasswordField password = new JPasswordField();
	JLabel name = new JLabel("Username: ");
	JLabel pas = new JLabel("Password: ");
	JLabel message = new JLabel();
	HashMap<String, String> logininfo = new HashMap<String, String>();
	private final JButton btnNewButton = new JButton("Signup here");
	
	
	Login(HashMap<String, String> loginInfoOriginal) {
		logininfo = loginInfoOriginal;
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,500,400);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		name.setBounds(50,100,75,25);	
	    pas.setBounds(50,150,75,25);
		message.setText("No account?");
		
		message.setBounds(132,255,80,25);
		message.setFont(new Font("Dialog", Font.BOLD, 12));
		
		username.setBounds(125,100,200,25);
		password.setBounds(125,150,200,25);
		button.setBackground(Color.GRAY);
		
		button.setBounds(125, 200,100, 25);
		button.addActionListener(this);
		
		
		
		
		
		
		
		frame.getContentPane().add(name);
		frame.getContentPane().add(pas);
		frame.getContentPane().add(message);
		frame.getContentPane().add(username);
		frame.getContentPane().add(password);
		frame.getContentPane().add(button);
		
		
		
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel title = new JLabel("STUDENT LOGIN");
		title.setBounds(88, 30, 400, 50);
		frame.getContentPane().add(title);
		title.setFont(new Font("MV Boli", Font.BOLD, 30));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(209, 257, 100, 23);
		
		frame.getContentPane().add(btnNewButton);
		
		JButton sign = new JButton("Sign up here");
		sign.setForeground(Color.BLACK);
		sign.setBounds(199, 242, 95, 23);
		
		sign.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				//HashMap <String, String> newLoginInfo = new HashMap <String, String> ();
				
					Signup sign = new Signup();
					sign.setVisible(true);					
					frame.dispose();
					
				
				
				 
				
				
				
			}
			
		});
			
				
		

	}	
	 

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
   
    
    if(e.getSource() == button) {
    	
			
			String name = username.getText();
			String haha = String.valueOf(password.getPassword());
			
			if(logininfo.containsKey(name)) {
				if(logininfo.get(name).equals(haha)) {
					message.setForeground(Color.green);
					message.setText("Login successful");
					frame.dispose();
					WelcomePage welcomePage= new WelcomePage();
				}
				else {
					message.setForeground(Color.red);
					message.setText("Wrong password");
					message.setBounds(0, 30,30,30);
				}

			}
			else {
				message.setForeground(Color.red);
				message.setText("User not found!");
			}
		}
	}	
		}
		
	



	