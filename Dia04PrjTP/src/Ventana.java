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
		 

	
		double[] puntoInicialA = {5, -5, 0};
		double[] puntoInicialB = {5, 5, 0};
		double[] puntoInicialC = {-5, 5, 0};
		double[] puntoInicialD = {-5, -5, 0};
		double[] puntoInicialE = {0, 0, 15};
		
		
		double[] vectorTraslacion = {5, 0, 0};
		int dimension = 3;
		double k = 1.7;
		double angulo = 270.0;
		for (int i = 360; i > 0; i--) {
			g.setColor(Color.BLACK);
			
			 g.drawLine(convertirPuntoX(0), convertirPuntoY(0),
					 convertirPuntoX(0), convertirPuntoY(100));
			 g.drawLine(convertirPuntoX(0), convertirPuntoY(0),
			 convertirPuntoX(100), convertirPuntoY(0));
			 g.drawLine(convertirPuntoX(0), convertirPuntoY(0),
					 convertirPuntoX(-100), convertirPuntoY(-100));
			 
			super.paint(g);
			angulo = i;
			double[] puntoTransformadoA = operaciones.rotarR3(puntoInicialA, angulo, "x");
			double[] puntoTransformadoB = operaciones.rotarR3(puntoInicialB, angulo, "x");
			double[] puntoTransformadoC = operaciones.rotarR3(puntoInicialC, angulo, "x");
			double[] puntoTransformadoD = operaciones.rotarR3(puntoInicialD, angulo, "x");
			double[] puntoTransformadoE = operaciones.rotarR3(puntoInicialE, angulo, "x");
			
			puntoTransformadoA = operaciones.rotarR3(puntoTransformadoA, angulo, "y");
			puntoTransformadoB = operaciones.rotarR3(puntoTransformadoB, angulo, "y");
			puntoTransformadoC = operaciones.rotarR3(puntoTransformadoC, angulo, "y");
			puntoTransformadoD = operaciones.rotarR3(puntoTransformadoD, angulo, "y");
			puntoTransformadoE = operaciones.rotarR3(puntoTransformadoE, angulo, "y");
			
			puntoTransformadoA = operaciones.rotarR3(puntoTransformadoA, angulo, "z");
			puntoTransformadoB = operaciones.rotarR3(puntoTransformadoB, angulo, "z");
			puntoTransformadoC = operaciones.rotarR3(puntoTransformadoC, angulo, "z");
			puntoTransformadoD = operaciones.rotarR3(puntoTransformadoD, angulo, "z");
			puntoTransformadoE = operaciones.rotarR3(puntoTransformadoE, angulo, "z");
			
			
			puntoTransformadoA = operaciones.transformarR3(puntoTransformadoA);
			puntoTransformadoB = operaciones.transformarR3(puntoTransformadoB);
			puntoTransformadoC = operaciones.transformarR3(puntoTransformadoC);
			puntoTransformadoD = operaciones.transformarR3(puntoTransformadoD);
			puntoTransformadoE = operaciones.transformarR3(puntoTransformadoE);
			
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
					convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]));
			
			g2.drawLine(convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]), // d -> a
					convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]));
			
			g2.drawLine(convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]), // d -> a
					convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]));
			
			g2.drawLine(convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]), // d -> a
					convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]));
			
			g2.drawLine(convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]), // d -> a
					convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]));
		
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
