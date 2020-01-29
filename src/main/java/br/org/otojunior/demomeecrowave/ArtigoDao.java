/**
 * 
 */
package br.org.otojunior.demomeecrowave;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.apache.meecrowave.jpa.api.Jpa;
import org.apache.meecrowave.jpa.api.Unit;

/**
 * @author Oto Soares Coelho Junior (oto.coelho-junior@serpro.gov.br)
 *
 */
@ApplicationScoped
@Jpa(transactional = false)
public class ArtigoDao {
	@Inject
    @Unit(name = "test")
    private EntityManager em;

	/**
	 * 
	 * @param artigo
	 * @return
	 */
	@Jpa
    public Artigo salvar(final Artigo artigo) {
        em.persist(artigo);
        return artigo;
    }

    /**
     * 
     * @param id
     * @return
     */
    public Artigo obter(final Long id) {
        return em.find(Artigo.class, id);
    }
}
