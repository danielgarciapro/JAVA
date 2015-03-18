package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<CuentaBancaria> listaCuentasBanco;
	private String nombreBanco;
	
	public Banco(String nombre){
		listaCuentasBanco = new ArrayList<CuentaBancaria>();
		this.nombreBanco=nombre;
	}
	
	public void guardarCuenta(CuentaBancaria cuenta){
		if (listaCuentasBanco.contains(cuenta)) System.out.println("La cuenta ya existe");
		else listaCuentasBanco.add(cuenta);
	}	
	
	
	public void borrarCuenta(CuentaBancaria cuenta){
		if (listaCuentasBanco.contains(cuenta))
			listaCuentasBanco.remove(cuenta);
		else System.out.println("La cuenta a borrar no existe en el banco");
	}
	
	public  List<CuentaBancaria> cuentaMayorSaldo(){
		//CuentaBancaria cuentaMayor = new CuentaBancaria();
		List<CuentaBancaria> listaCuentaMayor = new ArrayList<CuentaBancaria>();
		double saldoMayor=0;
		//conseguimos el saldo mayor que puede pertenecer a una cuenta o varias
		for (CuentaBancaria cuentaBancaria : listaCuentasBanco) {
			if(cuentaBancaria.getSaldo()>=saldoMayor)
				saldoMayor = cuentaBancaria.getSaldo();
		}
		for (CuentaBancaria cuentaBancaria : listaCuentasBanco) {
			if(cuentaBancaria.getSaldo()==saldoMayor)
				listaCuentaMayor.add(cuentaBancaria);
		}
		/*for (int i = 0; i < listaCuentasBanco.size()-1; i++) {
			if (listaCuentasBanco.get(i).getSaldo() > listaCuentasBanco.get(i+1).getSaldo())
				cuentaMayor = listaCuentasBanco.get(i);
		}*/
		return listaCuentaMayor;
	}
	
	public  List<CuentaBancaria> cuentaMenorSaldo(){
		//CuentaBancaria cuentaMenor = new CuentaBancaria(listaCuentasBanco.get(0).getSaldo(),listaCuentasBanco.get(0).getInteres());
		List<CuentaBancaria> listaCuentaMenor = new ArrayList<CuentaBancaria>();
		double saldoMenor=Double.MAX_VALUE;
		for (CuentaBancaria cuentaBancaria : listaCuentasBanco) {
			if(cuentaBancaria.getSaldo()<=saldoMenor)
				saldoMenor = cuentaBancaria.getSaldo();
		}
		for (CuentaBancaria cuentaBancaria : listaCuentasBanco) {
			if(cuentaBancaria.getSaldo()==saldoMenor)
				listaCuentaMenor.add(cuentaBancaria);
		}
		/*for (int i = 0; i < listaCuentasBanco.size()-1; i++) {
			if (listaCuentasBanco.get(i).getSaldo() <= cuentaMenor.getSaldo())
			//(listaCuentasBanco.get(i).getSaldo() < listaCuentasBanco.get(i+1).getSaldo())
				cuentaMenor = listaCuentasBanco.get(i);
		}*/
		return listaCuentaMenor;
	}
	
	public double saldoMedio(){
		double saldoMedio;
		double saldo=0;
		for (int i = 0; i < listaCuentasBanco.size(); i++) {
			saldo += listaCuentasBanco.get(i).getSaldo();
		}
		saldoMedio = saldo/CuentaBancaria.getNumeroDeCuentas();
		return saldoMedio;
	}

	@Override
	public String toString() {
		return "Banco "+this.nombreBanco+" [numero de cuentas: "+listaCuentasBanco.size()+" y saldo medio: "+saldoMedio()+"]";
	}
	
	
	
}
