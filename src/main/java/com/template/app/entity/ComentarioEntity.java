package com.template.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import java.util.Date;

@Entity
@Table(name="COMENTARIO")
@SequenceGenerator(name = "COMENTARIO_ID_GENERATOR", sequenceName = "SE_COMENTARIO", allocationSize = 1)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

@NamedQueries({
    @NamedQuery(name="ComentarioEntity.retrieveAll", query="Select distinct coment from ComentarioEntity coment order by coment.data desc")
}) 

public class ComentarioEntity implements IEntity<Long> {
	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMENTARIO_ID_GENERATOR")	
	private Long id;
	
	@NotNull 
	@Size(min=2, max = 400)
	@Column
	private String comentario;
	
	@Size(min=2, max = 100)
	@Column
	private String nomeAutorCriador;
	
	@Column
	private Date data;
	
    @ManyToOne (targetEntity = PostagemEntity.class)  
    @JoinColumn(name="postagem_id", referencedColumnName="id")
    @XmlTransient
	private PostagemEntity postagemEntity;
	
	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getNomeAutorCriador() {
		return nomeAutorCriador;
	}

	public void setNomeAutorCriador(String nomeAutorCriador) {
		this.nomeAutorCriador = nomeAutorCriador;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public PostagemEntity getPostagemEntity() {
		return postagemEntity;
	}

	public void setPostagemEntity(PostagemEntity postagemEntity) {
		this.postagemEntity = postagemEntity;
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
