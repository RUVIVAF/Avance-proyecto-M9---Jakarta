package mx.unam.diplomado.jakarta.beans;

import java.io.Serializable;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import mx.unam.diplomado.jakarta.repositories.LibroEntity;
import mx.unam.diplomado.jakarta.repositories.Libros;

@Named
@SessionScoped
public class Libro implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8718415184368936871L;
	
	private String titulo;
	private String autor;
	private String Editorial;
	private int numEdicion;
	private String categoria;
	private Libros libros; 
	
	public Libro() {
		// TODO Auto-generated constructor stub
		libros = new Libros();
	}
	
	public List<LibroEntity>  getCandidatos() {
		return libros.getLibros();
	}

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
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
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

	public Libros getLibros() {
		return libros;
	}

	public void setLibros(Libros libros) {
		this.libros = libros;
	}

	public String agregar() {
		libros.agregar(this);
		return "index";
	}
	
}
