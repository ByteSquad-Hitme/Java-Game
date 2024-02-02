package p1;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import p1.gameZoneI2.gamethread;

public class beg_lev1_info {
	//helper
//	JFrame frame;
//	private goHandler gHandler = new goHandler();
	//the Components
	private font font = new font();
	public static JLabel begStage,infoLabel;
	public static JPanel infoPanel;
	private Image demoIcon;
	public static JButton goButton;
	static int k=0;
	
	
	//The main class
	public static void main(String args[]) {
//		new beg_lev1_info();
			
	}
	
	//the constructor
	public beg_lev1_info(JFrame baseframe) {
		
		//try to say timer is not cancellled
		
		//Setting up the frame	
//		frame = new JFrame("ByteSquad");
//		frame.setSize(800, 600);
//		frame.setVisible(true);
//		frame.getContentPane().setBackground(Color.black);
//		frame.setLayout(null);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLocationRelativeTo(null);
//		//Setting up the icon
//		demoIcon = new ImageIcon(this.getClass().getResource("/Images/DEMON_1 _reZ.png")).getImage();//Imports the font file
//		frame.setIconImage(demoIcon);
		

		//setting up the stageTitle image
		begStage = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/Images/beginnerTitle.png")).getImage();
		begStage.setIcon(new ImageIcon(img));
		begStage.setBounds(310,50, 200, 100);
		baseframe.add(begStage);
		
		
		//setting up the info panel
		infoPanel = new JPanel();
		infoPanel.setBounds(225, 170, 350, 240);
		infoPanel.setBackground(Color.red);
		infoPanel.setLayout(null);
		baseframe.add(infoPanel);

		//setting up the infoLabel
		infoLabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Level 1<br/> <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Time : 180 Seconds<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hit Target : 20<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Maximum miss : 60<br/> <br/>&nbsp;&nbsp;Objective : Hit The Demon To &nbsp;&nbsp;Gain Points</html>");
		infoLabel.setBounds(10,25, 330, 190);
		infoLabel.setBackground(Color.yellow);
		infoLabel.setForeground(Color.yellow);
		infoLabel.setFont(font.pixelMplus);
		infoLabel.setFont(infoLabel.getFont().deriveFont(Font.PLAIN,20f));
		infoPanel.add(infoLabel);
		
		//setting up the goButton
		goButton = new JButton("GO");
		goButton.setBounds(370,460,60,35);
		goButton.setForeground(Color.yellow);
		goButton.setBackground(Color.red);
		goButton.setFont(font.pixelMplus);
		goButton.setFont(goButton.getFont().deriveFont(Font.PLAIN, 20f));
		goButton.setBorderPainted(false);
		goButton.setFocusPainted(false);
		goButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				begStage.setVisible(false);
				infoPanel.setVisible(false);
				infoLabel.setVisible(false);
				goButton.setVisible(false);
				
				
				//linking to the gameZoneB1
				
				new  gameZoneB1(baseframe);
				
					
					
					
			
//				gZB1.creator1();
//				gZB1.creator();
				
				
				
			}

		});
		baseframe.add(goButton);
		
		//helper
//		frame.add(begStage);
//		frame.add(infoPanel);
//		frame.add(goButton);
		
	}
	
//	public class goHandler implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}
	
}
