package nl.aalten.javabuddy.newdomain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Persoon {

    private String bsnNummer;
    private String naam;
    private LocalDate geboorteDatum;
    private List<Rekening> rekeningen = new ArrayList();

    public Persoon(String bsnNummer, String naam, LocalDate geboorteDatum) {
        this.bsnNummer = bsnNummer;
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
    }

    public String getBsnNummer() {
        return bsnNummer;
    }
}