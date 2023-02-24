package swingClass;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

public class class1 {

	private JFrame frmUserRegistrationForm;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JLabel lblNewLabel_6;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					class1 window = new class1();
					window.frmUserRegistrationForm.setVisible(true);
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
		frmUserRegistrationForm = new JFrame();
		frmUserRegistrationForm.setTitle("User Registration form");
		frmUserRegistrationForm.setBounds(100, 100, 450, 300);
		frmUserRegistrationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUserRegistrationForm.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name :");
		lblNewLabel.setBounds(10, 11, 76, 14);
		frmUserRegistrationForm.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(99, 11, 325, 20);
		frmUserRegistrationForm.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Father Name :");
		lblNewLabel_1.setBounds(10, 42, 76, 20);
		frmUserRegistrationForm.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 42, 325, 20);
		frmUserRegistrationForm.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Age :");
		lblNewLabel_2.setBounds(10, 76, 46, 17);
		frmUserRegistrationForm.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(99, 73, 325, 20);
		frmUserRegistrationForm.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Gender :");
		lblNewLabel_3.setBounds(10, 112, 46, 14);
		frmUserRegistrationForm.getContentPane().add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(99, 108, 109, 23);
		frmUserRegistrationForm.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femal");
		buttonGroup_1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(254, 108, 109, 23);
		frmUserRegistrationForm.getContentPane().add(rdbtnNewRadioButton_1);
		
		lblNewLabel_4 = new JLabel(" Course :");
		lblNewLabel_4.setBounds(10, 150, 46, 14);
		frmUserRegistrationForm.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Hobbies : ");
		lblNewLabel_5.setBounds(10, 185, 60, 14);
		frmUserRegistrationForm.getContentPane().add(lblNewLabel_5);
		
		chckbxNewCheckBox = new JCheckBox("Cricket");
		chckbxNewCheckBox.setBounds(99, 181, 66, 23);
		frmUserRegistrationForm.getContentPane().add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("Singing");
		chckbxNewCheckBox_1.setBounds(167, 181, 73, 23);
		frmUserRegistrationForm.getContentPane().add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("Dance");
		chckbxNewCheckBox_2.setBounds(242, 181, 66, 23);
		frmUserRegistrationForm.getContentPane().add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("Others");
		chckbxNewCheckBox_3.setBounds(320, 181, 76, 23);
		frmUserRegistrationForm.getContentPane().add(chckbxNewCheckBox_3);
		
		lblNewLabel_6 = new JLabel("Address : ");
		lblNewLabel_6.setBounds(10, 222, 60, 14);
		frmUserRegistrationForm.getContentPane().add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(99, 219, 325, 20);
		frmUserRegistrationForm.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}