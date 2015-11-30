package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dibujo.Figura;
import dibujo.Lienzo;
import dibujo.LienzoImpl;

public class PanelComandos extends JPanel {
	
	private JLabel lblRotar = null;
	private JLabel lblTrasladar = null;
	private JLabel lblEscalar = null;
	
	private JLabel lblRX = null;
	private JLabel lblRY = null;
	private JLabel lblRZ = null;
	
	private JLabel lblTX = null;
	private JLabel lblTY = null;
	private JLabel lblTZ = null;
	
	private JButton btnRXI = null;
	private JButton btnRYI = null;
	private JButton btnRZI = null;
	private JButton btnRXD = null;
	private JButton btnRYD = null;
	private JButton btnRZD = null;
	
	private JButton btnTXI = null;
	private JButton btnTYI = null;
	private JButton btnTZI = null;
	private JButton btnTXD = null;
	private JButton btnTYD = null;
	private JButton btnTZD = null;
	
	private JButton btnAcercar = null;
	private JButton btnAlejar = null;
	
	private ImageIcon izquierda = null;
	private ImageIcon derecha = null;
	private ImageIcon expandir = null;
	private ImageIcon colapsar = null;
	private ImageIcon menos = null;
	private ImageIcon mas = null;
	
	private Lienzo lienzo = null;
	private Ventana ventana = null;
	
	public PanelComandos(Ventana v) {
		this.setSize(v.getWidth() - 10, 110);
		this.setLayout(null);
		this.iniciarComponentes(v);
	}
	
	private void iniciarComponentes(Ventana v) {
		this.ventana = v;
		int alto = this.getHeight();
		int ancho = this.getWidth();
		
		this.lienzo = new LienzoImpl();
		
		this.izquierda = new ImageIcon("izquierda.png");
		this.derecha = new ImageIcon("derecha.png");
		this.expandir = new ImageIcon("expandir.png");
		this.colapsar = new ImageIcon("colapsar.png");
		this.mas = new ImageIcon("mas.png");
		this.menos = new ImageIcon("menos.png");
		
		this.lblRotar = new JLabel("Rotar");
		this.lblRotar.setBounds(120, alto - 100, 100, 20);
		this.add(lblRotar);
		
		this.lblTrasladar = new JLabel("Trasladar");
		this.lblTrasladar.setBounds((int) (ancho / 2 - 20), alto - 100, 100, 20);
		this.add(lblTrasladar);
		
		this.lblEscalar = new JLabel("Escalar");
		this.lblEscalar.setBounds((int) (ancho - 200), alto - 100, 100, 20);
		this.add(lblEscalar);
		
		this.lblRX = new JLabel("X:");
		this.lblRX.setBounds(10, alto - 65, 20, 20);
		this.add(lblRX);
		
		this.btnRXI = new JButton(this.izquierda);
		this.btnRXI.setBounds(30, alto - 70, 28, 28);
		this.btnRXI.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Figura fig = lienzo.rotarFigura(ventana.getFigura(), -10, "X");
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnRXI);
		
