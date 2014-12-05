public class Numeros{
	//Creo el atributo
	private int valor;
	//Creo los getter y setter
	public int getValor(){
		return this.valor;
	}
	public void setValor(int n){
		this.valor=n;
	}
	//Metodos adicionales
	public int imprimeHasta(){
		int i;
		for (i=0 ; i<=this.valor ; i++){
			System.out.printf("%3d",i);
		}
		System.out.printf("\n");
		return i;
	}
	public String esDivisible(){
		if(this.valor %10 == 0) return "Es divisible por 10 por 5 y por 2\n";
		else if(this.valor %5 == 0) return "es divisible por 5\n";
		else if(this.valor %2 == 0) return "es divisible por 2\n";
		else return "No es divisible por ninguno del los anteriores";
	}
	public String mayorCien(){
		if(this.valor>100) return "Es mayor que cien\n";
		else if (this.valor==100) return "es igual a cien\n";
		else return "es menor que cien\n";
	}
	public int divisoresDeNumero(){
		int i=0;
		int primo=0;
		if (this.valor<100){
			for (i=this.valor ; i>0 ; i--){
				if(this.valor %i == 0){
					System.out.printf("el numero %4d es divisor de %3d\n",i,this.valor);
					primo++;
				}
				else if(i>0) continue;
			}
			if(primo==2) System.out.printf("el numero %d es numero primo\n",this.valor);
		}	
		return i;
	}
}
class TestNumeros{
	public static void main(String[] arg) {
		if (arg.length==0){
			System.out.println("No has pasado argumento");
			System.exit(2);
		}
			
		int num = Integer.parseInt(arg[0]);	//pasamos num por argumentos
		Numeros v1 = new Numeros();
		v1.setValor(num);
		v1.imprimeHasta();
		//int variable = v1.imprimeHasta();
		//System.out.println("valor de retorno: "+variable);
		System.out.println("el numero es: "+v1.getValor()+" "+v1.esDivisible());
		System.out.println("el numero: "+v1.getValor()+" "+v1.mayorCien());
		System.out.println("----------------");
		v1.divisoresDeNumero();
	}
}
