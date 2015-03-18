package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private List<Producto> Lista;

	public Tienda() {
		this.Lista = new ArrayList<Producto>();
	}
	
	public void addProducto(Producto p){
		Lista.add(p);
	}

	public List<Producto> getLista() {
		return Lista;
	}
	
	public void eliminarProducto(Producto p){
		if (this.Lista.contains(p)) this.Lista.remove(p);
	}
	
	public Producto productoMasCaro(){
		double caro = Lista.get(0).getPrecioProducto();
		Producto productoMasCaro = null;
		for (Producto producto : Lista) {
			if(producto.getPrecioProducto() > caro){
				caro = producto.getPrecioProducto();
				productoMasCaro = producto;
			}
		}
		return productoMasCaro;
	}
	
	public Producto productoMasBarato(){
		double barato = Lista.get(0).getPrecioProducto();
		//Producto productoMasBarato = null;
		//no es viable porque ese producto tendria como valores por defecto 0
		Producto productoMasBarato = Lista.get(0);
		for (Producto producto : Lista) {
			if(producto.getPrecioProducto() < barato){
				barato = producto.getPrecioProducto();
				productoMasBarato = producto;
			}
		}
		return productoMasBarato;
	}

	@Override
	public String toString() {
		return "Tienda " + Lista ;
	}
	
	
}
