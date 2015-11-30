package encriptacion;

public class PolybiusImpl implements Polybius {

	private String[][] tablero = {
			{"", "A", "B", "C", "D", "E", "F"},
			{"A", "A", "B", "C", "D", "E", "F"},
			{"B", "G", "H", "I", "J", "K", "L"},
			{"C", "M", "N", "Ñ", "O", "P", "Q"},
			{"D", "R", "S", "T", "U", "V", "W"},
			{"E", "X", "Y", "Z", " ", ".", "-"}
	};

	@Override
	public String toPolybius(String s) {
		String cadena = s.toUpperCase();
		String resultado = "";
		for (int i = 0; i < s.length(); i++)
			resultado += getPair(cadena.charAt(i));
		return resultado;
	}

	private String getPair(char ch) {
		boolean encontrado = false;
		String pareja = "";
		String c = "";
		c = "" + ch;
		int i = 1;
		while (! encontrado && i < tablero.length) {
			int j = 1;
			while (! encontrado && j < tablero[i].length) {
				if ( tablero[i][j].equals(c) ) {
					pareja += tablero[i][0] + "" + tablero[0][j];
					encontrado = true;
				} else {
					j++;
				}
			}
			i++;
		}
		return pareja;
	}

	@Override
	public String desPolybius(String s) {
		String resultado = "";
		for (int i = 0; i < s.length() - 1; i = i + 2) {
			resultado += this.getChar(s.charAt(i), s.charAt(i + 1));
		}
		return resultado;
	}

	private String getChar(char a, char b) {
		boolean encontrado = false;
		int fila = 0;
		int col = 0;
		int i = 0;
		while (! encontrado && i < tablero.length) {
			if (tablero[i][0].equals(a + "")) {
				encontrado = true;
				fila = i;
			}
				i++;
		}
		i = 0;
		encontrado = false;
		while (! encontrado && i < tablero[0].length) {
			if (tablero[0][i].equals(b + "")) {
				encontrado = true;
				col = i;
			}
				i++;
		}

		return tablero[fila][col];
	}


}
