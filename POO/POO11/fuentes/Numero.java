//clase que genera numero aleatorio
package biblioteca.utilidades;
public class Numero{
	private int numero;
	
	public Numero(){
		this.numero = (int)(Math.random()*10);
		}
	@Override
	public String toString(){
	return "El numero creado es: "+this.numero;
	}
}
