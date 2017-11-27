import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Print extends JPanel implements ActionListener{
	
	JLabel lbl;
	JTextField tf;
	JButton b;
	
	public Print() {
		lbl = new JLabel();
		tf = new JTextField(15);
		b = new JButton("Submit");
		
		add(tf);	add(b);		add(lbl);
		b.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		lbl.setText(tf.getText());
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLocation(200,200);
		f.setSize(400,400);
		f.setTitle("Print");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Print p = new Print();
		f.add(p);
		f.setVisible(true);
	}
}


