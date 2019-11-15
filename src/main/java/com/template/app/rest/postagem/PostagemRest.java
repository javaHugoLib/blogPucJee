package com.template.app.rest.postagem;

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

import com.template.app.entity.PostagemEntity;
import com.template.app.exception.AppException;
import com.template.app.rest.service.PostagemService;

@Path("/postagem")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class PostagemRest {
	private final static Logger LOGGER = Logger.getLogger(PostagemRest.class.getName());
	
	@Inject
	private PostagemService postagemService;
	
	@GET
	@Path("/all")
	public List<PostagemEntity> getAllAPostagem() throws AppException{
		LOGGER.info("PostagemRest.getAllAPostagem");
		List<PostagemEntity> listPostagem = postagemService.retrieveAll();		
		LOGGER.info("PostagemRest.getAllAutor: " + listPostagem);
		
		return listPostagem;
	}
	
	@GET
	@Path("/{id}")
	public PostagemEntity get( @PathParam("id") Long entityId) throws AppException {
		LOGGER.info("PostagemRest.get: id " + entityId);
		PostagemEntity postagem =  postagemService.get(entityId);
		LOGGER.info("PostagemRest.get: " + postagem);
		return postagem;
	}
	
	@PUT
	@Path("/")
	public void update(PostagemEntity entity) throws AppException {
		LOGGER.info("PostagemEntity.update: " + entity);
		postagemService.update(entity);
	}
	
	@POST
	@Path("/create")
	public PostagemEntity create(PostagemEntity entity) throws AppException{
		LOGGER.info("PostagemEntity.create: " + entity);
		return postagemService.create(entity);
	}
	
	@DELETE
	@Path("/delete")
	public void delete(PostagemEntity entity) throws AppException{
		LOGGER.info("PostagemEntity.delete: " + entity);
		postagemService.delete(entity);
	}
}
