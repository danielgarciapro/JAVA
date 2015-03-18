package ejercicios;

import java.time.LocalDate;

public class CuentaBancaria {
	private CrearCuenta cuentas = new CrearCuenta();
	private String cuenta = cuentas.numeroCuentaFinal;
	private double saldo=0;
	private double interes=2.5;
	private LocalDate fechaCreacion = LocalDate.now();
	private static int numeroDeCuentas=0;
	public CuentaBancaria() {
		numeroDeCuentas++;
	}
	public CuentaBancaria(double saldo, double interes) {
		this.saldo = saldo;
		this.interes = interes;
		numeroDeCuentas++;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public static int getNumeroDeCuentas() {
		return numeroDeCuentas;
	}
	public void depositarDinero(double cantidad){
		this.saldo += cantidad;
		System.out.println("Has ingresado "+cantidad+"€, tu saldo actual es de "+this.saldo+"€");
	}
	
	public void retirarDinero(double cantidad){
		if (this.saldo <= cantidad){
			System.out.println("No tienes suficiente saldo para sacar "+cantidad+"€, tu saldo es de: "+this.saldo+"€");
		}
		else {
			this.saldo -= cantidad;
			System.out.println("Has retirado "+cantidad+"€, tu saldo actual es de "+this.saldo+"€");
		}
	}
	
	/*public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
	}*/
	@Override
	public String toString() {
		return "CuentaBancaria [cuenta=" + cuenta + ", saldo=" + saldo + "]";
	}



	private  class CrearCuenta{
		public final int[] ENTIDAD = {1,2,3,4};
		public final int[] OFICINA = {5,6,7,8};
		public final int[] COEFICIENTE1 = {4,8,5,10,9,7,3,6};
		public final int[] COEFICIENTE2 = {1,2,4,8,5,10,9,7,3,6};
		public  String numeroCuentaAleatorio=crearnumeroCuentaAleatorio();
		public String numeroCuentaFinal = crearCuentaFinal();
		
		public String crearnumeroCuentaAleatorio(){
			int aleatorio=0;
			StringBuilder sb = new StringBuilder();
			while (sb.length()<10){
				aleatorio = (int) (Math.random()*10);
				sb.append(aleatorio);
			}
			return sb.toString();
		}
		
		public int crearPrimerDigitoControl(){
			int resultado=0;
			int resto;
			int primerDigitoControl;
			int j=0;
			for (int i = 0; i < COEFICIENTE1.length; i++) {
				 if (i<4){
					 resultado += OFICINA[j]*COEFICIENTE1[i];
					 j++;
				 }
				 else if (i==4) j=0;
				 else{
					 resultado += ENTIDAD[j]*COEFICIENTE1[i];
					 j++;
				 }
			}
			resto = resultado%11;
			primerDigitoControl = 11-resto;
			if (primerDigitoControl == 10) return 1;
			else if (primerDigitoControl == 11) return 0;
			else return primerDigitoControl;
		}
		
		public int crearSegundoDigitoControl(){
			int resultado=0;
			int resto;
			int segundoDigitoControl;
			char[] numeroCuenta = numeroCuentaAleatorio.toCharArray();
			for (int i = 0; i < COEFICIENTE2.length; i++) {
				resultado += Character.digit(numeroCuenta[i],10)*COEFICIENTE2[i];
			}
			resto = resultado%11;
			segundoDigitoControl = 11-resto;
			/*System.out.println("en el 1 - "+numeroCuentaAleatorio);
			System.out.println("en el 1 - "+numeroCuentaAleatorio);
			System.out.println("en el 1 - "+numeroCuentaAleatorio);
			System.out.println("resto "+resto+" resultado "+resultado);*/
			if (segundoDigitoControl == 10) return 1;
			else if (segundoDigitoControl == 11) return 0;
			else return segundoDigitoControl;
		}
		
		public String crearCuentaFinal(){
			String entidad="";
			String oficina="";
			for (int i = 0; i < ENTIDAD.length; i++) {
				entidad += ENTIDAD[i]+"";
			}
			for (int i = 0; i < OFICINA.length; i++) {
				oficina += OFICINA[i]+"";
			}
			/*System.out.println("en el 2 - "+numeroCuentaAleatorio);
			System.out.println("en el 2 - "+numeroCuentaAleatorio);
			System.out.println("en el 2 - "+numeroCuentaAleatorio);*/
			String cuenta = entidad+"-"+oficina+"-"+crearSegundoDigitoControl()+crearPrimerDigitoControl()+"-"+numeroCuentaAleatorio;
			return cuenta;
		}
		
	}
	
	
	/*public static void main(String[] args) {
		System.out.println(CuentaBancaria.CrearCuenta.numeroCuentaAleatorio);
		System.out.println(CuentaBancaria.CrearCuenta.crearPrimerDigitoControl());
		System.out.println(CuentaBancaria.CrearCuenta.crearSegundoDigitoControl());
		System.out.println(CuentaBancaria.CrearCuenta.primeraCifraCuenta);
		System.out.println(CuentaBancaria.CrearCuenta.numeroCuentaFinal);

	}*/
	
}


