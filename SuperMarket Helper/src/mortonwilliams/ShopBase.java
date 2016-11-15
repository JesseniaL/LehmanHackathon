package mortonwilliams;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ShopBase extends JApplet implements ActionListener {
	static final long serialVersionUID = 0;
	
	private JButton v = new JButton("Vegetables");
	private JButton f = new JButton("Fruits");
	private JButton m = new JButton("Meat");
	private JButton s = new JButton("Seafood");
	
	
	public void init() {
        
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.GRAY);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		contentPane.add(v);
		v.addActionListener((ActionListener) this);
		
		contentPane.add(f);
		f.addActionListener((ActionListener) this);
		contentPane.add(m);
		m.addActionListener((ActionListener) this);
		contentPane.add(s);
		s.addActionListener((ActionListener) this);
		
}

	public void actionPerformed(ActionEvent e) {
		//Container contentPane = getContentPane();
		
		if (e.getActionCommand().equals("Vegetables")) {
			//System.out.println("Yeam im printing");
			//Button arr = new Button();
			//JFrame frame = new JFrame("HelloWorldSwing");
			//frame.add(frame);
			Button b = new Button();
			//JButton open = new JButton("Button");
			//open.addActionListener(this);
			//add(open);
			//setVisible(true);
			
	        
	    }
		
	}
}
  