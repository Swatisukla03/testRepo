package sumit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class class1 {

	private JFrame frame;
	private JTextField txtThisIsThe;
	
	private  JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					class1 window = new class1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public class1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Asish Goyal");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(5, 4));
		
		JButton btnNewButton = new JButton("enter user name");
		//to perform action listener part
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Clicked from TOP button");
				
			 
				
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton(" Mp");
		frame.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_4 = new JButton("DAA");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		
		lblNewLabel = new JLabel(" enter user name");
		frame.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		
		txtThisIsThe = new JTextField();
		frame.getContentPane().add(txtThisIsThe, BorderLayout.EAST);
		txtThisIsThe.setColumns(10);
	}

}
