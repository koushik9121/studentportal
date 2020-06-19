import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class frame18 {

	private JFrame frame;
	private JTextField usert;
	private JPasswordField passt;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void f18() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame18 window = new frame18();
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
	public frame18() {
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
		
		JLabel lblNewLabel = new JLabel("USER ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(98, 84, 90, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(98, 118, 90, 23);
		frame.getContentPane().add(lblPassword);
		
		usert = new JTextField();
		usert.setBounds(198, 87, 86, 20);
		frame.getContentPane().add(usert);
		usert.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Log In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b=0;
				char p[]=passt.getPassword();
				String k=new String(p);
				for( b=0;b<10;b++)
				{
					if(usert.getText().equals(data.t[b][0]) && k.equals(data.passwordt[b]))
		{
						Frame21 f21=new Frame21();
						f21.f21();
						break;
		}
					
					else 
					{

						lblNewLabel_1 = new JLabel("Your user id or password is incorrect.");
						lblNewLabel_1.setForeground(Color.RED);
						lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
						lblNewLabel_1.setBounds(75, 151, 276, 20);
						frame.getContentPane().add(lblNewLabel_1);
					}
				}
				
				data.teacher=b;
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(143, 182, 107, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		passt = new JPasswordField();
		passt.setBounds(198, 121, 86, 20);
		frame.getContentPane().add(passt);
		
	}
}
