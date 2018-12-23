import java.awt.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StaffLogin extends Login{

	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField passwordField;
	private JButton btnBack;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffLogin window = new StaffLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StaffLogin() {
		
		StaffLoginGUI();
		
	}

	public void StaffLoginGUI() {
		frame = new JFrame("Welcome to System");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel WelcomeToSystem = new JLabel("Welcome To System");
		WelcomeToSystem.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		WelcomeToSystem.setBounds(300, 80, 500, 30);
		frame.getContentPane().add(WelcomeToSystem);
		
		txtUserName = new JTextField();
		txtUserName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtUserName.selectAll();
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUserName.getText().isEmpty()){
					txtUserName.setText("User Name");
				}
			}
		});
		txtUserName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtUserName.setText("User Name");
		txtUserName.setBounds(260, 220, 260, 30);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		passwordField.setBounds(260, 260, 260, 30);
		char passwordChar; 
		passwordChar = passwordField.getEchoChar(); 
		passwordField.setEchoChar((char) 0); 
		passwordField.setText("Password");
		passwordField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				passwordField.setText("");
				passwordField.setEchoChar(passwordChar); 
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(passwordField.getPassword().length == 0){
					passwordField.setText("Password");
					passwordField.setEchoChar((char) 0);
			}
		}
		});
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    @SuppressWarnings("resource")
					BufferedReader Reader = new BufferedReader(new FileReader("StaffDatabase.txt"));
				    String username = txtUserName.getText().trim();
				    String password = new String(passwordField.getPassword());
				    
				    String line;
				    
				    while((line = Reader.readLine())!= null){
				    	String[] array = line.split(",");
				    	
				    	if(array[0].equals(username) && array[1].equals(password)){
				    		JOptionPane.showMessageDialog(frame,"Welcome to System");
				    		StaffPage.main(null);
				    		frame.dispose();
				    		return;
				        }

				    }
				    try {
				         // Open an audio input stream.
				         File soundFile = new File ("src/error.wav");
				         AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
				         // Get a sound clip resource.
				         Clip clip = AudioSystem.getClip();
				         // Open audio clip and load samples from the audio input stream.
				         clip.open(audioIn);
				         clip.stop();
				         clip.setFramePosition(0);
				         clip.start();
				        
				         
				      } catch (UnsupportedAudioFileException e1) {
				         e1.printStackTrace();
				      } catch (IOException e1) {
				         e1.printStackTrace();
				      } catch (LineUnavailableException e1) {
				         e1.printStackTrace();
				      }

				    JOptionPane.showMessageDialog(frame,"Invalid Username or Password","Error!",JOptionPane.ERROR_MESSAGE);
				    
				} catch (IOException t) {
				    t.printStackTrace();
				} 
			}
		});
		btnLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnLogin.setBounds(260, 320, 100, 30);
		frame.getContentPane().add(btnLogin);
		
		JLabel StaffLogin = new JLabel("Staff Login");
		StaffLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		StaffLogin.setBounds(340, 120, 500, 30);
		frame.getContentPane().add(StaffLogin);
		
		JLabel lblRegister = new JLabel("OR Register an Account");
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.main(new String[]{});
				frame.dispose();
			}
		});
		lblRegister.setForeground(Color.BLUE);
		lblRegister.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblRegister.setBounds(300, 160, 500, 30);
		frame.getContentPane().add(lblRegister);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnBack.setBounds(400, 320, 100, 30);
		frame.getContentPane().add(btnBack);
	
	}
	
}
