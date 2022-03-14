package co.ayush.spring_demo_maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Student student=context.getBean(Student.class);
		
		System.out.println(student);
		
	
	}

}
