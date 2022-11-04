package mx.unam.diplomado.jakarta.repositories;

public class LibroEntity {
	private String titulo;
	private String autor;
	private String editorial;
	private int numEdicion;
	private String categoria;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getNumEdicion() {
		return numEdicion;
	}
	public void setNumEdicion(int numEdicion) {
		this.numEdicion = numEdicion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "LibroEntity [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", numEdicion="
				+ numEdicion + ", categoria=" + categoria + "]";
	}
}
