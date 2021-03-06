package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {
	private List<Persona> listaPersonas;
	public ListaPersonas() {
		//tipico en colecciones de objetos
		//inicializar a coleccion vacia
		this.listaPersonas = new ArrayList<Persona>();
	}
	public void addPersona(Persona p){
		//añado un objeto persona
		listaPersonas.add(p);
	}
	public void eliminarPersona(Persona p){
		if (listaPersonas.contains(p)) listaPersonas.remove(p);
	}
	public boolean exixtePersona(Persona p){
		return listaPersonas.contains(p);
	}
	public void modificarNombrePersona(Persona p, String nuevoNombre){
		if (listaPersonas.contains(p)){
			p.setNombre(nuevoNombre);
		} 
	}
	@Override
	public String toString() {
		return listaPersonas.toString();
	}
	
}
