/**
 * 
 */
package br.org.otojunior.demomeecrowave;

import org.apache.meecrowave.Meecrowave;

/**
 * @author Oto Soares Coelho Junior (oto.coelho-junior@serpro.gov.br)
 *
 */
public class DemoMeecrowaveMain {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try (Meecrowave meecrowave = new Meecrowave()) {
	        meecrowave.bake().await();
	    }
	}
}
