package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ListinProfesores {
	List<Profesor> listaProfesores;

	public ListinProfesores() {
		this.listaProfesores = new ArrayList<Profesor>();
	}

	public void addProfesor(Profesor p){
		listaProfesores.add(p);
	}
	
	public List<Profesor> getListaProfesores() {
		return listaProfesores;
	}

	@Override
	public String toString() {
		return "ListinProfesores [listaProfesores=" + listaProfesores + "]";
	}
	
}
