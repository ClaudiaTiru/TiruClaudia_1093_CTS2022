package Strategy.clase;

public class CardSTB implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("Plata a fost efectuata prin card STB avand pretul de "+ pret);
    }
}
