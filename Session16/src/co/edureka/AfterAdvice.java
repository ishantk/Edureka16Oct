package co.edureka;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{
	
	@Override
	public void afterReturning(Object obj1, Method method, Object[] arr, Object obj2) throws Throwable {
		
		System.out.println("--AfterAdvice in Execution--");
		
		System.out.println("--Detail--");
		
		// Extract Method Details
		System.out.println("Method: "+method.getName());
		
		// Read Inputs passed in business method
		for(Object o : arr){
			System.out.println(o);
		}
		
		// reference to the object
		System.out.println("obj1: "+obj1);
		System.out.println("obj2: "+obj2);
		
		System.out.println("--AfterAdvice Execution Finished--");
	}
}
