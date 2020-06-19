import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame16 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void f16() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame16 window = new Frame16();
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
	public Frame16() {
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
		
		JLabel lblNewLabel = new JLabel("Question");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(30, 90, 93, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(378, 44, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblTeacherId = new JLabel("Teacher ID");
		lblTeacherId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeacherId.setBounds(30, 65, 93, 26);
		frame.getContentPane().add(lblTeacherId);
		
		textField = new JTextField();
		textField.setBounds(124, 90, 109, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 65, 109, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				data.tid=textField_1.getText();
					
						if(data.a[data.stu][4].equals(""))
		{
						data.a[data.stu][4]=textField.getText();
		}
						else
						{
							data.a[data.stu][5]=textField.getText();
						}
					
				}
				
			
					});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(83, 178, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\NAIMISHA\\Desktop\\profile-icon-9.png"));
		lblNewLabel_1.setBounds(124, -14, 335, 277);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
