package com.template.app.rest.autor;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.template.app.entity.AutorEntity;
import com.template.app.entity.PostagemEntity;
import com.template.app.exception.AppException;
import com.template.app.rest.service.AutorService;

@Path("/autor")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class AutorRest {
	private final static Logger LOGGER = Logger.getLogger(AutorEntity.class.getName());
	
	@Inject
	private AutorService autorService;

	@GET
	@Path("/all")
	public List<AutorEntity> getAllAutor() throws AppException{
		LOGGER.info("AutorRest.getAllAutor");
		List<AutorEntity> listAutor = autorService.retrieveAll();		
		LOGGER.info("AutorRest.getAllAutor: "+listAutor);
		
		return listAutor;
	}
	
	@GET
	@Path("/{id}")
	public AutorEntity get( @PathParam("id") long entityId) throws AppException {
		LOGGER.info("AutorRest.get: id " + entityId);
		AutorEntity autor =  autorService.get(entityId);
		LOGGER.info("AutorRest.get: " + autor);
		return autor;
	}
	
	@GET
	@Path("/{id}/postagens")
	public List<PostagemEntity> PostagemAutor( @PathParam("id") Long entityId) throws AppException {
		LOGGER.info("AutorRest.PostagemAutor: id " + entityId);
		List<PostagemEntity> postagens =  autorService.getPostagemAutor(entityId);
		LOGGER.info("AutorRest.PostagemAutor: " + postagens);
		return postagens;
	}
	
	@PUT
	@Path("/")
	public void update(AutorEntity entity) throws AppException {
		LOGGER.info("AutorRest.update: " + entity);
		autorService.update(entity);
	}
	
	@POST
	@Path("/create")
	public AutorEntity create(AutorEntity entity) throws AppException{
		LOGGER.info("AutorRest.create: " + entity);
		return autorService.create(entity);
	}
	
	@DELETE
	@Path("/delete")
	public void delete(AutorEntity entity) throws AppException{
		LOGGER.info("AutorRest.delete: " + entity);
		autorService.delete(entity);
	}
}
