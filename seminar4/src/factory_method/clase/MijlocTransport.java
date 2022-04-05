package factory_method.clase;

public abstract class MijlocTransport {
    private String numarInmatriculare;

    public MijlocTransport(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    public abstract void afiseazaDescriere();

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    @Override
    public String toString() {
        return "MijlocTransport{" +
                "numarInmatriculare='" + numarInmatriculare + '\'' +
                '}';
    }
}
