package ejercicios;

public class TestConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Binario b = new Binario("101");
			System.out.println("Valor decimal: "+b.getValorDecimal());
			Hexadecimal h = new Hexadecimal("101");
			System.out.println("Valor Hexadecimal: "+h.getValorHexadecimal());
			
		} catch (BinarioMalFormadoExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println("No es un numero Decimal");
			e.printStackTrace();
		}
		catch (HexadecimalMalFormadoException e) {
			// TODO Auto-generated catch block
			System.out.println("No es un numero Hexadecimal");
			e.printStackTrace();
		}
	}

}
@SuppressWarnings("serial")
class BinarioMalFormadoExcepcion extends Exception{
}
@SuppressWarnings("serial")
class HexadecimalMalFormadoException extends Exception{
}


class Binario {
	private String valor;

	public Binario(String valor) throws BinarioMalFormadoExcepcion {
		if (esBinario(valor)) this.valor = valor;
		else throw new BinarioMalFormadoExcepcion();
	}
	private boolean esBinario(String valor){
		return valor.matches("[01]+"); //+ uno o muchos
	}
	public int getValorDecimal(){
		int suma=0;
		StringBuilder sBuilder = new StringBuilder(this.valor);
		String vuelta = sBuilder.reverse().toString();
		
		for (int i = 0; i < vuelta.length(); i++) {
			//charAt devuelve un char, despues character.tostring lo convierte a string
			//finalmente interger.parseInt lo convierte a Int
			//suma += Integer.parseInt(Character.toString(vuelta.charAt(i))) * Math.pow(2, i);
			if (vuelta.charAt(i)=='1') suma += Math.pow(2, i);
		}
		
		return suma;
	}
	
}

class Hexadecimal {
	private String valor;

	/**
	 * @param valor
	 * @throws HexadecimalMalFormadoException 
	 */
	public Hexadecimal(String valor) throws HexadecimalMalFormadoException {
		if (esHexadecimal(valor)) this.valor = valor;
		else throw new HexadecimalMalFormadoException();
	}
	public int getValorHexadecimal(){
		int suma=0;
		StringBuilder sBuilder = new StringBuilder(this.valor.toLowerCase());
		String vuelta = sBuilder.reverse().toString();
		
		for (int i = 0; i < vuelta.length(); i++) {
			char aux = vuelta.charAt(i);
			
			switch (aux) {
			case 'a':
				suma += 10 * Math.pow(16, i);
				break;
			case 'b':
				suma += 11 * Math.pow(16, i);
				break;
			case 'c':
				suma += 12 * Math.pow(16, i);
				break;
			case 'd':
				suma += 13 * Math.pow(16, i);
				break;
			case 'e':
				suma += 14 * Math.pow(16, i);
				break;
			case 'f':
				suma += 15 * Math.pow(16, i);
				break;
			default:
				suma += Integer.parseInt(Character.toString(aux)) * Math.pow(16, i);
				break;
			}		
		}
		return suma;
		
	}
	private boolean esHexadecimal (String valor){
		return valor.matches("[0-9a-fA-F]+");
	}
}