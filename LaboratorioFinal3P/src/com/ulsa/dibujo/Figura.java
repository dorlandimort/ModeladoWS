package com.ulsa.dibujo;
import java.util.LinkedList;
import java.util.List;


public class Figura {
	
	List<double[]> puntos = null;
	
	private int minX = 0;
	private int maxX = 0;
	private int minY = 0;
	private int maxY = 0;
	private int minZ = 0;
	private int maxZ = 0;
	
	private double[] ejeX = {300, 0, 0};
	private double[] ejeY = {0, 300, 0};
	private double[] ejeZ = {0, 0, 300};
	
	public Figura() {
		puntos = new LinkedList<>();
	}

	public List<double[]> getPuntos() {
		return puntos;
	}

	public void setPuntos(List<double[]> puntos) {
		this.puntos = puntos;
	}

	public int getMinX() {
		return minX;
	}

	public void setMinX(int minX) {
		this.minX = minX;
	}

	public int getMaxX() {
		return maxX;
	}

	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	public int getMinY() {
		return minY;
	}

	public void setMinY(int minY) {
		this.minY = minY;
	}

	public int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}

	public int getMinZ() {
		return minZ;
	}

	public void setMinZ(int minZ) {
		this.minZ = minZ;
	}

	public int getMaxZ() {
		return maxZ;
	}

	public void setMaxZ(int maxZ) {
		this.maxZ = maxZ;
	}

	public double[] getEjeX() {
		return ejeX;
	}

	public void setEjeX(double[] ejeX) {
		this.ejeX = ejeX;
	}

	public double[] getEjeY() {
		return ejeY;
	}

	public void setEjeY(double[] ejeY) {
		this.ejeY = ejeY;
	}

	public double[] getEjeZ() {
		return ejeZ;
	}

	public void setEjeZ(double[] ejeZ) {
		this.ejeZ = ejeZ;
	}
	
	
	
}
