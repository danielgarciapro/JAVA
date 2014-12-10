//Ejercicio 12
//Test para comprobar el correcto
//funcinamiento de la clase Ecuacion
public class TestEcuacion{
	public static void main(String[] arg){
	//creamos las dos ecuaciones
	// x+y=1
	// 2·x+2·y=2
	//public Ecuacion(double a, double b, double c, double d,
	// double e, double f)
	Ecuacion e1 = new Ecuacion(1, 1, 2, 2, 1, 2);
	System.out.println(e1);
	if(e1.esResoluble()){
		System.out.println("Ese sistema es resoluble, soluciones:");
		System.out.println("x: "+e1.getX());
		System.out.println("y: "+e1.getY());
	}
	else
	System.out.println("Ese sistema no es resoluble");
	// 2·x+y=7
	// −x+2·y=−1
	Ecuacion e2 = new Ecuacion(2, 1, -1, 2, 7, -1);
	System.out.println(e2);
	if(e2.esResoluble()){
		System.out.println("Ese sistema es resoluble, soluciones");
		System.out.println("x: "+e2.getX());
		System.out.println("y: "+e2.getY());
	}
	else
	System.out.println("Ese sistema no es resoluble");
	}
}
