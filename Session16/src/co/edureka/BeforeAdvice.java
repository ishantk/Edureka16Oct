package co.edureka;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	// Executed before the business method of your bean object
	@Override
	public void before(Method method, Object[] arr, Object obj) throws Throwable {
		
		System.out.println("--BeforeAdvice in Execution--");
		
		System.out.println("--Detail--");
		
		// Extract Method Details
		System.out.println("Method: "+method.getName());
		
		// Read Inputs passed in business method
		for(Object o : arr){
			System.out.println(o);
		}
		
		// reference to the object
		System.out.println("obj: "+obj);
		
		System.out.println("--BeforeAdvice Execution Finished--");
	}

}
