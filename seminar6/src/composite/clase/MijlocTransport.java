package composite.clase;

public interface MijlocTransport {
    public void afiseazaDescriere();
    public void adaugaMijlocTransport(MijlocTransport mijlocTransport);
    public void stergeMijlocTransport(MijlocTransport mijlocTransport);
    public MijlocTransport getMijlocTransport(int index);
}
