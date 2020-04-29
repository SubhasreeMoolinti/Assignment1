package p2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import p2.Address;
//import p2.Employee;
@Configuration
public class annot {
	@Bean
public Employee getEmp()
{
	return new Employee();
}
	
	@Bean
public Address getAdr()
{
	return new Address();
}
}

