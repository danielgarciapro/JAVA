package ejercicios;
/**
 * 
 * @author Daniel Garcia
 * @version 1.0
 *
 */
public class UtilidadesString {
	final public static String[] ARTICULOS_DETERMINADOS = {"el", "la", "los", "las"};
	final public static String[] ARTICULOS_INDETERMINADOS = {"un", "unos", "una", "unas"};
	final public static String[] PREPOSICIONES = {"a", "ante", "bajo", "cabe", "con", "contra", 
		"de", "desde", "durante", "en", "entre", "hacia", "hasta", "mediante", "para", "por",
		"según", "sin", "so", "sobre", "tras", "versus", "vía"};
	/**
	 * 
	 * @param frase String
	 * @return numero de palabras de la frase
	 */
	public static int numeroPalabras (String frase){
		String[] s1 = frase.split(" ");
		return s1.length;
	}
	/**
	 * 
	 * @param frase String
	 * @return numero de preposiciones
	 */
	public static int numeroPreposiciones (String frase){
		String[] s1 = frase.split(" ");
		int contadorPreposiciones=0;
		for (int i = 0; i < PREPOSICIONES.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (s1[j].equalsIgnoreCase(PREPOSICIONES[i])) contadorPreposiciones++;
			}
		}
		return contadorPreposiciones;
	}
	/**
	 * 
	 * @param frase String
	 * @return numero de articulos determinados
	 */
	public static int numeroArticulosDeterminados (String frase){
		String[] s1 = frase.split(" ");
		int contadorArticulosDeterminados=0;
		for (int i = 0; i < ARTICULOS_DETERMINADOS.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (s1[j].equalsIgnoreCase(ARTICULOS_DETERMINADOS[i])) contadorArticulosDeterminados++;
			}
		}
		return contadorArticulosDeterminados;
	}
	/**
	 * 
	 * @param frase String
	 * @return numero de articulos indeterminados
	 */
	public static int numeroArticulosIndeterminados (String frase){
		String[] s1 = frase.split(" ");
		int contadorArticulosIndeterminados=0;
		for (int i = 0; i < ARTICULOS_INDETERMINADOS.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (s1[j].equalsIgnoreCase(ARTICULOS_INDETERMINADOS[i])) contadorArticulosIndeterminados++;
			}
		}
		return contadorArticulosIndeterminados;
	}
	/**
	 * 
	 * @param comienzo int
	 * @param fin int
	 * @param frase String
	 * @return substring en mayuscula con los parametros indicados
	 */
	public static String devolverMayuscula (int comienzo, int fin, String frase){
		return frase.toUpperCase().substring(comienzo, fin);
	}
}
