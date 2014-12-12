//vamos a crear una biblioteca basica situado en biblioteca utilidades
//la primera linea de codigo sea:
//package biblioteca.utilidades
//compilamos con javac -d
//clase auxiliar que crea objetos y metodos de acceso
package biblioteca.utilidades;
public class Auxiliar{
	private String nombre;
	private int edad;
	public Auxiliar(String n, int e){
		this.nombre=n;
		this.edad=e;
	}
	public String getNombre(){
		return this.nombre;
		}
	public int getEdad(){
		return this.edad;
		}
	public void setNombre(String n){
		this.nombre=n;
		}
	public void setEdad(int e){
		this.edad=e;
		}
	@Override
	public String toString(){
	return "Este es el nombre "+this.nombre+" y la edad "+this.edad;
	}
}
