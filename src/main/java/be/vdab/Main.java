package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.repositories.PersoonRepositoryCSV;

public class Main {

    public static void main(String[] args) {

	try (ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("container.xml")) {
	    context.getBean(PersoonRepositoryCSV.class).findAll()
		    .forEach(persoon -> System.out.println(persoon.toString()));
	}
    }

}

