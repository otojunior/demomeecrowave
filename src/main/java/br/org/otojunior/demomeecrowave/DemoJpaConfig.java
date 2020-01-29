/**
 * 
 */
package br.org.otojunior.demomeecrowave;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

import org.apache.meecrowave.jpa.api.PersistenceUnitInfoBuilder;
import org.h2.jdbcx.JdbcDataSource;

/**
 * @author Oto Soares Coelho Junior (oto.coelho-junior@serpro.gov.br)
 *
 */
@ApplicationScoped
public class DemoJpaConfig {
	/**
	 * 
	 * @param datasource
	 * @return
	 */
	@Produces
    public PersistenceUnitInfoBuilder unit(final DataSource datasource) {
        return new PersistenceUnitInfoBuilder()
            .setUnitName("test")
            .setDataSource(datasource)
            .setExcludeUnlistedClasses(true)
            .addManagedClazz(Artigo.class)
            .addProperty("openjpa.RuntimeUnenhancedClasses", "supported")
            .addProperty("openjpa.jdbc.SynchronizeMappings", "buildSchema");
    }
	
	/**
	 * 
	 * @return
	 */
	@Produces
    @ApplicationScoped
    public DataSource dataSource() {
        final JdbcDataSource datasource = new JdbcDataSource();
        datasource.setUrl("jdbc:h2:~/.sample/demomeecrowavedb");
        //datasource.setUser("sa");
        //datasource.setPassword("");
        return datasource;
    }
}
