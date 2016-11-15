package mortonwilliams;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



public class Button extends JFrame implements ActionListener {
	static final long serialVersionUID = 0;
	
	private JButton bb = new JButton("Black Beans");
	private JButton c = new JButton("Cilantro");
	private JButton bs = new JButton("Brussels sprouts");
	private JButton ca = new JButton("Carrots");
	private JButton k = new JButton("Kale");
	private JButton sc = new JButton("Sweet Corn");
	private JButton m = new JButton("Mushrooms");
	private JButton o = new JButton("Onion");
	private JButton g = new JButton("Garlic");
	private JButton a = new JButton("Avocado");
	private JButton s = new JButton("Spinach");
	private JButton cc = new JButton("Cucumber");
	private JButton p = new JButton("Potato");
	private JButton gp = new JButton("Green Pepper");
	
	public Button() {
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		
		contentPane.setLayout(new GridLayout(14, 8));
		
		contentPane.add(bb);
		bb.addActionListener((ActionListener) this);
		
		contentPane.add(c);
		c.addActionListener((ActionListener) this);
		
		contentPane.add(bs);
		bs.addActionListener((ActionListener) this);
		
		contentPane.add(ca);
		ca.addActionListener((ActionListener) this);
		
		contentPane.add(k);
		k.addActionListener((ActionListener) this);
		
		contentPane.add(sc);
		sc.addActionListener((ActionListener) this);
		
		contentPane.add(m);
		m.addActionListener((ActionListener) this);
		
		contentPane.add(o);
		o.addActionListener((ActionListener) this);
		
		contentPane.add(g);
		g.addActionListener((ActionListener) this);
		
		contentPane.add(a);
		a.addActionListener((ActionListener) this);
		
		contentPane.add(s);
		s.addActionListener((ActionListener) this);
		
		contentPane.add(cc);
		cc.addActionListener((ActionListener) this);
		
		contentPane.add(p);
		p.addActionListener((ActionListener) this);
		
		contentPane.add(gp);
		gp.addActionListener((ActionListener) this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pack();
	}
	
	public void actionPerformed(ActionEvent e) {
		Container contentPane = getContentPane();
		
		if (e.getActionCommand().equals("Black Beans")) {
			//contentPane.removeAll();
			//contentPane.setBackground(Color.GRAY);
			Vegetable array = new Vegetable("Black Beans");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());
		}
		
		else if (e.getActionCommand().equals("Cilantro")) {
			//contentPane.removeAll();
			//contentPane.setBackground(Color.GREEN);
			Vegetable array = new Vegetable("Cilantro");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());
		}
		
		else if (e.getActionCommand().equals("Brussels sprouts")) {
			//contentPane.removeAll();
			//contentPane.setBackground(Color.BLUE);
			Vegetable array = new Vegetable("Brussels sprouts");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());	
		}
		
		else if (e.getActionCommand().equals("Carrots")) {
			//contentPane.removeAll();
			//contentPane.setBackground(Color.BLUE);
			Vegetable array = new Vegetable("Carrots");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());	
		}
		
		else if (e.getActionCommand().equals("Kale")) {
			//contentPane.removeAll();
			//contentPane.setBackground(Color.BLUE);
			Vegetable array = new Vegetable("Kale");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());	
		}
		
		else if (e.getActionCommand().equals("Sweet Corn")) {
			//contentPane.removeAll();
			//contentPane.setBackground(Color.BLUE);
			Vegetable array = new Vegetable("Sweet Corn");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());	
		}
		
		else if (e.getActionCommand().equals("Mushrooms")) {
			//contentPane.removeAll();
			//contentPane.setBackground(Color.BLUE);
			Vegetable array = new Vegetable("Mushrooms");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());	
		}
		
		else if (e.getActionCommand().equals("Onion")) {
			//contentPane.removeAll();
			//contentPane.setBackground(Color.BLUE);
			Vegetable array = new Vegetable("Onion");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());	
		}
		
		else if (e.getActionCommand().equals("Garlic")) {
			contentPane.removeAll();
			contentPane.setBackground(Color.BLUE);
			Vegetable array = new Vegetable("Garlic");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());	
		}
		
		else if (e.getActionCommand().equals("Avocado")) {
			//contentPane.removeAll();
			//contentPane.setBackground(Color.BLUE);
			Vegetable array = new Vegetable("Avocado");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());	
		}
		
		else if (e.getActionCommand().equals("Spinach")) {
			contentPane.removeAll();
			contentPane.setBackground(Color.BLUE);
			Vegetable array = new Vegetable("Spinach");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());	
		}
		
		else if (e.getActionCommand().equals("Cucumber")) {
			//contentPane.removeAll();
			//contentPane.setBackground(Color.BLUE);
			Vegetable array = new Vegetable("Cucumber");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());	
		}
		
		else if (e.getActionCommand().equals("Potato")) {
			//contentPane.removeAll();
			//contentPane.setBackground(Color.BLUE);
			Vegetable array = new Vegetable("Potato");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());	
		}
		
		else if (e.getActionCommand().equals("Green Pepper")) {
			//contentPane.removeAll();
			//contentPane.setBackground(Color.BLUE);
			Vegetable array = new Vegetable("Green Pepper");
			JFrame frame = new JFrame("HelloWorldSwing");
			JOptionPane.showMessageDialog(frame, array.toString());	
		}
		
		else {
			System.out.println("ERROR IN BUTTON INTERFACE");
		}
	}
}
