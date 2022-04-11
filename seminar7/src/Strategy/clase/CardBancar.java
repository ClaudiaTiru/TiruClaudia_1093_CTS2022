package Strategy.clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("Plata a fost efectuata prin card bancar avand pretul de "+ pret);
    }
}
