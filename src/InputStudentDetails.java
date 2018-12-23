import java.awt.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class InputStudentDetails extends Login{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputStudentDetails window = new InputStudentDetails();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InputStudentDetails() {
		StudentDetailsGUI();
	}

	private void StudentDetailsGUI() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Welcome To System");
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label.setBounds(300, 80, 500, 30);
		frame.getContentPane().add(label);
		
		JButton btnInptStdntDetails = new JButton("Save");
		btnInptStdntDetails.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent arg0) {
				File log = new File("StudentDetails.txt");
				
			    String SdName = textField.getText().trim();
			    String SdAddress = textField_1.getText().trim();
			    String Program = textField_2.getText().trim();
			    int Year = 0;
			    
			    boolean validInt = false;
			   
			    while(!validInt) {
			        try {
			        	Year = Integer.parseInt(textField_3.getText().trim());
			        	validInt = true;
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
			    
			    double Fee = 0.0;
			    boolean validDouble = false;
			    while(!validDouble) {
			        try {
			        	Fee = Double.parseDouble(textField_3.getText().trim());
			        	validDouble = true;
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

				    JOptionPane.showMessageDialog(null, "Program must not be empty");
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

				    JOptionPane.showMessageDialog(null, "Year must not be empty");
				    return;
				}
			    else if(textField_4.getText().hashCode() == 0){
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

				    JOptionPane.showMessageDialog(null, "Fee must not be empty");
				    return;
				}
			    
			    String line;
			    
			    try {
			    	@SuppressWarnings("resource")
					BufferedReader Reader = new BufferedReader(new FileReader("StudentDetails.txt"));
			    	
					while((line = Reader.readLine())!= null){
						String[] array = line.split(",");
						
						if(array[0].equals(SdName) || array[1].equals(SdAddress) || array[2].equals(Program) || array[3].equals(Year) || array[4].equals(Fee)){
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
						    bufferedWriter.write(SdName + "," + SdAddress + "," + Program + "," + Year + "," + Fee);
						    bufferedWriter.newLine();
						    bufferedWriter.close();
						    JOptionPane.showMessageDialog(frame,"Student details are added!");

						} catch(IOException n) {
						}
			}
		});
		btnInptStdntDetails.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnInptStdntDetails.setBounds(310, 380, 80, 29);
		frame.getContentPane().add(btnInptStdntDetails);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				System.main(null);
			}
		});
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnBack.setBounds(410, 380, 80, 29);
		frame.getContentPane().add(btnBack);
		
		JLabel lblUserPage = new JLabel("Input Student Details");
		lblUserPage.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblUserPage.setBounds(300, 120, 500, 30);
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
		textField_3.setBounds(200, 280, 500, 30);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(200, 320, 500, 30);
		frame.getContentPane().add(textField_4);
		
		JLabel Name = new JLabel("Name");
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		Name.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Name.setBounds(140, 160, 46, 29);
		frame.getContentPane().add(Name);
		
		JLabel Address = new JLabel("Address");
		Address.setHorizontalAlignment(SwingConstants.CENTER);
		Address.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Address.setBounds(120, 200, 80, 29);
		frame.getContentPane().add(Address);
		
		JLabel Program = new JLabel("Program");
		Program.setHorizontalAlignment(SwingConstants.CENTER);
		Program.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Program.setBounds(130, 240, 60, 29);
		frame.getContentPane().add(Program);
		
		JLabel Year = new JLabel("Year");
		Year.setHorizontalAlignment(SwingConstants.CENTER);
		Year.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Year.setBounds(110, 280, 80, 29);
		frame.getContentPane().add(Year);
		
		JLabel Fee = new JLabel("Fee");
		Fee.setHorizontalAlignment(SwingConstants.CENTER);
		Fee.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Fee.setBounds(110, 320, 80, 29);
		frame.getContentPane().add(Fee);
		
	}

}
