package diapositivas;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura cir = new Circulo("rojo", 2);
		System.out.println(datosFigura(cir));
		
		Figura cuad = new Cuadrado("verde", 5);
		System.out.println(datosFigura(cuad));
	}
	//gracias al polimorfismo usamos un unico metodo para todas las figuras
	public static String datosFigura(Figura f){
		return f+" y su area es: "+f.getArea();
	}
}
class Figura{
	private String color;

	/**
	 * @param color
	 */
	public Figura(String color) {
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
	//esto es mejor hacerlo con interfaces o clases abstractas
	//definimos un metodo llamado getArea
	public double getArea(){
		return 0;
	}
}
class Circulo extends Figura{
	private double radio;

	/**
	 * @param color
	 * @param radio
	 */
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", color=" + getColor()
				+ "]";
	}

	/* (non-Javadoc)
	 * @see diapositivas.Figura#getArea()
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}
	
}
class Cuadrilatero extends Figura{
	private double lado1;
	private double lado2;
	/**
	 * @param color
	 * @param lado1
	 * @param lado2
	 */
	public Cuadrilatero(String color, double lado1, double lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cuadrilatero [lado1=" + lado1 + ", lado2=" + lado2
				+ ", color=" + getColor() + "]";
	}
	/* (non-Javadoc)
	 * @see diapositivas.Figura#getArea()
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.lado1*this.lado2;
	}
}
class Cuadrado extends Cuadrilatero{

	/**
	 * @param color
	 * @param lado1
	 * @param lado2
	 */
	public Cuadrado(String color, double lado) {
		super(color, lado, lado);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cuadrado [" + super.toString() + "]";
	}
	
}