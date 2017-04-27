package be.vdab;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.vdab.presentation.PersoonViewer;
import be.vdab.presentation.PresentationConfig;
import be.vdab.repositories.RepositoryConfig;
import be.vdab.services.ServicesConfig;

public class Main {

    public static void main(String[] args) {

	try (AnnotationConfigApplicationContext context = 
		new AnnotationConfigApplicationContext(
			RepositoryConfig.class, ServicesConfig.class, PresentationConfig.class)) {
	    try {
		context.getBean(PersoonViewer.class).afbeelden();
	    } catch (BeansException e) {
		e.printStackTrace();
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}
    }

}
