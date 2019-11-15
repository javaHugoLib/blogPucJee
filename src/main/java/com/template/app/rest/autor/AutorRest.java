package com.template.app.rest.autor;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.template.app.entity.AutorEntity;
import com.template.app.entity.CompanyEntity;
import com.template.app.exception.AppException;
import com.template.app.rest.company.CompanyRest;
import com.template.app.rest.service.autor.AutorService;
import com.template.app.rest.service.company.CompanyService;

@Path("/autor")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class AutorRest {
	private final static Logger LOGGER = Logger.getLogger(CompanyRest.class.getName());
	
	@Inject
	private AutorService autorService;

	@GET
	@Path("/all")
	public List<AutorEntity> getAllAutor() throws AppException{
		LOGGER.info("AutorRest.getAllAutor");
		List<AutorEntity> listAutor = autorService.GetAllAutor();		
		LOGGER.info("AutorRest.getAllAutor: "+listAutor);
		
		return listAutor;
	}
	
	@POST
	@Path("/create")
	public AutorEntity create(AutorEntity entity) throws AppException{
		return autorService.create(entity);
	}
	
	@DELETE
	@Path("/delete")
	public void delete(AutorEntity entity) throws AppException{
		autorService.delete(entity);
	}
}
