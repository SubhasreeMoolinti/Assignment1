package eg4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
		Employee e=(Employee)ac.getBean("m");
		System.out.println(e);
		

	}

}
