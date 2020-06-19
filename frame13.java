import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class framefuckoff {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framefuckoff window = new framefuckoff();
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
	public framefuckoff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(42, 33, 83, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("pin");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(42, 74, 83, 22);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBranch.setBounds(42, 120, 83, 22);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYear.setBounds(42, 145, 83, 22);
		frame.getContentPane().add(lblYear);
		
		JLabel lblConfirmPassword = new JLabel("confirm pin");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConfirmPassword.setBounds(42, 98, 94, 22);
		frame.getContentPane().add(lblConfirmPassword);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblId.setBounds(42, 55, 83, 22);
		frame.getContentPane().add(lblId);
		
		JLabel lblCgpa = new JLabel("CGPA");
		lblCgpa.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCgpa.setBounds(42, 164, 83, 22);
		frame.getContentPane().add(lblCgpa);
		
		JButton btnRegister = new JButton("SEND REQUEST");
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegister.setBounds(161, 215, 143, 23);
		frame.getContentPane().add(btnRegister);
		
		textField = new JTextField();
		textField.setBounds(149, 33, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 55, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(149, 77, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(149, 101, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(149, 123, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(149, 145, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(149, 167, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\NAIMISHA\\Desktop\\profile-icon-9.png"));
		lblNewLabel_1.setBounds(171, -10, 276, 286);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
