import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Adminblocks {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Ab() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminblocks window = new Adminblocks();
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
	public Adminblocks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		data d=new data();
		d.info(d);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.setBounds(162, 34, 124, 35);
		btnStudent.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(btnStudent);
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame4 f4=new Frame4();
				f4.F4();
				
                
			}
		});
		
		
		
		JButton btnFaculty = new JButton("Faculty");
		btnFaculty.setBounds(162, 80, 124, 35);
		btnFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame5 k=new Frame5();
				k.f5();
			
			}
		});
		btnFaculty.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(btnFaculty);
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame5 f=new Frame5();
				f.f5();
			}
		});
				
          
		
		JButton btnQa = new JButton("Q/A");
		btnQa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame6 u=new frame6();
				u.f6();
			}
		});
		btnQa.setBounds(162, 129, 124, 35);
		btnQa.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(btnQa);
		
		JButton btnMaterial = new JButton("Material");
		btnMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame9 h=new frame9();
				h.f9();
			}
		});
		btnMaterial.setBounds(162, 176, 124, 35);
		btnMaterial.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(btnMaterial);
		
		
	}
}
