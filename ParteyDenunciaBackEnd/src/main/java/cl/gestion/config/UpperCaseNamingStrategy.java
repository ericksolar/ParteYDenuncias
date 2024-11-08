package cl.gestion.config;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;


public class UpperCaseNamingStrategy extends SpringPhysicalNamingStrategy {
    @Override
    protected Identifier getIdentifier(String name, boolean quoted, JdbcEnvironment jdbcEnvironment) {
        return new Identifier(UnderscoreToSnakeCase(name), quoted);
        //return new Identifier(name.toUpperCase(), quoted);
    }
    
    private String UnderscoreToSnakeCase(String id) {
    	return id.replaceAll("_", "");
    }
    
}