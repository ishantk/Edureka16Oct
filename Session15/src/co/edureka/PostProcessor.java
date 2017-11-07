package co.edureka;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanId) throws BeansException {
		System.out.println("--postProcessAfterInitialization-- "+beanId);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanId) throws BeansException {
		System.out.println("--postProcessBeforeInitialization-- "+beanId);
		return bean;
	}

}
