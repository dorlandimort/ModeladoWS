package ventanas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import dibujo.Figura;
import dibujo.Lienzo;
import dibujo.LienzoImpl;

public class Ventana extends JFrame {
	
	private Lienzo lienzo = null;
	private Figura figura = null;
	private PanelDibujo panelDibujo = null;
	private PanelComandos panelComandos = null;
	
	
	public Ventana(String ruta) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setTitle("Hipercubo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize((int)(screenSize.getWidth() - 10), (int)(screenSize.getHeight() - 60));
		this.iniciarComponentes(ruta);
		this.setVisible(true);
	}
	
	private void iniciarComponentes(String ruta) {
		this.lienzo = new LienzoImpl();
		this.figura = lienzo.generarFigura(ruta);
		
		this.panelDibujo = new PanelDibujo(this);
		this.panelDibujo.setLocation(0, 0);
		this.add(this.panelDibujo);
		
		this.panelComandos = new PanelComandos(this);
		this.panelComandos.setLocation(5, this.getHeight() - 115);
		this.add(this.panelComandos);
		
		
	}
	
	public void dibujar(Figura figura) {
		lienzo.dibujarFigura(figura, this.panelDibujo);
	}

	public Lienzo getLienzo() {
		return lienzo;
	}

	public void setLienzo(Lienzo lienzo) {
		this.lienzo = lienzo;
	}

	public Figura getFigura() {
		return figura;
	}

	public void setFigura(Figura figura) {
		this.figura = figura;
	}
	
	public PanelDibujo getPanelDibujo() {
		return panelDibujo;
	}

	public void setPanelDibujo(PanelDibujo panelDibujo) {
		this.panelDibujo = panelDibujo;
	}

	public PanelComandos getPanelComandos() {
		return panelComandos;
	}

	public void setPanelComandos(PanelComandos panelComandos) {
		this.panelComandos = panelComandos;
	}

}
