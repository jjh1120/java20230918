package secondClass;

import java.awt.Color;
import javax.swing.*;

public class Mypanel extends JFrame {

	public Mypanel() {

		JPanel p = new JPanel();
		add(p);
		p.setBackground(Color.orange);

		JButton btn1 = new JButton("버튼1");
		btn1.setBackground(Color.green);
		JButton btn2 = new JButton("버튼2");
		btn2.setBackground(Color.yellow);

		p.add(btn1);
		p.add(btn2);

		setTitle("패널예제");
		setSize(350, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Mypanel();
		
		

	}

}
