import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class frame6 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void f6() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame6 window = new frame6();
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
	public frame6() {
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
		
		String q[][]=new String[2][20];
		String col[]= {"questions","answers"};
		
		int p=0;
		for(int t=0;t<10;t++)
		{
			if(!data.a[t][4].equals("")) {
				q[0][p]=data.a[t][4];
				p++;
			}
			
			if(!data.a[t][5].equals("")) {
				q[0][p]=data.a[t][5];
				p++;
			}
		}
		p=0;
		for(int t=0;t<10;t++)
		{
			if(!data.a[t][5].equals("")) {
				q[1][p]=data.a[t][5];
				p++;
			}
			
			if(!data.a[t][6].equals("")) {
				q[1][p]=data.a[t][6];
				p++;
			}
		}
		
		
		table = new JTable(q,col);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"questions", "answers"
			}
		));
		table.setBounds(63, 54, 312, 161);
		frame.getContentPane().add(table);
	}

}
