import javax.swing.JOptionPane;
public class Empleado{
	private String nombre;
	private double horasSemana;
	private double sueldoPorHora;
	private double deduccionHacienda;
	private double deduccionSS;
	//constructor
	public Empleado(String n, double horas, double sueldo, double dhac, double dss){
		this.nombre=n;
		this.horasSemana=horas;
		this.sueldoPorHora=sueldo;
		this.deduccionHacienda=dhac;
		this.deduccionSS=dss;
		}
	/*public void setEmpleado(String n, double horas, double sueldo, double dhac, double dss){
		this.nombre=n;
		this.horasSemana=horas;
		this.sueldoPorHora=sueldo;
		this.deduccionHacienda=dhac;
		this.deduccionSS=dss;
		}*/
	@Override
	public String toString(){
		return "Este es el nombre del empleado: "+this.nombre+", y su sueldo neto a la semana es: "+sueldoNetoPorSemana();
		}
	
	public double sueldoBruto(){
		return this.horasSemana*this.sueldoPorHora;
		}
	public double deduccionesTotales(){
		return this.deduccionHacienda+this.deduccionSS;
		}
	public double sueldoNetoPorSemana(){
		return sueldoBruto()-deduccionesTotales();
		}
}

class TestEmpleado{
	public static void main (String[] args){
			String nombre=JOptionPane.showInputDialog("Introduce el nombre: ");
			String h=JOptionPane.showInputDialog("Introduce horas a la semana trabajadas: ");
			double horas=Double.parseDouble(h);
			String sueldoPorHora=JOptionPane.showInputDialog("Introduce el Sueldo por hora: ");
			double s=Double.parseDouble(sueldoPorHora);
			String deduccionHacienda=JOptionPane.showInputDialog("Introduce la deduccion de hacienda: ");
			double hh=Double.parseDouble(deduccionHacienda);
			String deduccionSS=JOptionPane.showInputDialog("Introduce la deducciones de la seguridad social: ");
			double dss=Double.parseDouble(deduccionSS);
			Empleado e1= new Empleado(nombre,horas,s,hh,dss);
			//e1.setEmpleado("Juan Perez Perez",40,10,100,50);
			JOptionPane.showMessageDialog(null,e1,"Información del empleado", JOptionPane.INFORMATION_MESSAGE);
			System.out.println(e1);
			

			
	}
}
