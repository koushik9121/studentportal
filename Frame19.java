import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Frame19 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void f19() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame19 window = new Frame19();
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
	public Frame19() {
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
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(59, 60, 77, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("ID");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(59, 119, 77, 20);
		frame.getContentPane().add(lblName);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCourse.setBounds(59, 174, 77, 20);
		frame.getContentPane().add(lblCourse);
		
		JLabel name = new JLabel(data.t[data.teacher][2]);
		name.setFont(new Font("Tahoma", Font.BOLD, 14));
		name.setBounds(132, 60, 189, 20);
		frame.getContentPane().add(name);
		
		JLabel id = new JLabel(data.t[data.teacher][0]);
		id.setFont(new Font("Tahoma", Font.BOLD, 14));
		id.setBounds(132, 121, 104, 20);
		frame.getContentPane().add(id);
		
		JLabel course = new JLabel(data.t[data.teacher][1]);
		course.setFont(new Font("Tahoma", Font.BOLD, 14));
		course.setBounds(132, 174, 218, 20);
		frame.getContentPane().add(course);
	}
}
