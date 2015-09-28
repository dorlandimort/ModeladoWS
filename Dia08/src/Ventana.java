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
		double[] puntoInicialA = { -22, 9 }; // -14
		double[] puntoInicialB = { -22, 14 };
		double[] puntoInicialC = { -19, 14 };
		double[] puntoInicialD = { -19, 13 };
		double[] puntoInicialE = { -21, 13 };
		double[] puntoInicialF = { -21, 12 };
		double[] puntoInicialG = { -20, 12 };
		double[] puntoInicialH = { -20, 11 };
		double[] puntoInicialI = { -21, 11 };
		double[] puntoInicialJ = { -21, 9 };

		double[] puntoEscaladoA = null;
		double[] puntoEscaladoB = null;
		double[] puntoEscaladoC = null;
		double[] puntoEscaladoD = null;
		double[] puntoEscaladoE = null;
		double[] puntoEscaladoF = null;
		double[] puntoEscaladoG = null;
		double[] puntoEscaladoH = null;
		double[] puntoEscaladoI = null;
		double[] puntoEscaladoJ = null;
		
		double[] puntoRotadoA = null;
		double[] puntoRotadoB = null;
		double[] puntoRotadoC = null;
		double[] puntoRotadoD = null;
		double[] puntoRotadoE = null;
		double[] puntoRotadoF = null;
		double[] puntoRotadoG = null;
		double[] puntoRotadoH = null;
		double[] puntoRotadoI = null;
		double[] puntoRotadoJ = null;
		
		double[] puntoTrasladadoA = null;
		double[] puntoTrasladadoB = null;
		double[] puntoTrasladadoC = null;
		double[] puntoTrasladadoD = null;
		double[] puntoTrasladadoE = null;
		double[] puntoTrasladadoF = null;
		double[] puntoTrasladadoG = null;
		double[] puntoTrasladadoH = null;
		double[] puntoTrasladadoI = null;
		double[] puntoTrasladadoJ = null;

		double[] centro ={-20.5, 11.5};
		
		double[] primerCuadrante = { 0, 0 };
		double[] segundoCuadrante = { 0, 0 };
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
				convertirPuntoX(puntoInicialG[0]), convertirPuntoY(puntoInicialG[1]));

		g.drawLine(convertirPuntoX(puntoInicialG[0]), convertirPuntoY(puntoInicialG[1]),
				convertirPuntoX(puntoInicialH[0]), convertirPuntoY(puntoInicialH[1]));

		g.drawLine(convertirPuntoX(puntoInicialH[0]), convertirPuntoY(puntoInicialH[1]),
				convertirPuntoX(puntoInicialI[0]), convertirPuntoY(puntoInicialI[1]));

		g.drawLine(convertirPuntoX(puntoInicialI[0]), convertirPuntoY(puntoInicialI[1]),
				convertirPuntoX(puntoInicialJ[0]), convertirPuntoY(puntoInicialJ[1]));

		g.drawLine(convertirPuntoX(puntoInicialJ[0]), convertirPuntoY(puntoInicialJ[1]),
				convertirPuntoX(puntoInicialA[0]), convertirPuntoY(puntoInicialA[1]));

		g.setColor(Color.BLUE);
		int angulo = 360;
		int dimension = 2;
		
		while (1 == 1) {
			double k = 0.5;
			
			for (double i = 0; i < 40; i = i + 0.5) {
				try {
					super.paint(g);
					
					angulo -= 9;
					primerCuadrante[0] = - centro[0];
					primerCuadrante[1] = - centro[1];
					
					puntoEscaladoA = operaciones.trasladar(puntoInicialA, primerCuadrante);
					puntoEscaladoB = operaciones.trasladar(puntoInicialB, primerCuadrante);
					puntoEscaladoC = operaciones.trasladar(puntoInicialC, primerCuadrante);
					puntoEscaladoD = operaciones.trasladar(puntoInicialD, primerCuadrante);
					puntoEscaladoE = operaciones.trasladar(puntoInicialE, primerCuadrante);
					puntoEscaladoF = operaciones.trasladar(puntoInicialF, primerCuadrante);
					puntoEscaladoG = operaciones.trasladar(puntoInicialG, primerCuadrante);
					puntoEscaladoH = operaciones.trasladar(puntoInicialH, primerCuadrante);
					puntoEscaladoI = operaciones.trasladar(puntoInicialI, primerCuadrante);
					puntoEscaladoJ = operaciones.trasladar(puntoInicialJ, primerCuadrante);
				// rotar
					puntoRotadoA = operaciones.rotar(puntoEscaladoA, angulo, 2);
					puntoRotadoB = operaciones.rotar(puntoEscaladoB, angulo, 2);
					puntoRotadoC = operaciones.rotar(puntoEscaladoC, angulo, 2);
					puntoRotadoD = operaciones.rotar(puntoEscaladoD, angulo, 2);
					puntoRotadoE = operaciones.rotar(puntoEscaladoE, angulo, 2);
					puntoRotadoF = operaciones.rotar(puntoEscaladoF, angulo, 2);
					puntoRotadoG = operaciones.rotar(puntoEscaladoG, angulo, 2);
					puntoRotadoH = operaciones.rotar(puntoEscaladoH, angulo, 2);
					puntoRotadoI = operaciones.rotar(puntoEscaladoI, angulo, 2);
					puntoRotadoJ = operaciones.rotar(puntoEscaladoJ, angulo, 2);
				// Trasladar otra vez
					primerCuadrante[0] = centro[0];
					primerCuadrante[1] = centro[1];
					puntoEscaladoA = operaciones.trasladar(puntoRotadoA, primerCuadrante);
					puntoEscaladoB = operaciones.trasladar(puntoRotadoB, primerCuadrante);
					puntoEscaladoC = operaciones.trasladar(puntoRotadoC, primerCuadrante);
					puntoEscaladoD = operaciones.trasladar(puntoRotadoD, primerCuadrante);
					puntoEscaladoE = operaciones.trasladar(puntoRotadoE, primerCuadrante);
					puntoEscaladoF = operaciones.trasladar(puntoRotadoF, primerCuadrante);
					puntoEscaladoG = operaciones.trasladar(puntoRotadoG, primerCuadrante);
					puntoEscaladoH = operaciones.trasladar(puntoRotadoH, primerCuadrante);
					puntoEscaladoI = operaciones.trasladar(puntoRotadoI, primerCuadrante);
					puntoEscaladoJ = operaciones.trasladar(puntoRotadoJ, primerCuadrante);
					
					// Trasladar
					
					primerCuadrante[0] = i;
					primerCuadrante[1] = 0;
					puntoEscaladoA = operaciones.trasladar(puntoEscaladoA, primerCuadrante);
					puntoEscaladoB = operaciones.trasladar(puntoEscaladoB, primerCuadrante);
					puntoEscaladoC = operaciones.trasladar(puntoEscaladoC, primerCuadrante);
					puntoEscaladoD = operaciones.trasladar(puntoEscaladoD, primerCuadrante);
					puntoEscaladoE = operaciones.trasladar(puntoEscaladoE, primerCuadrante);
					puntoEscaladoF = operaciones.trasladar(puntoEscaladoF, primerCuadrante);
					puntoEscaladoG = operaciones.trasladar(puntoEscaladoG, primerCuadrante);
					puntoEscaladoH = operaciones.trasladar(puntoEscaladoH, primerCuadrante);
					puntoEscaladoI = operaciones.trasladar(puntoEscaladoI, primerCuadrante);
					puntoEscaladoJ = operaciones.trasladar(puntoEscaladoJ, primerCuadrante);

					
					
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
							convertirPuntoX(puntoEscaladoG[0]), convertirPuntoY(puntoEscaladoG[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoG[0]), convertirPuntoY(puntoEscaladoG[1]),
							convertirPuntoX(puntoEscaladoH[0]), convertirPuntoY(puntoEscaladoH[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoH[0]), convertirPuntoY(puntoEscaladoH[1]),
							convertirPuntoX(puntoEscaladoI[0]), convertirPuntoY(puntoEscaladoI[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoI[0]), convertirPuntoY(puntoEscaladoI[1]),
							convertirPuntoX(puntoEscaladoJ[0]), convertirPuntoY(puntoEscaladoJ[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoJ[0]), convertirPuntoY(puntoEscaladoJ[1]),
							convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]));
					 
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			puntoInicialA = puntoEscaladoA;
			puntoInicialB = puntoEscaladoB;
			puntoInicialC = puntoEscaladoC;
			puntoInicialD = puntoEscaladoD;
			puntoInicialE = puntoEscaladoE;
			puntoInicialF = puntoEscaladoF;
			puntoInicialG = puntoEscaladoG;
			puntoInicialH = puntoEscaladoH;
			puntoInicialI = puntoEscaladoI;
			puntoInicialJ = puntoEscaladoJ;
			
			centro[0] = centro[0] + 40;
			centro[1] = centro[1] + 0;
			
			
			// Para abajo
			angulo = 360;
			for (double i = 0; i < 25; i = i + 0.5) {
				try {
					super.paint(g);
					
					
					angulo -= 9;
					primerCuadrante[0] = - centro[0];
					primerCuadrante[1] = - centro[1];
					
					puntoEscaladoA = operaciones.trasladar(puntoInicialA, primerCuadrante);
					puntoEscaladoB = operaciones.trasladar(puntoInicialB, primerCuadrante);
					puntoEscaladoC = operaciones.trasladar(puntoInicialC, primerCuadrante);
					puntoEscaladoD = operaciones.trasladar(puntoInicialD, primerCuadrante);
					puntoEscaladoE = operaciones.trasladar(puntoInicialE, primerCuadrante);
					puntoEscaladoF = operaciones.trasladar(puntoInicialF, primerCuadrante);
					puntoEscaladoG = operaciones.trasladar(puntoInicialG, primerCuadrante);
					puntoEscaladoH = operaciones.trasladar(puntoInicialH, primerCuadrante);
					puntoEscaladoI = operaciones.trasladar(puntoInicialI, primerCuadrante);
					puntoEscaladoJ = operaciones.trasladar(puntoInicialJ, primerCuadrante);
				// rotar
					puntoRotadoA = operaciones.rotar(puntoEscaladoA, angulo, 2);
					puntoRotadoB = operaciones.rotar(puntoEscaladoB, angulo, 2);
					puntoRotadoC = operaciones.rotar(puntoEscaladoC, angulo, 2);
					puntoRotadoD = operaciones.rotar(puntoEscaladoD, angulo, 2);
					puntoRotadoE = operaciones.rotar(puntoEscaladoE, angulo, 2);
					puntoRotadoF = operaciones.rotar(puntoEscaladoF, angulo, 2);
					puntoRotadoG = operaciones.rotar(puntoEscaladoG, angulo, 2);
					puntoRotadoH = operaciones.rotar(puntoEscaladoH, angulo, 2);
					puntoRotadoI = operaciones.rotar(puntoEscaladoI, angulo, 2);
					puntoRotadoJ = operaciones.rotar(puntoEscaladoJ, angulo, 2);
				// Trasladar otra vez
					primerCuadrante[0] = centro[0];
					primerCuadrante[1] = centro[1];
					puntoEscaladoA = operaciones.trasladar(puntoRotadoA, primerCuadrante);
					puntoEscaladoB = operaciones.trasladar(puntoRotadoB, primerCuadrante);
					puntoEscaladoC = operaciones.trasladar(puntoRotadoC, primerCuadrante);
					puntoEscaladoD = operaciones.trasladar(puntoRotadoD, primerCuadrante);
					puntoEscaladoE = operaciones.trasladar(puntoRotadoE, primerCuadrante);
					puntoEscaladoF = operaciones.trasladar(puntoRotadoF, primerCuadrante);
					puntoEscaladoG = operaciones.trasladar(puntoRotadoG, primerCuadrante);
					puntoEscaladoH = operaciones.trasladar(puntoRotadoH, primerCuadrante);
					puntoEscaladoI = operaciones.trasladar(puntoRotadoI, primerCuadrante);
					puntoEscaladoJ = operaciones.trasladar(puntoRotadoJ, primerCuadrante);
					
					primerCuadrante[0] = 0;
					primerCuadrante[1] = -i;
					
					puntoEscaladoA = operaciones.trasladar(puntoEscaladoA, primerCuadrante);
					puntoEscaladoB = operaciones.trasladar(puntoEscaladoB, primerCuadrante);
					puntoEscaladoC = operaciones.trasladar(puntoEscaladoC, primerCuadrante);
					puntoEscaladoD = operaciones.trasladar(puntoEscaladoD, primerCuadrante);
					puntoEscaladoE = operaciones.trasladar(puntoEscaladoE, primerCuadrante);
					puntoEscaladoF = operaciones.trasladar(puntoEscaladoF, primerCuadrante);
					puntoEscaladoG = operaciones.trasladar(puntoEscaladoG, primerCuadrante);
					puntoEscaladoH = operaciones.trasladar(puntoEscaladoH, primerCuadrante);
					puntoEscaladoI = operaciones.trasladar(puntoEscaladoI, primerCuadrante);
					puntoEscaladoJ = operaciones.trasladar(puntoEscaladoJ, primerCuadrante);

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
							convertirPuntoX(puntoEscaladoG[0]), convertirPuntoY(puntoEscaladoG[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoG[0]), convertirPuntoY(puntoEscaladoG[1]),
							convertirPuntoX(puntoEscaladoH[0]), convertirPuntoY(puntoEscaladoH[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoH[0]), convertirPuntoY(puntoEscaladoH[1]),
							convertirPuntoX(puntoEscaladoI[0]), convertirPuntoY(puntoEscaladoI[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoI[0]), convertirPuntoY(puntoEscaladoI[1]),
							convertirPuntoX(puntoEscaladoJ[0]), convertirPuntoY(puntoEscaladoJ[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoJ[0]), convertirPuntoY(puntoEscaladoJ[1]),
							convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]));

					// Rotar
					/*
					 * puntoEscaladoA = operaciones.rotar(puntoInicialA, angulo,
					 * dimension); puntoEscaladoB =
					 * operaciones.rotar(puntoInicialA, angulo, dimension);
					 * puntoEscaladoC = operaciones.rotar(puntoInicialA, angulo,
					 * dimension); puntoEscaladoA =
					 * operaciones.rotar(puntoInicialA, angulo, dimension);
					 * puntoEscaladoA = operaciones.rotar(puntoInicialA, angulo,
					 * dimension); puntoEscaladoA =
					 * operaciones.rotar(puntoInicialA, angulo, dimension);
					 * 
					 * g.drawLine(convertirPuntoX(puntoEscaladoA[0]),
					 * convertirPuntoY(puntoEscaladoA[1]),
					 * convertirPuntoX(puntoEscaladoB[0]),
					 * convertirPuntoY(puntoEscaladoB[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoB[0]),
					 * convertirPuntoY(puntoEscaladoB[1]),
					 * convertirPuntoX(puntoEscaladoC[0]),
					 * convertirPuntoY(puntoEscaladoC[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoC[0]),
					 * convertirPuntoY(puntoEscaladoC[1]),
					 * convertirPuntoX(puntoEscaladoD[0]),
					 * convertirPuntoY(puntoEscaladoD[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoD[0]),
					 * convertirPuntoY(puntoEscaladoD[1]),
					 * convertirPuntoX(puntoEscaladoE[0]),
					 * convertirPuntoY(puntoEscaladoE[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoE[0]),
					 * convertirPuntoY(puntoEscaladoE[1]),
					 * convertirPuntoX(puntoEscaladoF[0]),
					 * convertirPuntoY(puntoEscaladoF[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoF[0]),
					 * convertirPuntoY(puntoEscaladoF[1]),
					 * convertirPuntoX(puntoEscaladoA[0]),
					 * convertirPuntoY(puntoEscaladoA[1]));
					 */
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			puntoInicialA = puntoEscaladoA;
			puntoInicialB = puntoEscaladoB;
			puntoInicialC = puntoEscaladoC;
			puntoInicialD = puntoEscaladoD;
			puntoInicialE = puntoEscaladoE;
			puntoInicialF = puntoEscaladoF;
			puntoInicialG = puntoEscaladoG;
			puntoInicialH = puntoEscaladoH;
			puntoInicialI = puntoEscaladoI;
			puntoInicialJ = puntoEscaladoJ;

			// Para Izquierda
			centro[0] = centro[0] + 40;
			centro[1] = centro[1] - 25;
			angulo = 360;
			for (double i = 0; i < 40; i = i + 0.5) {
				try {
					super.paint(g);
					
					angulo -= 9;
					primerCuadrante[0] = - centro[0];
					primerCuadrante[1] = - centro[1];
					
					puntoEscaladoA = operaciones.trasladar(puntoInicialA, primerCuadrante);
					puntoEscaladoB = operaciones.trasladar(puntoInicialB, primerCuadrante);
					puntoEscaladoC = operaciones.trasladar(puntoInicialC, primerCuadrante);
					puntoEscaladoD = operaciones.trasladar(puntoInicialD, primerCuadrante);
					puntoEscaladoE = operaciones.trasladar(puntoInicialE, primerCuadrante);
					puntoEscaladoF = operaciones.trasladar(puntoInicialF, primerCuadrante);
					puntoEscaladoG = operaciones.trasladar(puntoInicialG, primerCuadrante);
					puntoEscaladoH = operaciones.trasladar(puntoInicialH, primerCuadrante);
					puntoEscaladoI = operaciones.trasladar(puntoInicialI, primerCuadrante);
					puntoEscaladoJ = operaciones.trasladar(puntoInicialJ, primerCuadrante);
				// rotar
					puntoRotadoA = operaciones.rotar(puntoEscaladoA, angulo, 2);
					puntoRotadoB = operaciones.rotar(puntoEscaladoB, angulo, 2);
					puntoRotadoC = operaciones.rotar(puntoEscaladoC, angulo, 2);
					puntoRotadoD = operaciones.rotar(puntoEscaladoD, angulo, 2);
					puntoRotadoE = operaciones.rotar(puntoEscaladoE, angulo, 2);
					puntoRotadoF = operaciones.rotar(puntoEscaladoF, angulo, 2);
					puntoRotadoG = operaciones.rotar(puntoEscaladoG, angulo, 2);
					puntoRotadoH = operaciones.rotar(puntoEscaladoH, angulo, 2);
					puntoRotadoI = operaciones.rotar(puntoEscaladoI, angulo, 2);
					puntoRotadoJ = operaciones.rotar(puntoEscaladoJ, angulo, 2);
				// Trasladar otra vez
					primerCuadrante[0] = centro[0];
					primerCuadrante[1] = centro[1];
					puntoEscaladoA = operaciones.trasladar(puntoRotadoA, primerCuadrante);
					puntoEscaladoB = operaciones.trasladar(puntoRotadoB, primerCuadrante);
					puntoEscaladoC = operaciones.trasladar(puntoRotadoC, primerCuadrante);
					puntoEscaladoD = operaciones.trasladar(puntoRotadoD, primerCuadrante);
					puntoEscaladoE = operaciones.trasladar(puntoRotadoE, primerCuadrante);
					puntoEscaladoF = operaciones.trasladar(puntoRotadoF, primerCuadrante);
					puntoEscaladoG = operaciones.trasladar(puntoRotadoG, primerCuadrante);
					puntoEscaladoH = operaciones.trasladar(puntoRotadoH, primerCuadrante);
					puntoEscaladoI = operaciones.trasladar(puntoRotadoI, primerCuadrante);
					puntoEscaladoJ = operaciones.trasladar(puntoRotadoJ, primerCuadrante);
					
					
					primerCuadrante[0] = -i;
					primerCuadrante[1] = 0;
					puntoEscaladoA = operaciones.trasladar(puntoInicialA, primerCuadrante);
					puntoEscaladoB = operaciones.trasladar(puntoInicialB, primerCuadrante);
					puntoEscaladoC = operaciones.trasladar(puntoInicialC, primerCuadrante);
					puntoEscaladoD = operaciones.trasladar(puntoInicialD, primerCuadrante);
					puntoEscaladoE = operaciones.trasladar(puntoInicialE, primerCuadrante);
					puntoEscaladoF = operaciones.trasladar(puntoInicialF, primerCuadrante);
					puntoEscaladoG = operaciones.trasladar(puntoInicialG, primerCuadrante);
					puntoEscaladoH = operaciones.trasladar(puntoInicialH, primerCuadrante);
					puntoEscaladoI = operaciones.trasladar(puntoInicialI, primerCuadrante);
					puntoEscaladoJ = operaciones.trasladar(puntoInicialJ, primerCuadrante);

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
							convertirPuntoX(puntoEscaladoG[0]), convertirPuntoY(puntoEscaladoG[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoG[0]), convertirPuntoY(puntoEscaladoG[1]),
							convertirPuntoX(puntoEscaladoH[0]), convertirPuntoY(puntoEscaladoH[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoH[0]), convertirPuntoY(puntoEscaladoH[1]),
							convertirPuntoX(puntoEscaladoI[0]), convertirPuntoY(puntoEscaladoI[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoI[0]), convertirPuntoY(puntoEscaladoI[1]),
							convertirPuntoX(puntoEscaladoJ[0]), convertirPuntoY(puntoEscaladoJ[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoJ[0]), convertirPuntoY(puntoEscaladoJ[1]),
							convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]));

					// Rotar
					/*
					 * puntoEscaladoA = operaciones.rotar(puntoInicialA, angulo,
					 * dimension); puntoEscaladoB =
					 * operaciones.rotar(puntoInicialA, angulo, dimension);
					 * puntoEscaladoC = operaciones.rotar(puntoInicialA, angulo,
					 * dimension); puntoEscaladoA =
					 * operaciones.rotar(puntoInicialA, angulo, dimension);
					 * puntoEscaladoA = operaciones.rotar(puntoInicialA, angulo,
					 * dimension); puntoEscaladoA =
					 * operaciones.rotar(puntoInicialA, angulo, dimension);
					 * 
					 * g.drawLine(convertirPuntoX(puntoEscaladoA[0]),
					 * convertirPuntoY(puntoEscaladoA[1]),
					 * convertirPuntoX(puntoEscaladoB[0]),
					 * convertirPuntoY(puntoEscaladoB[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoB[0]),
					 * convertirPuntoY(puntoEscaladoB[1]),
					 * convertirPuntoX(puntoEscaladoC[0]),
					 * convertirPuntoY(puntoEscaladoC[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoC[0]),
					 * convertirPuntoY(puntoEscaladoC[1]),
					 * convertirPuntoX(puntoEscaladoD[0]),
					 * convertirPuntoY(puntoEscaladoD[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoD[0]),
					 * convertirPuntoY(puntoEscaladoD[1]),
					 * convertirPuntoX(puntoEscaladoE[0]),
					 * convertirPuntoY(puntoEscaladoE[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoE[0]),
					 * convertirPuntoY(puntoEscaladoE[1]),
					 * convertirPuntoX(puntoEscaladoF[0]),
					 * convertirPuntoY(puntoEscaladoF[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoF[0]),
					 * convertirPuntoY(puntoEscaladoF[1]),
					 * convertirPuntoX(puntoEscaladoA[0]),
					 * convertirPuntoY(puntoEscaladoA[1]));
					 */
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			puntoInicialA = puntoEscaladoA;
			puntoInicialB = puntoEscaladoB;
			puntoInicialC = puntoEscaladoC;
			puntoInicialD = puntoEscaladoD;
			puntoInicialE = puntoEscaladoE;
			puntoInicialF = puntoEscaladoF;
			puntoInicialG = puntoEscaladoG;
			puntoInicialH = puntoEscaladoH;
			puntoInicialI = puntoEscaladoI;
			puntoInicialJ = puntoEscaladoJ;

			// Para Izquierda
			for (double i = 0; i < 25; i = i + 0.5) {
				try {
					super.paint(g);

					primerCuadrante[0] = 0;
					primerCuadrante[1] = i;
					puntoEscaladoA = operaciones.trasladar(puntoInicialA, primerCuadrante);
					puntoEscaladoB = operaciones.trasladar(puntoInicialB, primerCuadrante);
					puntoEscaladoC = operaciones.trasladar(puntoInicialC, primerCuadrante);
					puntoEscaladoD = operaciones.trasladar(puntoInicialD, primerCuadrante);
					puntoEscaladoE = operaciones.trasladar(puntoInicialE, primerCuadrante);
					puntoEscaladoF = operaciones.trasladar(puntoInicialF, primerCuadrante);
					puntoEscaladoG = operaciones.trasladar(puntoInicialG, primerCuadrante);
					puntoEscaladoH = operaciones.trasladar(puntoInicialH, primerCuadrante);
					puntoEscaladoI = operaciones.trasladar(puntoInicialI, primerCuadrante);
					puntoEscaladoJ = operaciones.trasladar(puntoInicialJ, primerCuadrante);

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
							convertirPuntoX(puntoEscaladoG[0]), convertirPuntoY(puntoEscaladoG[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoG[0]), convertirPuntoY(puntoEscaladoG[1]),
							convertirPuntoX(puntoEscaladoH[0]), convertirPuntoY(puntoEscaladoH[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoH[0]), convertirPuntoY(puntoEscaladoH[1]),
							convertirPuntoX(puntoEscaladoI[0]), convertirPuntoY(puntoEscaladoI[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoI[0]), convertirPuntoY(puntoEscaladoI[1]),
							convertirPuntoX(puntoEscaladoJ[0]), convertirPuntoY(puntoEscaladoJ[1]));
					g.drawLine(convertirPuntoX(puntoEscaladoJ[0]), convertirPuntoY(puntoEscaladoJ[1]),
							convertirPuntoX(puntoEscaladoA[0]), convertirPuntoY(puntoEscaladoA[1]));

					// Rotar
					/*
					 * puntoEscaladoA = operaciones.rotar(puntoInicialA, angulo,
					 * dimension); puntoEscaladoB =
					 * operaciones.rotar(puntoInicialA, angulo, dimension);
					 * puntoEscaladoC = operaciones.rotar(puntoInicialA, angulo,
					 * dimension); puntoEscaladoA =
					 * operaciones.rotar(puntoInicialA, angulo, dimension);
					 * puntoEscaladoA = operaciones.rotar(puntoInicialA, angulo,
					 * dimension); puntoEscaladoA =
					 * operaciones.rotar(puntoInicialA, angulo, dimension);
					 * 
					 * g.drawLine(convertirPuntoX(puntoEscaladoA[0]),
					 * convertirPuntoY(puntoEscaladoA[1]),
					 * convertirPuntoX(puntoEscaladoB[0]),
					 * convertirPuntoY(puntoEscaladoB[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoB[0]),
					 * convertirPuntoY(puntoEscaladoB[1]),
					 * convertirPuntoX(puntoEscaladoC[0]),
					 * convertirPuntoY(puntoEscaladoC[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoC[0]),
					 * convertirPuntoY(puntoEscaladoC[1]),
					 * convertirPuntoX(puntoEscaladoD[0]),
					 * convertirPuntoY(puntoEscaladoD[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoD[0]),
					 * convertirPuntoY(puntoEscaladoD[1]),
					 * convertirPuntoX(puntoEscaladoE[0]),
					 * convertirPuntoY(puntoEscaladoE[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoE[0]),
					 * convertirPuntoY(puntoEscaladoE[1]),
					 * convertirPuntoX(puntoEscaladoF[0]),
					 * convertirPuntoY(puntoEscaladoF[1]));
					 * g.drawLine(convertirPuntoX(puntoEscaladoF[0]),
					 * convertirPuntoY(puntoEscaladoF[1]),
					 * convertirPuntoX(puntoEscaladoA[0]),
					 * convertirPuntoY(puntoEscaladoA[1]));
					 */
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
