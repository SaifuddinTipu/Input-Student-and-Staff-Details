import java.awt.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class RegisterStudent extends Login{
	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField passwordField;
	private JTextField txtName;
	private JTextField txtEmail;
	private JButton btnNewButton;
	private JButton btnBack;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterStudent window = new RegisterStudent();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	public RegisterStudent() {
		
		RegisterStudentGUI();
		
	}

	public void RegisterStudentGUI() {
		
		frame = new JFrame("Create An Account");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCreateAnAccount = new JLabel("Create An Account");
		lblCreateAnAccount.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblCreateAnAccount.setBounds(320, 80, 500, 30);
		frame.getContentPane().add(lblCreateAnAccount);
		
		JLabel lblLoginOrRegister = new JLabel("Register or");
		lblLoginOrRegister.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblLoginOrRegister.setBounds(270, 120, 500, 30);
		frame.getContentPane().add(lblLoginOrRegister);
		
		JLabel lblRegister = new JLabel("Login to your Account");
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login.main(new String[]{});
				frame.dispose();
			}
		});
		lblRegister.setForeground(Color.BLUE);
		lblRegister.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblRegister.setBounds(360, 120, 500, 30);
		frame.getContentPane().add(lblRegister);
		
		txtUserName = new JTextField();
		txtUserName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtUserName.selectAll();
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUserName.getText().isEmpty()){
					txtUserName.setText("");
				}
			}
		});
		txtUserName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtUserName.setText("User Name");
		txtUserName.setBounds(180, 160, 450, 30);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		passwordField.setBounds(180, 200, 450, 30);
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
					passwordField.setText("");
				}
			}
		});
		frame.getContentPane().add(passwordField);
		
		txtName = new JTextField();
		txtName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtName.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtName.getText().isEmpty()){
					txtName.setText("");
				}
			}
		});
		txtName.setText("Name");
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtName.setColumns(10);
		txtName.setBounds(180, 240, 450, 30);
		frame.getContentPane().add(txtName);
		
		txtEmail = new JTextField();
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtEmail.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEmail.getText().isEmpty()){
					txtEmail.setText("");
				}
			}
		});
		txtEmail.setText("Email");
		txtEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtEmail.setColumns(10);
		txtEmail.setBounds(180, 280, 450, 30);
		frame.getContentPane().add(txtEmail);
		
		btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File log = new File("StudentDatabase.txt");
				
			    String username = txtUserName.getText().trim();
			    String password = new String(passwordField.getPassword());
			    String name = txtName.getText().trim();
			    String email = txtEmail.getText().trim();
			    
			    if(txtUserName.getText().hashCode() == 0){
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

			    	JOptionPane.showMessageDialog(null, "UserName must not be empty");
			    	return;
			    }
			    else if(passwordField.getPassword().length == 0){
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

				    JOptionPane.showMessageDialog(null, "Password must not be empty");
				    return;
				}
			    else if(txtName.getText().hashCode() == 0){
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

				    JOptionPane.showMessageDialog(null, "Name must not be empty");
				    return;
				}
			    else if(txtEmail.getText().hashCode() == 0){
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

				    JOptionPane.showMessageDialog(null, "Email must not be empty");
				    return;
				}
			    
			    String line;
			    
			    try {
			    	@SuppressWarnings("resource")
					BufferedReader Reader = new BufferedReader(new FileReader("StudentDatabase.txt"));
			    	
					while((line = Reader.readLine())!= null){
						String[] array = line.split(",");
						
						if(array[0].equals(username) || array[3].equals(email)){
							JOptionPane.showMessageDialog(frame,"User existed!","Error!",JOptionPane.ERROR_MESSAGE);
							return;
					    }
						
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			    
						try{
						    if(!log.exists()){
						        log.createNewFile();
						    }
						    
						    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(log,true));
						    bufferedWriter.write(username + "," + password + "," + name + "," + email);
						    bufferedWriter.newLine();
						    bufferedWriter.close();
						    JOptionPane.showMessageDialog(frame,"Registration is successful!");

						} catch(IOException n) {
						}

			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnNewButton.setBounds(190, 320, 200, 30);
		frame.getContentPane().add(btnNewButton);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentLogin.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnBack.setBounds(410, 320, 200, 30);
		frame.getContentPane().add(btnBack);
		
	}

}
