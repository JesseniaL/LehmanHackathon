package mortonwilliams;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class SButton extends JButton {
	static final long serialVersionUID = 0;
	
	static Font defaultFont = new Font("Dialog",Font.PLAIN,24);
	static Color defaultColor = Color.yellow;
	static int counter = 0;
	static ActionListener defaultAction = new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		System.err.println("This button has no assigned action.");
	}
};

	SButton() {
		this("Button #" + counter, defaultAction, defaultColor, defaultFont);
	}
	    
	SButton(String label, ActionListener listener) {
		this(label, listener, defaultColor, defaultFont);
	}

	SButton(String label, ActionListener listener, Color color) {
		this(label, listener, color, defaultFont);
	}

	SButton(String label, ActionListener listener, Color color, Font font) {
		setFont(font);
		setBackground(color);
		setText(label);
		addActionListener(listener);
		counter++;
	}
}
