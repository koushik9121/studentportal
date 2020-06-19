import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame14 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void f14() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame14 window = new Frame14();
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
	public Frame14() {
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
		
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnProfile.setBounds(52, 30, 163, 97);
		frame.getContentPane().add(btnProfile);
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame12 f=new Frame12();
				f.f12();
                
			}});
		
		JButton btnStudyMaterial = new JButton("Study Material");
		btnStudyMaterial.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStudyMaterial.setBounds(225, 30, 163, 97);
		frame.getContentPane().add(btnStudyMaterial);
		btnStudyMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame15 f=new Frame15();
				f.f15();
			}});
		
		JButton btnDoubts = new JButton("Doubts");
		btnDoubts.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDoubts.setBounds(52, 132, 163, 97);
		frame.getContentPane().add(btnDoubts);
		btnDoubts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame16 f=new Frame16();
				f.f16();
				
			}});
		
		JButton btnAnswers = new JButton("Answers");
		btnAnswers.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAnswers.setBounds(225, 132, 163, 97);
		frame.getContentPane().add(btnAnswers);
		btnAnswers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame17 f=new frame17();
				f.f17();
				
			}});
	}

}
