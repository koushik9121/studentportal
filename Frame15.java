import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame15 {

	private JFrame frame;
	private JTextField id;
	private JTextField mat;

	/**
	 * Launch the application.
	 */
	public static void f15() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame15 window = new Frame15();
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
	public Frame15() {
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
		
		JLabel lblStudyMaterial = new JLabel("Study Material");
		lblStudyMaterial.setBounds(46, 25, 110, 37);
		lblStudyMaterial.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblStudyMaterial);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(75, 219, 307, -133);
		frame.getContentPane().add(tabbedPane);
		
		id = new JTextField();
		id.setBounds(96, 97, 124, 24);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Faculty ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 91, 96, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Material:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 128, 78, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		mat = new JTextField();
		mat.setBounds(96, 132, 185, 64);
		frame.getContentPane().add(mat);
		mat.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String h=id.getText();
				for(int i=0;i<10;i++)
				{
					if(data.t[i][0].equals(h))
		{
						
					mat.setText(data.t[i][3]+"\n"+data.t[i][4]);	
		}
					
				}
			}
		});
		btnOk.setBounds(228, 97, 53, 23);
		frame.getContentPane().add(btnOk);
	}
}
