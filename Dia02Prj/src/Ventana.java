import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	public static final int ESCALA = 20;

	@Override
	public void paint(Graphics g) {
		g.drawLine(convertirPuntoX(-100), convertirPuntoY(0), 
				convertirPuntoX(100), convertirPuntoY(0));
		g.drawLine(convertirPuntoX(0), convertirPuntoY(100), 
				convertirPuntoX(0), convertirPuntoY(-100));
		
		// Poligono
		
		g.drawLine(convertirPuntoX(1), convertirPuntoY(1), 
				convertirPuntoX(4), convertirPuntoY(1));
		g.drawLine(convertirPuntoX(4), convertirPuntoY(1), 
				convertirPuntoX(4), convertirPuntoY(4));
		g.drawLine(convertirPuntoX(4), convertirPuntoY(4), 
				convertirPuntoX(1), convertirPuntoY(4));
		g.drawLine(convertirPuntoX(1), convertirPuntoY(4), 
				convertirPuntoX(1), convertirPuntoY(1));
		
	}
	
	private int convertirPuntoX(double x) {
		double centro = this.getWidth() / 2.0;
		return (int) (centro + x * ESCALA);
	}
	
	private int convertirPuntoY(double y) {
		double centro = this.getHeight() / 2.0;
		return (int) (centro - y * ESCALA);
	}
}
