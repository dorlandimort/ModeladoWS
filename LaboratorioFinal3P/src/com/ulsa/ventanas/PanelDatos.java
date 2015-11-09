package com.ulsa.ventanas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;
import javax.swing.JTextField;


public class PanelDatos extends JPanel {
	
	private Ventana ventana = null;
	private PanelDatos panel = null;
	private Border titulo = null;
	private JLabel lblEcuacion = null;
	private JTextField txtEcuacion = null;
	private JLabel txtEjeX = null;
	private JLabel txtEjeY = null;
	private JLabel txtEjeZ = null;
	private JLabel deX = null;
	private JLabel deY = null;
	private JLabel deZ = null;
	private JLabel hastaX = null;
	private JLabel hastaY = null;
	private JLabel hastaZ = null;
	private JSpinner numDeX = null;
	private JSpinner numDeY = null;
	private JSpinner numDeZ = null;
	private JSpinner numHastaX = null;
	private JSpinner numHastaY = null;
	private JSpinner numHastaZ = null;
	private JButton btnGraficar = null;
	private JSpinner spinner = null;
	private SpinnerNumberModel modeloDX = null;
	private SpinnerNumberModel modeloDY = null;
	private SpinnerNumberModel modeloDZ = null;
	private SpinnerNumberModel modeloHX = null;
	private SpinnerNumberModel modeloHY = null;
	private SpinnerNumberModel modeloHZ = null;
	
	
	public PanelDatos(Ventana v) {
		this.titulo = BorderFactory.createTitledBorder("Datos");
		this.setBorder(titulo);
		//350
		this.setSize(350, v.getHeight() * 92 / 100 - 10);
		this.setLayout(null);
		
		panel = this;
		this.ventana = v;
		
		this.lblEcuacion = new JLabel("Ecuación:");
		this.lblEcuacion.setBounds(50, 30, 100, 20);
		this.add(lblEcuacion);
		
		this.txtEcuacion = new JTextField();
		this.txtEcuacion.setBounds(30, 70, 300, 20);
		this.add(txtEcuacion);
		
		this.txtEjeX = new JLabel("Eje X");
		this.txtEjeX.setBounds(50, 110, 100, 20);
		this.add(txtEjeX);
		
		this.deX = new JLabel("De:");
		this.deX.setBounds(30, 150, 30, 20);
		this.add(deX);
		
		this.modeloDX = new SpinnerNumberModel(-10, -100, 100, 1);
		this.numDeX = new JSpinner(modeloDX);
		this.numDeX.setBounds(70, 150, 100, 20 );
		this.add(numDeX);
		
		this.hastaX = new JLabel("Hasta:");
		this.hastaX.setBounds(180, 150, 50, 20);
		this.add(hastaX);
		
		this.modeloDY = new SpinnerNumberModel(10, -100, 100, 1);
		this.numHastaX = new JSpinner(modeloDY);
		this.numHastaX.setBounds(240, 150, 100, 20);
		this.numHastaX.setValue(10);
		this.add(numHastaX);
	// Eje Y
		this.txtEjeY = new JLabel("Eje Y");
		this.txtEjeY.setBounds(50, 200, 100, 20);
		this.add(txtEjeY);
		
		this.deY = new JLabel("De:");
		this.deY.setBounds(30, 240, 30, 20);
		this.add(deY);
		
		this.modeloDY = new SpinnerNumberModel(-10, -100, 100, 1);
		this.numDeY = new JSpinner(modeloDY);
		this.numDeY.setBounds(70, 240, 100, 20 );
		this.add(numDeY);
		
		this.hastaY = new JLabel("Hasta:");
		this.hastaY.setBounds(180, 240, 50, 20);
		this.add(hastaY);
		
		this.modeloDY = new SpinnerNumberModel(10, -100, 100, 1);
		this.numHastaY = new JSpinner(modeloDY);
		this.numHastaY.setBounds(240, 240, 100, 20);
		this.numHastaY.setValue(10);
		this.add(numHastaY);
// Eje Z
		this.txtEjeZ = new JLabel("Eje Z");
		this.txtEjeZ.setBounds(50, 290, 100, 20);
		this.add(txtEjeZ);
		
		this.deZ = new JLabel("De:");
		this.deZ.setBounds(30, 330, 30, 20);
		this.add(deZ);
		
		this.modeloDZ = new SpinnerNumberModel(-10, -100, 100, 1);
		this.numDeZ = new JSpinner(modeloDZ);
		this.numDeZ.setBounds(70, 330, 100, 20 );
		this.add(numDeZ);
		
		this.hastaZ = new JLabel("Hasta:");
		this.hastaZ.setBounds(180, 330, 50, 20);
		this.add(hastaZ);
		
		this.modeloDZ = new SpinnerNumberModel(10, -100, 100, 1);
		this.numHastaZ = new JSpinner(modeloDZ);
		this.numHastaZ.setBounds(240, 330, 100, 20);
		this.numHastaZ.setValue(10);
		this.add(numHastaZ);
		
		this.btnGraficar = new JButton("Graficar");
		this.btnGraficar.setBounds(230, 400, 100, 20);
		this.btnGraficar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (! panel.txtEcuacion.getText().equals("")) {
					int minX = (int) panel.numDeX.getValue();
					int maxX = (int) panel.numHastaX.getValue();
					int minY = (int) panel.numDeY.getValue();
					int maxY = (int) panel.numHastaY.getValue();
					int minZ = (int) panel.numDeZ.getValue();
					int maxZ = (int) panel.numHastaZ.getValue();
					ventana.getpDibujo().dibujar(panel.txtEcuacion.getText(), minX, maxX, minY, maxY, minZ, maxZ);
				}
				
				
			}
			
		});
		this.add(btnGraficar);
	}

	public Border getTitulo() {
		return titulo;
	}

	public void setTitulo(Border titulo) {
		this.titulo = titulo;
	}

	public JLabel getTxtEjeX() {
		return txtEjeX;
	}

	public void setTxtEjeX(JLabel txtEjeX) {
		this.txtEjeX = txtEjeX;
	}

	public JLabel getTxtEjeY() {
		return txtEjeY;
	}

	public void setTxtEjeY(JLabel txtEjeY) {
		this.txtEjeY = txtEjeY;
	}

	public JLabel getTxtEjeZ() {
		return txtEjeZ;
	}

	public void setTxtEjeZ(JLabel txtEjeZ) {
		this.txtEjeZ = txtEjeZ;
	}

	public JLabel getDeX() {
		return deX;
	}

	public void setDeX(JLabel deX) {
		this.deX = deX;
	}

	public JLabel getDeY() {
		return deY;
	}

	public void setDeY(JLabel deY) {
		this.deY = deY;
	}

	public JLabel getDeZ() {
		return deZ;
	}

	public void setDeZ(JLabel deZ) {
		this.deZ = deZ;
	}

	public JLabel getHastaX() {
		return hastaX;
	}

	public void setHastaX(JLabel hastaX) {
		this.hastaX = hastaX;
	}

	public JLabel getHastaY() {
		return hastaY;
	}

	public void setHastaY(JLabel hastaY) {
		this.hastaY = hastaY;
	}

	public JLabel getHastaZ() {
		return hastaZ;
	}

	public void setHastaZ(JLabel hastaZ) {
		this.hastaZ = hastaZ;
	}

	public JButton getBtnGraficar() {
		return btnGraficar;
	}

	public void setBtnGraficar(JButton btnGraficar) {
		this.btnGraficar = btnGraficar;
	}

	public JSpinner getSpinner() {
		return spinner;
	}

	public void setSpinner(JSpinner spinner) {
		this.spinner = spinner;
	}

	public JSpinner getNumDeX() {
		return numDeX;
	}

	public void setNumDeX(JSpinner numDeX) {
		this.numDeX = numDeX;
	}

	public JSpinner getNumDeY() {
		return numDeY;
	}

	public void setNumDeY(JSpinner numDeY) {
		this.numDeY = numDeY;
	}

	public JSpinner getNumDeZ() {
		return numDeZ;
	}

	public void setNumDeZ(JSpinner numDeZ) {
		this.numDeZ = numDeZ;
	}

	public JSpinner getNumHastaX() {
		return numHastaX;
	}

	public void setNumHastaX(JSpinner numHastaX) {
		this.numHastaX = numHastaX;
	}

	public JSpinner getNumHastaY() {
		return numHastaY;
	}

	public void setNumHastaY(JSpinner numHastaY) {
		this.numHastaY = numHastaY;
	}

	public JSpinner getNumHastaZ() {
		return numHastaZ;
	}

	public void setNumHastaZ(JSpinner numHastaZ) {
		this.numHastaZ = numHastaZ;
	}

	public SpinnerNumberModel getModeloDX() {
		return modeloDX;
	}

	public void setModeloDX(SpinnerNumberModel modeloDX) {
		this.modeloDX = modeloDX;
	}

	public SpinnerNumberModel getModeloDY() {
		return modeloDY;
	}

	public void setModeloDY(SpinnerNumberModel modeloDY) {
		this.modeloDY = modeloDY;
	}

	public SpinnerNumberModel getModeloDZ() {
		return modeloDZ;
	}

	public void setModeloDZ(SpinnerNumberModel modeloDZ) {
		this.modeloDZ = modeloDZ;
	}

	public SpinnerNumberModel getModeloHX() {
		return modeloHX;
	}

	public void setModeloHX(SpinnerNumberModel modeloHX) {
		this.modeloHX = modeloHX;
	}

	public SpinnerNumberModel getModeloHY() {
		return modeloHY;
	}

	public void setModeloHY(SpinnerNumberModel modeloHY) {
		this.modeloHY = modeloHY;
	}

	public SpinnerNumberModel getModeloHZ() {
		return modeloHZ;
	}

	public void setModeloHZ(SpinnerNumberModel modeloHZ) {
		this.modeloHZ = modeloHZ;
	}

	public Ventana getVentana() {
		return ventana;
	}

	public void setVentana(Ventana ventana) {
		this.ventana = ventana;
	}

	public JLabel getLblEcuacion() {
		return lblEcuacion;
	}

	public void setLblEcuacion(JLabel lblEcuacion) {
		this.lblEcuacion = lblEcuacion;
	}

	public JTextField getTxtEcuacion() {
		return txtEcuacion;
	}

	public void setTxtEcuacion(JTextField txtEcuacion) {
		this.txtEcuacion = txtEcuacion;
	}
	
	
}
