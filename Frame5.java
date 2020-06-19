import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void f5() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame5 window = new Frame5();
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
	public Frame5() {
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
		
		JButton btnFacultyData = new JButton("Faculty Data");
		btnFacultyData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame77 p1=new frame77();
				p1.f77();
				
			}
		});
		btnFacultyData.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFacultyData.setBounds(138, 73, 160, 40);
		frame.getContentPane().add(btnFacultyData);
		
		JButton btnRequestList = new JButton("Request list");
		btnRequestList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame88 b=new frame88();
				b.f88();
			}
			
		});
		btnRequestList.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRequestList.setBounds(138, 129, 160, 40);
		frame.getContentPane().add(btnRequestList);
	}

}
