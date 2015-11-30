import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	public static int ESCALA = 30;
	public static double[] matrizSegundoCuadrante = { -8, 0, -8, 0 };
	public static double[] matrizTercerCuadrante = { -8, -10, -8, -10 };
	public static double[] matrizCuartoCuadrante = { 0, -10, 0, -10 };

	@Override
	public void paint(Graphics g) {

		MatrizImpl operaciones = new MatrizImpl();

		// Dibujar plano cartesiano
		
		 g.drawLine(convertirPuntoX(-100), convertirPuntoY(0),
		 convertirPuntoX(100), convertirPuntoY(0));
		 g.drawLine(convertirPuntoX(0), convertirPuntoY(100),
		 convertirPuntoX(0), convertirPuntoY(-100));
		 

	
		double[] puntoInicialA = {0, 0, 0};
		double[] puntoInicialB = {0, 3, 0};
		double[] puntoInicialC = {3, 3, 0};
		double[] puntoInicialD = {3, 0, 0};
		
		double[] puntoInicialE = {3, 0, 3};
		double[] puntoInicialF = {0, 0, 3};
		double[] puntoInicialG = {0, 3, 3};
		double[] puntoInicialH = {3, 3, 3};
		
		double[] vectorTraslacion = {5, 0, 0};
		int dimension = 3;
		
		double[] puntoTransformadoA = operaciones.trasladar(puntoInicialA, vectorTraslacion, dimension);
		double[] puntoTransformadoB = operaciones.trasladar(puntoInicialB, vectorTraslacion, dimension);
		double[] puntoTransformadoC = operaciones.trasladar(puntoInicialC, vectorTraslacion, dimension);
		double[] puntoTransformadoD = operaciones.trasladar(puntoInicialD, vectorTraslacion, dimension);
		double[] puntoTransformadoE = operaciones.trasladar(puntoInicialE, vectorTraslacion, dimension);
		double[] puntoTransformadoF = operaciones.trasladar(puntoInicialF, vectorTraslacion, dimension);
		double[] puntoTransformadoG = operaciones.trasladar(puntoInicialG, vectorTraslacion, dimension);
		double[] puntoTransformadoH = operaciones.trasladar(puntoInicialH, vectorTraslacion, dimension);
		
		puntoTransformadoA = operaciones.transformarR3(puntoTransformadoA);
		puntoTransformadoB = operaciones.transformarR3(puntoTransformadoB);
		puntoTransformadoC = operaciones.transformarR3(puntoTransformadoC);
		puntoTransformadoD = operaciones.transformarR3(puntoTransformadoD);
		puntoTransformadoE = operaciones.transformarR3(puntoTransformadoE);
		puntoTransformadoF = operaciones.transformarR3(puntoTransformadoF);
		puntoTransformadoG = operaciones.transformarR3(puntoTransformadoG);
		puntoTransformadoH = operaciones.transformarR3(puntoTransformadoH);
		
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
		/////////////
		
		g2.drawLine(convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]), // e -> f
				convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]), // f -> g
				convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]), // g -> h
				convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]), // h -> e
				convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]));
		
		
		
		g2.drawLine(convertirPuntoX(puntoTransformadoA[0]), convertirPuntoY(puntoTransformadoA[1]), // a -> f 
				convertirPuntoX(puntoTransformadoF[0]), convertirPuntoY(puntoTransformadoF[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoB[0]), convertirPuntoY(puntoTransformadoB[1]), // b -> g
				convertirPuntoX(puntoTransformadoG[0]), convertirPuntoY(puntoTransformadoG[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoC[0]), convertirPuntoY(puntoTransformadoC[1]), // c -> h
				convertirPuntoX(puntoTransformadoH[0]), convertirPuntoY(puntoTransformadoH[1]));
		
		g2.drawLine(convertirPuntoX(puntoTransformadoD[0]), convertirPuntoY(puntoTransformadoD[1]), // d -> e
				convertirPuntoX(puntoTransformadoE[0]), convertirPuntoY(puntoTransformadoE[1]));
		
		
		
		
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
