package be.vdab.presentation;

import java.io.IOException;
import java.util.List;

import be.vdab.entities.Persoon;
import be.vdab.services.PersoonService;

public class PersoonViewer {

    private final PersoonService persoonService;

    public PersoonViewer(PersoonService persoonService) {
	this.persoonService = persoonService;
    }

    public void afbeelden() throws IOException {
	List<Persoon> personen = persoonService.findAll();
	for (Persoon persoon : personen) {
	    System.out.println(persoon.toString());
	}
    }

}
