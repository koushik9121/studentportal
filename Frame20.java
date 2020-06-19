import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame20 {

	private JFrame frame;
	private JTextField a;
	private JLabel q;

	/**
	 * Launch the application.
	 */
	public static void f20() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame20 window = new Frame20();
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
	public Frame20() {
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
		
		JLabel lblNewLabel = new JLabel("Question");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(48, 67, 69, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAnswer.setBounds(48, 92, 69, 14);
		frame.getContentPane().add(lblAnswer);
		
		a = new JTextField();
		a.setColumns(10);
		a.setBounds(152, 97, 228, 77);
		frame.getContentPane().add(a);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				data.a[data.stu][6]=a.getText();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(124, 200, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		q = new JLabel("");
		q.setBounds(152, 56, 228, 30);
		frame.getContentPane().add(q);
		
		q.setText(data.a[data.stu][4]+"\n"+data.a[data.stu][5]);
		
		
	}

}
