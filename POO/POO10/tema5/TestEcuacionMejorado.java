public class TestEcuacionMejorado{
	public static void main (String[] arg){
	//creamos 2 ecuaciones
	//x+y=1
	//2·x+2·y=2
	Ecuacion e1 = new Ecuacion(1,1,2,2,1,2);
	evaluarResultados(e1);
	System.out.println("-------------------------------------");
	
	//creamos 2 ecuaciones
	//2x+y=7
	//-x+2·y=-1
	Ecuacion e2 = new Ecuacion(2,1,-1,2,7,-1);
	evaluarResultados(e2);
}
	public static void evaluarResultados(Ecuacion e){
		System.out.println(e);
		if (e.esResoluble()){
			System.out.println("El sistema es resoluble, soluciones :");
			System.out.println("Para x = "+e.getX());
			System.out.println("Para y = "+e.getY());
		}
		else 	System.out.println("El sistema NO es resoluble");
	}
	
}

