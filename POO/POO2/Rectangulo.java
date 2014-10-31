public class Rectangulo{
	private int alto=5; //atributos, se puede inicializar aqui
	private int ancho=3;
	public int getAlto(){ //metodo que devuelve el alto (entre llaves)
		return this.alto;
	}
	public int getAncho(){ //metodo que devuelve el ancho (entre llaves)
		return this.ancho;
	}
	public int getArea(){ //metodo que devuelve el area (entre llaves)
		return this.ancho*this.alto;
	}
	public void setAlto(int al){ //metodo de tipo mutante que cambia el valor del alto
		this.alto=al;
	}
	public void setAncho(int an){ //metodo de tipo mutante que cambia el valor del ancho
		this.alto=an;
	}
}
class TestRectangulo{ //podemos omitir esta clase, probar con la main y luego comentarla
	public static void main (String[] args){
		Rectangulo rec1 = new Rectangulo(); //crea un objeto tipo rectangulo
		System.out.println("El alto del rectangulo es: "+rec1.getAlto());//llamamos a la clase
		System.out.println("El ancho del rectangulo es: "+rec1.getAncho());//llamamos a la clase
		System.out.println("El area del rectangulo es: "+rec1.getArea());//llamamos a la clase
		/* rec1.setAlto(12); rec1.setAncho(15); de esta forma puedo darle valor a los atributos */
		Rectangulo rec2 = new Rectangulo(); //crea un objeto tipo rectangulo
		rec2.setAlto(10); //cambio el alto a 10
		System.out.println("El nuevo alto del rectangulo es: "+rec2.getAlto());//llamamos a la clase
		System.out.println("La vieja area del rectangulo es: "+rec1.getArea());//llamamos a la clase
		System.out.println("La vieja area del rectangulo es: "+rec2.getArea());//llamamos a la clase
	}
}

