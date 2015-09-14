import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel1 extends JPanel {
	
	public Panel1() {
		JButton boton1 = new JButton("Verde");
		boton1.addActionListener(new Boton1Action(this));
		this.add(boton1);
		JButton boton2 = new JButton("Blanco");
		boton2.addActionListener(new Boton2Action(this));
		this.add(boton2);
		JButton boton3 = new JButton("Rojo");
		boton3.addActionListener(new Boton3Action(this));
		this.add(boton3);

	}
}

class Boton1Action implements ActionListener {
	private Panel1 ventana;

	public Boton1Action(Panel1 ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.ventana.setBackground(Color.GREEN);

	}

}

class Boton2Action implements ActionListener {
	private Panel1 ventana;

	public Boton2Action(Panel1 ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.ventana.setBackground(Color.WHITE);

	}

}

class Boton3Action implements ActionListener {
	private Panel1 ventana;

	public Boton3Action(Panel1 ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.ventana.setBackground(Color.RED);

	}

}
