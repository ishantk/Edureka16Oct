package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		// Traditionally
		Employee eRef1 = new Employee();
		eRef1.setEid(101);
		eRef1.setName("George");
		eRef1.setEmail("george@example.com");
		eRef1.setAddress("Country Home North");
		eRef1.setSalary(50000);
		
		Employee eRef2 = new Employee(201,"Fionna",67000,"fionna@example.com","Redwood Shores");
		
		System.out.println("eRef1 is: "+eRef1);
		System.out.println("eRef2 is: "+eRef2);
		
		// Spring Way
		// Don't Create Objects. Create a SpringContainer, which will create Objects and manages the same.
		// 1. BeanFactory 
		
		/*Resource resource = new ClassPathResource("employeebean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Employee e3 = factory.getBean("eRef3",Employee.class);
		Employee e4 = (Employee)factory.getBean("eRef4");
		
		System.out.println("e3 is: "+e3);
		System.out.println("e4 is: "+e4);*/
		
		//2. ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
		/*Employee e3 = context.getBean("eRef3",Employee.class);
		Employee e4 = (Employee)context.getBean("eRef4");
		
		System.out.println("e3 is: "+e3);
		System.out.println("e4 is: "+e4);*/
		
//		Employee e3 = context.getBean("eRef3",Employee.class);
//		Employee e4 = context.getBean("eRef3",Employee.class);
//		
//		System.out.println("e3 is: "+e3);
//		System.out.println("e4 is: "+e4);
		
		
		/*Father f = context.getBean("fRef",Father.class);
		System.out.println(f);
		Child c = context.getBean("cRef",Child.class);
		System.out.println(c);*/
		
		//Person p = context.getBean("pRef",Person.class);
		//System.out.println("p is: "+p);
		
		//System.out.println("Certificates: "+p.getCertificates());
		
		CB cbRef = context.getBean("cb",CB.class);
		CA caRef = cbRef.getCa();
		
		caRef.sayHello("George");
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
		
	}

}
