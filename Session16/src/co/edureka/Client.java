package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		// Spring Way | IOC
		// SpringContainer
		
		Resource resource = new ClassPathResource("aop.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student sRef = factory.getBean("stuProxy",Student.class);
		
		sRef.saveMyData("Cloud"); // Call to the business method
		// BeforeAdvice will be executed before business method
		// AfterAdvice will be executed after business method

	}

}
