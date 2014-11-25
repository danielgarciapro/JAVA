import javax.swing.JOptionPane;
public class Calculadora{
	private double valor1,valor2;
	private String operacion; //div, x, sum, -
	private double resultado;
	public Calculadora(double v1, double v2, String op){
		this.valor1=v1;
		this.valor2=v2;
		this.operacion=op;
		}
	public void calcularResultado(){
		switch (this.operacion){
			case "div":
				this.resultado=this.valor1/this.valor2;
				break;
			case "x":
				this.resultado=this.valor1*this.valor2;
				break;
			case "sum":
				this.resultado=this.valor1+this.valor2;
				break;
			case "-":
				this.resultado=this.valor1-this.valor2;
				break;
			default : //para el caso de k no sea ninguna de las otras opciones
				System.out.println("Operacion no permitida");
			}
		}
	public double getResultado(){
			return this.resultado;
		}	
}

class TestCalculadora{
	public static void main(String[] args){
			String val1=JOptionPane.showInputDialog("Introduce el valor 1... ");
			double v1=Double.parseDouble(val1);
			String val2=JOptionPane.showInputDialog("Introduce el valor 2... ");
			double v2=Double.parseDouble(val2);
			String ope=JOptionPane.showInputDialog("Introduce el tipo de operacion, div para dividir, x para multiplicar, + para sumar y - para restar");
			Calculadora c1= new Calculadora(v1,v2,ope);
			c1.calcularResultado();
			JOptionPane.showMessageDialog(null,c1.getResultado(),"Calculadora", JOptionPane.INFORMATION_MESSAGE);
			//System.out.println(c1.calcularResultado());
			//"El resultado de la operacion "+v1+" "+ope+" "+v2+" tiene como resultado = "+c1.calcularResultado()
	}
}
