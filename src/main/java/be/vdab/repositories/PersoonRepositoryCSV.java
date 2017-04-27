package be.vdab.repositories;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import be.vdab.entities.Persoon;

public class PersoonRepositoryCSV implements PersoonRepository {

    private final String bestandsPad;

    public PersoonRepositoryCSV(String bestandsPad) {
	this.bestandsPad = bestandsPad;
    }

    
//    @Override 
//    public List<Persoon> findAll() throws IOException { 
//      List<Persoon> personen = new ArrayList<>(); 
//      try (Scanner scanner = new Scanner(bestand)) { 
//        while (scanner.hasNext()) { 
//          String[] onderdelen = scanner.nextLine().split(","); 
//          personen.add(new Persoon(Integer.parseInt(onderdelen[0]), 
//            onderdelen[1], onderdelen[2], Integer.parseInt(onderdelen[3]))); 
//        } 
//      } 
//      return personen; 
//    } 
    
    @Override
    public List<Persoon> findAll() {
	List<Persoon> personen = new ArrayList<>();
	String line = "";
	String scvSplitBy = ","; 
	try (BufferedReader br = new BufferedReader(new FileReader(bestandsPad))) {
	    while ((line = br.readLine()) != null) {
		String[] arrPersoon = line.split(scvSplitBy);
		personen.add(new Persoon(
			Integer.parseInt(arrPersoon[0]),
			arrPersoon[1],
			arrPersoon[2],
			Integer.parseInt(arrPersoon[3])));
	    }
	} catch (IOException ex) {
	    ex.printStackTrace();
	}
	return personen;
    }
    
//    @Override
//    public List<Persoon> findAll() {
//	Path path = Paths.get(bestandsPad);
//	List<Persoon> personen = new ArrayList<>();
//	String scvSplitBy = ","; 
//	try (Stream<String> stream = Files.lines(path)) {
//	    stream.map(regel -> regel.split(scvSplitBy))
//	    .forEach(arrPersoonGegevens -> {
//	    	Persoon persoon = new Persoon(
//	    		Integer.parseInt(arrPersoonGegevens[0]), 
//	    		arrPersoonGegevens[1], 
//	    		arrPersoonGegevens[2], 
//	    		Integer.parseInt(arrPersoonGegevens[3]));
//	    	personen.add(persoon); 
//	    	});
//	} catch (IOException ex) {
//	    ex.printStackTrace();
//	}
//	return personen;
//    }

}
