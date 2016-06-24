package fr.treeptik.springsample.runtime;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.treeptik.springsample.model.Personne;
import fr.treeptik.springsample.service.PersonneServiceImpl;

public class Runtime {

	public static void main(String[] args) {

		System.setProperty("spring.profiles.active", "jpa");

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"application-context.xml");

		for (String string : applicationContext.getBeanDefinitionNames()) {
			System.out.println(string);
		}
		PersonneServiceImpl personneService = (PersonneServiceImpl) applicationContext.getBean("personneService");

		personneService = applicationContext.getBean(PersonneServiceImpl.class);

		personneService = applicationContext.getBean("personneService", PersonneServiceImpl.class);

		personneService.save(new Personne());

		applicationContext.close();
	}

}
