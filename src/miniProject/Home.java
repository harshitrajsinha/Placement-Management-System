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

public class Home {

	JFrame homeframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.homeframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		homeframe = new JFrame();
		homeframe.setSize(761, 438);
		homeframe.setTitle("Placement Management System");
		homeframe.getContentPane().setBackground(new Color(135, 206, 250));
		homeframe.setExtendedState(homeframe.MAXIMIZED_BOTH);
		homeframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 66));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(242, 53, 1189, 57);
		homeframe.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("STUDENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDetails sd = new StudentDetails();
				sd.sd.setVisible(true);
				homeframe.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 50));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setBounds(175, 248, 429, 114);
		homeframe.getContentPane().add(btnNewButton);
		
		
		JButton btnCompany = new JButton("COMPANY");
		btnCompany.setForeground(Color.BLACK);
		btnCompany.setFont(new Font("Tahoma", Font.BOLD, 50));
		btnCompany.setBackground(Color.CYAN);
		btnCompany.setBounds(1085, 248, 429, 114);
		homeframe.getContentPane().add(btnCompany);
		
		JButton btnSummary = new JButton("SUMMARY");
		btnSummary.setForeground(Color.BLACK);
		btnSummary.setFont(new Font("Tahoma", Font.BOLD, 50));
		btnSummary.setBackground(Color.CYAN);
		btnSummary.setBounds(597, 539, 429, 114);
		homeframe.getContentPane().add(btnSummary);
		homeframe.setBounds(500, 500, 1050, 800);
		homeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
