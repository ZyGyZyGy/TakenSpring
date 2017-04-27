package be.vdab;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.presentation.PersoonViewer;

public class Main {

    public static void main(String[] args) {

	try (ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("container.xml")) {
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
