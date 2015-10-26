import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	public static int ESCALA = 15;
	public static double[] matrizSegundoCuadrante = { -8, 0, -8, 0 };
	public static double[] matrizTercerCuadrante = { -8, -10, -8, -10 };
	public static double[] matrizCuartoCuadrante = { 0, -10, 0, -10 };

	@Override
	public void paint(Graphics g) {

		MatrizImpl operaciones = new MatrizImpl();

		// Dibujar plano cartesiano
		
		 g.drawLine(convertirPuntoX(0), convertirPuntoY(0),
		 convertirPuntoX(0), convertirPuntoY(100));
		 g.drawLine(convertirPuntoX(0), convertirPuntoY(0),
		 convertirPuntoX(100), convertirPuntoY(0));
		 
		 g.drawLine(convertirPuntoX(0), convertirPuntoY(0),
				 convertirPuntoX(-100), convertirPuntoY(-100));
		 

	
		double[] puntoInicialA = {3, 0, 0};
		double[] puntoInicialB = {1, 3, 0};
		double[] puntoInicialC = {-1, 3, 0};
		double[] puntoInicialD = {-3, 0, 0};
		double[] puntoInicialE = {-1, -3, 0};
		double[] puntoInicialF = {1, -3, 0};
		
		double[] puntoInicialG = {3, 0, 10};
		double[] puntoInicialH = {1, 3, 10};
		double[] puntoInicialI = {-1, 3, 10};
		double[] puntoInicialJ = {-3, 0, 10};
		double[] puntoInicialK = {-1, -3, 10};
		double[] puntoInicialL = {1, -3, 10};
		
		double[] vectorTraslacion = {5, 0, 0};
		int dimension = 3;
		double k = 1.7;
		
		double[] puntoTransformadoA = operaciones.escalar(puntoInicialA, dimension, k);
		double[] puntoTransformadoB = operaciones.escalar(puntoInicialB, dimension, k);
		double[] puntoTransformadoC = operaciones.escalar(puntoInicialC, dimension, k);
		double[] puntoTransformadoD = operaciones.escalar(puntoInicialD, dimension, k);
		double[] puntoTransformadoE = operaciones.escalar(puntoInicialE, dimension, k);
		double[] puntoTransformadoF = operaciones.escalar(puntoInicialF, dimension, k);
		double[] puntoTransformadoG = operaciones.escalar(puntoInicialG, dimension, k);
		double[] puntoTransformadoH = operaciones.escalar(puntoInicialH, dimension, k);
		double[] puntoTransformadoI = operaciones.escalar(puntoInicialI, dimension, k);
		double[] puntoTransformadoJ = operaciones.escalar(puntoInicialJ, dimension, k);
		double[] puntoTransformadoK = operaciones.escalar(puntoInicialK, dimension, k);
		double[] puntoTransformadoL = operaciones.escalar(puntoInicialL, dimension, k);
		
		puntoTransformadoA = operaciones.transformarR3(puntoTransformadoA);
		puntoTransformadoB = operaciones.transformarR3(puntoTransformadoB);
		puntoTransformadoC = operaciones.transformarR3(puntoTransformadoC);
		puntoTransformadoD = operaciones.transformarR3(puntoTransformadoD);
		puntoTransformadoE = operaciones.transformarR3(puntoTransformadoE);
		puntoTransformadoF = operaciones.transformarR3(puntoTransformadoF);
		puntoTransformadoG = operaciones.transformarR3(puntoTransformadoG);
		puntoTransformadoH = operaciones.transformarR3(puntoTransformadoH);
		puntoTransformadoI = operaciones.transformarR3(puntoTransformadoI);
		puntoTransformadoJ = operaciones.transformarR3(puntoTransformadoJ);
		puntoTransformadoK = operaciones.transformarR3(puntoTransformadoK);
		puntoTransformadoL = operaciones.transformarR3(puntoTransformadoL);
		
		g.setColor(Color.RED);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON); 
		g2.drawLine(convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]), // a -> b
				convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]), // b -> c
				convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]), // c -> d
				convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]), // d -> a
				convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]), // e -> f
				convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]), // f -> a
				convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]));
		
		/////////////////////////
		
		g2.drawLine(convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]), // g -> h
				convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]), // h -> i
				convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]));
		
		
		
		g2.drawLine(convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]), // i -> j
				convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]), // b -> g
				convertirPuntoX(puntoTransformadoK[0]), convertirPuntoY(puntoTransformadoK[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoK[0]), convertirPuntoY(puntoTransformadoK[1]), // c -> h
				convertirPuntoX(puntoTransformadoL[0]), convertirPuntoY(puntoTransformadoL[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoL[0]), convertirPuntoY(puntoTransformadoL[1]), // d -> e
				convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]));
		/////////
		
		g2.drawLine(convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]), // a -> b
				convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]), // b -> c
				convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]), // c -> d
				convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]), // d -> a
				convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]), // e -> f
				convertirPuntoX(puntoTransformadoK[0]), convertirPuntoY(puntoTransformadoK[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]), // f -> a
				convertirPuntoX(puntoTransformadoL[0]), convertirPuntoY(puntoTransformadoL[1]));
		
		k = 0.5;
		
		puntoTransformadoA = operaciones.escalar(puntoInicialA, dimension, k);
		puntoTransformadoB = operaciones.escalar(puntoInicialB, dimension, k);
		puntoTransformadoC = operaciones.escalar(puntoInicialC, dimension, k);
		puntoTransformadoD = operaciones.escalar(puntoInicialD, dimension, k);
		puntoTransformadoE = operaciones.escalar(puntoInicialE, dimension, k);
		puntoTransformadoF = operaciones.escalar(puntoInicialF, dimension, k);
		puntoTransformadoG = operaciones.escalar(puntoInicialG, dimension, k);
		puntoTransformadoH = operaciones.escalar(puntoInicialH, dimension, k);
		puntoTransformadoI = operaciones.escalar(puntoInicialI, dimension, k);
		puntoTransformadoJ = operaciones.escalar(puntoInicialJ, dimension, k);
		puntoTransformadoK = operaciones.escalar(puntoInicialK, dimension, k);
		puntoTransformadoL = operaciones.escalar(puntoInicialL, dimension, k);
		
		puntoTransformadoA = operaciones.transformarR3(puntoTransformadoA);
		puntoTransformadoB = operaciones.transformarR3(puntoTransformadoB);
		puntoTransformadoC = operaciones.transformarR3(puntoTransformadoC);
		puntoTransformadoD = operaciones.transformarR3(puntoTransformadoD);
		puntoTransformadoE = operaciones.transformarR3(puntoTransformadoE);
		puntoTransformadoF = operaciones.transformarR3(puntoTransformadoF);
		puntoTransformadoG = operaciones.transformarR3(puntoTransformadoG);
		puntoTransformadoH = operaciones.transformarR3(puntoTransformadoH);
		puntoTransformadoI = operaciones.transformarR3(puntoTransformadoI);
		puntoTransformadoJ = operaciones.transformarR3(puntoTransformadoJ);
		puntoTransformadoK = operaciones.transformarR3(puntoTransformadoK);
		puntoTransformadoL = operaciones.transformarR3(puntoTransformadoL);
		
		
		
		g.setColor(Color.GREEN);
		 
		g2.drawLine(convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]), // a -> b
				convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]), // b -> c
				convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]), // c -> d
				convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]), // d -> a
				convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]), // e -> f
				convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]), // f -> a
				convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]));
		
		/////////////////////////
		
		g2.drawLine(convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]), // g -> h
				convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]), // h -> i
				convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]));
		
		
		
		g2.drawLine(convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]), // i -> j
				convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]), // b -> g
				convertirPuntoX(puntoTransformadoK[0]), convertirPuntoY(puntoTransformadoK[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoK[0]), convertirPuntoY(puntoTransformadoK[1]), // c -> h
				convertirPuntoX(puntoTransformadoL[0]), convertirPuntoY(puntoTransformadoL[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoL[0]), convertirPuntoY(puntoTransformadoL[1]), // d -> e
				convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]));
		/////////
		
		g2.drawLine(convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]), // a -> b
				convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]), // b -> c
				convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]), // c -> d
				convertirPuntoX(puntoTransformadoI[0]), convertirPuntoY(puntoTransformadoI[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]), // d -> a
				convertirPuntoX(puntoTransformadoJ[0]), convertirPuntoY(puntoTransformadoJ[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]), // e -> f
				convertirPuntoX(puntoTransformadoK[0]), convertirPuntoY(puntoTransformadoK[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]), // f -> a
				convertirPuntoX(puntoTransformadoL[0]), convertirPuntoY(puntoTransformadoL[1]));
		
		
		
		
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
