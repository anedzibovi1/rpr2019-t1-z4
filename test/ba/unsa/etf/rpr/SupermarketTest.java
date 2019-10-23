package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        ArrayList<Artikl> novi = new ArrayList<Artikl>();
        for(int i=0;i<1000; i++) novi.add(new Artikl());
        Supermarket sup = new Supermarket(novi);
        assertFalse(sup.dodajArtikl(new Artikl("Mobitel", 500, "2345")));
    }

    @Test
    void getArtikli() {

    }

    @Test
    void izbaciArtiklSaKodom() {
    }
}