package main;

import clase.Singleton;
import simple_factory.Autobuz;
import simple_factory.FabricaMijlocTransport;
import simple_factory.MijlocTransport;
import simple_factory.TipMijlocTransport;

public class Main {
    public static void main(String[] args) {

        //SINGLETON
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        //SIMPLE FACTORY
        MijlocTransport autobuz = FabricaMijlocTransport.getMijlocTransport("B22YYY", TipMijlocTransport.Autobuz);
        MijlocTransport tramvai = FabricaMijlocTransport.getMijlocTransport("B23ZZZ", TipMijlocTransport.Tramvai);
        MijlocTransport troleibuz = FabricaMijlocTransport.getMijlocTransport("B24XXX", TipMijlocTransport.Troleibuz);
        //PRO: pe termenul lung e mai usor de scalat
        //nu respecta principiul open-closed daca mai adaugam un element in enum

        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());
    }
}
