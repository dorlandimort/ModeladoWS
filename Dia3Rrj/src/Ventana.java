import java.awt.Graphics;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	public static int ESCALA = 20;
	public static double[] matrizSegundoCuadrante = {-8, 0, -8, 0};
	public static double[] matrizTercerCuadrante = {-8, -10, -8, -10};
	public static double[] matrizCuartoCuadrante = {0, -10, 0, -10};

	@Override
	public void paint(Graphics g) {
		
		MatrizImpl operaciones = new MatrizImpl();
	
		// Dibujar plano cartesiano
		g.drawLine(convertirPuntoX(-100), convertirPuntoY(0), 
				convertirPuntoX(100), convertirPuntoY(0));
		g.drawLine(convertirPuntoX(0), convertirPuntoY(100), 
				convertirPuntoX(0), convertirPuntoY(-100));
		
	// Dibujar el poligono
		g.drawLine((convertirPuntoX(2)), (convertirPuntoY(1)), 
				(convertirPuntoX(4)), (convertirPuntoY(5)));
		
		g.drawLine((convertirPuntoX(4)), (convertirPuntoY(5)), 
				(convertirPuntoX(6)), (convertirPuntoY(1)));
		
		g.drawLine((convertirPuntoX(6)), (convertirPuntoY(1)), 
				(convertirPuntoX(4)), (convertirPuntoY(2)));
		
		g.drawLine((convertirPuntoX(4)), (convertirPuntoY(2)), 
				(convertirPuntoX(2)), (convertirPuntoY(1)));
		
	// Declarar puntos iniciales
		double[] puntoInicial1 = {2, 1, 4, 5};
		double[] puntoInicial2 = {4, 5, 6, 1};
		double[] puntoInicial3 = {6, 1, 4, 2};
		double[] puntoInicial4 = {4, 2, 2, 1};
	// Dibujar poligono en segundo cuadrante
		
		double[] puntoSegundoCuadrante1= operaciones.trasladar(puntoInicial1, 
				matrizSegundoCuadrante);
		
		g.drawLine(convertirPuntoX( puntoSegundoCuadrante1[0]), convertirPuntoY( puntoSegundoCuadrante1[1]),
				convertirPuntoX( puntoSegundoCuadrante1[2]), convertirPuntoY(puntoSegundoCuadrante1[3]));
		
		double[] puntoSegundoCuadrante2= operaciones.trasladar(puntoInicial2, 
				matrizSegundoCuadrante);
		g.drawLine(convertirPuntoX((int) puntoSegundoCuadrante2[0]), convertirPuntoY(puntoSegundoCuadrante2[1]),
				convertirPuntoX((int) puntoSegundoCuadrante2[2]), convertirPuntoY(puntoSegundoCuadrante2[3]));
		
		double[] puntoSegundoCuadrante3= operaciones.trasladar(puntoInicial3, 
				matrizSegundoCuadrante);
		g.drawLine(convertirPuntoX(puntoSegundoCuadrante3[0]), convertirPuntoY(puntoSegundoCuadrante3[1]),
				convertirPuntoX(puntoSegundoCuadrante3[2]), convertirPuntoY(puntoSegundoCuadrante3[3]));
		
		double[] puntoSegundoCuadrante4= operaciones.trasladar(puntoInicial4, 
				matrizSegundoCuadrante);
		g.drawLine(convertirPuntoX(puntoSegundoCuadrante4[0]), convertirPuntoY(puntoSegundoCuadrante4[1]),
				convertirPuntoX(puntoSegundoCuadrante4[2]), convertirPuntoY(puntoSegundoCuadrante4[3]));
		
	
		
		double[] puntoTercerCuadrante1= operaciones.trasladar(puntoInicial1, 
				matrizTercerCuadrante);
		g.drawLine(convertirPuntoX(puntoTercerCuadrante1[0]), convertirPuntoY(puntoTercerCuadrante1[1]),
				convertirPuntoX(puntoTercerCuadrante1[2]), convertirPuntoY(puntoTercerCuadrante1[3]));
		
		double[] puntoTercerCuadrante2= operaciones.trasladar(puntoInicial2, 
				matrizTercerCuadrante);
		g.drawLine(convertirPuntoX(puntoTercerCuadrante2[0]), convertirPuntoY(puntoTercerCuadrante2[1]),
				convertirPuntoX(puntoTercerCuadrante2[2]), convertirPuntoY(puntoTercerCuadrante2[3]));
		
		double[] puntoTercerCuadrante3= operaciones.trasladar(puntoInicial3, 
				matrizTercerCuadrante);
		g.drawLine(convertirPuntoX(puntoTercerCuadrante3[0]), convertirPuntoY(puntoTercerCuadrante3[1]),
				convertirPuntoX(puntoTercerCuadrante3[2]), convertirPuntoY(puntoTercerCuadrante3[3]));
		
		double[] puntoTercerCuadrante4= operaciones.trasladar(puntoInicial4, 
				matrizTercerCuadrante);
		g.drawLine(convertirPuntoX(puntoTercerCuadrante4[0]), convertirPuntoY(puntoTercerCuadrante4[1]),
				convertirPuntoX(puntoTercerCuadrante4[2]), convertirPuntoY(puntoTercerCuadrante4[3]));
				
				
		
		// Dibujar poligono en Tercer cuadrante
		
		
		double[] puntoCuartoCuadrante1= operaciones.trasladar(puntoInicial1, 
				matrizCuartoCuadrante);
		g.drawLine(convertirPuntoX(puntoCuartoCuadrante1[0]), convertirPuntoY(puntoCuartoCuadrante1[1]),
				convertirPuntoX(puntoCuartoCuadrante1[2]), convertirPuntoY(puntoCuartoCuadrante1[3]));
		
		double[] puntoCuartoCuadrante2= operaciones.trasladar(puntoInicial2, 
				matrizCuartoCuadrante);
		g.drawLine(convertirPuntoX(puntoCuartoCuadrante2[0]), convertirPuntoY(puntoCuartoCuadrante2[1]),
				convertirPuntoX(puntoCuartoCuadrante2[2]), convertirPuntoY(puntoCuartoCuadrante2[3]));
		
		double[] puntoCuartoCuadrante3= operaciones.trasladar(puntoInicial3, 
				matrizCuartoCuadrante);
		g.drawLine(convertirPuntoX(puntoCuartoCuadrante3[0]), convertirPuntoY(puntoCuartoCuadrante3[1]),
				convertirPuntoX(puntoCuartoCuadrante3[2]), convertirPuntoY(puntoCuartoCuadrante3[3]));
		
		double[] puntoCuartoCuadrante4= operaciones.trasladar(puntoInicial4, 
				matrizCuartoCuadrante);
		g.drawLine(convertirPuntoX(puntoCuartoCuadrante4[0]), convertirPuntoY(puntoCuartoCuadrante4[1]),
				convertirPuntoX(puntoCuartoCuadrante4[2]), convertirPuntoY(puntoCuartoCuadrante4[3]));
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
