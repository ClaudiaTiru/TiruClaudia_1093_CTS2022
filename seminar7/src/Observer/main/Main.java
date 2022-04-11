package Observer.main;

import Observer.clase.Calator;
import Observer.clase.ICalator;
import Observer.clase.MijlocTransport;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport = new MijlocTransport(137,new ArrayList<>());
        ICalator c1= new Calator("Maria");
        ICalator c2 = new Calator("Andrei");
        ICalator c3 = new Calator("George");

        mijlocTransport.adaugaCalator(c1);
        mijlocTransport.adaugaCalator(c2);
        mijlocTransport.trimiteMesajPlecareCapatLinie();

        mijlocTransport.stergeCalator(c1);
        mijlocTransport.adaugaCalator(c3);

        mijlocTransport.trimiteMesaj("suntem la piata victoriei");

    }
}
