package ventanas;

import java.awt.Color;

import javax.swing.JPanel;

public class PanelDibujo extends JPanel{
	
	public PanelDibujo(Ventana v) {
		this.setSize(v.getWidth(), v.getHeight() - 120);
		this.setLayout(null);
		this.setBackground(Color.black);
	}

}
