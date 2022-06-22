package miniProject;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;

public class SearchS {

	JFrame searchframe;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchS window = new SearchS();
					window.searchframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SearchS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		searchframe = new JFrame();
		searchframe.setBounds(500, 500, 1050, 800);
		searchframe.setTitle("Placement Managemet System");
		searchframe.getContentPane().setBackground(new Color(135, 206, 250));
		searchframe.getContentPane().setLayout(null);
		searchframe.setExtendedState(searchframe.MAXIMIZED_BOTH);
		
		JLabel lblNewLabel = new JLabel("SEARCH");
		lblNewLabel.setBounds(10, 45, 1540, 61);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		searchframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter USN to Search");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblNewLabel_1.setBounds(290, 164, 362, 68);
		searchframe.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(913, 164, 334, 68);
		searchframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setBounds(278, 335, 1011, 104);
		searchframe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDetails sd = new StudentDetails();
				sd.sd.setVisible(true);
				searchframe.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnBack.setBackground(Color.CYAN);
		btnBack.setBounds(838, 621, 211, 67);
		searchframe.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				BufferedReader br = new BufferedReader(new FileReader("student.txt"));
				String name = "", usn = "", sem = "", branch = "", r;
				//System.out.println("Enter the usn");
				String usn1 = textField.getText();
				while((r= br.readLine()) !=null)
				{
					String[] result = r.split("\\|");
					name=result[0];
					usn=result[1];
					sem= result[2];
					branch=result[3];
					if(usn.equals(usn1))
					{
						//System.out.println("Match found. The details of the record are:");
						textField_1.setText(name + " " + usn + " " + sem + " " + branch);
						br.close();
						return;
					}
				}
				textField_1.setText("Record not found");
				br.close();
				}
				catch(IOException ioe) {
					System.out.println("Some error occured");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBounds(480, 621, 177, 61);
		searchframe.getContentPane().add(btnNewButton);
		searchframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
