package com.ulsa.ventanas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.ulsa.dibujo.Figura;
import com.ulsa.dibujo.Lienzo;


public class PanelDibujo extends JPanel {
	
	private Border titulo = null;
	private JLabel txtEjeX = null;
	private JLabel txtEjeY = null;
	private JLabel txtEjeZ = null;
	private JButton btnIzquierdaX = null;
	private JButton btnIzquierdaY = null;
	private JButton btnIzquierdaZ = null;
	private JButton btnDerechaX = null;
	private JButton btnDerechaY = null;
	private JButton btnDerechaZ = null;
	private ImageIcon izquierda = null;
	private ImageIcon derecha = null;
	private PanelDibujo panel= null;
	
	private Figura figura = null;
	Lienzo lienzo = null;
	
	public PanelDibujo(Ventana v) {
		this.titulo = BorderFactory.createTitledBorder("Plano");
		this.setBorder(titulo);
		int d = v.getpDatos().getWidth();
		this.setSize(v.getWidth() - d - 40, v.getHeight() * 92 / 100 - 10);
		this.setLayout(null);
		this.panel = this;
		
		this.lienzo = new Lienzo();
		
		this.izquierda = new ImageIcon("rotar-izq.png");
		this.derecha = new ImageIcon("rotar-der.png");
	// Eje X
		this.txtEjeX = new JLabel("Eje X");
		this.txtEjeX.setBounds(30, this.getHeight() - 70, 50, 20);
		this.add(txtEjeX);
		
		this.btnIzquierdaX = new JButton(izquierda);
		this.btnIzquierdaX.setBounds(10, this.getHeight() - 40, 35, 35);
		this.btnIzquierdaX.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.figura = panel.lienzo.rotarFigura(panel.figura, -10, "X");
				panel.lienzo.dibujarFigura(panel, figura);
			}
			
		});
		this.add(btnIzquierdaX);
		
		this.btnDerechaX = new JButton(derecha);
		this.btnDerechaX.setBounds(50, this.getHeight() - 40, 35, 35);
		this.btnDerechaX.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.figura = panel.lienzo.rotarFigura(panel.figura, 10, "X");
				panel.lienzo.dibujarFigura(panel, figura);
			}
			
		});
		this.add(btnDerechaX);
	// Eje Y
		this.txtEjeY = new JLabel("Eje Y");
		this.txtEjeY.setBounds(this.getWidth() - 60, this.getHeight() - 70, 50, 20);
		this.add(txtEjeY);
		
		this.btnIzquierdaY = new JButton(izquierda);
		this.btnIzquierdaY.setBounds(this.getWidth() - 85, this.getHeight() - 40, 35, 35);
		this.btnIzquierdaY.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.figura = panel.lienzo.rotarFigura(panel.figura, 10, "Y");
				panel.lienzo.dibujarFigura(panel, figura);
			}
			
		});
		this.add(btnIzquierdaY);
		
		this.btnDerechaY = new JButton(derecha);
		this.btnDerechaY.setBounds(this.getWidth() - 45, this.getHeight() - 40, 35, 35);
		this.btnDerechaY.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.figura = panel.lienzo.rotarFigura(panel.figura, -10, "Y");
				panel.lienzo.dibujarFigura(panel, figura);
			}
			
		});
		this.add(btnDerechaY);
// Eje Z
		this.txtEjeZ = new JLabel("Eje Z");
		this.txtEjeZ.setBounds(this.getWidth() - 60, 5, 50,	 20);
		this.add(txtEjeZ);
		
		this.btnIzquierdaZ = new JButton(izquierda);
		this.btnIzquierdaZ.setBounds(this.getWidth() - 85, 30, 35, 35);
		this.btnIzquierdaZ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.figura = panel.lienzo.rotarFigura(panel.figura, -10, "Z");
				panel.lienzo.dibujarFigura(panel, figura);
			}
			
		});
		this.add(btnIzquierdaZ);
		
		this.btnDerechaZ = new JButton(derecha);
		this.btnDerechaZ.setBounds(this.getWidth() - 45, 30, 35, 35);
		this.btnDerechaZ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.figura = panel.lienzo.rotarFigura(panel.figura, 10, "Z");
				panel.lienzo.dibujarFigura(panel, figura);
			}
			
		});
		this.add(btnDerechaZ);
	}
	
	public void dibujar(String ecuacion, int minX, int maxX, int minY, int maxY, int minZ, int maxZ) {
		this.figura = this.lienzo.generarFigura(ecuacion, minX, maxX, minY, maxY, minZ, maxZ);
		this.lienzo.dibujarFigura(this, this.figura);
	}
	
	public JLabel getTxtEjeX() {
		return txtEjeX;
	}

	public void setTxtEjeX(JLabel txtEjeX) {
		this.txtEjeX = txtEjeX;
	}

	public JLabel getTxtEjeY() {
		return txtEjeY;
	}

	public void setTxtEjeY(JLabel txtEjeY) {
		this.txtEjeY = txtEjeY;
	}

	public JLabel getTxtEjeZ() {
		return txtEjeZ;
	}

	public void setTxtEjeZ(JLabel txtEjeZ) {
		this.txtEjeZ = txtEjeZ;
	}

	public JButton getBtnIzquierdaX() {
		return btnIzquierdaX;
	}

	public void setBtnIzquierdaX(JButton btnIzquierdaX) {
		this.btnIzquierdaX = btnIzquierdaX;
	}

	public JButton getBtnIzquierdaY() {
		return btnIzquierdaY;
	}

	public void setBtnIzquierdaY(JButton btnIzquierdaY) {
		this.btnIzquierdaY = btnIzquierdaY;
	}

	public JButton getBtnIzquierdaZ() {
		return btnIzquierdaZ;
	}

	public void setBtnIzquierdaZ(JButton btnIzquierdaZ) {
		this.btnIzquierdaZ = btnIzquierdaZ;
	}

	public JButton getBtnDerechaX() {
		return btnDerechaX;
	}

	public void setBtnDerechaX(JButton btnDerechaX) {
		this.btnDerechaX = btnDerechaX;
	}

	public JButton getBtnDerechaY() {
		return btnDerechaY;
	}

	public void setBtnDerechaY(JButton btnDerechaY) {
		this.btnDerechaY = btnDerechaY;
	}

	public JButton getBtnDerechaZ() {
		return btnDerechaZ;
	}

	public void setBtnDerechaZ(JButton btnDerechaZ) {
		this.btnDerechaZ = btnDerechaZ;
	}

	public Border getTitulo() {
		return titulo;
	}

	public void setTitulo(Border titulo) {
		this.titulo = titulo;
	}

	public ImageIcon getIzquierda() {
		return izquierda;
	}

	public void setIzquierda(ImageIcon izquierda) {
		this.izquierda = izquierda;
	}

	public ImageIcon getDerecha() {
		return derecha;
	}

	public void setDerecha(ImageIcon derecha) {
		this.derecha = derecha;
	}

	public PanelDibujo getPanel() {
		return panel;
	}

	public void setPanel(PanelDibujo panel) {
		this.panel = panel;
	}

	public Figura getFigura() {
		return figura;
	}

	public void setFigura(Figura figura) {
		this.figura = figura;
	}

	public Lienzo getLienzo() {
		return lienzo;
	}

	public void setL(Lienzo lienzo) {
		this.lienzo = lienzo;
	}
	
}


