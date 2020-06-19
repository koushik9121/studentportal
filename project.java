import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class project {

	private JFrame frame;
	
		
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project window = new project();
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
	public project() {
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
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame1 f=new Frame1();
				f.F1();
			}
		});
		btnNewButton.setBounds(29, 79, 109, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame11 k=new Frame11();
				k.f11();
			}
		});
		btnStudent.setBounds(162, 79, 109, 42);
		frame.getContentPane().add(btnStudent);
		
		JButton btnFaculty = new JButton("Faculty");
		btnFaculty.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame18 m=new frame18();
				m.f18();
			}
		});
		btnFaculty.setBounds(295, 79, 109, 42);
		frame.getContentPane().add(btnFaculty);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NAIMISHA\\Desktop\\50-Beautiful-and-Minimalist-Presentation-Backgrounds-014.jpg"));
		lblNewLabel.setBounds(-277, -142, 741, 443);
		frame.getContentPane().add(lblNewLabel);
	}

}
