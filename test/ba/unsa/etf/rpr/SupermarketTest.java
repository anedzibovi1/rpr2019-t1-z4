package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtiklUPunuKorpu() {
        ArrayList<Artikl> novi = new ArrayList<Artikl>();
        for(int i=0;i<1000; i++) novi.add(new Artikl());
        Supermarket sup = new Supermarket(novi);
        assertFalse(sup.dodajArtikl(new Artikl("Mobitel", 500, "2345")));
    }

    @Test
    void dodajArtiklNormalno() {
        ArrayList<Artikl> novi = new ArrayList<Artikl>();
        for(int i=0;i<10; i++) novi.add(new Artikl());
        Supermarket sup = new Supermarket(novi);
        assertTrue(sup.dodajArtikl(new Artikl("Mobitel", 500, "2345")));
    }

    @Test
    void izbaciArtiklSaKodom() {
        ArrayList<Artikl> novi = new ArrayList<Artikl>();
        novi.add(new Artikl("Nesto", 500, "345"));
        novi.add(new Artikl("Nesto2", 400, "555"));
        Supermarket sup = new Supermarket(novi);
        sup.izbaciArtiklSaKodom("345");
        assertEquals(1, sup.getArtikli().length);
    }
}