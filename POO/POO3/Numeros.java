public class Numeros{
	private int valor;
	public int getValor(){
		return this.valor;
		}
	public void setValor(int valor){
		System.out.println("Usando metodo setValor(int valor)");
		this.valor=valor;
		}
	public void setValor(double valor){
		System.out.println("Usando metodo setValor(double valor)");
		this.valor=(int)valor;			//hacemos el casting
		return;
		//System.out.println("Usando metodo setValor(double valor)");    Esta linea esta detras del return y no se ejecuta

		}
	}
