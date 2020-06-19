import java.awt.EventQueue;

import javax.swing.JFrame;

public class datum {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		int i=0,j,p1,k;
		String a[][]={{"513","S.Divya Naimisha","17-CSE","7.5"},
		{"525","Koushik.M","17-CSE","6.2"},
		{"512","Dheeraj","17-CSE","8.8"},
		{"563","Sonali","17-CSE","10"},
		{"533","Jayaram","17-CSE","9.5"},
		{"527","Teja","17-CSE","9.99"},
		{"521","Sahithi","17-CSE","9.98"},
		{"524","Priya","17-CSE","9.85"},
		{"565","Janith","17-CSE","8.7"},
		{"523","Preetham","17-CSE","8.35"}};
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datum window = new datum();
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
	public datum() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
