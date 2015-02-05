package ejercicios;
/**
 * 
 * @author Daniel Garcia
 * @version 1.0
 *
 */
public class PalabraLeida {
	private String valor;
	
	/*public PalabraLeida(String s1) {
		this.valor=s1;
	}*/
	/**
	 * 
	 * @param s Le paso un String
	 * @return int numeroDeLetras
	 */
	public int numeroDeLetras(String s){
		int numeroDeLetras = s.length();
		return numeroDeLetras;
	}
	public boolean empiezaPorVocal(String s){
		return s.toLowerCase().matches("[aeiou].*");
	}
	public boolean acabaPorVocal(String s){
		return s.toLowerCase().matches(".*[aeiou]");
	}
	public int numeroDeVocales(String s){
		int numeroDeVocales=0;
		char[] arrayChar = s.toLowerCase().toCharArray();
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] == 'a' || arrayChar[i] == 'e' || arrayChar[i] == 'i' 
					|| arrayChar[i] == 'o' ||arrayChar[i] == 'u') numeroDeVocales++;
		}
		return numeroDeVocales;
	}
	public boolean contieneH(String s){
		boolean tieneH=false;
		char[] arrayChar = s.toUpperCase().toCharArray();
		for (int i = 0; i < arrayChar.length; i++) {
			if (arrayChar[i] == 'H') {
				tieneH=true;
			}
		}
		return tieneH;
	}
	public boolean esUnPalindromo(String s){
		String s1 = s.toUpperCase();
		StringBuilder sBuilder = new StringBuilder(s);
		String s2 = sBuilder.reverse().toString().toUpperCase();
		return s1.equals(s2);
	}
	public boolean sonIguales(String s, String[] args){
		if (s.equals(args[0])) return true;
		else return false;
	}
}