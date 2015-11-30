import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class Dialogo extends JDialog {
	Ventana v = null;
	JButton aceptar = null;
	JButton cancelar = null;
	LinkedList<Punto> puntos = new LinkedList<>();
	LinkedList<Componentes> componentes = new LinkedList<>();
	Dialogo d = this;
	PanelEdicion panel = null;
	
	
	public Dialogo(Ventana v, boolean modal, int n) {
		super(v, modal);
		this.v = v;
		this.setSize(620, 420);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setLayout(null);
		
		this.panel = new PanelEdicion(n);
		this.panel.setLayout(null);
		
		for (int i = 0; i < n; i++) {
			puntos.add(new Punto("Nodo " + (i + 1)));
		}
		
		for (int i = 0; i < n; i++) {
			JLabel nodo = new JLabel(puntos.get(i).getNombre());
				nodo.setBounds(20, (i * 30 + 30), 100, 20);
			JLabel eX = new JLabel("X:");
				eX.setBounds(130, (i * 30 + 30), 40, 20);
				panel.add(eX);
			JTextField x = new JTextField();
				x.setBounds(180, (i * 30 + 30), 100, 20);
				JLabel eY = new JLabel("Y:");
				eY.setBounds(290, (i * 30 + 30), 40, 20);
				panel.add(eY);
			JTextField y = new JTextField();
				y.setBounds(340, (i * 30 + 30), 100, 20);
			JComboBox<String> combo = new JComboBox<>();
				combo.setBounds(450, (i * 30 + 30), 100, 20);
				
			
					for(Punto p : puntos) {
						combo.addItem(p.getNombre());
					}
				
				Componentes c = new Componentes();
				c.setNombre(nodo);
				c.setX(x);
				c.setY(y);
				c.setPar(combo);
				componentes.add(c);
				this.agregarComponentes(c, panel);
				
			
		}
		
		aceptar = new JButton("Aceptar");
		aceptar.setBounds(300, 340, 100, 20);
		aceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean campoVacio = false;
				for(int i = 0; i < puntos.size(); i++) {
					if ( (componentes.get(i).getX().getText().equals("")) || 
							(componentes.get(i).getY().getText().equals(""))) 
						campoVacio = true;
				}
				if (campoVacio)
					JOptionPane.showMessageDialog(d, "Por favor llena todos los campos");
				else {
				
					v.exito = 1;
					
					int indice = 0;
					Punto pAdy = null;
					int x = 0;
					int y = 0;
					for(int i = 0; i < puntos.size(); i++) {
						indice = componentes.get(i).getPar().getSelectedIndex();
						pAdy = puntos.get(indice);
						x = Integer.parseInt(componentes.get(i).getX().getText());
						y = Integer.parseInt(componentes.get(i).getY().getText());
						System.out.println(x);
						puntos.get(i).setPuntoAdy(pAdy);
						puntos.get(i).setX(x);
						puntos.get(i).setY(y);
						x = y = 0;
					}
					
						v.puntos = d.puntos;
					
					d.dispose();
				}
			}
		});
		this.add(aceptar);
		
		this.cancelar = new JButton("Cancelar");
		cancelar.setBounds(420, 340, 100, 20);
		cancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				v.exito = 0;
				
				d.dispose();
				
			}
			
		});
		this.add(cancelar);
		
		JScrollPane scroll = new JScrollPane(panel);
		scroll.setBounds(10, 20, 590, 300);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.add(scroll);
		this.setVisible(true);
	}
	
	private void agregarComponentes(Componentes c, JPanel p) {
		p.add(c.getNombre());
		p.add(c.getX());
		p.add(c.getY());
		p.add(c.getPar());
	}
	
	
}
