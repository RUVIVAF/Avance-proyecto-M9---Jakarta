package mx.unam.diplomado.jakarta.repositories;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import mx.unam.diplomado.jakarta.beans.Libro;

@SessionScoped
public class Libros implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 103253370006282145L;
	
	private List<LibroEntity> libros;
	
	public Libros() {
		// TODO Auto-generated constructor stub
		libros = new ArrayList<>();
	}
	
	public void agregar(Libro libro) {
		LibroEntity le = new LibroEntity();
		
		le.setTitulo(libro.getTitulo());
		le.setAutor(libro.getAutor());
		le.setNumEdicion(libro.getNumEdicion());
		le.setEditorial(libro.getEditorial());
		le.setCategoria(libro.getCategoria());
		libros.add(le);
		
		System.out.println("Libros registrados: "+libros.size());
	}

	public List<LibroEntity> getLibros() {
		return libros;
	}

}
