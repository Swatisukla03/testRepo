package awtsProject;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awtsDemo extends Frame{
	public awtsDemo() {
//		setSize(400,300);
//		setVisible(true);
		
		Frame frame=new Frame("hello first GUI");
		
		
		
		Label label1=new Label("hello friends");
		label1.setBounds(20,90,150,30);
		Button button=new Button("Click Me");
		button.setBounds(20,40,80,30);
		
		
		TextField textfield=new TextField();
		textfield.setBounds(20,120,150,30);
		
		frame.add(button);
		
		frame.add(label1);
		frame.add(textfield);
//		frame.setSize(400,300);
//		frame.setVisible(true);
		
	frame.setSize(400,300);
	frame.setLayout(null);
	frame.setVisible(true);
	
	frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			frame.dispose();
		
	}
	});
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 awtsDemo obj1=new awtsDemo();
		 

	}

}
