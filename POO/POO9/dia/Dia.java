public class Dia{
	//definimos un enum llamado Dias
	//mayuscula xk se trata como una clase
	public enum Dias{
		//por convenio los valors se ponen en mayusculas
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO	//NO SE CIERRA con punto y coma
		}
	private int horasTrabajar; //no lo vamos a usar
	private Dias dias;
	public Dia(int h, Dias d){
		this.horasTrabajar=h;
		this.dias=d;
		}
	public void festivo(){
		switch(this.dias){
			case LUNES: case MARTES: case MIERCOLES: case JUEVES: case VIERNES:
				this.horasTrabajar=8;
				System.out.println("Dia completamente laborable, con "+this.horasTrabajar+" al dia");
				break;
			case SABADO:
				this.horasTrabajar=5;
				System.out.println("Dia laboral de media jornada, con "+this.horasTrabajar+" al dia");
				break;
			default:
				this.horasTrabajar=0;
				System.out.println("Dia festivo, con "+this.horasTrabajar+" al dia");
			//lo mejor seria definir case SABADO: case DOMINGO: y el resto en default
			}
		
		}
}
class TestDias{
	public static void main(String[] args){
			Dia d1 = new Dia(0, Dia.Dias.DOMINGO);
			d1.festivo();
			Dia d2 = new Dia(0, Dia.Dias.LUNES);
			d2.festivo();
			Dia d3 = new Dia(0, Dia.Dias.SABADO);
			d3.festivo();
	}
}
