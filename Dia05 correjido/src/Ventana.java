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
		g.drawLine((int)convertirPuntoX(-100), (int) convertirPuntoY(0), 
				(int) convertirPuntoX(100), (int) convertirPuntoY(0));
		g.drawLine((int) convertirPuntoX(0), (int)convertirPuntoY(100), 
				(int) convertirPuntoX(0), (int) convertirPuntoY(-100));
	

	// Declarar puntos iniciales
		double[] puntoInicialA = {-1, 3};
		double[] puntoInicialB = {1, 3};
		double[] puntoInicialC = {3, 1};
		double[] puntoInicialD = {3, -1};
		double[] puntoInicialE = {1, -3};
		double[] puntoInicialF = {-1, -3};
		double[] puntoInicialG = {-3, -1};
		double[] puntoInicialH = {-3, 1};
		
	// Dibujar el poligono
		
		g.setColor(Color.RED);
		
		g.drawLine((int)convertirPuntoX(puntoInicialA[0]), (int)convertirPuntoY(puntoInicialA[1]),
				(int)convertirPuntoX(puntoInicialB[0]), (int)convertirPuntoY(puntoInicialB[1]));
		
		g.drawLine((int)convertirPuntoX(puntoInicialB[0]), (int)convertirPuntoY(puntoInicialB[1]),
				(int)convertirPuntoX(puntoInicialC[0]), (int)convertirPuntoY(puntoInicialC[1]));
		
		g.drawLine((int)convertirPuntoX(puntoInicialC[0]), (int) convertirPuntoY(puntoInicialC[1]),
				(int)convertirPuntoX(puntoInicialD[0]), (int) convertirPuntoY(puntoInicialD[1]));
		
		g.drawLine((int) convertirPuntoX(puntoInicialD[0]), (int) convertirPuntoY(puntoInicialD[1]),
				(int) convertirPuntoX((int)puntoInicialE[0]), (int) convertirPuntoY((int)puntoInicialE[1]));
		
		g.drawLine((int) convertirPuntoX(puntoInicialE[0]), (int) convertirPuntoY(puntoInicialE[1]),
				(int) convertirPuntoX(puntoInicialF[0]), (int) convertirPuntoY(puntoInicialF[1]));
		
		g.drawLine((int) convertirPuntoX(puntoInicialF[0]), (int) convertirPuntoY(puntoInicialF[1]),
				(int) convertirPuntoX(puntoInicialG[0]), (int) convertirPuntoY(puntoInicialG[1]));
		
		g.drawLine((int) convertirPuntoX(puntoInicialG[0]), (int) convertirPuntoY(puntoInicialG[1]),
				(int) convertirPuntoX(puntoInicialH[0]), (int) convertirPuntoY(puntoInicialH[1]));
		
		g.drawLine((int) convertirPuntoX(puntoInicialH[0]), (int) convertirPuntoY(puntoInicialH[1]),
				(int) convertirPuntoX(puntoInicialA[0]), (int) convertirPuntoY(puntoInicialA[1]));
	
	// Segunda figura
		double k = 0.5;
		
		double[] puntoEscaladoA = operaciones.escalar(puntoInicialA, 2, k);
		double[] puntoEscaladoB = operaciones.escalar(puntoInicialB, 2, k);
		double[] puntoEscaladoC = operaciones.escalar(puntoInicialC, 2, k);
		double[] puntoEscaladoD = operaciones.escalar(puntoInicialD, 2, k);
		double[] puntoEscaladoE = operaciones.escalar(puntoInicialE, 2, k);
		double[] puntoEscaladoF = operaciones.escalar(puntoInicialF, 2, k);
		double[] puntoEscaladoG = operaciones.escalar(puntoInicialG, 2, k);
		double[] puntoEscaladoH = operaciones.escalar(puntoInicialH, 2, k);
		
		g.setColor(Color.BLUE);
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoA[0]), (int) convertirPuntoY(puntoEscaladoA[1]),
				(int) convertirPuntoX(puntoEscaladoB[0]), (int) convertirPuntoY(puntoEscaladoB[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoB[0]), (int) convertirPuntoY(puntoEscaladoB[1]),
				(int) convertirPuntoX(puntoEscaladoC[0]), (int) convertirPuntoY(puntoEscaladoC[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoC[0]), (int) convertirPuntoY(puntoEscaladoC[1]),
				(int) convertirPuntoX(puntoEscaladoD[0]), (int) convertirPuntoY(puntoEscaladoD[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoD[0]), (int) convertirPuntoY(puntoEscaladoD[1]),
				(int) convertirPuntoX(puntoEscaladoE[0]), (int) convertirPuntoY(puntoEscaladoE[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoE[0]), (int) convertirPuntoY(puntoEscaladoE[1]),
				(int) convertirPuntoX(puntoEscaladoF[0]), (int) convertirPuntoY(puntoEscaladoF[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoF[0]), (int) convertirPuntoY(puntoEscaladoF[1]),
				(int) convertirPuntoX(puntoEscaladoG[0]), (int) convertirPuntoY(puntoEscaladoG[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoG[0]), (int) convertirPuntoY(puntoEscaladoG[1]),
				(int) convertirPuntoX(puntoEscaladoH[0]), (int) convertirPuntoY(puntoEscaladoH[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoH[0]), (int) convertirPuntoY(puntoEscaladoH[1]),
				(int) convertirPuntoX(puntoEscaladoA[0]), (int) convertirPuntoY(puntoEscaladoA[1]));
		
		k = 1.2;
		
		puntoEscaladoA = operaciones.escalar(puntoInicialA, 2, k);
		puntoEscaladoB = operaciones.escalar(puntoInicialB, 2, k);
		puntoEscaladoC = operaciones.escalar(puntoInicialC, 2, k);
		puntoEscaladoD = operaciones.escalar(puntoInicialD, 2, k);
		puntoEscaladoE = operaciones.escalar(puntoInicialE, 2, k);
		puntoEscaladoF = operaciones.escalar(puntoInicialF, 2, k);
		puntoEscaladoG = operaciones.escalar(puntoInicialG, 2, k);
		puntoEscaladoH = operaciones.escalar(puntoInicialH, 2, k);
		
		
		/*
		double grados = 90;
		
		puntoEscaladoA = operaciones.rotar(puntoInicialA, grados);
		puntoEscaladoB = operaciones.rotar(puntoInicialB, grados);
		puntoEscaladoC = operaciones.rotar(puntoInicialC, grados);
		puntoEscaladoD = operaciones.rotar(puntoInicialD, grados);
		puntoEscaladoE = operaciones.rotar(puntoInicialE, grados);
		puntoEscaladoF = operaciones.rotar(puntoInicialF, grados);
		puntoEscaladoG = operaciones.rotar(puntoInicialG, grados);
		puntoEscaladoH = operaciones.rotar(puntoInicialH, grados);
		*/
		g.setColor(Color.GREEN);
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoA[0]), (int) convertirPuntoY(puntoEscaladoA[1]),
				(int) convertirPuntoX(puntoEscaladoB[0]), (int) convertirPuntoY(puntoEscaladoB[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoB[0]), (int) convertirPuntoY(puntoEscaladoB[1]),
				(int) convertirPuntoX(puntoEscaladoC[0]), (int) convertirPuntoY(puntoEscaladoC[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoC[0]), (int) convertirPuntoY(puntoEscaladoC[1]),
				(int) convertirPuntoX(puntoEscaladoD[0]), (int) convertirPuntoY(puntoEscaladoD[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoD[0]), (int) convertirPuntoY(puntoEscaladoD[1]),
				(int) convertirPuntoX(puntoEscaladoE[0]), (int) convertirPuntoY(puntoEscaladoE[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoE[0]), (int) convertirPuntoY(puntoEscaladoE[1]),
				(int) convertirPuntoX(puntoEscaladoF[0]), (int) convertirPuntoY(puntoEscaladoF[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoF[0]), (int) convertirPuntoY(puntoEscaladoF[1]),
				(int) convertirPuntoX(puntoEscaladoG[0]), (int) convertirPuntoY(puntoEscaladoG[1]));
		
		g.drawLine((int) convertirPuntoX(puntoEscaladoG[0]), (int) convertirPuntoY(puntoEscaladoG[1]),
				(int) convertirPuntoX(puntoEscaladoH[0]), (int) convertirPuntoY(puntoEscaladoH[1]));

		g.drawLine((int) convertirPuntoX(puntoEscaladoH[0]), (int) convertirPuntoY(puntoEscaladoH[1]),
				(int) convertirPuntoX(puntoEscaladoA[0]), (int) convertirPuntoY(puntoEscaladoA[1]));
	
	}
	
	
	private double convertirPuntoX(double x) {
		int centro = this.getWidth() / 2;
		return centro + x * ESCALA;
	}
	
	private double convertirPuntoY(double y) {
		int centro = this.getHeight() / 2;
		return centro - y * ESCALA;
	}

}
