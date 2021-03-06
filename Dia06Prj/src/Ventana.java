import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	public static int ESCALA = 20;
	public static double[] matrizSegundoCuadrante = { -8, 0, -8, 0 };
	public static double[] matrizTercerCuadrante = { -8, -10, -8, -10 };
	public static double[] matrizCuartoCuadrante = { 0, -10, 0, -10 };

	@Override
	public void paint(Graphics g) {

		MatrizImpl operaciones = new MatrizImpl();

		// Dibujar plano cartesiano
		/*
		 * g.drawLine(convertirPuntoX(-100), convertirPuntoY(0),
		 * convertirPuntoX(100), convertirPuntoY(0));
		 * g.drawLine(convertirPuntoX(0), convertirPuntoY(100),
		 * convertirPuntoX(0), convertirPuntoY(-100));
		 */

		
		// Declarar puntos iniciales
		double[] puntoInicialA = { 0, 0 };
		double[] puntoInicialB = { 0, 10 };
		double[] puntoInicialC = { -0.3, 9 };
		double[] puntoInicialD = { 0.3, 9 };
		double[] puntoEscaladoB = null;
		double[] puntoEscaladoC = null;
		double[] puntoEscaladoD = null;

		// Dibujar el poligono

		g.setColor(Color.RED);

		try {
			for (int i = 360; i >= 0; i -= 6) {
				puntoEscaladoB = operaciones.rotar(puntoInicialB, i, 2);
				puntoEscaladoC = operaciones.rotar(puntoInicialC, i, 2);
				puntoEscaladoD = operaciones.rotar(puntoInicialD, i, 2);
				
				g.drawLine(convertirPuntoX(puntoInicialA[0]), convertirPuntoY(puntoInicialA[1]),
						convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]));
				
				g.drawLine(convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]),
						convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]));
				
				g.drawLine(convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]),
						convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]));
				Thread.sleep(100);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

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
