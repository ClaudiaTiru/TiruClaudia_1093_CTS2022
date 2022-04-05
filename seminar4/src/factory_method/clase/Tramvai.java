package factory_method.clase;

import factory_method.clase.MijlocTransport;

public class Tramvai extends MijlocTransport {
    public Tramvai(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Tramvai " + super.getNumarInmatriculare());
    }
}
