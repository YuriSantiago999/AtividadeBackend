package org.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categoria")
public class Categoria {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size  (min = 2, max= 100)
	private String nome;
	
	private boolean prescricao_medica;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isPrescricao_medica() {
		return prescricao_medica;
	}

	public void setCosumivel(boolean prescricao_medica) {
		this.prescricao_medica = prescricao_medica;
	}
	
	
	
	

}