		this.btnRXD = new JButton(this.derecha);
		this.btnRXD.setBounds(60, alto - 70, 28, 28);
		this.btnRXD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Figura fig = lienzo.rotarFigura(ventana.getFigura(), 10, "X");
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnRXD);
		
		this.lblRY = new JLabel("Y:");
		this.lblRY.setBounds(95, alto - 65, 20, 20);
		this.add(lblRY);
		
		this.btnRYI = new JButton(this.izquierda);
		this.btnRYI.setBounds(115, alto - 70, 28, 28);
		this.btnRYI.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Figura fig = lienzo.rotarFigura(ventana.getFigura(), 10, "Y");
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnRYI);
		
		this.btnRYD = new JButton(this.derecha);
		this.btnRYD.setBounds(145, alto - 70, 28, 28);
		this.btnRYD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Figura fig = lienzo.rotarFigura(ventana.getFigura(), -10, "Y");
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnRYD);
		
		this.lblRZ = new JLabel("Z:");
		this.lblRZ.setBounds(180, alto - 65, 20, 20);
		this.add(lblRZ);
		
		this.btnRZI = new JButton(this.izquierda);
		this.btnRZI.setBounds(200, alto - 70, 28, 28);
		this.btnRZI.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Figura fig = lienzo.rotarFigura(ventana.getFigura(), -10, "Z");
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnRZI);
		
		this.btnRZD = new JButton(this.derecha);
		this.btnRZD.setBounds(230, alto - 70, 28, 28);
		this.btnRZD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Figura fig = lienzo.rotarFigura(ventana.getFigura(), 10, "Z");
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnRZD);
		
		
		this.lblTX = new JLabel("X:");
		this.lblTX.setBounds((int) (ancho/2 - 110), alto - 65, 20, 20);
		this.add(lblTX);
		
		this.btnTXI = new JButton(this.menos);
		this.btnTXI.setBounds((int) (ancho/2 - 90), alto - 70, 28, 28);
		this.btnTXI.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double[] vectorTraslacion = {-5, 0, 0};
				Figura fig = lienzo.trasladarFigura(ventana.getFigura(), vectorTraslacion);
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnTXI);
		
		this.btnTXD = new JButton(this.mas);
		this.btnTXD.setBounds((int) (ancho/2 - 60), alto - 70, 28, 28);
		this.btnTXD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double[] vectorTraslacion = {5, 0, 0};
				Figura fig = lienzo.trasladarFigura(ventana.getFigura(), vectorTraslacion);
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnTXD);
		
		this.lblTY = new JLabel("Y:");
		this.lblTY.setBounds((int) (ancho/2 - 25), alto - 65, 20, 20);
		this.add(lblTY);
		
		this.btnTYI = new JButton(this.menos);
		this.btnTYI.setBounds((int) (ancho/2 - 5), alto - 70, 28, 28);
		this.btnTYI.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double[] vectorTraslacion = {0, -5, 0};
				Figura fig = lienzo.trasladarFigura(ventana.getFigura(), vectorTraslacion);
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnTYI);
		
		this.btnTYD = new JButton(this.mas);
		this.btnTYD.setBounds((int) (ancho/2 + 25), alto - 70, 28, 28);
		this.btnTYD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double[] vectorTraslacion = {0, 5, 0};
				Figura fig = lienzo.trasladarFigura(ventana.getFigura(), vectorTraslacion);
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnTYD);
		
		this.lblTZ = new JLabel("Z:");
		this.lblTZ.setBounds((int) (ancho/2 + 60), alto - 65, 20, 20);
		this.add(lblTZ);
		
		this.btnTZI = new JButton(this.menos);
		this.btnTZI.setBounds((int) (ancho/2 + 80), alto - 70, 28, 28);
		this.btnTZI.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double[] vectorTraslacion = {0, 0, -5};
				Figura fig = lienzo.trasladarFigura(ventana.getFigura(), vectorTraslacion);
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnTZI);
		
		this.btnTZD = new JButton(this.mas);
		this.btnTZD.setBounds((int) (ancho/2 + 110), alto - 70, 28, 28);
		this.btnTZD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double[] vectorTraslacion = {0, 0, 5};
				Figura fig = lienzo.trasladarFigura(ventana.getFigura(), vectorTraslacion);
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnTZD);
		
		this.btnAcercar = new JButton(this.expandir);
		this.btnAcercar.setBounds(ancho - 205, alto - 70, 28, 28);
		this.btnAcercar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Figura fig = lienzo.escalarFigura(ventana.getFigura(), 1.2);
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnAcercar);
		
		this.btnAlejar = new JButton(this.colapsar);
		this.btnAlejar.setBounds(ancho - 175, alto - 70, 28, 28);
		this.btnAlejar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Figura fig = lienzo.escalarFigura(ventana.getFigura(), 0.8);
				ventana.dibujar(fig);
			}
			
		});
		this.add(btnAlejar);
	}

	public JLabel getLblRotar() {
		return lblRotar;
	}

	public void setLblRotar(JLabel lblRotar) {
		this.lblRotar = lblRotar;
	}

	public JLabel getLblTrasladar() {
		return lblTrasladar;
	}

	public void setLblTrasladar(JLabel lblTrasladar) {
		this.lblTrasladar = lblTrasladar;
	}

	public JLabel getLblEscalar() {
		return lblEscalar;
	}

	public void setLblEscalar(JLabel lblEscalar) {
		this.lblEscalar = lblEscalar;
	}

	public JLabel getLblRX() {
		return lblRX;
	}

	public void setLblRX(JLabel lblRX) {
		this.lblRX = lblRX;
	}

	public JLabel getLblRY() {
		return lblRY;
	}

	public void setLblRY(JLabel lblRY) {
		this.lblRY = lblRY;
	}

	public JLabel getLblRZ() {
		return lblRZ;
	}

	public void setLblRZ(JLabel lblRZ) {
		this.lblRZ = lblRZ;
	}

	public JLabel getLblTX() {
		return lblTX;
	}

	public void setLblTX(JLabel lblTX) {
		this.lblTX = lblTX;
	}

	public JLabel getLblTY() {
		return lblTY;
	}

	public void setLblTY(JLabel lblTY) {
		this.lblTY = lblTY;
	}

	public JLabel getLblTZ() {
		return lblTZ;
	}

	public void setLblTZ(JLabel lblTZ) {
		this.lblTZ = lblTZ;
	}

	public JButton getBtnRXI() {
		return btnRXI;
	}

	public void setBtnRXI(JButton btnRXI) {
		this.btnRXI = btnRXI;
	}

	public JButton getBtnRYI() {
		return btnRYI;
	}

	public void setBtnRYI(JButton btnRYI) {
		this.btnRYI = btnRYI;
	}

	public JButton getBtnRZI() {
		return btnRZI;
	}

	public void setBtnRZI(JButton btnRZI) {
		this.btnRZI = btnRZI;
	}

	public JButton getBtnRXD() {
		return btnRXD;
	}

	public void setBtnRXD(JButton btnRXD) {
		this.btnRXD = btnRXD;
	}

	public JButton getBtnRYD() {
		return btnRYD;
	}

	public void setBtnRYD(JButton btnRYD) {
		this.btnRYD = btnRYD;
	}

	public JButton getBtnRZD() {
		return btnRZD;
	}

	public void setBtnRZD(JButton btnRZD) {
		this.btnRZD = btnRZD;
	}

	public JButton getBtnTXI() {
		return btnTXI;
	}

	public void setBtnTXI(JButton btnTXI) {
		this.btnTXI = btnTXI;
	}

	public JButton getBtnTYI() {
		return btnTYI;
	}

	public void setBtnTYI(JButton btnTYI) {
		this.btnTYI = btnTYI;
	}

	public JButton getBtnTZI() {
		return btnTZI;
	}

	public void setBtnTZI(JButton btnTZI) {
		this.btnTZI = btnTZI;
	}

	public JButton getBtnTXD() {
		return btnTXD;
	}

	public void setBtnTXD(JButton btnTXD) {
		this.btnTXD = btnTXD;
	}

	public JButton getBtnTYD() {
		return btnTYD;
	}

	public void setBtnTYD(JButton btnTYD) {
		this.btnTYD = btnTYD;
	}

	public JButton getBtnTZD() {
		return btnTZD;
	}

	public void setBtnTZD(JButton btnTZD) {
		this.btnTZD = btnTZD;
	}

	public JButton getBtnAcercar() {
		return btnAcercar;
	}

	public void setBtnAcercar(JButton btnAcercar) {
		this.btnAcercar = btnAcercar;
	}

	public JButton getBtnAlejar() {
		return btnAlejar;
	}

	public void setBtnAlejar(JButton btnAlejar) {
		this.btnAlejar = btnAlejar;
	}

	public ImageIcon getIzquierda() {
		return izquierda;
	}

	public void setIzquierda(ImageIcon izquierda) {
		this.izquierda = izquierda;
	}

	public ImageIcon getDerecha() {
		return derecha;
	}

	public void setDerecha(ImageIcon derecha) {
		this.derecha = derecha;
	}

	public ImageIcon getExpandir() {
		return expandir;
	}

	public void setExpandir(ImageIcon expandir) {
		this.expandir = expandir;
	}

	public ImageIcon getColapsar() {
		return colapsar;
	}

	public void setColapsar(ImageIcon colapsar) {
		this.colapsar = colapsar;
	}

	public ImageIcon getMenos() {
		return menos;
	}

	public void setMenos(ImageIcon menos) {
		this.menos = menos;
	}

	public ImageIcon getMas() {
		return mas;
	}

	public void setMas(ImageIcon mas) {
		this.mas = mas;
	}

	public Lienzo getLienzo() {
		return lienzo;
	}

	public void setLienzo(Lienzo lienzo) {
		this.lienzo = lienzo;
	}

	public Ventana getVentana() {
		return ventana;
	}

	public void setVentana(Ventana ventana) {
		this.ventana = ventana;
	}	
}
