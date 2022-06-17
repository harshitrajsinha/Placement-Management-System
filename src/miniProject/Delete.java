package miniProject;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;

public class Delete {

	JFrame deleteframe;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete window = new Delete();
					window.deleteframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Delete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		deleteframe = new JFrame();
		deleteframe.setBounds(500, 500, 1050, 800);
		deleteframe.setTitle("Placement Managemet System");
		deleteframe.setExtendedState(deleteframe.MAXIMIZED_BOTH);
		deleteframe.getContentPane().setBackground(new Color(135, 206, 250));
		deleteframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DELETE");
		lblNewLabel.setBounds(10, 45, 1540, 61);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		deleteframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter USN to Delete");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblNewLabel_1.setBounds(290, 164, 362, 68);
		deleteframe.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(913, 164, 334, 68);
		deleteframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("student.txt");
				BufferedReader br = new BufferedReader(new FileReader(file));
				File temp = new File("temp.txt");
				PrintWriter pw = new PrintWriter(temp);
				String usn = "", r;
				int count = 0;
				//System.out.println("Enter the usn");
				String usn1 = textField.getText();
				while((r= br.readLine()) !=null)
				{
					String[] result = r.split("\\|");
					usn=result[1];
					if(usn.equals(usn1))
					{
					    count = 1;
						continue;
					}
					else {
						pw.println(r);
					//	pw.close();
						
					}
				}
			      if(count == 0)
	                    JOptionPane.showMessageDialog(null, "Invalid USN");
	                else
	                    JOptionPane.showMessageDialog(null, "Record Deleted!");
			      
			    pw.flush();
			    pw.close();
				br.close();
				
				 file.delete();
	             temp.renameTo(file);

				}
				catch(IOException ioe) {
					System.out.println("Some error occured");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBounds(712, 619, 177, 61);
		deleteframe.getContentPane().add(btnNewButton);
		deleteframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
