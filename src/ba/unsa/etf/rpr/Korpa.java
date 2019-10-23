package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Artikl> artikli;

    Korpa() {
        artikli = new ArrayList<Artikl>();
    }

    Korpa(ArrayList<Artikl> ar) {
        artikli = ar;
    }

    public boolean dodajArtikl(Artikl artikl) {
        if(artikli.size() == 50) return false;
        artikli.add(artikl);
        return true;
    }

    public Artikl[] getArtikli() {
        Artikl[] temp = new Artikl[artikli.size()];
        temp = artikli.toArray(temp);
        return temp;
    }


    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl temp = new Artikl();
        for(int i = 0; i < artikli.size(); i++) {
            if(kod.equals(artikli.get(i).getKod())) {
                temp = artikli.get(i);
                artikli.remove(i);
            }
        }
        return temp;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i = 0; i < artikli.size(); i++) {
            suma += artikli.get(i).getCijena();
        }
        return suma;
    }
}
