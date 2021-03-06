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
		
		g.drawLine(convertirPuntoX(puntoInicialA[0]), convertirPuntoY(puntoInicialA[1]),
				convertirPuntoX(puntoInicialB[0]), convertirPuntoY(puntoInicialB[1]));
		
		g.drawLine(convertirPuntoX(puntoInicialB[0]), convertirPuntoY(puntoInicialB[1]),
				convertirPuntoX(puntoInicialC[0]), convertirPuntoY(puntoInicialC[1]));
		
		g.drawLine(convertirPuntoX(puntoInicialC[0]),  convertirPuntoY(puntoInicialC[1]),
				convertirPuntoX(puntoInicialD[0]),  convertirPuntoY(puntoInicialD[1]));
		
		g.drawLine(convertirPuntoX(puntoInicialD[0]), convertirPuntoY(puntoInicialD[1]),
				 convertirPuntoX(puntoInicialE[0]), convertirPuntoY(puntoInicialE[1]));
		
		g.drawLine(convertirPuntoX(puntoInicialE[0]), convertirPuntoY(puntoInicialE[1]),
				 convertirPuntoX(puntoInicialF[0]), convertirPuntoY(puntoInicialF[1]));
		
		g.drawLine(convertirPuntoX(puntoInicialF[0]), convertirPuntoY(puntoInicialF[1]),
				 convertirPuntoX(puntoInicialG[0]), convertirPuntoY(puntoInicialG[1]));
		
		g.drawLine(convertirPuntoX(puntoInicialG[0]), convertirPuntoY(puntoInicialG[1]),
				 convertirPuntoX(puntoInicialH[0]),convertirPuntoY(puntoInicialH[1]));
		
		g.drawLine( convertirPuntoX(puntoInicialH[0]), convertirPuntoY(puntoInicialH[1]),
				(int) convertirPuntoX(puntoInicialA[0]), convertirPuntoY(puntoInicialA[1]));
	
	// Segunda figura
		double k = 0.1;
		
		double[] puntoEscaladoA = operaciones.escalar(puntoInicialA, 2, k);
		double[] puntoEscaladoB = operaciones.escalar(puntoInicialB, 2, k);
		double[] puntoEscaladoC = operaciones.escalar(puntoInicialC, 2, k);
		double[] puntoEscaladoD = operaciones.escalar(puntoInicialD, 2, k);
		double[] puntoEscaladoE = operaciones.escalar(puntoInicialE, 2, k);
		double[] puntoEscaladoF = operaciones.escalar(puntoInicialF, 2, k);
		double[] puntoEscaladoG = operaciones.escalar(puntoInicialG, 2, k);
		double[] puntoEscaladoH = operaciones.escalar(puntoInicialH, 2, k);
		
		g.setColor(Color.BLUE);
		
		g.drawLine(convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]),
				 convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]),
				convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]),
				convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]),
				convertirPuntoX(puntoEscaladoE[0]), convertirPuntoY(puntoEscaladoE[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoE[0]),  convertirPuntoY(puntoEscaladoE[1]),
				convertirPuntoX(puntoEscaladoF[0]), convertirPuntoY(puntoEscaladoF[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoF[0]), convertirPuntoY(puntoEscaladoF[1]),
				convertirPuntoX(puntoEscaladoG[0]),  convertirPuntoY(puntoEscaladoG[1]));
		
		g.drawLine( convertirPuntoX(puntoEscaladoG[0]),convertirPuntoY(puntoEscaladoG[1]),
				convertirPuntoX(puntoEscaladoH[0]), convertirPuntoY(puntoEscaladoH[1]));
		
		g.drawLine( convertirPuntoX(puntoEscaladoH[0]), convertirPuntoY(puntoEscaladoH[1]),
				 convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]));
		
	// Tercer figura
		k = 1.2;
		
		puntoEscaladoA = operaciones.escalar(puntoInicialA, 2, k);
		puntoEscaladoB = operaciones.escalar(puntoInicialB, 2, k);
		puntoEscaladoC = operaciones.escalar(puntoInicialC, 2, k);
		puntoEscaladoD = operaciones.escalar(puntoInicialD, 2, k);
		puntoEscaladoE = operaciones.escalar(puntoInicialE, 2, k);
		puntoEscaladoF = operaciones.escalar(puntoInicialF, 2, k);
		puntoEscaladoG = operaciones.escalar(puntoInicialG, 2, k);
		puntoEscaladoH = operaciones.escalar(puntoInicialH, 2, k);
		
		
		g.setColor(Color.GREEN);
		
		g.drawLine(convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]),
				 convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]),
				convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]),
				convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]),
				convertirPuntoX(puntoEscaladoE[0]), convertirPuntoY(puntoEscaladoE[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoE[0]),  convertirPuntoY(puntoEscaladoE[1]),
				convertirPuntoX(puntoEscaladoF[0]), convertirPuntoY(puntoEscaladoF[1]));
		
		g.drawLine(convertirPuntoX(puntoEscaladoF[0]), convertirPuntoY(puntoEscaladoF[1]),
				convertirPuntoX(puntoEscaladoG[0]),  convertirPuntoY(puntoEscaladoG[1]));
		
		g.drawLine( convertirPuntoX(puntoEscaladoG[0]),convertirPuntoY(puntoEscaladoG[1]),
				convertirPuntoX(puntoEscaladoH[0]), convertirPuntoY(puntoEscaladoH[1]));
		
		g.drawLine( convertirPuntoX(puntoEscaladoH[0]), convertirPuntoY(puntoEscaladoH[1]),
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
