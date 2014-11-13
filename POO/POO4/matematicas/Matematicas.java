public class Matematicas {
	//atributo
	private double numero;

	//getter y setter
	public double getNumero(){
		return this.numero;
		}
	public void setNumero(double n){
		this.numero=n;
		}
	@Override
	public String toString(){
		return "Nuestro numero es: "+this.numero;
		}
	public double raiz(){
		return Math.sqrt(this.numero);
		}
	public double cubica(){
		return Math.cbrt(Math.abs(this.numero));
		}
	public long redondeo(){							//pongo long para que me de sin el punto cero
		return Math.round(Math.abs(this.numero));
		}
	public long aleatorio(){
		return Math.round(Math.random()*this.numero);
		}
	}
	
class TestMatematicas {
	public static void main (String[] args){
			Matematicas m1= new Matematicas();
			System.out.println(m1);
			m1.setNumero(9);
			System.out.println(m1);
			System.out.println("Esta es la raiz del numero: "+m1.raiz()); //para que vale lo que va entre parentesis??
			System.out.println("Esta es la raiz cubica en valor absoluto del numero: "+m1.cubica());
			m1.setNumero(-9.56);
			System.out.println("Este es el numero obtenido por el GET: "+m1.getNumero());
			System.out.println("Este es el numero redondeado en valor absoluto: "+m1.redondeo());
			System.out.println("----------------------------------------------------");
			System.out.println("Este es un numero aleatorio: "+m1.aleatorio());			
		}
	}
