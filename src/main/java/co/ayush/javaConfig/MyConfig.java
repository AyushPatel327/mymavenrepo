package co.ayush.javaConfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration("myconfig")
@ComponentScan("co.ayush.javaConfig")
public class MyConfig {

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5432/training");
		ds.setUsername("postgres");
		ds.setPassword("admin");
		return ds;
	}
}
