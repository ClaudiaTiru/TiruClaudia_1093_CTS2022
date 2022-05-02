package Memento.main;

import Memento.clase.Autobuz;
import Memento.clase.ManagerAutobuze;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Gigel",6,8,"Otokar");
        ManagerAutobuze managerAutobuze = new ManagerAutobuze();

        managerAutobuze.adaugaMementoAutobuz(autobuz.createMementoAutobuz());

        autobuz.setNumeSofer("Florin");
        managerAutobuze.adaugaMementoAutobuz(autobuz.createMementoAutobuz());

        autobuz.setConsumMediu(8);
        managerAutobuze.adaugaMementoAutobuz(autobuz.createMementoAutobuz());

        System.out.println(autobuz);

        autobuz.setMementoAutobuz(managerAutobuze.getMementoAutobuz(0));
        System.out.println(autobuz);

    }
}
