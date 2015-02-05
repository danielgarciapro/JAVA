package ejercicios;

import java.util.Scanner;

public class TestTienda {

	public static void main(String[] args) {
		int id = 0;
		Tienda tienda = new Tienda();
		tienda.addProducto(new Producto(id++, "CD", 3));
		//otra forma de hacerlo
		Producto p1 = new Producto(id++, "DVD", 6);
		tienda.addProducto(p1);
		tienda.addProducto(new Producto(id++, "lector CD", 2));
		//otra forma de hacerlo
		Producto p2 = new Producto(id++, "lector DVD", 12);
		tienda.addProducto(p2);
		System.out.println(tienda);
		System.out.println("Producto mas barato "+tienda.productoMasBarato());
		System.out.println("Producto mas caro "+tienda.productoMasCaro());
		//leemos por escaner
		Scanner in = new Scanner(System.in);
		while (true){
			String nombreProducto = in.next();
			if (nombreProducto.equals("exit")) break; //condicion de salida (exit)
			double precioProducto = in.nextDouble();
			tienda.addProducto(new Producto(id++, nombreProducto, precioProducto));
		}
		in.close();
		tienda.eliminarProducto(p1);//eliminar por referencia
		tienda.eliminarProducto(tienda.getLista().get(0));//eliminar sin referencia
		System.out.println(tienda);
		
	}

}
