package biblioteca.matematicas;
public class Numeros{
	private int numero;
	public Numeros(int n){
		this.numero=n;
		}
	private boolean esPar(){
		if (this.numero%2 == 0) return true;
		else return false;
		}
	@Override
	public String toString(){
		return "El numero es "+this.numero+" es PAR?: "+esPar();
		}
}
