package composite.main;

import composite.clase.Autobuz;
import composite.clase.Grup;
import composite.clase.MijlocTransport;
import java.lang.UnsupportedOperationException;


public class Main {
    public static void main(String[] args) {
        MijlocTransport a1 = new Autobuz("STB", "MERCEDES", 10);
        MijlocTransport a2 = new Autobuz("RATB", "OTOKAR", 8);
        MijlocTransport a3 = new Autobuz("PTB", "AUDI", 40);

        MijlocTransport grup1 = new Grup("Mici");
        MijlocTransport grup2 = new Grup("Medii");
        MijlocTransport grup3 = new Grup("Flota");

        try {
            grup1.adaugaMijlocTransport(a1);
            grup1.adaugaMijlocTransport(a2);
            grup2.adaugaMijlocTransport(a3);
            grup3.adaugaMijlocTransport(grup1);
            grup3.adaugaMijlocTransport(grup2);
        }catch(UnsupportedOperationException e){
            e.printStackTrace();
        }

        grup3.afiseazaDescriere();
    }
}