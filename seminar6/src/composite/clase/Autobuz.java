package composite.clase;


import java.lang.UnsupportedOperationException;

public class Autobuz implements MijlocTransport{

    private String model;
    private String producator;
    private int nrLocuri;

    public Autobuz(String model, String producator, int nrLocuri) {
        this.model = model;
        this.producator = producator;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", producator='" + producator + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(toString());
    }

    @Override
    public void adaugaMijlocTransport(MijlocTransport mijlocTransport) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void stergeMijlocTransport(MijlocTransport mijlocTransport) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public MijlocTransport getMijlocTransport(int index) {
        throw  new UnsupportedOperationException();
    }
}
