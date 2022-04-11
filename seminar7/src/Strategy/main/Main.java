package Strategy.main;

import Strategy.clase.CardBancar;
import Strategy.clase.CardSTB;
import Strategy.clase.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(10);
        validator.validareCalatorie();

        validator.setModPlata(new CardBancar());
        validator.validareCalatorie();
    }
}
