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
		
		g.drawLine(convertirPuntoX((int)puntoInicialA[0]), convertirPuntoY((int)puntoInicialA[1]),
				convertirPuntoX((int)puntoInicialB[0]), convertirPuntoY((int)puntoInicialB[1]));
		
		g.drawLine(convertirPuntoX((int)puntoInicialB[0]), convertirPuntoY((int)puntoInicialB[1]),
				convertirPuntoX((int)puntoInicialC[0]), convertirPuntoY((int)puntoInicialC[1]));
		
		g.drawLine(convertirPuntoX((int)puntoInicialC[0]), convertirPuntoY((int)puntoInicialC[1]),
				convertirPuntoX((int)puntoInicialD[0]), convertirPuntoY((int)puntoInicialD[1]));
		
		g.drawLine(convertirPuntoX((int)puntoInicialD[0]), convertirPuntoY((int)puntoInicialD[1]),
				convertirPuntoX((int)puntoInicialE[0]), convertirPuntoY((int)puntoInicialE[1]));
		
		g.drawLine(convertirPuntoX((int)puntoInicialE[0]), convertirPuntoY((int)puntoInicialE[1]),
				convertirPuntoX((int)puntoInicialF[0]), convertirPuntoY((int)puntoInicialF[1]));
		
		g.drawLine(convertirPuntoX((int)puntoInicialF[0]), convertirPuntoY((int)puntoInicialF[1]),
				convertirPuntoX((int)puntoInicialG[0]), convertirPuntoY((int)puntoInicialG[1]));
		
		g.drawLine(convertirPuntoX((int)puntoInicialG[0]), convertirPuntoY((int)puntoInicialG[1]),
				convertirPuntoX((int)puntoInicialH[0]), convertirPuntoY((int)puntoInicialH[1]));
		
		g.drawLine(convertirPuntoX((int)puntoInicialH[0]), convertirPuntoY((int)puntoInicialH[1]),
				convertirPuntoX((int)puntoInicialA[0]), convertirPuntoY((int)puntoInicialA[1]));
	
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
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoA[0]), convertirPuntoY((int)puntoEscaladoA[1]),
				convertirPuntoX((int)puntoEscaladoB[0]), convertirPuntoY((int)puntoEscaladoB[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoB[0]), convertirPuntoY((int)puntoEscaladoB[1]),
				convertirPuntoX((int)puntoEscaladoC[0]), convertirPuntoY((int)puntoEscaladoC[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoC[0]), convertirPuntoY((int)puntoEscaladoC[1]),
				convertirPuntoX((int)puntoEscaladoD[0]), convertirPuntoY((int)puntoEscaladoD[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoD[0]), convertirPuntoY((int)puntoEscaladoD[1]),
				convertirPuntoX((int)puntoEscaladoE[0]), convertirPuntoY((int)puntoEscaladoE[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoE[0]), convertirPuntoY((int)puntoEscaladoE[1]),
				convertirPuntoX((int)puntoEscaladoF[0]), convertirPuntoY((int)puntoEscaladoF[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoF[0]), convertirPuntoY((int)puntoEscaladoF[1]),
				convertirPuntoX((int)puntoEscaladoG[0]), convertirPuntoY((int)puntoEscaladoG[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoG[0]), convertirPuntoY((int)puntoEscaladoG[1]),
				convertirPuntoX((int)puntoEscaladoH[0]), convertirPuntoY((int)puntoEscaladoH[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoH[0]), convertirPuntoY((int)puntoEscaladoH[1]),
				convertirPuntoX((int)puntoEscaladoA[0]), convertirPuntoY((int)puntoEscaladoA[1]));
		
		k = -4;
		
		puntoEscaladoA = operaciones.escalar(puntoInicialA, 2, k);
		puntoEscaladoB = operaciones.escalar(puntoInicialB, 2, k);
		puntoEscaladoC = operaciones.escalar(puntoInicialC, 2, k);
		puntoEscaladoD = operaciones.escalar(puntoInicialD, 2, k);
		puntoEscaladoE = operaciones.escalar(puntoInicialE, 2, k);
		puntoEscaladoF = operaciones.escalar(puntoInicialF, 2, k);
		puntoEscaladoG = operaciones.escalar(puntoInicialG, 2, k);
		puntoEscaladoH = operaciones.escalar(puntoInicialH, 2, k);
		
		g.setColor(Color.GREEN);
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoA[0]), convertirPuntoY((int)puntoEscaladoA[1]),
				convertirPuntoX((int)puntoEscaladoB[0]), convertirPuntoY((int)puntoEscaladoB[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoB[0]), convertirPuntoY((int)puntoEscaladoB[1]),
				convertirPuntoX((int)puntoEscaladoC[0]), convertirPuntoY((int)puntoEscaladoC[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoC[0]), convertirPuntoY((int)puntoEscaladoC[1]),
				convertirPuntoX((int)puntoEscaladoD[0]), convertirPuntoY((int)puntoEscaladoD[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoD[0]), convertirPuntoY((int)puntoEscaladoD[1]),
				convertirPuntoX((int)puntoEscaladoE[0]), convertirPuntoY((int)puntoEscaladoE[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoE[0]), convertirPuntoY((int)puntoEscaladoE[1]),
				convertirPuntoX((int)puntoEscaladoF[0]), convertirPuntoY((int)puntoEscaladoF[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoF[0]), convertirPuntoY((int)puntoEscaladoF[1]),
				convertirPuntoX((int)puntoEscaladoG[0]), convertirPuntoY((int)puntoEscaladoG[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoG[0]), convertirPuntoY((int)puntoEscaladoG[1]),
				convertirPuntoX((int)puntoEscaladoH[0]), convertirPuntoY((int)puntoEscaladoH[1]));
		
		g.drawLine(convertirPuntoX((int)puntoEscaladoH[0]), convertirPuntoY((int)puntoEscaladoH[1]),
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