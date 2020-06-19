import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Frame22 {

	private JFrame frame;
	private JTextField links;
	private JButton back;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void f22() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame22 window = new Frame22();
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
	public Frame22() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private  void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		links = new JTextField();
		links.setColumns(10);
		links.setBounds(10, 54, 267, 127);
		frame.getContentPane().add(links);
		
		btnNewButton = new JButton("Upload");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addd();
			}
		});
		btnNewButton.setBounds(146, 192, 131, 32);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblPasteYourLinks = new JLabel("Paste your links here below");
		lblPasteYourLinks.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPasteYourLinks.setBounds(10, 11, 244, 32);
		frame.getContentPane().add(lblPasteYourLinks);
	
		
	}
	
	
	public void addd()
	{
		String pp=links.getText();
		if(data.t[data.teacher][3]!="")
		{
			 data.t[data.teacher][4]=pp;
		}
		else
		{
	    data.t[data.teacher][3]=pp;
		}
		//data.material.get(data.teacher).add(links.getText());
	}
}


