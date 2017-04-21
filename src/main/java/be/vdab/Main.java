package be.vdab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.entities.Persoon;
import be.vdab.presentation.PersoonViewer;

public class Main {

    public static void main(String[] args) {

	List<Persoon> list = new ArrayList<>();
	list.add(new Persoon(1, "Alex", "Jegorov", 0));
	list.add(new Persoon(2, "Igor", "Baranovskij", 5));
	list.add(new Persoon(3, "Pavel", "Gushin", 25));
	list.add(new Persoon(4, "Joe", "Rogan", 3));

	try (ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("container.xml")) {
	    context.getBean(PersoonViewer.class).afbeelden(list);
	}
    }

}
