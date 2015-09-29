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
		double[] puntoInicialA1 = { -22, 9 }; // -14
		double[] puntoInicialB1 = { -22, 14 };
		double[] puntoInicialC1 = { -19, 14 };
		double[] puntoInicialD1 = { -19, 13 };
		double[] puntoInicialE1 = { -21, 13 };
		double[] puntoInicialF1 = { -21, 12 };
		double[] puntoInicialG1 = { -20, 12 };
		double[] puntoInicialH1 = { -20, 11 };
		double[] puntoInicialI1 = { -21, 11 };
		double[] puntoInicialJ1 = { -21, 9 };
		
		double[] puntoInicialA = null;
		double[] puntoInicialB = null;
		double[] puntoInicialC = null;
		double[] puntoInicialD = null;
		double[] puntoInicialE = null;
		double[] puntoInicialF = null;
		double[] puntoInicialG = null;
		double[] puntoInicialH = null;
		double[] puntoInicialI = null;
		double[] puntoInicialJ = null;

		
		double[] puntoTransformadoA = null;
		double[] puntoTransformadoB = null;
		double[] puntoTransformadoC = null;
		double[] puntoTransformadoD = null;
		double[] puntoTransformadoE = null;
		double[] puntoTransformadoF = null;
		double[] puntoTransformadoG = null;
		double[] puntoTransformadoH = null;
		double[] puntoTransformadoI = null;
		double[] puntoTransformadoJ = null;

		double[] centro ={-20.5, 11.5};
		
		double[] primerCuadrante = { 0, 0 };
		
		// Dibujar el poligono
