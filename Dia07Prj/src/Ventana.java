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

		// Dibujar plano cartesiano
		g.drawLine((int)convertirPuntoX(-100), (int) convertirPuntoY(0), 
				(int) convertirPuntoX(100), (int) convertirPuntoY(0));
		g.drawLine((int) convertirPuntoX(0), (int)convertirPuntoY(100), 
				(int) convertirPuntoX(0), (int) convertirPuntoY(-100));
		
		// Declarar puntos iniciales
		double[] puntoInicialA = { -4, 6 }; //-14
		double[] puntoInicialB = { -6, 2 };
		double[] puntoInicialC = { -12, 2 };
		double[] puntoInicialD = { -14, 6 };
		double[] puntoInicialE = { -12, 10 };
		double[] puntoInicialF = { -6, 10 };
		
		double[] puntoEscaladoA = null;
		double[] puntoEscaladoB = null;
		double[] puntoEscaladoC = null;
		double[] puntoEscaladoD = null;
		double[] puntoEscaladoE = null;
		double[] puntoEscaladoF = null;

		double[] primerCuadrante = {0, 0};
		double[] segundoCuadrante = {0, 0};
		// Dibujar el poligono

		g.setColor(Color.RED);
		
		g.drawLine(convertirPuntoX(puntoInicialA[0]), convertirPuntoY(puntoInicialA[1]), 
				convertirPuntoX(puntoInicialB[0]), convertirPuntoY(puntoInicialB[1]));
		g.drawLine(convertirPuntoX(puntoInicialB[0]), convertirPuntoY(puntoInicialB[1]), 
				convertirPuntoX(puntoInicialC[0]), convertirPuntoY(puntoInicialC[1]));
		g.drawLine(convertirPuntoX(puntoInicialC[0]), convertirPuntoY(puntoInicialC[1]), 
				convertirPuntoX(puntoInicialD[0]), convertirPuntoY(puntoInicialD[1]));
		g.drawLine(convertirPuntoX(puntoInicialD[0]), convertirPuntoY(puntoInicialD[1]), 
				convertirPuntoX(puntoInicialE[0]), convertirPuntoY(puntoInicialE[1]));
		g.drawLine(convertirPuntoX(puntoInicialE[0]), convertirPuntoY(puntoInicialE[1]), 
				convertirPuntoX(puntoInicialF[0]), convertirPuntoY(puntoInicialF[1]));
		g.drawLine(convertirPuntoX(puntoInicialF[0]), convertirPuntoY(puntoInicialF[1]), 
				convertirPuntoX(puntoInicialA[0]), convertirPuntoY(puntoInicialA[1]));
		
		g.setColor(Color.BLUE);
		int angulo = 360;
		int dimension = 2;
		for (double i = 0; i < 30; i = i + 0.5) {
			try {
				
				primerCuadrante[0] = i;
				puntoEscaladoA = operaciones.trasladar(puntoInicialA, primerCuadrante);
				puntoEscaladoB = operaciones.trasladar(puntoInicialB, primerCuadrante);
				puntoEscaladoC = operaciones.trasladar(puntoInicialC, primerCuadrante);
				puntoEscaladoD = operaciones.trasladar(puntoInicialD, primerCuadrante);
				puntoEscaladoE = operaciones.trasladar(puntoInicialE, primerCuadrante);
				puntoEscaladoF = operaciones.trasladar(puntoInicialF, primerCuadrante);
				
				g.drawLine(convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]), 
						convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]), 
						convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]), 
						convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]), 
						convertirPuntoX(puntoEscaladoE[0]), convertirPuntoY(puntoEscaladoE[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoE[0]), convertirPuntoY(puntoEscaladoE[1]), 
						convertirPuntoX(puntoEscaladoF[0]), convertirPuntoY(puntoEscaladoF[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoF[0]), convertirPuntoY(puntoEscaladoF[1]), 
						convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]));
				
				// Rotar
				
				puntoEscaladoA = operaciones.rotar(puntoInicialA, angulo, dimension);
				puntoEscaladoB = operaciones.rotar(puntoInicialA, angulo, dimension);
				puntoEscaladoC = operaciones.rotar(puntoInicialA, angulo, dimension);
				puntoEscaladoA = operaciones.rotar(puntoInicialA, angulo, dimension);
				puntoEscaladoA = operaciones.rotar(puntoInicialA, angulo, dimension);
				puntoEscaladoA = operaciones.rotar(puntoInicialA, angulo, dimension);
				
				g.drawLine(convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]), 
						convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]), 
						convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]), 
						convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]), 
						convertirPuntoX(puntoEscaladoE[0]), convertirPuntoY(puntoEscaladoE[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoE[0]), convertirPuntoY(puntoEscaladoE[1]), 
						convertirPuntoX(puntoEscaladoF[0]), convertirPuntoY(puntoEscaladoF[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoF[0]), convertirPuntoY(puntoEscaladoF[1]), 
						convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]));
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		g.setColor(Color.GREEN);
		
		for (double i = 0; i < 20; i = i + 0.5) {
			try {
				segundoCuadrante[1] = -i;
				puntoEscaladoA = operaciones.trasladar(puntoInicialA, segundoCuadrante);
				puntoEscaladoB = operaciones.trasladar(puntoInicialB, segundoCuadrante);
				puntoEscaladoC = operaciones.trasladar(puntoInicialC, segundoCuadrante);
				puntoEscaladoD = operaciones.trasladar(puntoInicialD, segundoCuadrante);
				puntoEscaladoE = operaciones.trasladar(puntoInicialE, segundoCuadrante);
				puntoEscaladoF = operaciones.trasladar(puntoInicialF, segundoCuadrante);
				
				g.drawLine(convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]), 
						convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoB[0]), convertirPuntoY(puntoEscaladoB[1]), 
						convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoC[0]), convertirPuntoY(puntoEscaladoC[1]), 
						convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoD[0]), convertirPuntoY(puntoEscaladoD[1]), 
						convertirPuntoX(puntoEscaladoE[0]), convertirPuntoY(puntoEscaladoE[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoE[0]), convertirPuntoY(puntoEscaladoE[1]), 
						convertirPuntoX(puntoEscaladoF[0]), convertirPuntoY(puntoEscaladoF[1]));
				g.drawLine(convertirPuntoX(puntoEscaladoF[0]), convertirPuntoY(puntoEscaladoF[1]), 
						convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]));
				
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
