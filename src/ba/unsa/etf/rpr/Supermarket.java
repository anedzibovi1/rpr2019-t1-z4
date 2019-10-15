package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Artikl> artikli;

    public Supermarket() {
        artikli = new ArrayList<Artikl>();
    }

    public boolean dodajArtikl(Artikl artikl) {
        if(artikli.size() == 1000) return false;
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
        if(artikli.size() == 0) System.out.println("Nema vise dostupnih artikala!");
        for(int i = 0; i < artikli.size(); i++) {
            if(kod.equals(artikli.get(i).getKod())) {
                temp = artikli.get(i);
                artikli.remove(i);
            }
        }
        return temp;
    }


}
