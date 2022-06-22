package miniProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class DisplayS {

	JFrame displayframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayS window = new DisplayS();
					window.displayframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DisplayS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		displayframe = new JFrame();
		displayframe.getContentPane().setBackground(new Color(135, 206, 250));
		displayframe.getContentPane().setLayout(null);
		displayframe.setExtendedState(displayframe.MAXIMIZED_BOTH);
		displayframe.setTitle("Placement Management system");
		
		JLabel lblNewLabel = new JLabel("DISPLAY");
		lblNewLabel.setBounds(264, 66, 1036, 61);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		displayframe.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textArea.setBounds(355, 198, 879, 357);
		displayframe.getContentPane().add(textArea);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDetails sd = new StudentDetails();
				sd.sd.setVisible(true);
				displayframe.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnBack.setBackground(Color.CYAN);
		btnBack.setBounds(854, 667, 211, 67);
		displayframe.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("DISPLAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(buildText());
		
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnNewButton.setBounds(488, 667, 229, 61);
		displayframe.getContentPane().add(btnNewButton);
		

		displayframe.setBounds(500, 500, 1050, 800);
		displayframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private static String buildText() {
		StringBuilder sb = new StringBuilder();

		String name = "" ,usn = "" ,sem = "" ,branch = "", cgpa = "",s;
		try {
		BufferedReader br = new BufferedReader(new FileReader("student.txt"));
		while((s = br.readLine())!=null)
		{
			String[] result = s.split("\\|");
			name = result[0];
			usn = result[1];
			sem = result[2];
			branch = result[3];
			cgpa = result[4];
			sb.append(" " + name + "  " + usn + "  " + sem + "  " + branch + "  " + cgpa + "\n");
		}
		br.close();
		return sb.toString();
		}
		catch(IOException ioe) {
			sb.append("Some error occured");
			return sb.toString();
		}
	}
}
