package chatApp.modelo;

public class Usuario {
	private int idUsuario;
	private String nombre;

	public Usuario(int idUsuario, String nombre) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return nombre;
	}

	public boolean equals(Object u) {
		return idUsuario == ((Usuario) u).idUsuario;
	}

}
