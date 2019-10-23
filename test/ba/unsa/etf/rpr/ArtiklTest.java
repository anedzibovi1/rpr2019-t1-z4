package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("Mobitel", 455, "123");
        assertEquals(a.getNaziv(), "Mobitel");
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("Mobitel", 455, "123");
        assertEquals(a.getNaziv(), 455);
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("Mobitel", 455, "123");
        assertEquals(a.getNaziv(), "123");
    }
}