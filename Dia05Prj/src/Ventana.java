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
		
		g.drawLine(convertirPuntoX((int)puntoInicialA[0]), convertirPuntoY((int)puntoInicialA[1]),
				convertirPuntoX((int)puntoInicialB[0]), convertirPuntoY((int)puntoInicialB[1]));
		
		g.drawLine(convertirPuntoX((int)puntoInicialB[0]), convertirPuntoY((int)puntoInicialB[1]),
				convertirPuntoX((int)puntoInicialC[0]), convertirPuntoY((int)puntoInicialC[1]));
		
		g.drawLine(convertirPuntoX((int)puntoInicialC[0]), convertirPuntoY((int)puntoInicialC[1]),
				convertirPuntoX((int)puntoInicialD[0]), convertirPuntoY((int)puntoInicialD[1]));
		
		g.drawLine(convertirPuntoX((int)puntoInicialD[0]), convertirPuntoY((int)puntoInicialD[1]),
				convertirPuntoX((int)puntoInicialA[0]), convertirPuntoY((int)puntoInicialA[1]));

	
	// a)
		double grados = 90;
		
		double[] puntoEscaladoA = operaciones.rotar(puntoInicialA, grados, 2);
		double[] puntoEscaladoB = operaciones.rotar(puntoInicialB, grados, 2);
		double[] puntoEscaladoC = operaciones.rotar(puntoInicialC, grados, 2);
		double[] puntoEscaladoD = operaciones.rotar(puntoInicialD, grados, 2);
		
		g.setColor(Color.BLUE);
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoA[0]), convertirPuntoY((int)puntoEscaladoA[1]),
				convertirPuntoX((int)puntoEscaladoB[0]), convertirPuntoY((int)puntoEscaladoB[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoB[0]), convertirPuntoY((int)puntoEscaladoB[1]),
				convertirPuntoX((int)puntoEscaladoC[0]), convertirPuntoY((int)puntoEscaladoC[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoC[0]), convertirPuntoY((int)puntoEscaladoC[1]),
				convertirPuntoX((int)puntoEscaladoD[0]), convertirPuntoY((int)puntoEscaladoD[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoD[0]), convertirPuntoY((int)puntoEscaladoD[1]),
				convertirPuntoX((int)puntoEscaladoA[0]), convertirPuntoY((int)puntoEscaladoA[1]));
	
	// b)
		grados = 180;
		
		puntoEscaladoA = operaciones.rotar(puntoInicialA, grados, 2);
		puntoEscaladoB = operaciones.rotar(puntoInicialB, grados, 2);
		puntoEscaladoC = operaciones.rotar(puntoInicialC, grados, 2);
		puntoEscaladoD = operaciones.rotar(puntoInicialD, grados, 2);
		
		g.setColor(Color.GREEN);
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoA[0]), convertirPuntoY((int)puntoEscaladoA[1]),
				convertirPuntoX((int)puntoEscaladoB[0]), convertirPuntoY((int)puntoEscaladoB[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoB[0]), convertirPuntoY((int)puntoEscaladoB[1]),
				convertirPuntoX((int)puntoEscaladoC[0]), convertirPuntoY((int)puntoEscaladoC[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoC[0]), convertirPuntoY((int)puntoEscaladoC[1]),
				convertirPuntoX((int)puntoEscaladoD[0]), convertirPuntoY((int)puntoEscaladoD[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoD[0]), convertirPuntoY((int)puntoEscaladoD[1]),
				convertirPuntoX((int)puntoEscaladoA[0]), convertirPuntoY((int)puntoEscaladoA[1]));
		
	// c)
		grados = 270;
		
		puntoEscaladoA = operaciones.rotar(puntoInicialA, grados, 2);
		puntoEscaladoB = operaciones.rotar(puntoInicialB, grados, 2);
		puntoEscaladoC = operaciones.rotar(puntoInicialC, grados, 2);
		puntoEscaladoD = operaciones.rotar(puntoInicialD, grados, 2);
		
		g.setColor(Color.MAGENTA);
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoA[0]), convertirPuntoY((int)puntoEscaladoA[1]),
				convertirPuntoX((int)puntoEscaladoB[0]), convertirPuntoY((int)puntoEscaladoB[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoB[0]), convertirPuntoY((int)puntoEscaladoB[1]),
				convertirPuntoX((int)puntoEscaladoC[0]), convertirPuntoY((int)puntoEscaladoC[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoC[0]), convertirPuntoY((int)puntoEscaladoC[1]),
				convertirPuntoX((int)puntoEscaladoD[0]), convertirPuntoY((int)puntoEscaladoD[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoD[0]), convertirPuntoY((int)puntoEscaladoD[1]),
				convertirPuntoX((int)puntoEscaladoA[0]), convertirPuntoY((int)puntoEscaladoA[1]));
	
	}
	
	
	private int convertirPuntoX(int x) {
		int centro = this.getWidth() / 2;
		return centro + x * ESCALA;
	}
	
	private int convertirPuntoY(int y) {
		int centro = this.getHeight() / 2;
		return centro - y * ESCALA;
	}

}
