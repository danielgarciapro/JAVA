/*ax²+bx+c=0*/
public class Ecuacion2Grado{
	private double a;
	private double b;
	private double c;
	//getter y setter
	/*public double getNumero(){
		return this.a; return this.b; return this.c;
		}*/
	/*constructor
	public EcuacionSegundoGrado(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
		}*/
	public boolean esResoluble(){
		return (this.b*this.b)-4*this.a*this.c >= 0;
		}
	public void setNumero(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
		}
	public double ecuacion2GradoPositiva(){
		return (-this.b+(Math.sqrt((this.b*this.b)-4*(this.a*this.c))))/(2*this.a); // Math.pow(this.b,2) --> eleva al cuadrado
	}
	public double ecuacion2GradoNegativa(){
		return (-b-(Math.sqrt((b*b)-4*(a*c))))/(2*a); 
	}
	@Override
	public String toString(){
		return "Ecuacion de segundo grado: "+this.a+"x²"+this.b+"+x+"+this.c+"=0";
		}
}

class TestEcuacion {
	public static void main (String[] args){
			Ecuacion2Grado ecuacion= new Ecuacion2Grado();
			ecuacion.setNumero(1,-5,6);
			System.out.println(ecuacion);
			System.out.println("La ecuacion tiene solucion?:"+ecuacion.esResoluble());
			System.out.println("La ecuacion tiene como resultado para el +:"+ecuacion.ecuacion2GradoPositiva());
			System.out.println("La ecuacion tiene como resultado para el -:"+ecuacion.ecuacion2GradoNegativa());
		}
	}
