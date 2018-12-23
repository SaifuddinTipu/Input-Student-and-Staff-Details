//********
//copyright @ Md. Saifuddin Tipu
//dept. of Software Engineering, University Malaysia Sarawak
//********

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;


public class Main extends Login{	
	private Clip clip;
	private JFrame frame;
	

	int LblTextLength = 0;
	Timer tm;
	int counter = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		
		MainGUI();
	}

	public void MainGUI() {
		frame = new JFrame("Welcome to System");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	    
		JLabel lblMsg = new JLabel("Welcome to G-1-6 System");
		lblMsg.setForeground(Color.BLUE);
		lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsg.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblMsg.setBounds(140, 80, 500, 30);
		frame.getContentPane().add(lblMsg);
		
		String txt = lblMsg.getText();
		LblTextLength = txt.length();
		
		tm = new Timer(150,new ActionListener()
		{
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			counter++;
			if(counter > LblTextLength)
			{
				lblMsg.setText("");
				counter = 0; 
			}else{
				lblMsg.setText(txt.substring(0,counter));
				
				if (lblMsg.getForeground() == Color.blue)
				{
					lblMsg.setForeground(Color.red);
				}
				else if(lblMsg.getForeground() == Color.red)
				{
					lblMsg.setForeground(Color.DARK_GRAY);
				}
				else if(lblMsg.getForeground() == Color.DARK_GRAY)
				{
					lblMsg.setForeground(Color.blue);
				}
			}
			
		}
	});
		
		tm.start();
		
		//JLabel WelcomeToSystem = new JLabel("Welcome To System");
		//WelcomeToSystem.setHorizontalAlignment(SwingConstants.CENTER);
		//WelcomeToSystem.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		//WelcomeToSystem.setBounds(140, 80, 500, 30);
		//frame.getContentPane().add(WelcomeToSystem);
		
		JButton Student = new JButton("Student");
		Student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterStudent.main(new String[]{});
				frame.dispose();
			}
		});
		Student.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Student.setBounds(145, 170, 500, 30);
		frame.getContentPane().add(Student);
		
		JLabel LoginPage = new JLabel("Register as Following");
		LoginPage.setHorizontalAlignment(SwingConstants.CENTER);
		LoginPage.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		LoginPage.setBounds(135, 120, 500, 30);
		frame.getContentPane().add(LoginPage);
		
		JButton Staff = new JButton("Staff");
		Staff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterStaff.main(new String[]{});
				frame.dispose();
			}
		});
		Staff.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Staff.setBounds(145, 220, 500, 30);
		frame.getContentPane().add(Staff);
		
		JLabel lblRegister = new JLabel("or Login to your Account");
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login.main(new String[]{});
				frame.dispose();
			}
		});
		lblRegister.setForeground(Color.BLUE);
		lblRegister.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblRegister.setBounds(310, 300, 500, 30);
		frame.getContentPane().add(lblRegister);
		
		JButton btnmusic = new JButton("MUSIC ON/OFF");
		frame.getContentPane().add(btnmusic);
		btnmusic.setHorizontalAlignment(SwingConstants.CENTER);
	    btnmusic.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
	    btnmusic.setBounds(220, 360, 340, 30);
	    
	     
	    try {
	         // Open an audio input stream.
	         File soundFile = new File ("src/music.wav");
	         AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
	         // Get a sound clip resource.
	         clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.loop(Clip.LOOP_CONTINUOUSLY);
	         clip.start();
	    
	
	    btnmusic.addActionListener(new ActionListener()
		{	
	    	 
	    public void actionPerformed(ActionEvent n)
	    {
	   	         
	    	if (clip.isRunning())
	        {
	            clip.stop();			        	                	
	        }
	        else
	        { 
	            clip.loop(Clip.LOOP_CONTINUOUSLY);
	         	clip.start();   
	            clip.setFramePosition(0);
	        }
	    		 
	    			  
	    }
						
	});
	}catch (UnsupportedAudioFileException r){
	    r.printStackTrace();
	    } catch (IOException r) {
	       r.printStackTrace();
	       } catch (LineUnavailableException r) {
	         r.printStackTrace();
	    }
}
}
