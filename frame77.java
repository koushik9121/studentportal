import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class frame77 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void f77() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame77 window = new frame77();
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
	public frame77() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable(data.t,data.Columns);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"001", "School of Engineering Sciences", "Prof.Prafulla Kalapatapu"},
				{"002", "School of Natural Sciences", "Palash Roy Choudary"},
				{"003", "School of Engineering Sciences", "Naga Ravi Kanth Devarapalli "},
				{"004", "Schoool oh Humanities and Social Sciences", "Salome Benhur"},
				{"005", "School of Natural Sciences", "Nagaiah Chamakuri"},
				{"006", "School of natural Sciences", "Murtaza Bohra"},
				{"007", "Schoool oh Humanities and Social Sciences", "Kumudham Balasubramanian"},
				{"008", "School of Natural Sciences", "Mahipal J"},
				{"009", "School of Natural Sciences", "Manoj Kumar Yadav"},
				{"010", "School of Engineering Sciences", "Ravi Kishore"},
			},
			new String[] {
				"ID Number", "Name", "Year-Branch"
			}
		));
		table.setBounds(0, 59, 434, 160);
		frame.getContentPane().add(table);
		
		JLabel lblFacultyData = new JLabel("Faculty Data");
		lblFacultyData.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFacultyData.setBounds(159, 22, 218, 26);
		frame.getContentPane().add(lblFacultyData);
		
	}
}
