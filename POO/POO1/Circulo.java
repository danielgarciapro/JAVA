public class Circulo{
	private int radio=5; //atributos, se puede inicializar aqui
	public int getRadio(){ //metodo que devuelve el radio (entre llaves)
		return this.radio;
	}
	public void setRadio(int r){ //metodo de tipo mutante que cambia el valor del radio
		this.radio=r;
	}
}
class TestCirculo{
	public static void main (String[] args){
		Circulo c1 = new Circulo(); //crea un objeto tipo circulo de radio 5
		System.out.println("Radio del circulo: "+c1.getRadio());//llamamos a la clase
		Circulo c2 = new Circulo(); //crea un objeto tipo circulo de radio 5
		c2.setRadio(15); //cambio el radio del circulo a 15
		System.out.println("Radio del circulo: "+c2.getRadio());
	}
}
