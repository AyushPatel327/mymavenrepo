package co.ayush.spring_demo_maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
	public static void main(String[] args) {
			
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Student1 st=(Student1)context.getBean(Student1.class);
		System.out.println(st.getStid() + " " + st.getStname() + " ");
	}
}
