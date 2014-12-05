//Ejercicio 11. Nueva versión
//donde no definimos el enum
//dentro de la misma clase
//y el test lo vamos a definir
//en otra clase independiente
public class Dia{
	//atributo de tipo DiasSeman
	private DiasSemana dia;
	//constructor
	public Dia(DiasSemana d){
	this.dia=d;
	}
	@Override
	public String toString(){
	return ""+this.dia; //obligo a hacer casting de this.dia a String
	}
	//método que dado un número de días (int d)
	//debe dovolver un nuevo día (de tipo Dia)
	public Dia queDia(int d ){
	Dia diaRetorno;
	//debo obtener cardinalida, sumarle el número de días (int d) y hacer el resto de 7 (%7)
	//en función de ese valor devolver un tipo de día (Dia diaRetorno)
	switch((this.dia.ordinal()+d) %7){
		case 0:
			diaRetorno=new Dia(DiasSemana.DOMINGO);
			break;
		case 1:
			diaRetorno=new Dia(DiasSemana.LUNES);
			break;
		case 2:
			diaRetorno=new Dia(DiasSemana.MARTES);
			break;
		case 3:
			diaRetorno=new Dia(DiasSemana.MIERCOLES);
			break;
		case 4:
			diaRetorno=new Dia(DiasSemana.JUEVES);
			break;
		case 5:
			diaRetorno=new Dia(DiasSemana.VIERNES);
			break;
		default:
			diaRetorno= new Dia(DiasSemana.SABADO);
		}
		return diaRetorno;
	}
}
