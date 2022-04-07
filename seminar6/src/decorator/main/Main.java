package decorator.main;

import decorator.clase.bilete.PrinterBilet;
import decorator.clase.bilete.PrinterBiletConcret;
import decorator.clase.decorator.Decorator;
import decorator.clase.decorator.PrinterMesajPaste;

public class Main {
    public static void main(String[] args) {
//        PrinterBilet printerBilet = new PrinterBiletConcret("1/12/2022", 10);
//        printerBilet.afiseazaDescriere();
//
//        Decorator decorator = new PrinterMesajSpecial(printerBilet);
//        decorator.afiseazaDescriere();
//        decorator.afiseazaVerso();

        PrinterBilet printerBilet1 = new PrinterBiletConcret("17/4/2022", 5);
        printerBilet1.afiseazaDescriere();

        Decorator decorator1 = new PrinterMesajPaste(printerBilet1);
        decorator1.afiseazaDescriere();
        decorator1.afiseazaVerso();

    }
}
