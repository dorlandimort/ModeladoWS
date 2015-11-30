package dibujo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import util.Matriz;
import util.MatrizImpl;
import ventanas.PanelDibujo;

public class LienzoImpl implements Lienzo {
	
	private PanelDibujo ventana = null;
	private static int ESCALA = 10;

	@Override
	public Figura generarFigura(String ruta) {
		return this.leerDatos(ruta);
	}

	@Override
	public void dibujarFigura(Figura figura, PanelDibujo v) {
		this.ventana = v;
		Graphics2D g2 = (Graphics2D) v.getGraphics();
		 g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING, 
            RenderingHints.VALUE_ANTIALIAS_ON);
		v.paint(v.getGraphics());
		this.pintarPlano(figura.getEjeX(), figura.getEjeY(), figura.getEjeZ(), g2);
		g2.setColor(Color.GREEN);
		List<Cubo> listaCubos = figura.getCubos();
		
		for(Cubo c : listaCubos)
			this.dibujarCubo(c, g2);
		
		
	}
	
	@Override
	public Figura rotarFigura(Figura figura, double angulo, String eje) {
		Matriz m = new MatrizImpl();
		figura.setEjeX(m.rotarR3(figura.getEjeX(), angulo, eje));
		figura.setEjeY(m.rotarR3(figura.getEjeY(), angulo, eje));
		figura.setEjeZ(m.rotarR3(figura.getEjeZ(), angulo, eje));
		for(Cubo c : figura.getCubos()) {
			c.setV1(m.rotarR3(c.getV1(), angulo, eje));
			c.setV2(m.rotarR3(c.getV2(), angulo, eje));
			c.setV3(m.rotarR3(c.getV3(), angulo, eje));
			c.setV4(m.rotarR3(c.getV4(), angulo, eje));
			c.setV5(m.rotarR3(c.getV5(), angulo, eje));
			c.setV6(m.rotarR3(c.getV6(), angulo, eje));
			c.setV7(m.rotarR3(c.getV7(), angulo, eje));
			c.setV8(m.rotarR3(c.getV8(), angulo, eje));
		}
		return figura;
	}

	@Override
	public Figura escalarFigura(Figura figura, double k) {
		Matriz m = new MatrizImpl();
		int dimension = 3;
		for(Cubo c : figura.getCubos()) {
			c.setV1(m.escalar(c.getV1(), dimension, k));
			c.setV2(m.escalar(c.getV2(), dimension, k));
			c.setV3(m.escalar(c.getV3(), dimension, k));
			c.setV4(m.escalar(c.getV4(), dimension, k));
			c.setV5(m.escalar(c.getV5(), dimension, k));
			c.setV6(m.escalar(c.getV6(), dimension, k));
			c.setV7(m.escalar(c.getV7(), dimension, k));
			c.setV8(m.escalar(c.getV8(), dimension, k));
		}
		
		return figura;
	}

	@Override
	public Figura trasladarFigura(Figura figura, double[] vectorTraslacion) {
		Matriz m = new MatrizImpl();
		int dimension = 3;
		for(Cubo c : figura.getCubos()) {
			c.setV1(m.trasladar(c.getV1(), vectorTraslacion, dimension));
			c.setV2(m.trasladar(c.getV2(), vectorTraslacion, dimension));
			c.setV3(m.trasladar(c.getV3(), vectorTraslacion, dimension));
			c.setV4(m.trasladar(c.getV4(), vectorTraslacion, dimension));
			c.setV5(m.trasladar(c.getV5(), vectorTraslacion, dimension));
			c.setV6(m.trasladar(c.getV6(), vectorTraslacion, dimension));
			c.setV7(m.trasladar(c.getV7(), vectorTraslacion, dimension));
			c.setV8(m.trasladar(c.getV8(), vectorTraslacion, dimension));
		}
		return figura;
	}
	
	private void dibujarCubo(Cubo c, Graphics2D g2) {
		Matriz m = new MatrizImpl();
		int demora = 0;
		double[] v1 = m.transformarR3(c.getV1());
		double[] v2 = m.transformarR3(c.getV2());
		double[] v3 = m.transformarR3(c.getV3());
		double[] v4 = m.transformarR3(c.getV4());
		double[] v5 = m.transformarR3(c.getV5());
		double[] v6 = m.transformarR3(c.getV6());
		double[] v7 = m.transformarR3(c.getV7());
		double[] v8 = m.transformarR3(c.getV8());
		try {
		g2.drawLine(toX(v1[0]), toY(v1[1]), toX(v2[0]), toY(v2[1]));
		Thread.sleep(demora);
		g2.drawLine(toX(v2[0]), toY(v2[1]), toX(v3[0]), toY(v3[1]));
		Thread.sleep(demora);
		g2.drawLine(toX(v3[0]), toY(v3[1]), toX(v4[0]), toY(v4[1]));
		Thread.sleep(demora);
		g2.drawLine(toX(v4[0]), toY(v4[1]), toX(v1[0]), toY(v1[1]));
		Thread.sleep(demora);
		
		g2.drawLine(toX(v5[0]), toY(v5[1]), toX(v6[0]), toY(v6[1]));
		Thread.sleep(demora);
		g2.drawLine(toX(v6[0]), toY(v6[1]), toX(v7[0]), toY(v7[1]));
		Thread.sleep(demora);
		g2.drawLine(toX(v7[0]), toY(v7[1]), toX(v8[0]), toY(v8[1]));
		Thread.sleep(demora);
		g2.drawLine(toX(v8[0]), toY(v8[1]), toX(v5[0]), toY(v5[1]));
		Thread.sleep(demora);
		
		g2.drawLine(toX(v1[0]), toY(v1[1]), toX(v5[0]), toY(v5[1]));
		Thread.sleep(demora);
		g2.drawLine(toX(v2[0]), toY(v2[1]), toX(v6[0]), toY(v6[1]));
		Thread.sleep(demora);
		g2.drawLine(toX(v3[0]), toY(v3[1]), toX(v7[0]), toY(v7[1]));
		Thread.sleep(demora);
		g2.drawLine(toX(v4[0]), toY(v4[1]), toX(v8[0]), toY(v8[1]));
		Thread.sleep(demora);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void pintarPlano(double[] X, double[] Y, double[] Z, Graphics2D g2) {
		Matriz m = new MatrizImpl();
		double[] ejeX = m.transformarR3(X);
		double[] ejeY = m.transformarR3(Y);
		double[] ejeZ = m.transformarR3(Z);
		g2.setColor(Color.GRAY);
		g2.drawLine(toX(0), toY(0), toX(ejeX[0]), toY(ejeX[1]));
		g2.drawLine(toX(0), toY(0), toX(ejeY[0]), toY(ejeY[1]));
		g2.drawLine(toX(0), toY(0), toX(ejeZ[0]), toY(ejeZ[1]));
	}
	
	private Figura leerDatos(String ruta) {
		File f = new File(ruta);
		Scanner sc = null;
		Figura figura = new Figura();
		Cubo cubo = new Cubo();
		List<Cubo> listaCubos = new LinkedList<>();
		try {
			sc = new Scanner(f);
			String s = "";
			while(sc.hasNext()) {
				s = sc.nextLine();
				String[] strings = s.split(",");
				double[] puntosA = new double[strings.length];
				for (int i = 0; i < puntosA.length; i++) {
					puntosA[i] = Double.parseDouble(strings[i]);
				}
				cubo = new Cubo();
				double[] punto = new double[3];
				punto[0] = puntosA[0];
				punto[1] = puntosA[1];
				punto[2] = puntosA[2];
				cubo.setV1(punto);
				punto = new double[3];
				punto[0] = puntosA[3];
				punto[1] = puntosA[4];
				punto[2] = puntosA[5];
				cubo.setV2(punto);
				punto = new double[3];
				punto[0] = puntosA[6];
				punto[1] = puntosA[7];
				punto[2] = puntosA[8];
				cubo.setV3(punto);
				punto = new double[3];
				punto[0] = puntosA[9];
				punto[1] = puntosA[10];
				punto[2] = puntosA[11];
				cubo.setV4(punto);
				
				if (sc.hasNext()) {
					s = sc.nextLine();
					strings = s.split(",");
					double[] puntosB = new double[strings.length];
					for (int i = 0; i < puntosB.length; i++)
						puntosB[i] = Double.parseDouble(strings[i]);
					punto = new double[3];
					punto[0] = puntosB[0];
					punto[1] = puntosB[1];
					punto[2] = puntosB[2];
					cubo.setV5(punto);
					punto = new double[3];
					punto[0] = puntosB[3];
					punto[1] = puntosB[4];
					punto[2] = puntosB[5];
					cubo.setV6(punto);
					punto = new double[3];
					punto[0] = puntosB[6];
					punto[1] = puntosB[7];
					punto[2] = puntosB[8];
					cubo.setV7(punto);
					punto = new double[3];
					punto[0] = puntosB[9];
					punto[1] = puntosB[10];
					punto[2] = puntosB[11];
					cubo.setV8(punto);
				}
				listaCubos.add(cubo);
			}
			figura.setCubos(listaCubos);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		sc.close();
		return figura;
	}
	
	private int toX(double x) {
		double centro = this.ventana.getWidth() / 2;
		return (int) (centro + x * ESCALA);
	}
	
	private int toY(double y) {
		double centro = this.ventana.getHeight() / 2;
		return (int) (centro - y *  ESCALA);
	}

}
