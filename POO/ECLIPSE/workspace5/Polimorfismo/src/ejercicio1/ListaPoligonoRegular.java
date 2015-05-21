package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaPoligonoRegular {
	List<PoligonoRegular> listaPoligonoRegular;

	/**
	 * @param listaPoligonoRegular
	 */
	public ListaPoligonoRegular() {
		listaPoligonoRegular = new ArrayList<PoligonoRegular>();
	}
	
	public void addPoligonoRegular(PoligonoRegular p){
		listaPoligonoRegular.add(p);
	}
	public int tamanoLista(){
		return listaPoligonoRegular.size();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ""+listaPoligonoRegular ;
	}

	/**
	 * @return the listaPoligonoRegular
	 */
	public List<PoligonoRegular> getListaPoligonoRegular() {
		return listaPoligonoRegular;
	}

	/**
	 * @param listaPoligonoRegular the listaPoligonoRegular to set
	 */
	public void setListaPoligonoRegular(List<PoligonoRegular> listaPoligonoRegular) {
		this.listaPoligonoRegular = listaPoligonoRegular;
	}
	
}
