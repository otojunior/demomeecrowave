/**
 * 
 */
package br.org.otojunior.demomeecrowave;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author Oto Soares Coelho Junior (oto.coelho-junior@serpro.gov.br)
 *
 */
@ApplicationScoped
public class ArtigoService {
	private Map<Integer, Artigo> cache = new HashMap<>();
	
	/**
	 * 
	 */
	public ArtigoService() {
		cache.put(1, new Artigo(1, "Artigo 1", "Jorge Silva"));
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Artigo obter(final Integer id) {
		return cache.get(id);
	}
	
	/**
	 * 
	 * @param artigo
	 * @return
	 */
	public Artigo criar(Artigo artigo) {
		return cache.put(artigo.getId(), artigo);
	}
}
