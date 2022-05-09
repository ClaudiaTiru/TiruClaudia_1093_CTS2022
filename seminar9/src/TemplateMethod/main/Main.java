package TemplateMethod.main;

import TemplateMethod.clase.MijlocTransportPeSine;
import TemplateMethod.clase.Tramvai;

public class Main {
    public static void main(String[] args) {
        MijlocTransportPeSine tramvai = new Tramvai();
        tramvai.parcurgereTraseu();
        tramvai.parcurgereTraseuInvers();

    }
}
