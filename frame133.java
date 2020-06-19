import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class frame133 {

	private JFrame frame;
	private JTextField name_input;
	private JTextField id_input;
	private JTextField pin_input;
	private JTextField pin_confirm;
	private JTextField yr_branch;
	private JTextField cgpa_input;

	/**
	 * Launch the application.
	 */
	public static void f133 () {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame133 window = new frame133();
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
	public frame133() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		data l=new data();
		l.info(l);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(28, 46, 73, 22);
		frame.getContentPane().add(lblName);
		
		JLabel lblIdNumber = new JLabel("ID:");
		lblIdNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdNumber.setBounds(28, 66, 73, 22);
		frame.getContentPane().add(lblIdNumber);
		
		JLabel lblPassword = new JLabel("Pin:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(28, 95, 73, 22);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm PIN:");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConfirmPassword.setBounds(28, 115, 102, 22);
		frame.getContentPane().add(lblConfirmPassword);
		
		JLabel lblYear = new JLabel("Year-Branch");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblYear.setBounds(28, 148, 73, 22);
		frame.getContentPane().add(lblYear);
		
		JLabel lblCgpa = new JLabel("CGPA:");
		lblCgpa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCgpa.setBounds(28, 173, 73, 22);
		frame.getContentPane().add(lblCgpa);
		
		name_input = new JTextField();
		name_input.setBounds(151, 49, 86, 20);
		frame.getContentPane().add(name_input);
		name_input.setColumns(10);
		
		id_input = new JTextField();
		id_input.setBounds(151, 69, 86, 20);
		frame.getContentPane().add(id_input);
		id_input.setColumns(10);
		
		pin_input = new JTextField();
		pin_input.setBounds(151, 98, 86, 20);
		frame.getContentPane().add(pin_input);
		pin_input.setColumns(10);
		
		pin_confirm = new JTextField();
		pin_confirm.setBounds(151, 118, 86, 20);
		frame.getContentPane().add(pin_confirm);
		pin_confirm.setColumns(10);
		
		yr_branch = new JTextField();
		yr_branch.setBounds(151, 151, 86, 22);
		frame.getContentPane().add(yr_branch);
		yr_branch.setColumns(10);
		
		cgpa_input = new JTextField();
		cgpa_input.setBounds(151, 173, 86, 22);
		frame.getContentPane().add(cgpa_input);
		cgpa_input.setColumns(10);
		
		JLabel pins = new JLabel();
		pins.setFont(new Font("Tahoma", Font.BOLD, 12));
		pins.setForeground(Color.RED);
		pins.setBounds(28, 206, 223, 14);
		frame.getContentPane().add(pins);
		
		
		//System.out.println(temp[0]);
		
		JButton send_request = new JButton("Send Request");
		send_request.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(pin_input.getText().equals(pin_confirm.getText()))
				{
				
				String temp[]= {id_input.getText(),name_input.getText(),yr_branch.getText(),cgpa_input.getText()};
				data.request_password[data.n]=pin_input.getText();
						
				
				for(int g=0;g<4;g++)
				{
					data.request[data.n][g]=temp[g];
					
					System.out.println(data.request[data.n][g]);
				}
				data.n=data.n+1;
				}
				
				else
				{
					pins.setText("PINS do not match! Enter your pin again :)");
				}
				
			
			}
		});
		send_request.setFont(new Font("Tahoma", Font.BOLD, 14));
		send_request.setBounds(62, 231, 137, 23);
		frame.getContentPane().add(send_request);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NAIMISHA\\Desktop\\profile-icon-9.png"));
		lblNewLabel.setBounds(161, -37, 355, 330);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
