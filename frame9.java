import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;

public class frame9 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void f9() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame9 window = new frame9();
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
	public frame9() {
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
		String[] col= {"","","","",""};
		table = new JTable(data.t,col);
		table.setBounds(47, 54, 330, 160);
		frame.getContentPane().add(table);
	}

}
