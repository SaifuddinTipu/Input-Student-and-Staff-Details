import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StudentPage extends Login{

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentPage window = new StudentPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StudentPage() {
		StudentPageGUI();
	}

	private void StudentPageGUI() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Welcome To System");
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label.setBounds(310, 80, 500, 30);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("Input Student Details");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				InputStudentDetails.main(null);
			}
		});
		button.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		button.setBounds(260, 180, 280, 30);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Log Out");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Login.main(null);
			}
		});
		button_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		button_1.setBounds(260, 260, 280, 30);
		frame.getContentPane().add(button_1);
		
		JLabel lblStudentPage = new JLabel("Student Page");
		lblStudentPage.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblStudentPage.setBounds(340, 120, 280, 30);
		frame.getContentPane().add(lblStudentPage);
	}
}
