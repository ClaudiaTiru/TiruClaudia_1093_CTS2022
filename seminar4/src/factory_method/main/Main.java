package factory_method.main;

import factory_method.clase.MijlocTransport;
import factory_method.factory.AutobuzFactory;
import factory_method.factory.Factory;
import factory_method.factory.TramvaiFactory;
import factory_method.factory.TroleibuzFactory;

public class Main {
    public static void afisareMijlocTransport(Factory factory, String numarInmatriculare) {
        MijlocTransport mijlocTransport = factory.getMijlocTransport(numarInmatriculare);
        mijlocTransport.afiseazaDescriere();
    }

    public static void main(String[] args) {
        afisareMijlocTransport(new AutobuzFactory(), "B-22-YYY");

        MijlocTransport troleibuz = new TroleibuzFactory().getMijlocTransport("B-224566");
        troleibuz.afiseazaDescriere();

        new TramvaiFactory().getMijlocTransport("B-456834").afiseazaDescriere();
    }
}
