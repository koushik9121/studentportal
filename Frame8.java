import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame8 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void f8() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame8 window = new Frame8();
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
	public Frame8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStudentRequestList = new JLabel("Student Request List");
		lblStudentRequestList.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblStudentRequestList.setBounds(125, 11, 231, 29);
		frame.getContentPane().add(lblStudentRequestList);
		
		
		table = new JTable(data.request,data.Columns);
		table.setBounds(10, 56, 251, 160);
		frame.getContentPane().add(table);
		
		
		
		JCheckBox chckbxAccept = new JCheckBox("ACCEPT");
		chckbxAccept.setBounds(267, 56, 73, 15);
		frame.getContentPane().add(chckbxAccept);
		
		
		
		JCheckBox checkBox = new JCheckBox("ACCEPT");
		checkBox.setBounds(267, 73, 73, 15);
		frame.getContentPane().add(checkBox);
		
		
		
		
		JCheckBox checkBox_1 = new JCheckBox("ACCEPT");
		checkBox_1.setBounds(267, 88, 73, 15);
		frame.getContentPane().add(checkBox_1);
		
		
		
		JCheckBox checkBox_2 = new JCheckBox("ACCEPT");
		checkBox_2.setBounds(267, 103, 73, 15);
		frame.getContentPane().add(checkBox_2);
		
		
		
		
		JCheckBox checkBox_3 = new JCheckBox("ACCEPT");
		checkBox_3.setBounds(267, 119, 73, 15);
		frame.getContentPane().add(checkBox_3);
		
		
		
		JCheckBox checkBox_4 = new JCheckBox("ACCEPT");
		checkBox_4.setBounds(267, 135, 73, 15);
		frame.getContentPane().add(checkBox_4);
		
		
		
		JCheckBox checkBox_5 = new JCheckBox("ACCEPT");
		checkBox_5.setBounds(267, 151, 73, 15);
		frame.getContentPane().add(checkBox_5);
		
		
		
		JCheckBox checkBox_6 = new JCheckBox("ACCEPT");
		checkBox_6.setBounds(267, 169, 73, 15);
		frame.getContentPane().add(checkBox_6);
		
		
		
		JCheckBox checkBox_7 = new JCheckBox("ACCEPT");
		checkBox_7.setBounds(267, 185, 73, 15);
		frame.getContentPane().add(checkBox_7);
		
		
		
		JCheckBox checkBox_8 = new JCheckBox("ACCEPT");
		checkBox_8.setBounds(267, 201, 73, 15);
		frame.getContentPane().add(checkBox_8);
		
		
		
		for(int g=0;g<4;g++)
		{
			//l.request[l.n][g]=temp[g];
			//System.out.println(temp[g]);
			System.out.println(data.request[0][g]);
		}
		
		

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
//				int p=0;
//				for(int y=10;y<20;y++)
//				{
//					for(int i=0;i<4;i++)
//						{
//							data.a[y][i]=data.request[p][i];
//							System.out.println(data.a[y][i]);
//						
//						}
//					p++;
//				}
				
				if(chckbxAccept.isSelected())
				{
					for(int i=0;i<4;i++)
					{
						data.a[10][i]=data.request[0][i];
						System.out.println(data.a[10][i]);
						
					}
					data.password[10]=data.request_password[0];
				}
				
				if(checkBox.isSelected())
				{
					for(int i=0;i<4;i++)
					{
						data.a[11][i]=data.request[1][i];
					}
					data.password[11]=data.request_password[1];
				}
				
				
				if(checkBox_1.isSelected())
				{
					for(int i=0;i<4;i++)
					{
						data.a[12][i]=data.request[2][i];
					}
					data.password[12]=data.request_password[2];
				}
				
				
				if(checkBox_2.isSelected())
				{
					for(int i=0;i<4;i++)
					{
						data.a[13][i]=data.request[3][i];
					}
					data.password[13]=data.request_password[3];
				}
				
				if(checkBox_3.isSelected())
				{
					for(int i=0;i<4;i++)
					{
						data.a[14][i]=data.request[4][i];
					}
					data.password[14]=data.request_password[4];
				}
				
				if(checkBox_4.isSelected())
				{
					for(int i=0;i<4;i++)
					{
						data.a[15][i]=data.request[5][i];
					}
					data.password[15]=data.request_password[5];
				}
				
				if(checkBox_5.isSelected())
				{
					for(int i=0;i<4;i++)
					{
						data.a[16][i]=data.request[6][i];
					}
					data.password[16]=data.request_password[6];
				}
				
				
				if(checkBox_6.isSelected())
				{
					for(int i=0;i<4;i++)
					{
						data.a[17][i]=data.request[7][i];
					}
					data.password[17]=data.request_password[7];
				}
				
				if(checkBox_7.isSelected())
				{
					for(int i=0;i<4;i++)
					{
						data.a[18][i]=data.request[8][i];
					}
					data.password[18]=data.request_password[8];
				}
				
				if(checkBox_8.isSelected())
				{
					for(int i=0;i<4;i++)
					{
						data.a[19][i]=data.request[9][i];
					}
					data.password[19]=data.request_password[9];
				}
		}
		});
		
		btnOk.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnOk.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnOk);
		
		
		
	}
}
