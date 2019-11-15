package com.template.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name="POSTAGEM")
@SequenceGenerator(name = "POSTAGEM_ID_GENERATOR", sequenceName = "SE_POSTAGEM", allocationSize = 1)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

@NamedQueries({
    @NamedQuery(name="PostagemEntity.retrieveAll", query="select distinct post from PostagemEntity post ORDER BY post.id ASC")
}) 

public class PostagemEntity implements IEntity<Long> {
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POSTAGEM_ID_GENERATOR")	
	private Long id;
	
	@Size(min = 1, max = 200)
	@Column
	private String titulo;
		
	@NotNull 
	@Size(min=2, max = 700)
	@Column
	private String postagem;
	
    @ManyToOne (targetEntity = AutorEntity.class)  
    @JoinColumn(name="AUTOR_ID", referencedColumnName="ID")
    @XmlTransient
	private AutorEntity autorEntity;
    
	@OneToMany (targetEntity = ComentarioEntity.class, cascade=CascadeType.ALL, mappedBy="postagemEntity")
	private List<ComentarioEntity> listComentarioEntity; 
	
			
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPostagem() {
		return postagem;
	}

	public void setPostagem(String postagem) {
		this.postagem = postagem;
	}

	public AutorEntity getAutorEntity() {
		return autorEntity;
	}

	public void setAutorEntity(AutorEntity autorEntity) {
		this.autorEntity = autorEntity;
	}

	public List<ComentarioEntity> getListComentarioEntity() {
		return listComentarioEntity;
	}

	public void setListComentarioEntity(List<ComentarioEntity> listComentarioEntity) {
		this.listComentarioEntity = listComentarioEntity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
