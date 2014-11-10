//Ejercicio3.1

public class Libros {
	private String titulo;
	private String isbn;
	private String autor;
	private boolean disponible = true;

	//constructor

	public Libros (String autor, String isbn, String titulo) {
		this.titulo=titulo;
		this.autor=autor;
		this.isbn=isbn;
	}
	
	//getters y setter
	public String getTitulo () {
		return this.titulo;
	}

	public String getAutor () {
		return this.autor;
	}

	public String getIsbn () {
		return this.isbn;
	}

	public boolean getDisponible () {
		return this.disponible;
	}

	public void setIsbn (String isbn) {
		this.isbn=isbn;
	}

	//metodo para poner que no esta disponible
	public void prestar () {
		this.disponible=false;
	}

	//metodo para poner que esta disponible
	public void devolver () {
		this.disponible=true;
	}
	
	@Override
	public String toString () {
		return "Libro: "+this.titulo+" de "+this.autor+" con isbn: "+this.isbn;
	}

}

