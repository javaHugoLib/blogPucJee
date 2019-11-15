package com.template.app.rest.service;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.template.app.entity.AutorEntity;
import com.template.app.entity.PostagemEntity;

@Stateless
public class AutorService {
	private final static Logger logger = Logger.getLogger(AutorService.class.getName());

	@PersistenceContext(unitName = "blog-persistence-unit")
	private EntityManager entityManater;

	public List<AutorEntity> retrieveAll() {
		logger.info("AutorEntity.retrieveAll");
		List<AutorEntity> listAutor = entityManater.createNamedQuery("AutorEntity.retrieveAll").getResultList();
		return listAutor;
	}

	public AutorEntity get(long entityId) {
		logger.info("AutorEntity.get");
		AutorEntity a = GetAutor(entityId);
		return a;
	}

	public AutorEntity create(AutorEntity autorEntity) {
		logger.info("AutorEntity.create");
		entityManater.persist(autorEntity);
		return autorEntity;
	}

	public void delete(AutorEntity autorEntity) {
		entityManater.remove(entityManater.contains(autorEntity) ? autorEntity : entityManater.merge(autorEntity));
	}

	public void update(AutorEntity autor) {
		entityManater.merge(autor);
	}

	public List<PostagemEntity> getPostagemAutor(Long idAutor) {
		AutorEntity autor = GetAutor(idAutor);
		return autor != null ? autor.getPostagens() : null;
	}

	private AutorEntity GetAutor(Long idAutor) {
		CriteriaBuilder cb = entityManater.getCriteriaBuilder();
		CriteriaQuery q = cb.createQuery(AutorEntity.class);
		Root o = q.from(AutorEntity.class);
		q.where(cb.equal(o.get("id"), idAutor));

		try {
			return (AutorEntity) entityManater.createQuery(q).getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}
}
