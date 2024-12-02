package learnConfiguration.springFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(HelloLearnConfiguration.class);

		System.out.println(context.getBean("Branch"));
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("year"));
		System.out.println(context.getBean("grade"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("student"));
		System.out.println(context.getBean("student2"));

	}

}
