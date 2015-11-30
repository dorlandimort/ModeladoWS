
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
	
}
