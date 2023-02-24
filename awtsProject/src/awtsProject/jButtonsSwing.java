package awtsProject;

import javax.swing.JButton;
import javax.swing.JFrame;

public class jButtonsSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame f=new JFrame("Button Exmaple");
		JButton b=new JButton("Click here");
		b.setBounds(50,100,95,30); //for button
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
