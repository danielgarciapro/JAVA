package ejercicios;

public class TestCuentas {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria();
		CuentaBancaria cuenta2 = new CuentaBancaria(1000,5);
		CuentaBancaria cuenta3 = new CuentaBancaria();
		CuentaBancaria cuenta4 = new CuentaBancaria(5000, 3);
		CuentaBancaria cuenta5 = new CuentaBancaria(5000, 2.7);

		System.out.println("Cuenta 1: "+cuenta1);
		System.out.println("Cuenta 2: "+cuenta2);
		System.out.println("Cuenta 3: "+cuenta3);
		System.out.println("Cuenta 4: "+cuenta4);
		System.out.println("Cuenta 5: "+cuenta5);
		
		Banco banco1 = new Banco("La Caixa");
		
		banco1.guardarCuenta(cuenta1);
		banco1.guardarCuenta(cuenta2);
		banco1.guardarCuenta(cuenta3);
		banco1.guardarCuenta(cuenta4);
		banco1.guardarCuenta(cuenta5);
		
		System.out.println(banco1);
		
		System.out.println("Cuenta con mayor saldo "+banco1.cuentaMayorSaldo());
		System.out.println("Cuenta con menor saldo "+banco1.cuentaMenorSaldo());
		
		cuenta1.depositarDinero(5000);
		cuenta1.retirarDinero(6000);
		
		System.out.println(cuenta3.getFechaCreacion());
		System.out.println(cuenta5.getFechaCreacion());
		
	}

}
