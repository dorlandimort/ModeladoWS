package dibujo;

import java.awt.Graphics;

import ventanas.PanelDibujo;
import ventanas.Ventana;

public interface Lienzo {
	public Figura generarFigura(String ruta);
	public void dibujarFigura(Figura figura, PanelDibujo v);
	public Figura rotarFigura(Figura figura, double angulo, String eje);
	public Figura escalarFigura(Figura figura, double k);
	public Figura trasladarFigura(Figura figura, double[] vectorTraslacion);
	
}
