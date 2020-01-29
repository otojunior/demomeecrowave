/**
 * 
 */
package br.org.otojunior.demomeecrowave;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * @author Oto Soares Coelho Junior (oto.coelho-junior@serpro.gov.br)
 *
 */
@ApplicationScoped
public class ArtigoService {
	@Inject
	private ArtigoDao dao;
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Artigo obter(final Long id) {
		return dao.obter(id);
	}
	
	/**
	 * 
	 * @param artigo
	 * @return
	 */
	public Artigo criar(Artigo artigo) {
		return dao.salvar(artigo);
	}
}
