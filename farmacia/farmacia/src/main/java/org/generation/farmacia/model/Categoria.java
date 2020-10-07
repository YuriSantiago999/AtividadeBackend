package org.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	@OneToMany(mappedBy = "categoria", cascade= CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List <Produto> produto;

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

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
