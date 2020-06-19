import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame21 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void f21() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame21 window = new Frame21();
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
	public Frame21() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.ITALIC, 15));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton btnMaterial = new JButton("Material");
		btnMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame22 f22=new Frame22();
				f22.f22();
			}
		});
		btnMaterial.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMaterial.setBounds(200, 55, 104, 76);
		frame.getContentPane().add(btnMaterial);
		
		JButton btnDoubts = new JButton("Doubts");
		btnDoubts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame20 f20=new Frame20();
				f20.f20();
			}
		});
		btnDoubts.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDoubts.setBounds(147, 142, 104, 76);
		frame.getContentPane().add(btnDoubts);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame19 f19=new Frame19();
				f19.f19();
			}
		});
		btnProfile.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnProfile.setBounds(86, 55, 104, 76);
		frame.getContentPane().add(btnProfile);
		
	}

}
