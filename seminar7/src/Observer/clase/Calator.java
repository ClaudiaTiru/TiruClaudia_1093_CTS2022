package Observer.clase;

public class Calator implements ICalator{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primireMesaj(String mesaj) {
        System.out.println(this.nume + " a primit mesajul: "+ mesaj);
    }
}
