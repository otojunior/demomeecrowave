/**
 * 
 */
package br.org.otojunior.demomeecrowave;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * @author Oto Soares Coelho Junior (oto.coelho-junior@serpro.gov.br)
 *
 */
@RequestScoped
@Path("artigo")
public class ArtigoRest {
	@Inject
	private ArtigoService service;
	
	/**
	 * 
	 * @return
	 */
	@GET
	@Path("{id}")
	public Response obter(@PathParam("id") Integer id) {
		return Response
			.ok()
			.entity(service.obter(id))
			.build();
	}
	
	/**
	 * 
	 * @param artigo
	 * @return
	 */
	@POST
	public Response criar(Artigo artigo) {
		return Response
			.status(Status.CREATED)
			.entity(service.criar(artigo))
			.build();
	}
}
