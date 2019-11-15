package com.template.app.rest.autor;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.template.app.entity.AutorEntity;
import com.template.app.exception.AppException;
import com.template.app.rest.service.autor.AutorService;

@Path("/autor")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class AutorRest {
	private final static Logger LOGGER = Logger.getLogger(AutorEntity.class.getName());
	
	@Inject
	private AutorService autorService;

	@GET
	@Path("/")
	public List<AutorEntity> getAllAutor() throws AppException{
		LOGGER.info("AutorRest.getAllAutor");
		List<AutorEntity> listAutor = autorService.GetAllAutor();		
		LOGGER.info("AutorRest.getAllAutor: "+listAutor);
		
		return listAutor;
	}
	
	@GET
	@Path("/{id}")
	public AutorEntity get( @PathParam("id") Long entityId) throws AppException {
		LOGGER.info("AuthorRest.getAuthor: id " + entityId);
		AutorEntity author =  autorService.get(entityId);
		LOGGER.info("AuthorRest.getAuthor: " + author);
		return author;
	}
	
	@PUT
	@Path("/")
	public void update(AutorEntity entity) throws AppException {
		LOGGER.info("AuthorRest.update: " + entity);
		autorService.update(entity);
	}
	
	@POST
	@Path("/create")
	public AutorEntity create(AutorEntity entity) throws AppException{
		LOGGER.info("AuthorRest.create: " + entity);
		return autorService.create(entity);
	}
	
	@DELETE
	@Path("/")
	public void delete(AutorEntity entity) throws AppException{
		LOGGER.info("AuthorRest.delete: " + entity);
		autorService.delete(entity);
	}
}
