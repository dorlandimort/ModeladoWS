package dibujo;

import java.util.List;

public class Figura {
	
	private List<Cubo> cubos;
	
	private double[] ejeX = {300, 0, 0};
	private double[] ejeY = {0, 300, 0};
	private double[] ejeZ = {0, 0, 300};

	public List<Cubo> getCubos() {
		return cubos;
	}

	public void setCubos(List<Cubo> cubos) {
		this.cubos = cubos;
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
