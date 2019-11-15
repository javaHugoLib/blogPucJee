package com.template.app.rest.service.comentario;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.template.app.entity.ComentarioEntity;

@Stateless
public class ComentarioService {
	private final static Logger logger = Logger.getLogger(ComentarioService.class.getName());
	
	@PersistenceContext(unitName = "blog-persistence-unit")
	private EntityManager entityManater;
	
	public List<ComentarioEntity> retrieveAll() {			
		logger.info("ComentarioEntity.retrieveAll");				
		List<ComentarioEntity> listAutor = entityManater.createNamedQuery("ComentarioEntity.retrieveAll").getResultList();
		return listAutor;					
	}
	
	public ComentarioEntity get(Long id) {
		logger.info("ComentarioEntity.get");
		ComentarioEntity comentario = GetComentario(id);
		return comentario;
	}
	
	public ComentarioEntity create(ComentarioEntity comentarioEntity) {	
		logger.info("ComentarioEntity.create");
		entityManater.persist(comentarioEntity);
		return comentarioEntity;				
	}
	
	public void delete(ComentarioEntity comentarioEntity) {
		entityManater.remove(entityManater.contains(comentarioEntity) ? comentarioEntity : entityManater.merge(comentarioEntity));				
	}

	private ComentarioEntity GetComentario(Long idComentario) {		
		CriteriaBuilder cb = entityManater.getCriteriaBuilder();
		CriteriaQuery<ComentarioEntity> q = cb.createQuery(ComentarioEntity.class);
		Root<ComentarioEntity> o = q.from(ComentarioEntity.class);

		q.where(cb.equal(o.get("id"), idComentario));

		ComentarioEntity comentarioEntity = (ComentarioEntity)entityManater.createQuery(q).getSingleResult();
		return comentarioEntity;
	}	
}
