import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class frame17 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void f17() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame17 window = new frame17();
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
	public frame17() {
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
		
		JLabel lblQuestion = new JLabel("Question:");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuestion.setBounds(33, 60, 91, 25);
		frame.getContentPane().add(lblQuestion);
		
		JLabel q = new JLabel("");
		q.setFont(new Font("Tahoma", Font.PLAIN, 15));
		q.setBounds(118, 60, 286, 25);
		frame.getContentPane().add(q);
		
		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAnswer.setBounds(33, 102, 91, 25);
		frame.getContentPane().add(lblAnswer);
		
		JLabel a = new JLabel("");
		a.setForeground(new Color(0, 0, 0));
		a.setFont(new Font("Tahoma", Font.PLAIN, 15));
		a.setBounds(118, 109, 286, 79);
		frame.getContentPane().add(a);
		
		q.setText(data.a[data.stu][4]+"\n"+data.a[data.stu][5]);
		a.setText(data.a[data.stu][6]+"\n"+data.a[data.stu][7]);
	}

}
