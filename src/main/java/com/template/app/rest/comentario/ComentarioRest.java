package com.template.app.rest.comentario;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.template.app.entity.ComentarioEntity;
import com.template.app.exception.AppException;
import com.template.app.rest.service.ComentarioService;

@Path("/comentario")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class ComentarioRest {
	private final static Logger LOGGER = Logger.getLogger(ComentarioRest.class.getName());
	
	@Inject
	private ComentarioService comentarioService;
	
	@GET
	@Path("/all")
	public List<ComentarioEntity> getAllComentario() throws AppException{
		LOGGER.info("ComentarioRest.getAllComentario");
		List<ComentarioEntity> listComentario = comentarioService.retrieveAll();		
		LOGGER.info("ComentarioRest.getAllComentario: " + listComentario);
		
		return listComentario;
	}
	
	@GET
	@Path("/{id}")
	public ComentarioEntity get( @PathParam("id") Long entityId) throws AppException {
		LOGGER.info("ComentarioRest.get: id " + entityId);
		ComentarioEntity comentario =  comentarioService.get(entityId);
		LOGGER.info("ComentarioRest.get: " + comentario);
		return comentario;
	}
	
	@PUT
	@Path("/update")
	public void update(ComentarioEntity entity) throws AppException {
		LOGGER.info("ComentarioRest.update: " + entity);
		comentarioService.update(entity);
	}
	
	@POST
	@Path("/create")
	public ComentarioEntity create(ComentarioEntity entity) throws AppException{
		LOGGER.info("ComentarioRest.create: " + entity);
		return comentarioService.create(entity);
	}
	
	@DELETE
	@Path("/delete")
	public void delete(ComentarioEntity entity) throws AppException{
		LOGGER.info("ComentarioRest.delete: " + entity);
		comentarioService.delete(entity);
	}
}
