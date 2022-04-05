package Adapter.clase.stb;

public class ValidatorNFC implements ValidatorSTB{
    @Override
    public void valideazaBilet() {
        System.out.println("biletul a fost validat");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("abonamentul a fost validat");
    }
}
