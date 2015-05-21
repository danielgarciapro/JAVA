package ejercicio3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Usuario2 {
	private String nombre;
	private String apellidos;
	private String email;
	private String login;
	private String contraseña;
	/**
	 * @param nombre
	 * @param apellidos
	 * @param email
	 * @param login
	 * @param contraseña
	 */
	public Usuario2(String nombre, String apellidos, String email, String login,
			String contraseña) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.login = login;
		this.contraseña = contraseña;
	}
	public boolean validarUsuario(){
		if (camposVacios() && validarContraseña() && validarEmail()){
			
			String linea = this.nombre+":"+this.apellidos+":"+this.email+":"+this.login+":"+this.contraseña+"\n";
			File outFile = new File("/home/matinal/Escritorio/usuarios.csv");
			try (PrintWriter out = new PrintWriter(new FileOutputStream(outFile, true))){ //con el true evito la sobreescritura
		
				out.write(linea);
	
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return true;
		}
		else return false;
		
		
		
	}
	public boolean camposVacios(){
		if (this.nombre!=null && this.apellidos!=null && this.email!=null && this.login!=null
				&& this.contraseña!=null) return true;
		else return false;
	}
	public boolean validarContraseña(){
		if (this.contraseña.length()>6) return true;
		else return false;
	}
	public boolean validarEmail(){
		if (this.email.length()>0){
			if (this.email.matches(".*@*.es")) return true;
			else return false;
		}
		else return false;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}
	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos
				+ ", email=" + email + ", login=" + login + ", contraseña="
				+ contraseña + "]";
	}
	
}
