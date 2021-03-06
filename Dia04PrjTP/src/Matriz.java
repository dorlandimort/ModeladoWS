
public interface Matriz {
	
	public double[] trasladar(double[] puntoInicial, double[] vectorTraslacion);
	
	public double[] trasladar(double[] puntoInicial, double[] vectorTraslacion, int dimension);
	
	public double[] escalar(double[] puntoInicial, int dimension, double k);
	
	public double[] rotar(double[] puntoInicial, double angulo, int dimension);

	public double[] rotarR3(double[] puntoInicial, double angulo, String eje);
	
	public double[] transformarR3(double[] puntoInicial, double angulo);
	public double[] transformarR3(double[] puntoInicial);
	public double[] transformarR3(double x, double y, double z, double angulo);
	
	

}
