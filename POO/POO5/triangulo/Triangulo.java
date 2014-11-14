import javax.swing.JOptionPane;
public class Triangulo{
	private String a = JOptionPane.showInputDialog("Escribe el valor del primer cateto: ");  //resolver
	private String b = JOptionPane.showInputDialog("Escribe el valor del segundo cateto: ");
	private double cateto1=Double.parseDouble(a);
	private double cateto2=Double.parseDouble(b);
	//getter y setter
	public double getCateto(){
		//return this.cateto1, this.cateto2; 
		return this.cateto2;
		}
	public void setCateto(double a, double b){
		this.cateto1=a;
		this.cateto2=b;
		}
	@Override
	public String toString(){
		return "Estos son los catetos: "+cateto1+" y "+cateto2;
		}
	public double hipotenusa(){
		return Math.hypot(this.cateto1, this.cateto2);
		}
	public double area(){
		return (this.cateto1*this.cateto2)/2;
		}
	public double perimetro(){
		return this.cateto1+this.cateto2+hipotenusa();
		}
}


class TestTriangulo {
	public static void main (String[] args){
			Triangulo t= new Triangulo();
			//t.setCateto(2,5);
			JOptionPane.showMessageDialog(null,t.hipotenusa(),"Esta es la hipotenusa:", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,t.area(),"Esta es el area:", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,t.perimetro(),"Este es el perimetro:", JOptionPane.INFORMATION_MESSAGE);
			System.out.println(t);
			System.out.println("Esta es la hipotenusa: "+t.hipotenusa());
			System.out.println("Esta es el area: "+t.area());
			System.out.println("Esta es el perimetro: "+t.perimetro());
		}
	}
