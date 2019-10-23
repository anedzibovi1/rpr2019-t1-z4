package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtiklUPunuKorpu() {
        ArrayList<Artikl> novi = new ArrayList<Artikl>();
        for(int i=0;i<50; i++) novi.add(new Artikl());
        Korpa korpa = new Korpa(novi);
        assertFalse(korpa.dodajArtikl(new Artikl("Mobitel", 500, "2345")));
    }

    @Test
    void dodajArtiklNormalno() {
        ArrayList<Artikl> novi = new ArrayList<Artikl>();
        for(int i=0;i<10; i++) novi.add(new Artikl());
        Korpa korpa = new Korpa(novi);
        assertTrue(korpa.dodajArtikl(new Artikl("Mobitel", 500, "2345")));
    }

    @Test
    void izbaciArtiklSaKodomTest() {
        ArrayList<Artikl> novi = new ArrayList<Artikl>();
        novi.add(new Artikl("Nesto", 500, "345"));
        novi.add(new Artikl("Nesto2", 400, "555"));
        Korpa korpa = new Korpa(novi);
        korpa.izbaciArtiklSaKodom("345");
        assertEquals(1, korpa.getArtikli().length);
    }

    @Test
    void dajUkupnuCijenuArtikalaTest() {
        ArrayList<Artikl> novi = new ArrayList<Artikl>();
        novi.add(new Artikl("Biciklo", 1000, "1"));
        novi.add(new Artikl("Biciklo", 1000, "2"));
        novi.add(new Artikl("Biciklo", 1000, "3"));
        novi.add(new Artikl("Biciklo", 1000, "4"));
        novi.add(new Artikl("Biciklo", 1000, "5"));
        novi.add(new Artikl("Biciklo", 1000, "6"));
        novi.add(new Artikl("Biciklo", 1000, "7"));
        novi.add(new Artikl("Biciklo", 1000, "8"));
        novi.add(new Artikl("Biciklo", 1000, "9"));
        Korpa korpa = new Korpa(novi);
        assertEquals(9000, korpa.dajUkupnuCijenuArtikala());
    }
}