package Adapter.clase.stb;

import Adapter.clase.metrou.ValidatorScanare;

public class ValidatorAdapterDeClase extends ValidatorScanare implements ValidatorSTB {
    //extindem clase pentru care am creat adapter deoarece daca implementam interfata ne-ar fi cerut sa implementan ci validarebiletcalatori


    @Override
    public void valideazaBilet() {
        super.valideazaBiletMetrou();
    }

    @Override
    public void valideazaAbonament() {
        super.valideazaAbonamentMetrou();
    }
}
