import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class  Frame1 {

	private JFrame frame;
	private JTextField textField;
	private JButton btnLogin;
	private JLabel lblAdminstrator;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void F1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(114, 77, 122, 45);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(209, 91, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(158, 167, 171, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(114, 122, 122, 45);
		frame.getContentPane().add(lblPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(164, 190, 89, 23);
		frame.getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String u1="MEC";
			String p1="Test1234";
			String s=textField.getText();
			char p[]=passwordField.getPassword();
			String k=new String(p);
			if(u1.equals(s) && p1.equals(k))
			{
				Adminblocks ab=new Adminblocks();
				ab.Ab();	
			}
			else if(u1.equals(s))
			{
				lblNewLabel_1.setText("Wrong Password");
			}
			else
			{
				lblNewLabel_1.setText("No such user");
			}
			
            
		}
	});
		
		lblAdminstrator = new JLabel("ADMINSTRATOR");
		lblAdminstrator.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdminstrator.setBounds(139, 21, 175, 45);
		frame.getContentPane().add(lblAdminstrator);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 136, 86, 20);
		frame.getContentPane().add(passwordField);
		
		
	}
}
