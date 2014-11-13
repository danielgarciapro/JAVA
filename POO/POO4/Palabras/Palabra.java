public class Palabra {
	//atributo
	private String contenido;
	//constructor
	public Palabra(String c){
		this.contenido = c;
		}
	@Override
	public String toString(){
		return "Objeto creado: "+this.contenido;
		}
	public String mayusculas(){
		return this.contenido.toUpperCase();
		}
	public String minusculas(){
		return this.contenido.toLowerCase();
		}
	public String reemplazar(char vieja, char nueva){
		return this.contenido.replace(vieja,nueva);	
		}
	public char empiezaPor1(){
		return this.contenido.charAt(0);
		}
	public String empiezaPor2(){
		return this.contenido.substring(0,1);
		}
	public String numeroDeLetras(){
		return this.contenido.trim(); //(trim elimina los espacios en blanco al principio y al final)
		}
	public String eliminaEspacios(){
		return this.contenido.replace(" ","");
		}
	public int numeroDeCaracteres(){
		return this.contenido.length();
		}
	public char acabaPor1(){
		return this.contenido.charAt(this.contenido.length()-1);
		//return this.contenido.charAt(this.numeroDeCaracteres()-1); otra forma de hacerlo
		}
	public String acabaPor2(){
		return this.contenido.substring(this.contenido.length()-1);
		}
	}

class TestPalabras {
	public static void main (String[] args){
			Palabra p1= new Palabra("   esto es una cadena   ");
			System.out.println(p1);
			System.out.println("Aplicando toUpperCase: "+p1.mayusculas());
			System.out.println(p1);											//el metodo solo devuelve las mayusculas no transforma el String
			System.out.println("Aplicando toLowerCase: "+p1.minusculas());
			System.out.println("Reemplazar e por i : "+p1.reemplazar('e','i'));
			System.out.println("Empieza por : "+p1.empiezaPor1());
			System.out.println("Empieza por : "+p1.empiezaPor2());
			System.out.println("Tamaño del array: "+p1.numeroDeCaracteres());
			System.out.println("Acaba por: "+p1.acabaPor1());
			System.out.println("Acaba por: "+p1.acabaPor2());
			System.out.println("------------------------------------------------");
			//System.out.println("String sin espacios al principio y al final: "+p1.toString()+" dimension "p1.length());
			System.out.println("String sin espacios al principio y al final: "+p1.numeroDeLetras().length());
			System.out.println("String sin espacios: "+p1.eliminaEspacios().length());
		}
	
	}
