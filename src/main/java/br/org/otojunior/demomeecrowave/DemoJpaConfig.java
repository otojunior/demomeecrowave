/**
 * 
 */
package br.org.otojunior.demomeecrowave;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

import org.apache.meecrowave.jpa.api.PersistenceUnitInfoBuilder;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

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
		final HikariConfig config = new HikariConfig();
		config.setDriverClassName("org.postgresql.Driver");
		config.setJdbcUrl("jdbc:postgresql://localhost/demo");
		config.setUsername("postgres");
		config.setPassword("serpro");
		config.setMinimumIdle(10);
		config.setMaximumPoolSize(30);
		return new HikariDataSource(config);
    }
}
