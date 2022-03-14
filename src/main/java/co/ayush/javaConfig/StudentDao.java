package co.ayush.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("studentDao")
@Configuration
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveStudent(Student st) {
		String qry = "insert into student values (?,?)";

		int i = jdbcTemplate.update(qry, st.getStid(), st.getStname());
		return i;
	}


}
