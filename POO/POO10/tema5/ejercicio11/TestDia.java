/Ejercicio 11
//test para comprobar el funcionamiento
public class TestDia{
	public static void main(String[] arg){
		//creo un objeto de tipo Dia
		Dia d1 = new Dia(DiasSemana.MARTES);
		System.out.println("Día de partida: "+d1);
		//d1.queDia(125) debe devolver un nuevo día, de tip Dia
		int numeroDias=125;
		Dia d2 = d1.queDia(numeroDias);
		System.out.println("Días después de "+numeroDias+" días es: "+d2);
	}
}
