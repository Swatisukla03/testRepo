package awtsProject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingClass {
	
	SwingClass(){
		JFrame j1=new JFrame();
		JLabel firstName=new JLabel("First Name");
		firstName.setBounds(20,50,80,20);
		
		
		JLabel lastName=new JLabel("Last Name");
		lastName.setBounds(20,80,80,20);
		
		JLabel dob=new JLabel("Date of Birth");
		dob.setBounds(20,110,80,20);
		
		
		JTextField firstName1=new JTextField();
		firstName1.setBounds(120,50,100,20);
		
		
		
		JTextField lastName1=new JTextField();
		lastName1.setBounds(120,80,100,20);
		
		JTextField dob1=new JTextField();
		dob1.setBounds(120,110,100,20);
		
		JButton sbmt=new JButton("Submit");
		sbmt.setBounds(20,160,100,30);
		
		JButton reset=new JButton("Reset");
		reset.setBounds(120,160,100,30);
		
		
		j1.add(firstName);
		j1.add(lastName);
		j1.add(dob);
		j1.add(firstName1);
		j1.add(lastName1);
		j1.add(dob1);
		j1.add(sbmt);
		j1.add(reset);
		
		
		
		j1.setSize(300,300);
		j1.setLayout(null);
		j1.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SwingClass s=new SwingClass();

	}

}
