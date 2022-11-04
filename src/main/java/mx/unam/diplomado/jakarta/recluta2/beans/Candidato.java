package mx.unam.diplomado.jakarta.recluta2.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import mx.unam.diplomado.jakarta.recluta2.repositories.CandidatoEntity;
import mx.unam.diplomado.jakarta.recluta2.repositories.Candidatos;

@Named
@SessionScoped
public class Candidato implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8718415184368936871L;
	
	private String nombre;
	private String telefono;
	private	String correo;
	private Candidatos candidatos; 
	
	public Candidato() {
		// TODO Auto-generated constructor stub
		candidatos = new Candidatos();
	}
	
	public List<CandidatoEntity>  getCandidatos() {
		return candidatos.getCandidatos();
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String agregar() {
		candidatos.agregar(this);
		return "index";
	}
	
}
