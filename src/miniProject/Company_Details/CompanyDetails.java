package miniProject.Company_Details;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import miniProject.Home;
import miniProject.Student_Details.DeleteS;
import miniProject.Student_Details.DisplayS;
import miniProject.Student_Details.InsertS;
import miniProject.Student_Details.ModifyS;
import miniProject.Student_Details.SearchS;

public class CompanyDetails {

	public JFrame cdframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyDetails window = new CompanyDetails();
					window.cdframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CompanyDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		cdframe = new JFrame();
		cdframe.setSize(761, 438);
		cdframe.setTitle("Placement Management System");
		cdframe.setExtendedState(cdframe.MAXIMIZED_BOTH);
		cdframe.getContentPane().setBackground(new Color(135, 206, 250));
		cdframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COMPANY   DETAILS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 66));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(160, 54, 1189, 57);
		cdframe.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				InsertS in = new InsertS();
//				in.insertframe.setVisible(true);
//				cdframe.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setBounds(175, 248, 211, 67);
		cdframe.getContentPane().add(btnNewButton);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.setForeground(Color.BLACK);
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDisplay.setBackground(Color.CYAN);
		btnDisplay.setBounds(665, 248, 223, 67);
		cdframe.getContentPane().add(btnDisplay);
		
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DisplayS dis = new DisplayS();
//				dis.displayframe.setVisible(true);
//				cdframe.dispose();
			}
		});
		
		JButton btnDisplay_1 = new JButton("SEARCH");
		btnDisplay_1.setForeground(Color.BLACK);
		btnDisplay_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDisplay_1.setBackground(Color.CYAN);
		btnDisplay_1.setBounds(1149, 248, 252, 67);
		cdframe.getContentPane().add(btnDisplay_1);
		
		btnDisplay_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				SearchS se = new SearchS();
//				se.searchframe.setVisible(true);
//				cdframe.dispose();
			}
		});
		
		JButton btnModify = new JButton("MODIFY");
		btnModify.setForeground(Color.BLACK);
		btnModify.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnModify.setBackground(Color.CYAN);
		btnModify.setBounds(415, 452, 211, 67);
		cdframe.getContentPane().add(btnModify);
		
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				ModifyS mod = new ModifyS();
//				mod.modifyframe.setVisible(true);
//				cdframe.dispose();
			}
		});
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDelete.setBackground(Color.CYAN);
		btnDelete.setBounds(939, 452, 223, 67);
		cdframe.getContentPane().add(btnDelete);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home home = new Home();
				home.homeframe.setVisible(true);
				cdframe.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnBack.setBackground(Color.CYAN);
		btnBack.setBounds(665, 646, 211, 67);
		cdframe.getContentPane().add(btnBack);
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				DeleteS del = new DeleteS();
//				del.deleteframe.setVisible(true);
//				cdframe.dispose();
			}
		});
		
		cdframe.setBounds(5000, 5000, 10500, 8000);
		cdframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
