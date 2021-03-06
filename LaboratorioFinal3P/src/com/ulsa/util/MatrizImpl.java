package com.ulsa.util;

public class MatrizImpl implements Matriz {

	@Override
	public double[] trasladar(double[] puntoInicial, double[] vectorTraslacion) {
		double[] resultado = {
				puntoInicial[0] + vectorTraslacion[0], 
				puntoInicial[1] + vectorTraslacion[1]
			};
		return resultado;
	}

	@Override
	public double[] escalar(double[] puntoInicial, int dimension, double k ) {
		double[] resultado = new double[dimension];
		if (dimension == 2) {
		for (int i = 0; i < resultado.length; i++) 
			resultado[i] = puntoInicial[i] * k;
		
			return resultado;
		} else if (dimension == 3) {
			for(int i = 0; i < resultado.length; i++)
				resultado[i] = puntoInicial[i] * k;
			
			return resultado;
		}
		return null;
	}

	@Override
	public double[] rotar(double[] puntoInicial, double angulo, int dimension) {
		
		double seno = Math.sin(MatrizImpl.toRadians(angulo));
		double coseno = Math.cos(MatrizImpl.toRadians(angulo));
		double[] resultado = {
				(puntoInicial[0] * coseno) + (puntoInicial[1] * (- seno)),
				(puntoInicial[0] * seno) + (puntoInicial[1] * coseno)
		};
		return resultado;
	}
	
	public static double toRadians(double grados) {
		return (grados * Math.PI) / 180;
	}
/*
	@Override
	public double[] transformar(double[] puntoInicial) {
		double[] resultado = {
				 - puntoInicial[0] + (puntoInicial[1]),
				 - puntoInicial[0] +  puntoInicial[2]
		};
		return resultado;
	}
	*/

	@Override
	public double[] transformarR3(double[] puntoInicial, double angulo) {
		double l = 2.0 / 3.0;
		double[] resultado = {
				puntoInicial[1] - l * puntoInicial[0] * Math.sin(Math.toRadians(angulo)), 
				puntoInicial[2] + l * puntoInicial[0] * Math.cos(Math.toRadians(angulo)) 
		};
		return resultado;
	}

	@Override
	public double[] transformarR3(double x, double y, double z, double angulo) {
		double[] punto = {x, y, z};
		return transformarR3(punto, angulo);
	}

	@Override
	public double[] transformarR3(double[] puntoInicial) {
		return transformarR3(puntoInicial, 135);
	}

	@Override
	public double[] trasladar(double[] puntoInicial, double[] vectorTraslacion, int dimension) {
		double x = puntoInicial[0];
		double y = puntoInicial[1];
		double z = puntoInicial[2];
		if (dimension == 3) {
			double[] resultado = {
				x + vectorTraslacion[0],
				y + vectorTraslacion[1], 
				z + vectorTraslacion[2]
			};
			return resultado;
		}
		return null;
	}

	@Override
	public double[] rotarR3(double[] puntoInicial, double angulo, String eje) {
		double a = Math.toRadians(angulo);
		double x = puntoInicial[0];
		double y = puntoInicial[1];
		double z = puntoInicial[2];
		if (eje.toUpperCase().equals("X")) {
			double[] resultado = {
					puntoInicial[0],
					puntoInicial[1] * Math.cos(a) + (puntoInicial[2] * Math.sin(a)),
					puntoInicial[1] * (- Math.sin(a)) + (puntoInicial[2] * Math.cos(a))
			};
			return resultado;
		} else if (eje.toUpperCase().equals("Y")) {
			double[] resultado = {
					puntoInicial[0] * Math.cos(a) + (puntoInicial[2] * Math.sin(a)),
					puntoInicial[1],
					puntoInicial[0] * (- Math.sin(a)) + (puntoInicial[2] * Math.cos(a))
					
			};
			return resultado;
		} else if (eje.toUpperCase().equals("Z")) {
			double[] resultado = {
					puntoInicial[0] * Math.cos(a) + (puntoInicial[1] * Math.sin(a)),
					puntoInicial[0] * (- Math.sin(a)) + (puntoInicial[1] * Math.cos(a)),
					puntoInicial[2]
			};
			return resultado;
		} 
		return null;
	}
	
	
}
