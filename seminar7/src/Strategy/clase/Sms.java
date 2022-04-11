package Strategy.clase;

public class Sms implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("Plata a fost efectuata prin sms avand pretul de "+ pret);
    }
}
