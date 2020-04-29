package p2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//import p2.Address;
//import p2.Employee;
//import p2.annot;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ApplicationContext ctx = new AnnotationConfigApplicationContext(annot.class);
		 
				
		
		System.out.println("====== spring container created. ===========");

		Employee e=(Employee)ctx.getBean("getEmp");
		Address a=(Address)ctx.getBean("getAdr");
		a.setCity("huzurnagar");
		a.setState("Telangana");
		a.setZipcode(508204);
		 		
		 e.setEid(101);
		 e.setEname("Mani");
		 e.setEsal(10000);
		 e.setAd(a);
		 e.toString();
		 System.out.println(e);
		 
		// ctx.close();
		 
		

	}

}
