package Adapter.clase.metrou;

public class ValidatorScanare implements ValidatorMetrou{

    @Override
    public void valideazaBiletMetrou() {
        System.out.println("s-a scanat bilet metrou");
    }

    @Override
    public void valideazaAbonamentMetrou() {
        System.out.println("s-a scanat abonament metrou");
    }

    @Override
    public void valideazaBiletCalatorii() {
        System.out.println("s-a scanat bilet 2 calatorii metrou");
    }
}
