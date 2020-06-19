import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void F4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4 window = new Frame4();
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
	public Frame4() {
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
		
		JButton btnData = new JButton("Student Data");
		btnData.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnData.setBounds(141, 70, 133, 34);
		frame.getContentPane().add(btnData);
		btnData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame_new7 f4=new frame_new7();
				f4.frame7();
				
                
			}
		});
		
		JButton btnRequestList = new JButton("Request List");
		btnRequestList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame8 f=new Frame8();
				f.f8();
			}
		});
		btnRequestList.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRequestList.setBounds(141, 115, 133, 34);
		frame.getContentPane().add(btnRequestList);
	}

}
