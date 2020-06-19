import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame88 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void f88() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame88 window = new frame88();
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
	public frame88() {
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
		
		JLabel lblRequestList = new JLabel("Request list");
		lblRequestList.setBounds(153, 28, 95, 38);
		frame.getContentPane().add(lblRequestList);
	}

}
