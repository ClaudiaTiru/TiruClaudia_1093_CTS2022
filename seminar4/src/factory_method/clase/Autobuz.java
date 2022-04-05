package factory_method.clase;

public class Autobuz extends MijlocTransport {

    public Autobuz(String numarInmatriculare) {
        super(numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Autobuz " + super.getNumarInmatriculare());
    }
}
