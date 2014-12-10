//Ejercicio 4
//clase Plural que nos crea
//palabras en plural
public class Plural3{
//atributo, la palabra
	private String palabra;
	//constructor
	public Plural3(String palabra){
	this.palabra=palabra;
	}
	//método que devuelve el plural
	public String getPlural(){
	if (this.palabra.endsWith("a") || this.palabra.endsWith("e") ||
		this.palabra.endsWith("i") || this.palabra.endsWith("o") ||
		this.palabra.endsWith("u") || this.palabra.endsWith("é") ||
		this.palabra.endsWith("á") || this.palabra.endsWith("ó"))
		return this.palabra+"s";
	else if (this.palabra.endsWith("í") || this.palabra.endsWith("ú"))
		return this.palabra+"s o "+this.palabra+"es";
	else if (this.palabra.endsWith("ay") || this.palabra.endsWith("ey") ||
		this.palabra.endsWith("oy") || this.palabra.endsWith("iy") ||
		this.palabra.endsWith("uy"))
		return this.palabra+"es";
	else if (this.palabra.endsWith("l") || this.palabra.endsWith("r") ||
		this.palabra.endsWith("n") || this.palabra.endsWith("d") ||
		this.palabra.endsWith("j"))
		return this.palabra+"es";
	else if (this.palabra.endsWith("z"))
		return this.palabra.substring(0,this.palabra.length()-1)+"ces";
	else
		return this.palabra;
	}
}
