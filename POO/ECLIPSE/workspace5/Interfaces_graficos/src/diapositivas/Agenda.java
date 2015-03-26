package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Persona> listaPersonas;

	public Agenda() {
		this.listaPersonas = new ArrayList<Persona>();
	}

	/**
	 * @return the listaPersonas
	 */
	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	/**
	 * @param listaPersonas the listaPersonas to set
	 */
	public void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agenda [listaPersonas=" + listaPersonas + "]";
	}
	
	public void addPersona(Persona p){
		this.listaPersonas.add(p);
	}
	
	public Persona getPersona(int index){
		return this.listaPersonas.get(index);
	}
	

}