/*
		g.setColor(Color.RED);

		g.drawLine(convertirPuntoX(puntoInicialA1[0]), convertirPuntoY(puntoInicialA1[1]),
				convertirPuntoX(puntoInicialB1[0]), convertirPuntoY(puntoInicialB1[1]));

		g.drawLine(convertirPuntoX(puntoInicialB1[0]), convertirPuntoY(puntoInicialB1[1]),
				convertirPuntoX(puntoInicialC1[0]), convertirPuntoY(puntoInicialC1[1]));

		g.drawLine(convertirPuntoX(puntoInicialC1[0]), convertirPuntoY(puntoInicialC1[1]),
				convertirPuntoX(puntoInicialD1[0]), convertirPuntoY(puntoInicialD1[1]));

		g.drawLine(convertirPuntoX(puntoInicialD1[0]), convertirPuntoY(puntoInicialD1[1]),
				convertirPuntoX(puntoInicialE1[0]), convertirPuntoY(puntoInicialE1[1]));

		g.drawLine(convertirPuntoX(puntoInicialE1[0]), convertirPuntoY(puntoInicialE1[1]),
				convertirPuntoX(puntoInicialF1[0]), convertirPuntoY(puntoInicialF1[1]));

		g.drawLine(convertirPuntoX(puntoInicialF1[0]), convertirPuntoY(puntoInicialF1[1]),
				convertirPuntoX(puntoInicialG1[0]), convertirPuntoY(puntoInicialG1[1]));

		g.drawLine(convertirPuntoX(puntoInicialG1[0]), convertirPuntoY(puntoInicialG1[1]),
				convertirPuntoX(puntoInicialH1[0]), convertirPuntoY(puntoInicialH1[1]));

		g.drawLine(convertirPuntoX(puntoInicialH1[0]), convertirPuntoY(puntoInicialH1[1]),
				convertirPuntoX(puntoInicialI1[0]), convertirPuntoY(puntoInicialI1[1]));

		g.drawLine(convertirPuntoX(puntoInicialI1[0]), convertirPuntoY(puntoInicialI1[1]),
				convertirPuntoX(puntoInicialJ1[0]), convertirPuntoY(puntoInicialJ1[1]));

		g.drawLine(convertirPuntoX(puntoInicialJ1[0]), convertirPuntoY(puntoInicialJ1[1]),
				convertirPuntoX(puntoInicialA1[0]), convertirPuntoY(puntoInicialA1[1]));
*/
		
		g.setColor(Color.BLUE);
		int angulo = 360;
		int dimension = 2;
		double k = 0.5;
		
		while (1 == 1) {
			puntoInicialA = puntoInicialA1;
			puntoInicialB = puntoInicialB1;
			puntoInicialC = puntoInicialC1;
			puntoInicialD = puntoInicialD1;
			puntoInicialE = puntoInicialE1;
			puntoInicialF = puntoInicialF1;
			puntoInicialG = puntoInicialG1;
			puntoInicialH = puntoInicialH1;
			puntoInicialI = puntoInicialI1;
			puntoInicialJ = puntoInicialJ1;
			k = 0.5;
			
			for (double i = 0; i < 40; i = i + 0.5) {
				try {
					super.paint(g);
					if(i >= 20)
						k -= 0.05;
					else 
						k += 0.05;
					angulo -= 9;
					primerCuadrante[0] = - centro[0];
					primerCuadrante[1] = - centro[1];
					
				// Trasladar Con respecto al origen
					puntoTransformadoA = operaciones.trasladar(puntoInicialA, primerCuadrante);
					puntoTransformadoB = operaciones.trasladar(puntoInicialB, primerCuadrante);
					puntoTransformadoC = operaciones.trasladar(puntoInicialC, primerCuadrante);
					puntoTransformadoD = operaciones.trasladar(puntoInicialD, primerCuadrante);
					puntoTransformadoE = operaciones.trasladar(puntoInicialE, primerCuadrante);
					puntoTransformadoF = operaciones.trasladar(puntoInicialF, primerCuadrante);
					puntoTransformadoG = operaciones.trasladar(puntoInicialG, primerCuadrante);
					puntoTransformadoH = operaciones.trasladar(puntoInicialH, primerCuadrante);
					puntoTransformadoI = operaciones.trasladar(puntoInicialI, primerCuadrante);
					puntoTransformadoJ = operaciones.trasladar(puntoInicialJ, primerCuadrante);
					
				//escalar
					
					puntoTransformadoA = operaciones.escalar(puntoTransformadoA, dimension, k);
					puntoTransformadoB = operaciones.escalar(puntoTransformadoB, dimension, k);
					puntoTransformadoC = operaciones.escalar(puntoTransformadoC, dimension, k);
					puntoTransformadoD = operaciones.escalar(puntoTransformadoD, dimension, k);
					puntoTransformadoE = operaciones.escalar(puntoTransformadoE, dimension, k);
					puntoTransformadoF = operaciones.escalar(puntoTransformadoF, dimension, k);
					puntoTransformadoG = operaciones.escalar(puntoTransformadoG, dimension, k);
					puntoTransformadoH = operaciones.escalar(puntoTransformadoH, dimension, k);
					puntoTransformadoI = operaciones.escalar(puntoTransformadoI, dimension, k);
					puntoTransformadoJ = operaciones.escalar(puntoTransformadoJ, dimension, k);
					
				// rotar
					puntoTransformadoA = operaciones.rotar(puntoTransformadoA, angulo, dimension);
					puntoTransformadoB = operaciones.rotar(puntoTransformadoB, angulo, dimension);
					puntoTransformadoC = operaciones.rotar(puntoTransformadoC, angulo, dimension);
					puntoTransformadoD = operaciones.rotar(puntoTransformadoD, angulo, dimension);
					puntoTransformadoE = operaciones.rotar(puntoTransformadoE, angulo, dimension);
					puntoTransformadoF = operaciones.rotar(puntoTransformadoF, angulo, dimension);
					puntoTransformadoG = operaciones.rotar(puntoTransformadoG, angulo, dimension);
					puntoTransformadoH = operaciones.rotar(puntoTransformadoH, angulo, dimension);
					puntoTransformadoI = operaciones.rotar(puntoTransformadoI, angulo, dimension);
					puntoTransformadoJ = operaciones.rotar(puntoTransformadoJ, angulo, dimension);
					
				
				// Trasladar inversamente al origen
					primerCuadrante[0] = centro[0];
					primerCuadrante[1] = centro[1];
					puntoTransformadoA = operaciones.trasladar(puntoTransformadoA, primerCuadrante);
					puntoTransformadoB = operaciones.trasladar(puntoTransformadoB, primerCuadrante);
					puntoTransformadoC = operaciones.trasladar(puntoTransformadoC, primerCuadrante);
					puntoTransformadoD = operaciones.trasladar(puntoTransformadoD, primerCuadrante);
					puntoTransformadoE = operaciones.trasladar(puntoTransformadoE, primerCuadrante);
					puntoTransformadoF = operaciones.trasladar(puntoTransformadoF, primerCuadrante);
					puntoTransformadoG = operaciones.trasladar(puntoTransformadoG, primerCuadrante);
					puntoTransformadoH = operaciones.trasladar(puntoTransformadoH, primerCuadrante);
					puntoTransformadoI = operaciones.trasladar(puntoTransformadoI, primerCuadrante);
					puntoTransformadoJ = operaciones.trasladar(puntoTransformadoJ, primerCuadrante);
					
					// Trasladar
					
					primerCuadrante[0] = i;
					primerCuadrante[1] = 0;
					puntoTransformadoA = operaciones.trasladar(puntoTransformadoA, primerCuadrante);
					puntoTransformadoB = operaciones.trasladar(puntoTransformadoB, primerCuadrante);
					puntoTransformadoC = operaciones.trasladar(puntoTransformadoC, primerCuadrante);
					puntoTransformadoD = operaciones.trasladar(puntoTransformadoD, primerCuadrante);
					puntoTransformadoE = operaciones.trasladar(puntoTransformadoE, primerCuadrante);
					puntoTransformadoF = operaciones.trasladar(puntoTransformadoF, primerCuadrante);
					puntoTransformadoG = operaciones.trasladar(puntoTransformadoG, primerCuadrante);
					puntoTransformadoH = operaciones.trasladar(puntoTransformadoH, primerCuadrante);
					puntoTransformadoI = operaciones.trasladar(puntoTransformadoI, primerCuadrante);
					puntoTransformadoJ = operaciones.trasladar(puntoTransformadoJ, primerCuadrante);

					
					
					g.drawLine(convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]),
							convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]),
							convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]),
							convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]),
							convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]),
							convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]),
							convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]),
							convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]),
							convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]),
							convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]),
							convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]));
					 
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			puntoInicialA = puntoTransformadoA;
			puntoInicialB = puntoTransformadoB;
			puntoInicialC = puntoTransformadoC;
			puntoInicialD = puntoTransformadoD;
			puntoInicialE = puntoTransformadoE;
			puntoInicialF = puntoTransformadoF;
			puntoInicialG = puntoTransformadoG;
			puntoInicialH = puntoTransformadoH;
			puntoInicialI = puntoTransformadoI;
			puntoInicialJ = puntoTransformadoJ;
			
			centro[0] = centro[0] + 40;
			centro[1] = centro[1] + 0;
			k = 0.5;
			
			// Para abajo
			angulo = 360;
			for (double i = 0; i < 25; i = i + 0.5) {
				try {
					super.paint(g);
					if(i >= 20)
						k -= 0.05;
					else 
						k += 0.05;
					angulo -= 9;
					primerCuadrante[0] = - centro[0];
					primerCuadrante[1] = - centro[1];
					
					// Trasladar Con respecto al origen
					puntoTransformadoA = operaciones.trasladar(puntoInicialA, primerCuadrante);
					puntoTransformadoB = operaciones.trasladar(puntoInicialB, primerCuadrante);
					puntoTransformadoC = operaciones.trasladar(puntoInicialC, primerCuadrante);
					puntoTransformadoD = operaciones.trasladar(puntoInicialD, primerCuadrante);
					puntoTransformadoE = operaciones.trasladar(puntoInicialE, primerCuadrante);
					puntoTransformadoF = operaciones.trasladar(puntoInicialF, primerCuadrante);
					puntoTransformadoG = operaciones.trasladar(puntoInicialG, primerCuadrante);
					puntoTransformadoH = operaciones.trasladar(puntoInicialH, primerCuadrante);
					puntoTransformadoI = operaciones.trasladar(puntoInicialI, primerCuadrante);
					puntoTransformadoJ = operaciones.trasladar(puntoInicialJ, primerCuadrante);
					
				//escalar
					
					puntoTransformadoA = operaciones.escalar(puntoTransformadoA, dimension, k);
					puntoTransformadoB = operaciones.escalar(puntoTransformadoB, dimension, k);
					puntoTransformadoC = operaciones.escalar(puntoTransformadoC, dimension, k);
					puntoTransformadoD = operaciones.escalar(puntoTransformadoD, dimension, k);
					puntoTransformadoE = operaciones.escalar(puntoTransformadoE, dimension, k);
					puntoTransformadoF = operaciones.escalar(puntoTransformadoF, dimension, k);
					puntoTransformadoG = operaciones.escalar(puntoTransformadoG, dimension, k);
					puntoTransformadoH = operaciones.escalar(puntoTransformadoH, dimension, k);
					puntoTransformadoI = operaciones.escalar(puntoTransformadoI, dimension, k);
					puntoTransformadoJ = operaciones.escalar(puntoTransformadoJ, dimension, k);
					
				// rotar
					puntoTransformadoA = operaciones.rotar(puntoTransformadoA, angulo, dimension);
					puntoTransformadoB = operaciones.rotar(puntoTransformadoB, angulo, dimension);
					puntoTransformadoC = operaciones.rotar(puntoTransformadoC, angulo, dimension);
					puntoTransformadoD = operaciones.rotar(puntoTransformadoD, angulo, dimension);
					puntoTransformadoE = operaciones.rotar(puntoTransformadoE, angulo, dimension);
					puntoTransformadoF = operaciones.rotar(puntoTransformadoF, angulo, dimension);
					puntoTransformadoG = operaciones.rotar(puntoTransformadoG, angulo, dimension);
					puntoTransformadoH = operaciones.rotar(puntoTransformadoH, angulo, dimension);
					puntoTransformadoI = operaciones.rotar(puntoTransformadoI, angulo, dimension);
					puntoTransformadoJ = operaciones.rotar(puntoTransformadoJ, angulo, dimension);
					
				
				// Trasladar inversamente al origen
					primerCuadrante[0] = centro[0];
					primerCuadrante[1] = centro[1];
					puntoTransformadoA = operaciones.trasladar(puntoTransformadoA, primerCuadrante);
					puntoTransformadoB = operaciones.trasladar(puntoTransformadoB, primerCuadrante);
					puntoTransformadoC = operaciones.trasladar(puntoTransformadoC, primerCuadrante);
					puntoTransformadoD = operaciones.trasladar(puntoTransformadoD, primerCuadrante);
					puntoTransformadoE = operaciones.trasladar(puntoTransformadoE, primerCuadrante);
					puntoTransformadoF = operaciones.trasladar(puntoTransformadoF, primerCuadrante);
					puntoTransformadoG = operaciones.trasladar(puntoTransformadoG, primerCuadrante);
					puntoTransformadoH = operaciones.trasladar(puntoTransformadoH, primerCuadrante);
					puntoTransformadoI = operaciones.trasladar(puntoTransformadoI, primerCuadrante);
					puntoTransformadoJ = operaciones.trasladar(puntoTransformadoJ, primerCuadrante);
					
					primerCuadrante[0] = 0;
					primerCuadrante[1] = -i;
					
					puntoTransformadoA = operaciones.trasladar(puntoTransformadoA, primerCuadrante);
					puntoTransformadoB = operaciones.trasladar(puntoTransformadoB, primerCuadrante);
					puntoTransformadoC = operaciones.trasladar(puntoTransformadoC, primerCuadrante);
					puntoTransformadoD = operaciones.trasladar(puntoTransformadoD, primerCuadrante);
					puntoTransformadoE = operaciones.trasladar(puntoTransformadoE, primerCuadrante);
					puntoTransformadoF = operaciones.trasladar(puntoTransformadoF, primerCuadrante);
					puntoTransformadoG = operaciones.trasladar(puntoTransformadoG, primerCuadrante);
					puntoTransformadoH = operaciones.trasladar(puntoTransformadoH, primerCuadrante);
					puntoTransformadoI = operaciones.trasladar(puntoTransformadoI, primerCuadrante);
					puntoTransformadoJ = operaciones.trasladar(puntoTransformadoJ, primerCuadrante);

					
					
					g.drawLine(convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]),
							convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]),
							convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]),
							convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]),
							convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]),
							convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]),
							convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]),
							convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]),
							convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]),
							convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]),
							convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]));

					
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			puntoInicialA = puntoTransformadoA;
			puntoInicialB = puntoTransformadoB;
			puntoInicialC = puntoTransformadoC;
			puntoInicialD = puntoTransformadoD;
			puntoInicialE = puntoTransformadoE;
			puntoInicialF = puntoTransformadoF;
			puntoInicialG = puntoTransformadoG;
			puntoInicialH = puntoTransformadoH;
			puntoInicialI = puntoTransformadoI;
			puntoInicialJ = puntoTransformadoJ;

			// Para Izquierda
			centro[1] = centro[1] - 25;
			angulo = 360;
			k = 0.5;
			
			for (double i = 0; i < 40; i = i + 0.5) {
				try {
					super.paint(g);
					if(i >= 20)
						k -= 0.05;
					else 
						k += 0.05;
					angulo -= 9;
					primerCuadrante[0] = - centro[0];
					primerCuadrante[1] = - centro[1];
					
					// Trasladar Con respecto al origen
					puntoTransformadoA = operaciones.trasladar(puntoInicialA, primerCuadrante);
					puntoTransformadoB = operaciones.trasladar(puntoInicialB, primerCuadrante);
					puntoTransformadoC = operaciones.trasladar(puntoInicialC, primerCuadrante);
					puntoTransformadoD = operaciones.trasladar(puntoInicialD, primerCuadrante);
					puntoTransformadoE = operaciones.trasladar(puntoInicialE, primerCuadrante);
					puntoTransformadoF = operaciones.trasladar(puntoInicialF, primerCuadrante);
					puntoTransformadoG = operaciones.trasladar(puntoInicialG, primerCuadrante);
					puntoTransformadoH = operaciones.trasladar(puntoInicialH, primerCuadrante);
					puntoTransformadoI = operaciones.trasladar(puntoInicialI, primerCuadrante);
					puntoTransformadoJ = operaciones.trasladar(puntoInicialJ, primerCuadrante);
					
				//escalar
					
					puntoTransformadoA = operaciones.escalar(puntoTransformadoA, dimension, k);
					puntoTransformadoB = operaciones.escalar(puntoTransformadoB, dimension, k);
					puntoTransformadoC = operaciones.escalar(puntoTransformadoC, dimension, k);
					puntoTransformadoD = operaciones.escalar(puntoTransformadoD, dimension, k);
					puntoTransformadoE = operaciones.escalar(puntoTransformadoE, dimension, k);
					puntoTransformadoF = operaciones.escalar(puntoTransformadoF, dimension, k);
					puntoTransformadoG = operaciones.escalar(puntoTransformadoG, dimension, k);
					puntoTransformadoH = operaciones.escalar(puntoTransformadoH, dimension, k);
					puntoTransformadoI = operaciones.escalar(puntoTransformadoI, dimension, k);
					puntoTransformadoJ = operaciones.escalar(puntoTransformadoJ, dimension, k);
					
				// rotar
					puntoTransformadoA = operaciones.rotar(puntoTransformadoA, angulo, dimension);
					puntoTransformadoB = operaciones.rotar(puntoTransformadoB, angulo, dimension);
					puntoTransformadoC = operaciones.rotar(puntoTransformadoC, angulo, dimension);
					puntoTransformadoD = operaciones.rotar(puntoTransformadoD, angulo, dimension);
					puntoTransformadoE = operaciones.rotar(puntoTransformadoE, angulo, dimension);
					puntoTransformadoF = operaciones.rotar(puntoTransformadoF, angulo, dimension);
					puntoTransformadoG = operaciones.rotar(puntoTransformadoG, angulo, dimension);
					puntoTransformadoH = operaciones.rotar(puntoTransformadoH, angulo, dimension);
					puntoTransformadoI = operaciones.rotar(puntoTransformadoI, angulo, dimension);
					puntoTransformadoJ = operaciones.rotar(puntoTransformadoJ, angulo, dimension);
					
				
				// Trasladar inversamente al origen
					primerCuadrante[0] = centro[0];
					primerCuadrante[1] = centro[1];
					puntoTransformadoA = operaciones.trasladar(puntoTransformadoA, primerCuadrante);
					puntoTransformadoB = operaciones.trasladar(puntoTransformadoB, primerCuadrante);
					puntoTransformadoC = operaciones.trasladar(puntoTransformadoC, primerCuadrante);
					puntoTransformadoD = operaciones.trasladar(puntoTransformadoD, primerCuadrante);
					puntoTransformadoE = operaciones.trasladar(puntoTransformadoE, primerCuadrante);
					puntoTransformadoF = operaciones.trasladar(puntoTransformadoF, primerCuadrante);
					puntoTransformadoG = operaciones.trasladar(puntoTransformadoG, primerCuadrante);
					puntoTransformadoH = operaciones.trasladar(puntoTransformadoH, primerCuadrante);
					puntoTransformadoI = operaciones.trasladar(puntoTransformadoI, primerCuadrante);
					puntoTransformadoJ = operaciones.trasladar(puntoTransformadoJ, primerCuadrante);
					
					
					primerCuadrante[0] = -i;
					primerCuadrante[1] = 0;
					
					puntoTransformadoA = operaciones.trasladar(puntoTransformadoA, primerCuadrante);
					puntoTransformadoB = operaciones.trasladar(puntoTransformadoB, primerCuadrante);
					puntoTransformadoC = operaciones.trasladar(puntoTransformadoC, primerCuadrante);
					puntoTransformadoD = operaciones.trasladar(puntoTransformadoD, primerCuadrante);
					puntoTransformadoE = operaciones.trasladar(puntoTransformadoE, primerCuadrante);
					puntoTransformadoF = operaciones.trasladar(puntoTransformadoF, primerCuadrante);
					puntoTransformadoG = operaciones.trasladar(puntoTransformadoG, primerCuadrante);
					puntoTransformadoH = operaciones.trasladar(puntoTransformadoH, primerCuadrante);
					puntoTransformadoI = operaciones.trasladar(puntoTransformadoI, primerCuadrante);
					puntoTransformadoJ = operaciones.trasladar(puntoTransformadoJ, primerCuadrante);

					
					
					g.drawLine(convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]),
							convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]),
							convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]),
							convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]),
							convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]),
							convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]),
							convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]),
							convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]),
							convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]),
							convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]),
							convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]));

					
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			puntoInicialA = puntoTransformadoA;
			puntoInicialB = puntoTransformadoB;
			puntoInicialC = puntoTransformadoC;
			puntoInicialD = puntoTransformadoD;
			puntoInicialE = puntoTransformadoE;
			puntoInicialF = puntoTransformadoF;
			puntoInicialG = puntoTransformadoG;
			puntoInicialH = puntoTransformadoH;
			puntoInicialI = puntoTransformadoI;
			puntoInicialJ = puntoTransformadoJ;

		// Para Arriba
			centro[0] = -20.5;
			angulo = 360;
			k = 0.5;
			for (double i = 0; i < 25; i = i + 0.5) {
				try {
					super.paint(g);
					if(i >= 20)
						k -= 0.05;
					else 
						k += 0.05;
					angulo -= 9;
					primerCuadrante[0] = - centro[0];
					primerCuadrante[1] = - centro[1];
					
					// Trasladar Con respecto al origen
					puntoTransformadoA = operaciones.trasladar(puntoInicialA, primerCuadrante);
					puntoTransformadoB = operaciones.trasladar(puntoInicialB, primerCuadrante);
					puntoTransformadoC = operaciones.trasladar(puntoInicialC, primerCuadrante);
					puntoTransformadoD = operaciones.trasladar(puntoInicialD, primerCuadrante);
					puntoTransformadoE = operaciones.trasladar(puntoInicialE, primerCuadrante);
					puntoTransformadoF = operaciones.trasladar(puntoInicialF, primerCuadrante);
					puntoTransformadoG = operaciones.trasladar(puntoInicialG, primerCuadrante);
					puntoTransformadoH = operaciones.trasladar(puntoInicialH, primerCuadrante);
					puntoTransformadoI = operaciones.trasladar(puntoInicialI, primerCuadrante);
					puntoTransformadoJ = operaciones.trasladar(puntoInicialJ, primerCuadrante);
					
				//escalar
					
					puntoTransformadoA = operaciones.escalar(puntoTransformadoA, dimension, k);
					puntoTransformadoB = operaciones.escalar(puntoTransformadoB, dimension, k);
					puntoTransformadoC = operaciones.escalar(puntoTransformadoC, dimension, k);
					puntoTransformadoD = operaciones.escalar(puntoTransformadoD, dimension, k);
					puntoTransformadoE = operaciones.escalar(puntoTransformadoE, dimension, k);
					puntoTransformadoF = operaciones.escalar(puntoTransformadoF, dimension, k);
					puntoTransformadoG = operaciones.escalar(puntoTransformadoG, dimension, k);
					puntoTransformadoH = operaciones.escalar(puntoTransformadoH, dimension, k);
					puntoTransformadoI = operaciones.escalar(puntoTransformadoI, dimension, k);
					puntoTransformadoJ = operaciones.escalar(puntoTransformadoJ, dimension, k);
					
				// rotar
					puntoTransformadoA = operaciones.rotar(puntoTransformadoA, angulo, dimension);
					puntoTransformadoB = operaciones.rotar(puntoTransformadoB, angulo, dimension);
					puntoTransformadoC = operaciones.rotar(puntoTransformadoC, angulo, dimension);
					puntoTransformadoD = operaciones.rotar(puntoTransformadoD, angulo, dimension);
					puntoTransformadoE = operaciones.rotar(puntoTransformadoE, angulo, dimension);
					puntoTransformadoF = operaciones.rotar(puntoTransformadoF, angulo, dimension);
					puntoTransformadoG = operaciones.rotar(puntoTransformadoG, angulo, dimension);
					puntoTransformadoH = operaciones.rotar(puntoTransformadoH, angulo, dimension);
					puntoTransformadoI = operaciones.rotar(puntoTransformadoI, angulo, dimension);
					puntoTransformadoJ = operaciones.rotar(puntoTransformadoJ, angulo, dimension);
					
				
				// Trasladar inversamente al origen
					primerCuadrante[0] = centro[0];
					primerCuadrante[1] = centro[1];
					puntoTransformadoA = operaciones.trasladar(puntoTransformadoA, primerCuadrante);
					puntoTransformadoB = operaciones.trasladar(puntoTransformadoB, primerCuadrante);
					puntoTransformadoC = operaciones.trasladar(puntoTransformadoC, primerCuadrante);
					puntoTransformadoD = operaciones.trasladar(puntoTransformadoD, primerCuadrante);
					puntoTransformadoE = operaciones.trasladar(puntoTransformadoE, primerCuadrante);
					puntoTransformadoF = operaciones.trasladar(puntoTransformadoF, primerCuadrante);
					puntoTransformadoG = operaciones.trasladar(puntoTransformadoG, primerCuadrante);
					puntoTransformadoH = operaciones.trasladar(puntoTransformadoH, primerCuadrante);
					puntoTransformadoI = operaciones.trasladar(puntoTransformadoI, primerCuadrante);
					puntoTransformadoJ = operaciones.trasladar(puntoTransformadoJ, primerCuadrante);

					primerCuadrante[0] = 0;
					primerCuadrante[1] = i;
					
					puntoTransformadoA = operaciones.trasladar(puntoTransformadoA, primerCuadrante);
					puntoTransformadoB = operaciones.trasladar(puntoTransformadoB, primerCuadrante);
					puntoTransformadoC = operaciones.trasladar(puntoTransformadoC, primerCuadrante);
					puntoTransformadoD = operaciones.trasladar(puntoTransformadoD, primerCuadrante);
					puntoTransformadoE = operaciones.trasladar(puntoTransformadoE, primerCuadrante);
					puntoTransformadoF = operaciones.trasladar(puntoTransformadoF, primerCuadrante);
					puntoTransformadoG = operaciones.trasladar(puntoTransformadoG, primerCuadrante);
					puntoTransformadoH = operaciones.trasladar(puntoTransformadoH, primerCuadrante);
					puntoTransformadoI = operaciones.trasladar(puntoTransformadoI, primerCuadrante);
					puntoTransformadoJ = operaciones.trasladar(puntoTransformadoJ, primerCuadrante);

					
					
					g.drawLine(convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]),
							convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]),
							convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]),
							convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]),
							convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]),
							convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]),
							convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]),
							convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]),
							convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]),
							convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]));
					g.drawLine(convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]),
							convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]));

					
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			centro[0] = -20.5;
			centro[1] = 11.5;
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
