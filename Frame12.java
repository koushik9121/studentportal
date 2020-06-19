import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Frame12{

	private JFrame frame;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void f12(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame12 window = new Frame12();
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
	public Frame12() {
		initializ();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializ() {
		data dp=new data();
		dp.info(dp);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NAIMISHA\\Desktop\\profile-icon-9.png"));
		lblNewLabel.setBounds(109, -87, 577, 402);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(10, 50, 76, 25);
		frame.getContentPane().add(lblName);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(10, 86, 76, 25);
		frame.getContentPane().add(lblId);
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYear.setBounds(10, 122, 76, 25);
		frame.getContentPane().add(lblYear);
		
		JLabel lblCgpa = new JLabel("CGPA:");
		lblCgpa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCgpa.setBounds(10, 158, 76, 25);
		frame.getContentPane().add(lblCgpa);
		
		btnNewButton = new JButton("Save Changes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  String k=textField.getText();
			  data.a[data.stu][1]=k;
			  k=textField_1.getText();
			  data.a[data.stu][0]=k;
			  k=textField_2.getText();
			  data.a[data.stu][2]=k;
			  
				
			}
		});
		btnNewButton.setBounds(20, 199, 119, 23);
		frame.getContentPane().add(btnNewButton);
		String k[][]=Frame11.a;
		try
		{
		}
		catch(Exception e)
		{
			
		}
		
		
		textField = new JTextField();
		textField.setBounds(63, 54, 111, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(data.a[data.stu][1]);
		
		textField_1 = new JTextField();
		textField_1.setBounds(63, 86, 111, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText(data.a[data.stu][0]);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(63, 122, 111, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setText(data.a[data.stu][2]);
		
		JLabel label = new JLabel("");
		label.setBounds(63, 163, 111, 18);
		frame.getContentPane().add(label);
		label.setText(data.a[data.stu][3]);
		
	}

}
