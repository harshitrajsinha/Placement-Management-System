package miniProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;

public class Insert {

	JFrame insertframe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insert window = new Insert();
					window.insertframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Insert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		insertframe = new JFrame();
		insertframe.getContentPane().setBackground(new Color(135, 206, 250));
		insertframe.getContentPane().setLayout(null);
		insertframe.setTitle("Placement Management System");
		insertframe.setExtendedState(insertframe.MAXIMIZED_BOTH);
		
		JLabel lblNewLabel = new JLabel("INSERT DETAILS");
		lblNewLabel.setBounds(10, 20, 1540, 61);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		insertframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(107, 134, 212, 61);
		insertframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("USN");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1_1.setBounds(107, 232, 212, 61);
		insertframe.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("SEMESTER");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1_2.setBounds(107, 330, 212, 61);
		insertframe.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("BRANCH");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1_3.setBounds(107, 443, 212, 61);
		insertframe.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("CGPA");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1_4.setBounds(107, 562, 212, 61);
		insertframe.getContentPane().add(lblNewLabel_1_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(934, 134, 296, 50);
		insertframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(934, 232, 296, 50);
		insertframe.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(934, 346, 296, 50);
		insertframe.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(934, 454, 296, 50);
		insertframe.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(934, 562, 296, 50);
		insertframe.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String usn = textField_1.getText();
				String sem = textField_2.getText(); 
				String branch = textField_3.getText();
				String cgpa = textField_4.getText();
				try {
				PrintWriter pw = new PrintWriter(new FileOutputStream(new File("student.txt"),true));
				String b = name + "|" + usn + "|" + sem + "|" + branch + "|" + cgpa + "|";
				
				pw.println(b);
				
				pw.flush();
				pw.close();	
			}
			catch(IOException ioe) {
				System.out.println("Error occured");
			}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(762, 692, 212, 50);
		insertframe.getContentPane().add(btnNewButton);
		insertframe.setBounds(500, 500, 1050, 800);
		insertframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
