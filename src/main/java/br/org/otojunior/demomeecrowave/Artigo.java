/**
 * 
 */
package br.org.otojunior.demomeecrowave;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Oto Soares Coelho Junior (oto.coelho-junior@serpro.gov.br)
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Artigo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	@Column(nullable = false, length = 30)
	private String nome;
	
	@Column(nullable = false, length = 50)
	private String autor;
}
