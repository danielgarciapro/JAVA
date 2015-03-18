package ejercicios;

public class ClaveSegura {
	private String clave;
	
	public ClaveSegura(String clave) {
		this.clave = clave;
	}
	public boolean requisitos(){ //con static puedo trabajar con la clase 
		//boolean aux = false;					//Auxiliar sin crear objetos Auxiliar
		//comprobar que tenga como minimo 8 caracteres
		//comprobar si tiene letra mayuscula
		//comprobar si tiene letra minuscula
		//comprobar si tiene numero
		//comprobar si tiene alfanumerico
		return  minimoLongitud() && tieneLetraMayuscula() && tieneLetraMinuscula()
				&& tieneDigito() && tieneDigitoOLetra(); //manera mas optima
		
		/*aux = minimoLongitudOcho(s) && tieneLetraMayuscula(s) && tieneLetraMinuscula(s)
				&& tieneDigito(s) && tieneDigitoOLetra(s);*/
		//return aux;
	}
	private boolean minimoLongitud(){
		return clave.length() > 30;
	}
	private boolean tieneLetraMayuscula(){
		boolean aux = false;
		for (int i = 0; i < clave.length(); i++) {
			if (Character.isUpperCase(clave.charAt(i))){
				aux = true;
				break;//no merece la pena seguir buscando mayusculas
			}
		}
		return aux;
	}
	private boolean tieneLetraMinuscula(){
		boolean aux = false;
		for (int i = 0; i < clave.length(); i++) {
			if (Character.isLowerCase(clave.charAt(i))){
				aux = true;
				break;//no merece la pena seguir buscando mayusculas
			}
		}
		return aux;
	}
	private boolean tieneDigito(){
		boolean aux = false;
		for (int i = 0; i < clave.length(); i++) {
			if (Character.isDigit(clave.charAt(i))){
				aux = true;
				break;//no merece la pena seguir buscando mayusculas
			}
		}
		return aux;
	}
	private boolean tieneDigitoOLetra(){
		boolean aux = false;
		for (int i = 0; i < clave.length(); i++) {
			if (!Character.isLetterOrDigit(clave.charAt(i))){
				aux = true;
				break;//no merece la pena seguir buscando mayusculas
			}
		}
		return aux;
	}
	/* usado para pruebas
	public static void main(String[] args) {
		System.out.println(requisitos("Hol%ahola1"));
	}*/
}
