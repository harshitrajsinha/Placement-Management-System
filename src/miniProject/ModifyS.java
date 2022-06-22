package miniProject;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;

public class ModifyS {

	JFrame modifyframe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyS window = new ModifyS();
					window.modifyframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ModifyS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		modifyframe = new JFrame();
		modifyframe.setTitle("Placement Management System");
		modifyframe.getContentPane().setBackground(new Color(135, 206, 250));
		modifyframe.getContentPane().setLayout(null);
		modifyframe.setExtendedState(modifyframe.MAXIMIZED_BOTH);
		
		JLabel lblNewLabel = new JLabel("MODIFY");
		lblNewLabel.setBounds(281, 39, 1036, 61);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		modifyframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter USN to Modify");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblNewLabel_1.setBounds(303, 140, 411, 54);
		modifyframe.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(941, 140, 303, 48);
		modifyframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDetails sd = new StudentDetails();
				sd.sd.setVisible(true);
				modifyframe.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnBack.setBackground(Color.CYAN);
		btnBack.setBounds(901, 695, 211, 67);
		modifyframe.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("MODIFY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = "", usn = "", sem = "", branch = "", r;
				try {
				File file = new File("student.txt");
				BufferedReader br = new BufferedReader(new FileReader(file));
				File temp = new File("temp.txt");
				PrintWriter pw = new PrintWriter(temp);
				//System.out.println("Enter usn");
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
						//System.out.println("The details are: " + name + " " + usn + " " + sem + " " + branch);
						//System.out.println("enter name, usn,sem and branch");
						String name11 = textField_1.getText();
						String usn11 = textField_2.getText();
						String sem11 = textField_3.getText();
						String branch11 = textField_4.getText();
						String cgpa11 = textField_5.getText();
						String b = name11 + "|" + usn11 + "|" + sem11 + "|" + branch11 + "|" + cgpa11;
						int le = b.length();
						
						String s1 = "-";
						if(le<50)
						{
							for(int j=le;j<=50;j++)
								b = b.concat(s1);
							pw.println(b);
						}
					}
					else
					{
						pw.println(r);
					}
				}
				pw.flush();
				pw.close();
				br.close();	
				file.delete();
				temp.renameTo(file);
				JOptionPane.showMessageDialog(null, "File Modified");
				}
				catch(IOException ioe) {
					System.out.println("Some error occured");
				}
	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(509, 702, 234, 61);
		modifyframe.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(303, 247, 303, 48);
		modifyframe.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("USN");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(303, 335, 303, 48);
		modifyframe.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("SEMESTER");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2_2.setBounds(303, 431, 303, 48);
		modifyframe.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("BRANCH");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2_3.setBounds(303, 526, 303, 48);
		modifyframe.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("CGPA");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2_4.setBounds(303, 637, 303, 48);
		modifyframe.getContentPane().add(lblNewLabel_2_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(941, 256, 303, 48);
		modifyframe.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(941, 344, 303, 48);
		modifyframe.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(941, 431, 303, 48);
		modifyframe.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(941, 526, 303, 48);
		modifyframe.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(941, 608, 303, 48);
		modifyframe.getContentPane().add(textField_5);
		modifyframe.setBounds(500, 500, 1050, 800);
		modifyframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
