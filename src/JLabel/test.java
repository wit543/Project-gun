package JLabel;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class test extends JFrame implements Runnable {
	ColorLabel color = new ColorLabel();

	changeBackground c;
	
	test() {
		super.setSize(200, 200);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Image img = null;
		try{
			img =ImageIO.read(new File("D:\\java\\y1s1\\Project\\src\\images\\a.gif"));

		}
		catch(IOException e){
			System.out.println("fail");
		}
		c = new changeBackground(img);;
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				// TODO Auto-generated method stub
				Image i=null;
				try{
				 i = ImageIO.read(new File("D:\\java\\y1s1\\Project\\src\\images\\go.jpg"));
				}
				catch(IOException e){
					System.out.println("fail");
				}
				c.updateBackground(i);
				System.out.println("clicked");
			}
		});
		add(c);
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		setVisible(true);
	}

	public static void main(String[] args) {
		test t = new test();
		t.run();
	}
}
