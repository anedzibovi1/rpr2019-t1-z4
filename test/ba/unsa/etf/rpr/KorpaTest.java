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
    void getArtikli() {

    }

    @Test
    void izbaciArtiklSaKodom() {

    }

    @Test
    void dajUkupnuCijenuArtikala() {
    }
}