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

public class exp_lev2_info {
	//helper
//	JFrame frame;
//	private goHandler gHandler = new goHandler();
	//the Components
	private font font = new font();
	private JLabel expStage,infoLabel;
	private JPanel infoPanel;
	private Image demoIcon;
	private JButton goButton;
	
	//The main class
	public static void main(String args[]) {
//		new exp_lev2_info();
			
	}
	
	//the constructor
	public exp_lev2_info(JFrame baseframe) {
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
		expStage = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/Images/expertTitle.png")).getImage();
		expStage.setIcon(new ImageIcon(img));
		expStage.setBounds(320,50, 200, 100);
		baseframe.add(expStage);
		
		
		//setting up the info panel
		infoPanel = new JPanel();
		infoPanel.setBounds(225, 140, 350, 290);
		infoPanel.setBackground(Color.red);
		infoPanel.setLayout(null);
		baseframe.add(infoPanel);

		//setting up the infoLabel
		infoLabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Level 2<br/> <br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Time : 80 Seconds<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hit Target : 40<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Maximum miss : 40<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hit the demon : +1<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Click on fire : -1<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Click on bomb : GameOver<br/> <br/>&nbsp;&nbsp;Objective : Hit The Demon To &nbsp;&nbsp;Gain Points</html>");
		infoLabel.setBounds(10,25, 330, 240);
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
				
				expStage.setVisible(false);
				infoPanel.setVisible(false);
				infoLabel.setVisible(false);
				goButton.setVisible(false);
				
				
				//linking to the gameZoneB1
				gameZoneE2 gZE2 = new  gameZoneE2(baseframe);
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
