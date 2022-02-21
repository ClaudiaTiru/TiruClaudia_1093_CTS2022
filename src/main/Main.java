package main;

import clase.Girafa;
import clase.IngrijitorZOO;
import clase.ZOO;
import clase.Zebra;

public class Main {
    public static void main(String[] args) {
        IngrijitorZOO ingrijitorZOO = new IngrijitorZOO("Marius");
        Zebra zebra = new Zebra("Zebra dungata");
        Zebra zebra1 = new Zebra("Zebra alba");

        Girafa girafa = new Girafa("Girafa Maria");
        Girafa girafa1 = new Girafa("Girafa Elena");

        ZOO zoo = new ZOO("Bucuresti ZOO", ingrijitorZOO);
        zoo.adaugareAnimal(zebra);
        zoo.adaugareAnimal(zebra1);
        zoo.adaugareAnimal(girafa);
        zoo.adaugareAnimal(girafa1);

        zoo.hranesteAnimale("fan");
    }
}
