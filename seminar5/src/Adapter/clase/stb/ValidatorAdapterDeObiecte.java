package Adapter.clase.stb;

import Adapter.clase.metrou.ValidatorMetrou;

public class ValidatorAdapterDeObiecte implements ValidatorSTB{
    private ValidatorMetrou validatorMetrou;

    public ValidatorAdapterDeObiecte(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaBiletMetrou();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonamentMetrou();
    }
}
