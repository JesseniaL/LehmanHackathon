package mortonwilliams;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



public class ButtonforM extends JFrame implements ActionListener {
	static final long serialVersionUID = 0;
	
	private JButton s = new JButton("steak");
	private JButton b = new JButton("bacon");
	private JButton c = new JButton("chicken");
	private JButton l = new JButton("lamb");
	private JButton p = new JButton("pork");
	private JButton t = new JButton("turkey");
	
	public ButtonforM() {
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		
		contentPane.setLayout(new GridLayout(6, 8));
		
		contentPane.add(s);
		s.addActionListener((ActionListener) this);
		
		contentPane.add(b);
		b.addActionListener((ActionListener) this);
		
		contentPane.add(c);
		c.addActionListener((ActionListener) this);
		
		contentPane.add(l);
		l.addActionListener((ActionListener) this);
		
		contentPane.add(p);
		p.addActionListener((ActionListener) this);
		
		contentPane.add(t);
		t.addActionListener((ActionListener) this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pack();
	}
	/*
	public void actionPerformed(ActionEvent e) {
		Container contentPane = getContentPane();
		
		if (e.getActionCommand().equals(FoodFacts steak)) {
			MeatFacts array = FoodFacts("steak");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());
		}
		
		else {
			System.out.println("ERROR IN BUTTON INTERFACE");
		}
	}*/
}
