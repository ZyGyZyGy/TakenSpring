package be.vdab.repositories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import be.vdab.entities.Persoon;


class PersoonRepositoryMeerdereRegels implements PersoonRepository {

    private final String bestandsPad;
    
    PersoonRepositoryMeerdereRegels(String bestandsPad) {
	this.bestandsPad = bestandsPad;
    }
    
    @Override
    public List<Persoon> findAll() {
	Path path = Paths.get(bestandsPad);
	List<Persoon> personen = new ArrayList<>();
	try (Stream<String> stream = Files.lines(path)) {
	    List<String> regels = stream.collect(Collectors.toList());
	    for (int i = 0; i < regels.size(); i += 4) {
		Persoon persoon = new Persoon(
			Integer.parseInt(regels.get(i)),
			regels.get(i + 1),
			regels.get(i + 2),
			Integer.parseInt(regels.get(i + 3)));
		personen.add(persoon);
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}
	return personen;
    }

}
