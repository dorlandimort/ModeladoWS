import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.border.Border;


public class Ventana extends JFrame {
	
	int i = 0;
	JButton boton = null;
	JButton boton2 = null;
	JButton modal = null;
	JButton arriba = null;
	JButton abajo = null;
	JButton derecha = null;
	JButton izquierda = null;
	JButton rotarIzquierda = null;
	JButton rotarDerecha = null;
	JButton acercar = null;
	JButton alejar = null;
	Ventana v = this;
	Panel p = null;
	int exito = 0;
	LinkedList<Punto> puntos = new LinkedList<>();
	
	LinkedList<double[]> lista = new LinkedList<>();
	
	
	
	public Ventana() {
		super("Dibujar");
		Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/f.jpg"));
		this.setIconImage(icon);
		boton = new JButton("Cuadro");
		boton.setBounds(100, 100, 200, 20);
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = p.getGraphics();
				//p.paintComponent(g);
				p.repintar(g);
				g.drawRect(20, 20, 100, 100);
				
			}
			
		});
		this.add(boton);
		
		boton2 = new JButton("Linea");
		boton2.setBounds(100, 130, 200,20);
		boton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Graphics g = p.getGraphics();
				//p.paintComponent(g);
				p.repintar(g);
				g.drawRect(30, 30, 100, 100);
				
			}
			
		});
		this.add(boton2);
		
		modal = new JButton("Aceptar");
		modal.setBounds(100, 160, 200, 20);
		modal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Dialogo d = new Dialogo(v, true, 3);
				if (v.exito == 1) {
					System.out.println("Exito");
					Graphics g = p.getGraphics();
					//p.paintComponent(g);
					p.repintar(g);
					v.pintar(g);
				}
				else
					System.out.println("No Exito");
				
			}
			
		});
		this.add(modal);
		
		arriba = new JButton("Arriba");
		arriba.setBounds(100, 190, 200, 20);
		arriba.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = p.getGraphics();
				//p.paintComponent(g);
				p.repintar(g);
				double[] vT = {0, 1};
				moverFigura(g, vT);
				v.pintar(g);
			}
			
		});
		this.add(arriba);
		
		abajo = new JButton("Abajo");
		abajo.setBounds(100, 220, 200, 20);
		abajo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = p.getGraphics();
				//p.paintComponent(g);
				p.repintar(g);
				double[] vT = {0, -1};
				moverFigura(g, vT);
				v.pintar(g);
			}
			
		});
		this.add(abajo);
		
		derecha = new JButton("Derecha");
		derecha.setBounds(100, 260, 200, 20);
		derecha.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = p.getGraphics();
				//p.paintComponent(g);
				p.repintar(g);
				/*double[] vT = {1, 0};
				moverFigura(g, vT);
				v.pintar(g);
				*/
				v.dibujarFractal(g, p.getWidth() / 2, p.getHeight(), -90, 14);
			}
			
		});
		this.add(derecha);
		
		izquierda = new JButton("Izquierda");
		izquierda.setBounds(100, 300, 200, 20);
		izquierda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = p.getGraphics();
				//p.paintComponent(g);
				p.repintar(g);
				double[] vT = {-1, 0};
				moverFigura(g, vT);
				v.getCentro();
				v.pintar(g);
			}
			
		});
		this.add(izquierda);
		
		rotarIzquierda = new JButton("rotarIzquierda");
		rotarIzquierda.setBounds(100, 330, 200, 20);
		rotarIzquierda.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = p.getGraphics();
				//p.paintComponent(g);
				p.repintar(g);
				double angulo = 9;
				v.rotarFigura(g, angulo, 2);
				v.getCentro();
				v.pintar(g);
			}
			
		});
		this.add(rotarIzquierda);
		
		rotarDerecha = new JButton("rotarDerecha");
		rotarDerecha.setBounds(100, 360, 200, 20);
		rotarDerecha.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = p.getGraphics();
				//p.paintComponent(g);
				p.repintar(g);
				double angulo = -9;
				v.rotarFigura(g, angulo, 2);
				v.getCentro();
				v.pintar(g);
			}
			
		});
		this.add(rotarDerecha);
		
		acercar = new JButton("acercar");
		acercar.setBounds(100, 390, 200, 20);
		acercar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = p.getGraphics();
				//p.paintComponent(g);
				p.repintar(g);
				double k = 1.1;
				v.escalarFigura(g, k, 2);
				v.getCentro();
				v.pintar(g);
			}
			
		});
		this.add(acercar);
		
		alejar = new JButton("alejar");
		alejar.setBounds(100, 420, 200, 20);
		alejar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = p.getGraphics();
				//p.paintComponent(g);
				p.repintar(g);
				double k = 0.9;
				v.escalarFigura(g, k, 2);
				v.getCentro();
				v.pintar(g);
			}
			
		});
		this.add(alejar);
		
		p = new Panel(this);
		p.setSize(550, 450);
		p.setLayout(null);
		p.setVisible(true);
		p.setLocation(400, 50);
		this.add(p);
		System.out.println(v.i);
	}
	
	public void pintar(Graphics g) {
		for(Punto p : puntos) {
			g.drawLine(toX(p.getX()), toY(p.getY()), toX(p.getPuntoAdy().getX()), toY(p.getPuntoAdy().getY()));
		}
	}
	
	private void moverFigura(Graphics g, double[] vTraslacion) {
		Matriz m = new MatrizImpl();
		double[] nP = null;
		for(Punto p : puntos) {
			double[] puntoInicial = {p.getX(), p.getY()};
			nP = m.trasladar(puntoInicial, vTraslacion);
			p.setX(nP[0]);
			p.setY(nP[1]);
		}
		
	}
	
	private void rotarFigura(Graphics g, double angulo, int dimension) {
		double[] centro = this.getCentro();
		double[] vT = {-centro[0], -centro[1]};
		this.moverFigura(g, vT);
		Matriz m = new MatrizImpl();
		double[] nP = null;
		for(Punto p : puntos) {
			double[] puntoInicial = {p.getX(), p.getY()};
			nP = m.rotar(puntoInicial, angulo, dimension);
			p.setX(nP[0]);
			p.setY(nP[1]);
		}
		vT[0] = centro[0];
		vT[1] = centro[1];
		this.moverFigura(g, vT);
		
	}
	
	private void escalarFigura(Graphics g, double k, int dimension) {
		double[] centro = this.getCentro();
		double[] vT = {-centro[0], -centro[1]};
		this.moverFigura(g, vT);
		Matriz m = new MatrizImpl();
		double[] nP = null;
		for(Punto p : puntos) {
			double[] puntoInicial = {p.getX(), p.getY()};
			nP = m.escalar(puntoInicial, dimension, k);
			p.setX(nP[0]);
			p.setY(nP[1]);
		}
		vT[0] = centro[0];
		vT[1] = centro[1];
		this.moverFigura(g, vT);
	}
	
	private double[] getCentro() {
		double mayor = puntos.get(0).getX();
		double menor = puntos.get(0).getX();
		double[] centro = new double[2];
		for(Punto p : puntos) {
			if (p.getX() >= mayor)
				mayor = p.getX();
			if (p.getX() < menor)
				menor = p.getX();
		}
		centro[0] = menor + ((mayor - menor) / 2);
		
		mayor = puntos.get(0).getY();
		menor = puntos.get(0).getY();
		for(Punto p : puntos) {
			if (p.getY() >= mayor)
				mayor = p.getY();
			if (p.getY() < menor)
				menor = p.getY();
		}
		centro[1] = menor + ((mayor - menor) / 2);
		
		System.out.println("x: " + centro[0] + " y: " + centro[1]);
		
		return centro;
	}
	
	private int toX(double n) {
		double centro = p.getWidth() / 2;
		return (int) (centro + n * 10);
	}
	
	private int toY(double n) {
		double centro = p.getHeight() / 2;
		return (int) (centro - n * 10);
	}
	
	
	public void dibujarFractal(Graphics g, int x1, int y1, double angulo, int profundidad) {
		if (profundidad == 0) 
			return;
		
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        
        // Para que se vean más claras y nítidas las líneas
        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON);             
        
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angulo)) * profundidad * 20);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angulo)) * profundidad * 20);
        
        g2.drawLine(x1, y1, x2, y2);
        try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        dibujarFractal(g2, x2, y2, angulo - 30, profundidad - 1);
        dibujarFractal(g2, x2, y2, angulo + 30, profundidad - 1);
        dibujarFractal(g2, x2, y2, angulo - 60, profundidad - 1);
        dibujarFractal(g2, x2, y2, angulo + 60, profundidad - 1);
        dibujarFractal(g2, x2, y2, angulo - 90, profundidad - 1);
        dibujarFractal(g2, x2, y2, angulo + 90, profundidad - 1);
        dibujarFractal(g2, x2, y2, angulo - 120, profundidad - 1);
        dibujarFractal(g2, x2, y2, angulo + 120, profundidad - 1);
	}
	
}
