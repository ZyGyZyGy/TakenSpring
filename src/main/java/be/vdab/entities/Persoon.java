package be.vdab.entities;

public class Persoon {

    private int persoonNr;
    private String voornaam;
    private String familienaam;
    private int aantalKinderen;

    public Persoon(int persoonNr, String voornaam, String familienaam, int aantalKinderen) {
	this.persoonNr = persoonNr;
	this.voornaam = voornaam;
	this.familienaam = familienaam;
	this.aantalKinderen = aantalKinderen;
    }

    public int getPersoonNr() {
	return persoonNr;
    }

    public void setPersoonNr(int persoonNr) {
	this.persoonNr = persoonNr;
    }

    public String getVoornaam() {
	return voornaam;
    }

    public void setVoornaam(String voornaam) {
	this.voornaam = voornaam;
    }

    public String getFamilienaam() {
	return familienaam;
    }

    public void setFamilienaam(String familienaam) {
	this.familienaam = familienaam;
    }

    public int getAantalKinderen() {
	return aantalKinderen;
    }

    public void setAantalKinderen(int aantalKinderen) {
	this.aantalKinderen = aantalKinderen;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + persoonNr;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (!(obj instanceof Persoon))
	    return false;
	Persoon other = (Persoon) obj;
	return persoonNr == other.persoonNr;
    }
    
    @Override
    public String toString() {
	return persoonNr + "; " + voornaam + "; " + familienaam + "; " + aantalKinderen;
    }

}
