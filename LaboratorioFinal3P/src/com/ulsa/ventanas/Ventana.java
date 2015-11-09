package com.ulsa.ventanas;
import javax.swing.JFrame;


public class Ventana extends JFrame {
	// Paneles
	private PanelDatos pDatos = null;
	private PanelDibujo pDibujo = null;
	
	public Ventana() {
		super("Graficador de superficies");
		this.setSize(1280, 700);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pDatos = new PanelDatos(this);
		pDatos.setLocation(10, 10);
		this.add(pDatos);
		pDibujo = new PanelDibujo(this);
		pDibujo.setLocation(370, 10);
		this.add(pDibujo);
		
		this.setVisible(true);
	}

	public PanelDatos getpDatos() {
		return pDatos;
	}

	public void setpDatos(PanelDatos pDatos) {
		this.pDatos = pDatos;
	}

	public PanelDibujo getpDibujo() {
		return pDibujo;
	}

	public void setpDibujo(PanelDibujo pDibujo) {
		this.pDibujo = pDibujo;
	}
	
	
	
}
