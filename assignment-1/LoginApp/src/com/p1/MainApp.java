package com.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
	try
	{
		
ApplicationContext context=new ClassPathXmlApplicationContext("beans-aop-xml.xml");
Account account=context.getBean(Account.class);

java.util.Random r=new java.util.Random();
int otp=r.nextInt(10000);
System.out.println("otp="+otp);



System.out.println("Accno   :"+account.getAccno());
System.out.println("Name    :"+account.getName());
System.out.println("Balance :"+account.getBalance());
System.out.println(account);
System.out.println("Fund transferred sucessfully");

account.printThrowException();

((ClassPathXmlApplicationContext)context).close();

	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}