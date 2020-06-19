import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Frame11 {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblStudent;
	private JButton btnLogin;
	private JButton btnCreateAccount;
	private JPasswordField passwordField;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static int i=0;
	public static String a[][]=new String[4][];
	public static void f11() {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame11 window = new Frame11();
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
	public Frame11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
	    
		
		
		data po=new data();
		po.info(po);
		//password[]
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("ID number:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(100, 85, 113, 35);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(100, 122, 113, 35);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(204, 94, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblStudent = new JLabel("STUDENT");
		lblStudent.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblStudent.setBounds(150, 40, 113, 35);
		frame.getContentPane().add(lblStudent);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(150, 197, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCreateAccount.setBounds(291, 11, 133, 23);
		frame.getContentPane().add(btnCreateAccount);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(204, 131, 86, 20);
		frame.getContentPane().add(passwordField);
		
		label = new JLabel("");
		label.setBounds(60, 168, 301, 23);
		frame.getContentPane().add(label);
		
		
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame133 f=new frame133();
				f.f133();
                
			}
		});
		
		
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String e=textField.getText();
				char p[]=passwordField.getPassword();
				String k=new String(p);
				for(i=0;i<20;i++)
				{
					if(e.equals(data.a[i][0]) && k.equals(data.password[i]))
					{
						Frame14 f=new Frame14();
						f.f14();
						break;
					}
					else if(e.equals(data.a[i][0]))
					{
						label.setText("Wrong password");
					}
					
					else
					{
						label.setText("Username does not exist, Create an account");
					}
				}
				
				data.stu=i;
                
			}
		});

	
	}
	
}









