package ejercicios;

public class UtilidadesString {
	final public static String[] ARTICULOS_DETERMINADOS = {"el", "la", "los", "las"};
	final public static String[] ARTICULOS_INDETERMINADOS = {"un", "unos", "una", "unas"};
	final public static String[] PREPOSICIONES = {"a", "ante", "bajo", "cabe", "con", "contra", 
		"de", "desde", "durante", "en", "entre", "hacia", "hasta", "mediante", "para", "por",
		"según", "sin", "so", "sobre", "tras", "versus", "vía"};
	
	public int numeroPalabras (String frase){
		String[] s1 = frase.split(" ");
		return s1.length;
	}
	public int numeroPreposiciones (String frase){
		String[] s1 = frase.split(" ");
		int contadorPreposiciones=0;
		for (int i = 0; i < PREPOSICIONES.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (s1[j].equalsIgnoreCase(PREPOSICIONES[i])) contadorPreposiciones++;
			}
		}
		return contadorPreposiciones;
	}
	public int numeroArticulosDeterminados (String frase){
		String[] s1 = frase.split(" ");
		int contadorArticulosDeterminados=0;
		for (int i = 0; i < ARTICULOS_DETERMINADOS.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (s1[j].equalsIgnoreCase(ARTICULOS_DETERMINADOS[i])) contadorArticulosDeterminados++;
			}
		}
		return contadorArticulosDeterminados;
	}
	public int numeroArticulosIndeterminados (String frase){
		String[] s1 = frase.split(" ");
		int contadorArticulosIndeterminados=0;
		for (int i = 0; i < ARTICULOS_INDETERMINADOS.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (s1[j].equalsIgnoreCase(ARTICULOS_INDETERMINADOS[i])) contadorArticulosIndeterminados++;
			}
		}
		return contadorArticulosIndeterminados;
	}
	public String devolverMayuscula (int comienzo, int fin, String frase){
		return frase.toUpperCase().substring(comienzo, fin);
	}
}
