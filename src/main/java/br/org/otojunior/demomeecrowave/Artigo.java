/**
 * 
 */
package br.org.otojunior.demomeecrowave;

import java.io.Serializable;

/**
 * @author Oto Soares Coelho Junior (oto.coelho-junior@serpro.gov.br)
 *
 */
public class Artigo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String autor;
	
	/**
	 * 
	 */
	public Artigo() { }
	
	/**
	 * @param id
	 * @param nome
	 * @param autor
	 */
	public Artigo(final Integer id, final String nome, final String autor) {
		this.id = id;
		this.nome = nome;
		this.autor = autor;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
