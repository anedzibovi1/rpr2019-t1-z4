package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Artikl {
    private String naziv;
    private double cijena;
    private String kod;

    public Artikl() {
        naziv = "";
        cijena = 0;
        kod = "";
    }

    public Artikl(Artikl a) {
        naziv = a.naziv;
        cijena = a.cijena;
        kod = a.kod;
    }

    public Artikl(String n, int c, String k) {
        naziv=n;
        cijena=c;
        kod=k;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}

