package miniProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rough {

	private JFrame roughframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rough window = new Rough();
					window.roughframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Rough() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		roughframe = new JFrame();
		roughframe.setSize(761, 438);
		roughframe.setTitle("Placement Management System");
		roughframe.getContentPane().setBackground(new Color(135, 206, 250));
		roughframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT  DETAILS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 66));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(160, 54, 1189, 57);
		roughframe.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Insert insert = new Insert();
				insert.insertframe.setVisible(true);
				roughframe.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setBounds(178, 317, 211, 67);
		roughframe.getContentPane().add(btnNewButton);
		
		JButton btnModify_1 = new JButton("MODIFY");
		btnModify_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModify_1.setForeground(Color.BLACK);
		btnModify_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnModify_1.setBackground(Color.CYAN);
		btnModify_1.setBounds(658, 317, 211, 67);
		roughframe.getContentPane().add(btnModify_1);
		
		JButton btnDelete_1 = new JButton("DELETE");
		btnDelete_1.setForeground(Color.BLACK);
		btnDelete_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDelete_1.setBackground(Color.CYAN);
		btnDelete_1.setBounds(1162, 317, 211, 67);
		roughframe.getContentPane().add(btnDelete_1);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.setForeground(Color.BLACK);
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnDisplay.setBackground(Color.CYAN);
		btnDisplay.setBounds(396, 568, 236, 67);
		roughframe.getContentPane().add(btnDisplay);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnSearch.setBackground(Color.CYAN);
		btnSearch.setBounds(920, 568, 211, 67);
		roughframe.getContentPane().add(btnSearch);
		roughframe.setBounds(500, 500, 1050, 800);
		roughframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
