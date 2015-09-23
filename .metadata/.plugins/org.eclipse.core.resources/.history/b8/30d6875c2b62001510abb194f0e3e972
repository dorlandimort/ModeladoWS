import java.awt.Color;
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
		

	// Declarar puntos iniciales
		double[] puntoInicialA = {2, 1};
		double[] puntoInicialB = {4, 3};
		double[] puntoInicialC = {6, 1};
		double[] puntoInicialD = {4, 7};
		
	// Dibujar el poligono
		
		g.setColor(Color.RED);
		
		g.drawLine(convertirPuntoX(puntoInicialA[0]), convertirPuntoY(puntoInicialA[1]),
				convertirPuntoX(puntoInicialB[0]), convertirPuntoY(puntoInicialB[1]));
		
		g.drawLine(convertirPuntoX(puntoInicialB[0]), convertirPuntoY(puntoInicialB[1]),
				convertirPuntoX(puntoInicialC[0]), convertirPuntoY(puntoInicialC[1]));
		
		g.drawLine(convertirPuntoX(puntoInicialC[0]), convertirPuntoY(puntoInicialC[1]),
				convertirPuntoX(puntoInicialD[0]), convertirPuntoY(puntoInicialD[1]));
		
		g.drawLine(convertirPuntoX(puntoInicialD[0]), convertirPuntoY(puntoInicialD[1]),
				convertirPuntoX(puntoInicialA[0]), convertirPuntoY(puntoInicialA[1]));

	
	// a)
		double grados = 90;
		
		double[] puntoEscaladoA = operaciones.rotar(puntoInicialA, grados, 2);
		double[] puntoEscaladoB = operaciones.rotar(puntoInicialB, grados, 2);
		double[] puntoEscaladoC = operaciones.rotar(puntoInicialC, grados, 2);
		double[] puntoEscaladoD = operaciones.rotar(puntoInicialD, grados, 2);
		
		g.setColor(Color.BLUE);
		
		g.drawLine(convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]),
				convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]),
				convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]),
				convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]),
				convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]));
	
	// b)
		grados = 180;
		
		puntoEscaladoA = operaciones.rotar(puntoInicialA, grados, 2);
		puntoEscaladoB = operaciones.rotar(puntoInicialB, grados, 2);
		puntoEscaladoC = operaciones.rotar(puntoInicialC, grados, 2);
		puntoEscaladoD = operaciones.rotar(puntoInicialD, grados, 2);
		
		g.setColor(Color.GREEN);
		
		g.drawLine(convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]),
				convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]),
				convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]),
				convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]),
				convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]));
		
	// c)
		grados = 270;
		
		puntoEscaladoA = operaciones.rotar(puntoInicialA, grados, 2);
		puntoEscaladoB = operaciones.rotar(puntoInicialB, grados, 2);
		puntoEscaladoC = operaciones.rotar(puntoInicialC, grados, 2);
		puntoEscaladoD = operaciones.rotar(puntoInicialD, grados, 2);
		
		g.setColor(Color.MAGENTA);
		
		g.drawLine(convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]),
				convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]),
				convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]),
				convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]),
				convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]));
	
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
