package p1;


import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;




public class TheBaseClass {
	//The components
	JFrame baseframe;
	public static JLabel title, demon1;
	public static JButton enterButton;
	private font font = new font();
	private Image demonIcon;
	private titleScreenHandler tHandler = new titleScreenHandler();
	
	
	public static void main(String[] args) {
	
		new TheBaseClass();
	}
	
	
	//The Constructor
	public TheBaseClass() {
		
		baseframe = new JFrame("ByteSquad");
		baseframe.setSize(800, 600);
		baseframe.setVisible(true);
		baseframe.getContentPane().setBackground(Color.black);
		baseframe.setLayout(null);
		baseframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		baseframe.setLocationRelativeTo(null);
		//Committed in 5 minutes
		
		//Setting up the title image
		title = new JLabel();
		Image img0 = new ImageIcon(this.getClass().getResource("/Images/Title.png")).getImage();
		title.setIcon(new ImageIcon(img0));
		title.setBounds(295, 270, 400, 100);
		baseframe.add(title);
		
		//Adding enter Button
		enterButton =  new JButton("ENTER");
		enterButton.setBounds(350,420,110,30);
		enterButton.setForeground(Color.yellow);
		enterButton.setBackground(Color.red);
		
		enterButton.setFont(font.pixelMplus);
		enterButton.setFont(enterButton.getFont().deriveFont(Font.BOLD, 20f));
		enterButton.setBorderPainted(false);
		enterButton.setFocusPainted(false);
		enterButton.addActionListener(tHandler);
		baseframe.add(enterButton);
		
		//Setting up the icon
		demonIcon = new ImageIcon(this.getClass().getResource("/Images/DEMON_1 _reZ.png")).getImage();//Imports the font file
		baseframe.setIconImage(demonIcon);
		
//		//Adding the Image to the Home page
		demon1 = new JLabel();
		Image img1 = new ImageIcon(this.getClass().getResource("/Images/DEMON_1 _reZ.png")).getImage();
		demon1.setIcon(new ImageIcon(img1));
		demon1.setBounds(350, 140, 110, 122);  //Image sizes are crucial
		baseframe.add(demon1);
	}
	
	public class titleScreenHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//Helper
//			title.setVisible(false);
//			demon1.setVisible(false);
//			enterButton.setVisible(false);
//			frame.dispose();
//			MenuPage try1 =new MenuPage();

			
			//IntegrationPhase
			title.setVisible(false);
			demon1.setVisible(false);
			enterButton.setVisible(false);
			//linking up MenuPage
			new MenuPage(baseframe);
			
			
			
		}
		
	}
	
}
