import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class frame_new7 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void frame7() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame_new7 window = new frame_new7();
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
	public frame_new7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		data l=new data();
		l.info(l);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 474, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable(data.a,data.Columns);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setBounds(10, 22, 430, 228);
		frame.getContentPane().add(table);
		
	}
}
