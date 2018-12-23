import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login {
	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		
		LoginGUI();
		
	}

	public void LoginGUI() {
		frame = new JFrame("Welcome to System");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel WelcomeToSystem = new JLabel("Welcome To System");
		WelcomeToSystem.setHorizontalAlignment(SwingConstants.CENTER);
		WelcomeToSystem.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		WelcomeToSystem.setBounds(150, 80, 500, 30);
		frame.getContentPane().add(WelcomeToSystem);
		
		JButton Student = new JButton("Student");
		Student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentLogin.main(new String[]{});
				frame.dispose();
			}
		});
		Student.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Student.setBounds(140, 200, 500, 30);
		frame.getContentPane().add(Student);
		
		JLabel LoginPage = new JLabel("Login Page for Registered User");
		LoginPage.setHorizontalAlignment(SwingConstants.CENTER);
		LoginPage.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		LoginPage.setBounds(150, 140, 500, 30);
		frame.getContentPane().add(LoginPage);
		
		JButton Staff = new JButton("Staff");
		Staff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffLogin.main(new String[]{});
				frame.dispose();
			}
		});
		Staff.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Staff.setBounds(140, 260, 500, 30);
		frame.getContentPane().add(Staff);
		
	
	}

}
