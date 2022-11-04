package mx.unam.diplomado.jakarta.recluta2.repositories;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import mx.unam.diplomado.jakarta.recluta2.beans.Candidato;

@SessionScoped
public class Candidatos implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 103253370006282145L;
	private List<CandidatoEntity> candidatos;
	
	public Candidatos() {
		// TODO Auto-generated constructor stub
		candidatos = new ArrayList<>();
	}
	
	public void agregar(Candidato candidato) {
		CandidatoEntity ce = new CandidatoEntity();
		ce.setNombre(candidato.getNombre());
		ce.setCorreo(candidato.getCorreo());
		ce.setTelefono(candidato.getTelefono());
		candidatos.add(ce);
		System.out.println("Candidatos totales: "+candidatos.size());
	}

	public List<CandidatoEntity> getCandidatos() {
		return candidatos;
	}

}
