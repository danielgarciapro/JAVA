/** 
 * @author Daniel Garcia Merino
 * @version 1.0
 * Clase que representa a los <em>elementos quimicos</em>
 */


import javax.swing.JOptionPane;
public class ElementoQuimico{
	//atributos
	private String nombre;
	private String simbolo;
	private double masa;
	private int numeroAtomico;
	private boolean metal;
	private int periodo;
	private int grupo;
	private double electronegatividad;
	//constructor
	/** @param n nombre del elemento
	 * @param s simbolo
	 * ...........
	 */
	public ElementoQuimico(String n, String s, double m, int num, boolean me, int p, int g, double e){
		this.nombre=n;
		this.simbolo=s;
		this.masa=m;
		this.numeroAtomico=num;
		this.metal=me;
		this.periodo=p;
		this.grupo=g;
		this.electronegatividad=e;
		}
	//metodos
	/** @return si es metal
	 * devuelve si es metal o no
	 */
	public boolean esMetal(){
		return this.metal;
		}
	/** @return si es gas noble
	 * devuelve si es gas noble o no
	 */
	public boolean esGasNoble(){
		return this.grupo==18;
		}
	/** @return si es actinido
	 * devuelve si es actinido o no
	 */
	public boolean esActinido(){
		return this.grupo==3 && this.periodo==7;
		}
	/** @return si es mas electronegativo que el yodo
	 * devuelve si es mas electronegativo que el yodo
	 */
	public boolean esMasElectronegativo_I(){
		return this.electronegatividad >2.66;
		}
	@Override
	public String toString(){
		return "Elemento: "+this.nombre+", "+this.simbolo+", periodo: "+this.periodo+", grupo: "+this.grupo+" ";
		}
}

class TestElementoQuimico{
	public static void main (String[] arg){
		ElementoQuimico e1 = new ElementoQuimico("Kripton","Kr",83.798,36,false,4,18,3);
		ElementoQuimico e2 = new ElementoQuimico("Hafnio","Hf",178.49,72,true,4,6,1.30);
		ElementoQuimico e3 = new ElementoQuimico("Plata","Ag",107.86,47,true,11,5,1.93);
		String nombre = JOptionPane.showInputDialog("Nombre");
		String simbolo = JOptionPane.showInputDialog("Simbolo");
		String masa = JOptionPane.showInputDialog("Masa");
		String numero = JOptionPane.showInputDialog("Numero");
		String metal = JOptionPane.showInputDialog("Metal");
		String grupo = JOptionPane.showInputDialog("Grupo");
		String periodo = JOptionPane.showInputDialog("Periodo");
		String electronegatividad = JOptionPane.showInputDialog("Electronegatividad");
		double m = Double.parseDouble(masa);
		int n = Integer.parseInt(numero);
		boolean mt = Boolean.parseBoolean(metal);
		int g = Integer.parseInt(grupo);
		int p = Integer.parseInt(periodo);
		double e = Double.parseDouble(electronegatividad);
		ElementoQuimico e4 = new ElementoQuimico(nombre,simbolo,m,n,mt,g,p,e);
		//llamo al toString
		System.out.println(e1+ "es metal?"+e1.esMetal()+" es gas noble?"+e1.esGasNoble()+" es actinido?"+e1.esActinido()+" es mas electronegativo que el Fluor?"+e1.esMasElectronegativo_I());
		System.out.println(e2+ "es metal?"+e2.esMetal()+" es gas noble?"+e2.esGasNoble()+" es actinido?"+e2.esActinido()+" es mas electronegativo que el Fluor?"+e2.esMasElectronegativo_I());
		System.out.println(e3+ "es metal?"+e3.esMetal()+" es gas noble?"+e3.esGasNoble()+" es actinido?"+e3.esActinido()+" es mas electronegativo que el Fluor?"+e3.esMasElectronegativo_I());
		System.out.println(e4+ "es metal?"+e4.esMetal()+" es gas noble?"+e4.esGasNoble()+" es actinido?"+e4.esActinido()+" es mas electronegativo que el Fluor?"+e4.esMasElectronegativo_I());
		//JOptionPane
		JOptionPane.showMessageDialog(null,e4,"Elemento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
