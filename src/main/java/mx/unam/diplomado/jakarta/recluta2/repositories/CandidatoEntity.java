package mx.unam.diplomado.jakarta.recluta2.repositories;

public class CandidatoEntity {
	private String correo;
	private String telefono;
	private String nombre;
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "CandidatoEntity [correo=" + correo + ", telefono=" + telefono + ", nombre=" + nombre + "]";
	}
}
