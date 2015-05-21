package chatApp.modelo;

import java.util.Date;

public class Mensaje {
	private int idMensaje;
	private String texto;
	private Usuario usuarioOrigen;
	private Usuario usuarioDestino;
	private Date fecha;

	public Mensaje(int idMensaje, Usuario origen, Usuario destino, String texto) {
		this.idMensaje = idMensaje;
		this.texto = texto;
		this.usuarioOrigen = origen;
		this.usuarioDestino = destino;
		this.fecha = new Date();
	}

	public Mensaje(int idMensaje, Usuario origen, Usuario destino,
			String texto, Date fecha) {
		this.idMensaje = idMensaje;
		this.texto = texto;
		this.usuarioOrigen = origen;
		this.usuarioDestino = destino;
		this.fecha = fecha;
	}

	public int getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(int idMensaje) {
		this.idMensaje = idMensaje;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Usuario getUsuarioOrigen() {
		return usuarioOrigen;
	}

	public void setUsuarioOrigen(Usuario origen) {
		this.usuarioOrigen = origen;
	}

	public Usuario getUsuarioDestino() {
		return usuarioDestino;
	}

	public void setUsuarioDestino(Usuario destino) {
		this.usuarioDestino = destino;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String toString() {
		return idMensaje + usuarioOrigen.getNombre()
				+ usuarioDestino.getNombre() + texto;
	}

}
