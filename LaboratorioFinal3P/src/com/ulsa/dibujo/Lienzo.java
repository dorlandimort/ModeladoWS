package com.ulsa.dibujo;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

import com.ulsa.util.Matriz;
import com.ulsa.util.MatrizImpl;
import com.ulsa.util.PostFija;


public class Lienzo {
	
	public static int ESCALA = 5;
	public static JPanel panel = null;
	private Matriz m = null;
	
	public Lienzo() {
		this.m = new MatrizImpl();
	}
	
	public Figura generarFigura(String ecuacion, int minX, int maxX, int minY, int maxY, int minZ, int maxZ) {
		Figura figura = new Figura();
		figura.setMinX(minX);
		figura.setMaxX(maxX);
		figura.setMinY(minY);
		figura.setMaxY(maxY);
		figura.setMinZ(minZ);
		figura.setMaxZ(maxZ);
		PostFija p = new PostFija();
		List<double[]> lista = new LinkedList<>();
		double z = 0.0;
		String e = p.convertir(ecuacion);
		int intervalo = (int) ((maxX - minX) / 0.3) + 1;
		int intervaloY = (int) ((maxY - minY) / 0.3) + 1;
		double mY = minY;
		double mX = minX;
		int diferencia = maxX - minX;
		// Ajustar la escala de acuerdo al numero de puntos de la figura
		if (diferencia > 20 && diferencia <= 59)
			ESCALA = 10;
		else if (diferencia > 60)
			ESCALA = 7;
		else if (diferencia <= 20)
			ESCALA = 15;
		for (double i = 0; i < intervalo; i++) {
			for (double j = 0; j < intervaloY; j++) {
				// calcular z
				z = p.resultado(mX, mY, e);
				// verificar que z está en el rango definido
				if ( z <= maxZ && z >= minZ ) {
					// crear y agregar el punto a la lista de puntos
					double[] punto = {mX, mY, z};
					lista.add(punto);
				
				}
				// si z está fuera del rango se agrega un punto nulo
				else
					lista.add(null);
				mY = mY + 0.3;
			}
			mY = minY;
			mX = mX + 0.3;
		}
		figura.setPuntos(lista);
		return figura;
	}
	
	public void dibujarFigura(JPanel p, Figura figura) {
		panel = p;
		panel.paint(panel.getGraphics());
		Graphics2D g2 = (Graphics2D) panel.getGraphics();
		int intervalo = (int) ((figura.getMaxX() - figura.getMinX()) / 0.3) + 1;
		int intervaloY = (int) ((figura.getMaxY() - figura.getMinY()) / 0.3) + 1;
		double[][] puntosX = new double[intervalo][intervaloY];
		double[][] puntosY = new double[intervalo][intervaloY];
		int cont = 0;
		List<double[]> lista = figura.getPuntos();
			for (int i = 0; i < intervalo; i++) {
				for (int j = 0; j < intervaloY; j++) {
					if (lista.get(cont) != null) {
						double[] punto = m.transformarR3(lista.get(cont));
						puntosX[i][j] = punto[0];
						puntosY[i][j] = punto[1];
					} else {
						puntosX[i][j] = 0.0;
						puntosY[i][j] = 0.0;
					}
					cont++;
				}
			}
		// Dibujar panel cartesiano
			double[] ejeX = this.m.transformarR3(figura.getEjeX());
			double[] ejeY = this.m.transformarR3(figura.getEjeY());
			double[] ejeZ = this.m.transformarR3(figura.getEjeZ());
			g2.drawLine(convertirPuntoX(0), convertirPuntoY(0),convertirPuntoX(ejeX[0]), convertirPuntoY(ejeX[1]));
			g2.drawLine(convertirPuntoX(0), convertirPuntoY(0),convertirPuntoX(ejeY[0]), convertirPuntoY(ejeY[1]));
			g2.drawLine(convertirPuntoX(0), convertirPuntoY(0),convertirPuntoX(ejeZ[0]), convertirPuntoY(ejeZ[1]));
			
			
		for (int i = 0; i < puntosX.length - 1; i++) {
			for (int j = 0; j < puntosX[i].length - 1; j++) {
				if ( puntosX[i][j] != 0.0 && puntosX[i][j + 1] != 0.0) {
					g2.setColor(Color.BLUE);
					g2.drawLine(convertirPuntoX(puntosX[i][j]), convertirPuntoY(puntosY[i][j]),
							convertirPuntoX(puntosX[i][j + 1]), convertirPuntoY(puntosY[i][j + 1]));
				}
				if (puntosX[i][j] != 0.0 && puntosX[i + 1][j] != 0.0) {
					g2.setColor(Color.GREEN);
					g2.drawLine(convertirPuntoX(puntosX[i][j]), convertirPuntoY(puntosY[i][j]),
							convertirPuntoX(puntosX[i + 1][j]), convertirPuntoY(puntosY[i + 1][j]));
				}
			}
		}
	}
	
	public Figura rotarFigura(Figura figura, double angulo, String eje) {
		List<double[]> puntos = new LinkedList<>();
		for (int i = 0; i < figura.getPuntos().size(); i++) {
			if (figura.getPuntos().get(i) != null) {
				puntos.add(this.m.rotarR3(figura.getPuntos().get(i), angulo, eje));
			} else
				puntos.add(null);
		}
		double[] ejeX = this.m.rotarR3(figura.getEjeX(), angulo, eje);
		double[] ejeY = this.m.rotarR3(figura.getEjeY(), angulo, eje);
		double[] ejeZ = this.m.rotarR3(figura.getEjeZ(), angulo, eje);
		figura.setEjeX(ejeX);
		figura.setEjeY(ejeY);
		figura.setEjeZ(ejeZ);
		figura.setPuntos(puntos);
		return figura;
	}
	
	
	private int convertirPuntoX(double x) {
		double centro = panel.getWidth() / 2.0;
		return (int) (centro + x * ESCALA);
	}

	private int convertirPuntoY(double y) {
		
		double centro = panel.getHeight() / 2.0;
		return (int) (centro - y * ESCALA);
	}
}
