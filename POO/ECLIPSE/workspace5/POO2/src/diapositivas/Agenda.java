package diapositivas;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Daniel Garcia
 * @version 1.0
 *
 */

public class Agenda {
	private List<Contacto> lista;//encapsulacion del atributo lista
	/**
	 * @param lista
	 * crea una agenda a partir de otra agenda
	 */
	public Agenda(List<Contacto> lista) {
		this.lista = lista;
	}
	/**
	 * Inicializa la agenda vacia
	 */
	public Agenda() {
		this.lista = new ArrayList<Contacto>();
	}
	/**
	 * 
	 * @param c Contacto que añadimos
	 */
	public void addContacto(Contacto c){
		this.lista.add(c);
	}
	/**
	 * 
	 * @param c
	 * @return true si la lista contiene el contacto
	 */
	public boolean existeContacto(Contacto c){
		return this.lista.contains(c);
	}
	/**
	 * 
	 * @param c objeto a eliminar
	 */
	public void eliminarContacto(Contacto c){
		if(this.existeContacto(c)) this.lista.remove(c);
	}
	/**
	 * 
	 * @param c contacto a cambiar telefono
	 * @param telefono telefono nuevo
	 */
	public void actualizarTelefono(Contacto c, int telefono){
		if(this.existeContacto(c)) c.setTelefono(telefono);
	}
	/**
	 * 
	 * @param c contacto a cambiar el nombre
	 * @param nombre nuevo nombre
	 */
	public void actualizarNombre(Contacto c, String nombre){
		if(this.existeContacto(c)) c.setNombre(nombre);;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.lista.toString();
	}
}
