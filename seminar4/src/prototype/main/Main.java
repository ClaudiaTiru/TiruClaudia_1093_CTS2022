package prototype.main;

import prototype.clase.Autobuz;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz autobuz1 = new Autobuz("Gigel");
        Autobuz autobuz2 = (Autobuz)autobuz1.copiaza();
        autobuz2.setNumeSofer("Andrei");

        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
    }
}