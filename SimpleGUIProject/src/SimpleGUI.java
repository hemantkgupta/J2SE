import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class SimpleGUI implements ActionListener{
	JButton button;
	public static void main(String[] args) {
		SimpleGUI a = new SimpleGUI();
		a.go();
		
	}
	public void go(){
	JFrame frame = new JFrame();
	button = new JButton("Click me");
	button.addActionListener(this);
	frame.getContentPane().add(button);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 300);
	frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0) {
		button.setText("clicked");
		
		
	}
	

}
