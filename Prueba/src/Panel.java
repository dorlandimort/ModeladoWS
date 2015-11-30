import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;


public class Panel extends JPanel {
	Panel p = this;
	Ventana ventana = null;
	public Panel(Ventana v) {
		this.ventana = v;
		this.setBorder(javax.swing.BorderFactory.createTitledBorder("Titulo"));
		JButton boton = new JButton("DibujarFractal");
		boton.setBounds(20, 20, 100, 20);
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = getGraphics();
					p.paint(g);
					v.dibujarFractal(g, p.getWidth() / 2, p.getHeight() / 3 * 2, -90, 4);
				
			}
			
		});
		this.add(boton);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	}
	
	public void repintar(Graphics g) {
		super.paint(g);
	}
	

}
