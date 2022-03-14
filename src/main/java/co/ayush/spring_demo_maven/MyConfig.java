package co.ayush.spring_demo_maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean
	public Student1 getStudent() {
		Student1 st=new Student1();
		return st;
	}

}
