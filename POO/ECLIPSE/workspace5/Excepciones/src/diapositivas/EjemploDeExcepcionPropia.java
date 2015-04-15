package diapositivas;

public class EjemploDeExcepcionPropia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EcuacionSegundoGrado e = new EcuacionSegundoGrado(2, 2, 1);
		} catch (NoEcuacion2GradoExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//vamos a crear nuestra propia excepcion
class NoEcuacion2GradoExcepcion extends Exception{
}

//vamos a crear la clase ecuacion de segundo grado
class EcuacionSegundoGrado{
	//ax^2+bx+c=0	No sera ecuacion de segundo grado si a=0
	private int a;
	private int b;
	private int c;
	public EcuacionSegundoGrado(int a, int b, int c) throws NoEcuacion2GradoExcepcion {
		if (a==0) throw new NoEcuacion2GradoExcepcion();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//resto de metodos...
	
}