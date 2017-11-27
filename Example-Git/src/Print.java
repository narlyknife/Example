import java.awt.*;
import javax.swing.*;

public class Print extends JPanel{
	
	JLabel lbl;
	
	public Print() {
		lbl = new JLabel();
		lbl.setText("Hello World!");
		add(lbl);
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


