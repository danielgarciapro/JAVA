package diapositivas;

public class TestExterna {
	public static void main(String[] args) {
		Externa ex = new Externa();
		new Externa();
		int numero = Externa.InternaEstatica.devuelveUn2();
		System.out.println("Numero 1: "+numero);
		int numero2 = Externa.devuelveOtro2();
		System.out.println("Numero 2: "+numero2);
		int numero3 = ex.devuelve3();
		System.out.println("Numero 3: "+numero3);
		int numero4 = (new Externa()).devuelve3();
		System.out.println("Numero 4: "+numero4);
		//vamos a crear un objeto de la clase interna
		Externa.Interna interna = (ex).new Interna();
		//Externa.Interna interna2 = new Externa().new Interna();
		int numero5 = interna.devuelveOtro3();
		System.out.println("Numero 5: "+numero5);
		int numero6 = (ex).metodoInstancia();
		System.out.println("Numero 6: "+numero6);
	}
}

class Externa{
	public Externa(){
		System.out.println("Creada una clase externa");
	}
	public static int devuelveOtro2(){
		return 2;
	}
	//clase interna como estatica
	public static class InternaEstatica{
		public static int devuelveUn2(){
			return 2;
		}
	}
	//metodo de instancia
	public int devuelve3(){
		return 3;
	}
	public class Interna{
		public int devuelveOtro3(){
			return 3;
		}
	}
	public int metodoInstancia(){
		int x=5;
		class Local{
			public int devuelve4(){
				return 4;
			}
		}
		Local l = new Local();
		int numero = l.devuelve4()+x;
		return numero;
	}
	//vamos a crear un bloque (bloque anónimo)
	{
		System.out.println("Bloque anonimo a nivel de instancia");
		class LocalANievelDeBloque{
			public int devuelve5(){
				return 5;
			}
		}
		LocalANievelDeBloque l1 = new LocalANievelDeBloque();
		System.out.println(l1.devuelve5());
	}
	//bloque estatico
	static {
		System.out.println("Bloque anonimo a nivel de clase");
		class LocalANievelDeBloqueEstatico{
			private int seis = 6;
			public int devuelve6(){
				return this.seis;
			}
		}
		LocalANievelDeBloqueEstatico l = new LocalANievelDeBloqueEstatico();
		System.out.println(l.devuelve6());
	}
}