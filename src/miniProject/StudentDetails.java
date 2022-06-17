package miniProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentDetails {

	JFrame sd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDetails window = new StudentDetails();
					window.sd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		sd = new JFrame();
		sd.setSize(761, 438);
		sd.setTitle("Placement Management System");
		sd.setExtendedState(sd.MAXIMIZED_BOTH);
		sd.getContentPane().setBackground(new Color(135, 206, 250));
		sd.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT DETAILS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 66));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(160, 54, 1189, 57);
		sd.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Insert in = new Insert();
				in.insertframe.setVisible(true);
				sd.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setBounds(175, 248, 211, 67);
		sd.getContentPane().add(btnNewButton);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.setForeground(Color.BLACK);
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDisplay.setBackground(Color.CYAN);
		btnDisplay.setBounds(680, 248, 223, 67);
		sd.getContentPane().add(btnDisplay);
		
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display dis = new Display();
				dis.displayframe.setVisible(true);
				sd.dispose();
			}
		});
		
		JButton btnDisplay_1 = new JButton("SEARCH");
		btnDisplay_1.setForeground(Color.BLACK);
		btnDisplay_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDisplay_1.setBackground(Color.CYAN);
		btnDisplay_1.setBounds(1149, 248, 252, 67);
		sd.getContentPane().add(btnDisplay_1);
		
		btnDisplay_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search se = new Search();
				se.searchframe.setVisible(true);
				sd.dispose();
			}
		});
		
		JButton btnModify = new JButton("MODIFY");
		btnModify.setForeground(Color.BLACK);
		btnModify.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnModify.setBackground(Color.CYAN);
		btnModify.setBounds(175, 497, 211, 67);
		sd.getContentPane().add(btnModify);
		
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modify mod = new Modify();
				mod.modifyframe.setVisible(true);
				sd.dispose();
			}
		});
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDelete.setBackground(Color.CYAN);
		btnDelete.setBounds(680, 497, 223, 67);
		sd.getContentPane().add(btnDelete);
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete del = new Delete();
				del.deleteframe.setVisible(true);
				sd.dispose();
			}
		});
		
		sd.setBounds(500, 500, 1050, 800);
		sd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
