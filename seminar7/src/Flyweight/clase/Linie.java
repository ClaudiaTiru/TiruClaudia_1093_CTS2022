package Flyweight.clase;

public class Linie {
    private int numarLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int numarLinie, String primaStatie, String ultimaStatie) {
        this.numarLinie = numarLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        return "Linie{" +
                "numarLinie=" + numarLinie +
                ", primaStatie='" + primaStatie + '\'' +
                ", ultimaStatie='" + ultimaStatie + '\'' +
                '}';
    }
}
