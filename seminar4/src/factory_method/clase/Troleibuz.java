package factory_method.clase;

import factory_method.clase.MijlocTransport;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Troleibuz " + super.getNumarInmatriculare());
    }
}
