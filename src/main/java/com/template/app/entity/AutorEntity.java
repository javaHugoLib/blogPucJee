package com.template.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="AUTOR")
@SequenceGenerator(name = "AUTOR_ID_GENERATOR", sequenceName = "SE_AUTOR", allocationSize = 1)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

@NamedQueries({
    @NamedQuery(name="AutorEntity.retrieveAll", query="select distinct autor from AutorEntity autor ORDER BY autor.id ASC")
}) 

public class AutorEntity implements IEntity<Long>  {
	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUTOR_ID_GENERATOR")	
	private Long id;
	
	@NotNull 
	@Size(min=2, max = 100)
	@Column
	private String nome;
	
	@OneToMany (cascade=CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "autor_id")
	private List<PostagemEntity> postagens = new ArrayList<>();
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<PostagemEntity> getPostagens() {
		return postagens;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;		
	}
}
