
public class MatrizImpl implements Matriz {

	@Override
	public double[] trasladar(double[] puntoInicial, double[] vectorTraslacion) {
		double[] resultado = {
				puntoInicial[0] + vectorTraslacion[0], 
				puntoInicial[1] + vectorTraslacion[1], 
				puntoInicial[2] + vectorTraslacion[2], 
				puntoInicial[3] + vectorTraslacion[3]
			};
		return resultado;
	}

	@Override
	public double[] escalar(double[] puntoInicial, int dimension, double k ) {
		double[] resultado = new double[dimension];
		for (int i = 0; i < resultado.length; i++) 
			resultado[i] = puntoInicial[i] * k;
		
		return resultado;
	}

	@Override
	public double[] rotar(double[] puntoInicial, double angulo, int dimension) {
		double seno = Math.sin(Math.toRadians(angulo));
		double coseno = Math.cos(Math.toRadians(angulo));
		double[] resultado = {
				(puntoInicial[0] * coseno) + (puntoInicial[1] * (- seno)),
				(puntoInicial[0] * seno) + (puntoInicial[1] * coseno)
		};
		return null;
	}
	
	
	
}
