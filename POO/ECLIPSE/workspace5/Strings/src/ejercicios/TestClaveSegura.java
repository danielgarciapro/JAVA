package ejercicios;

public class TestClaveSegura {

	public static void main(String[] args) {
		final String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStT"
				+ "uUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&{}";
		StringBuilder SBuilder = new StringBuilder();
		
		while (true){ //cuando la clave sea segura salimos del bucle
			int longitud = (int) (Math.random()*FUENTE_CARACTERES.length());
			for (int i = 0; i < longitud; i++) { //vamos uniendo al sBuilder los caracteres
				int aleatorio= (int) (Math.random()*FUENTE_CARACTERES.length());
				 SBuilder.append(FUENTE_CARACTERES.charAt(aleatorio));
			}
			System.out.println("Longitud de la clave: "+longitud);
			System.out.println("CLAVE: "+SBuilder);
			String claveOpcional = SBuilder.toString();
			ClaveSegura claveOK = new ClaveSegura(claveOpcional);
			if (claveOK.requisitos()){
				System.out.println("La clave es segura ");
				break;
				}
			else {
				System.out.println("La clave no es segura");
				SBuilder.delete(0, longitud);
			}
		}
	}
}
