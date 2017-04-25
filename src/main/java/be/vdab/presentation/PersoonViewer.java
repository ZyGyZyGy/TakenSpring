package be.vdab.presentation;

import java.util.List;

import be.vdab.entities.Persoon;

public class PersoonViewer {

    private boolean aantalKinderenTonen;

    public PersoonViewer(boolean aantalKinderenTonen) {
	this.aantalKinderenTonen = aantalKinderenTonen;
    }
    
    public boolean isAantalKinderenTonen() {
	return aantalKinderenTonen;
    }

    public void afbeelden(List<Persoon> list) {
	for (Persoon persoon : list) {
	    System.out.println(
		    persoon.getPersoonNr()
		    + "; " + persoon.getVoornaam()
		    + "; " + persoon.getFamilienaam()
		    + (isAantalKinderenTonen() ? "; " + persoon.getAantalKinderen() : ""));
	}
    }

}
