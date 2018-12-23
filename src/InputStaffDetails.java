import java.awt.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class InputStaffDetails extends Login{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputStaffDetails window = new InputStaffDetails();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InputStaffDetails() {
		InputStaffDetailsGUI();
	}

	private void InputStaffDetailsGUI() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Welcome To System");
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label.setBounds(325, 80, 500, 30);
		frame.getContentPane().add(label);
		
		JButton btnInptStfDetails = new JButton("Save");
		btnInptStfDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File log = new File("StaffDetails.txt");
				
			    String Sname = textField.getText().trim();
			    String Saddress = textField_1.getText().trim();
			    String SSchool = textField_2.getText().trim();
			    double Spay = 0.0; 
			    
			    boolean validInput = false;

			    while(!validInput) {
			        try {
			        	Spay = Double.parseDouble(textField_3.getText().trim());
			            validInput = true;
			        } catch(NumberFormatException e) {
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
			        	JOptionPane.showMessageDialog(frame,"Incorrect Type!","Error!",JOptionPane.ERROR_MESSAGE);
			        	return;
			        }
			    }
			    if(textField.getText().hashCode() == 0){
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
			    else if(textField_1.getText().hashCode() == 0){
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

				    JOptionPane.showMessageDialog(null, "Address must not be empty");
				    return;
				}
			    else if(textField_2.getText().hashCode() == 0){
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

				    JOptionPane.showMessageDialog(null, "School must not be empty");
				    return;
				}
			    else if(textField_3.getText().hashCode() == 0){
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

				    JOptionPane.showMessageDialog(null, "Pay must not be empty");
				    return;
				}
			    String line;
			    
			    try {
			    	@SuppressWarnings("resource")
					BufferedReader Reader = new BufferedReader(new FileReader("StaffDetails.txt"));
			    	
					while((line = Reader.readLine())!= null){
						String[] array = line.split(",");
						
						if(array[0].equals(Sname) || array[1].equals(Saddress) || array[2].equals(SSchool) || array[3].equals(Spay)){
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
							JOptionPane.showMessageDialog(frame,"Details existed!","Error!",JOptionPane.ERROR_MESSAGE);
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
						    bufferedWriter.write(Sname + "," + Saddress + "," + SSchool + "," + Spay);
						    bufferedWriter.newLine();
						    bufferedWriter.close();
						    JOptionPane.showMessageDialog(frame,"Staff details are added!");

						} catch(IOException n) {
						}
			}
		});
		btnInptStfDetails.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnInptStfDetails.setBounds(320, 350, 80, 29);
		frame.getContentPane().add(btnInptStfDetails);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				System.main(null);
			}
		});
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnBack.setBounds(430, 350, 80, 29);
		frame.getContentPane().add(btnBack);
		
		JLabel lblUserPage = new JLabel("Input Staff Details");
		lblUserPage.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblUserPage.setBounds(330, 120, 500, 30);
		frame.getContentPane().add(lblUserPage);
		
		textField = new JTextField();
		textField.setBounds(200, 160, 500, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(200, 200, 500, 30);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(200, 240, 500, 30);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(200, 280, 500, 30);
		frame.getContentPane().add(textField_3);
		
		JLabel name = new JLabel("Name");
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		name.setBounds(140, 160, 46, 29);
		frame.getContentPane().add(name);
		
		JLabel address = new JLabel("Address");
		address.setHorizontalAlignment(SwingConstants.CENTER);
		address.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		address.setBounds(120, 200, 80, 29);
		frame.getContentPane().add(address);
		
		JLabel school = new JLabel("School");
		school.setHorizontalAlignment(SwingConstants.CENTER);
		school.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		school.setBounds(130, 240, 60, 29);
		frame.getContentPane().add(school);
		
		JLabel pay = new JLabel("Pay");
		pay.setHorizontalAlignment(SwingConstants.CENTER);
		pay.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		pay.setBounds(110, 280, 80, 29);
		frame.getContentPane().add(pay);
		
	}

}
