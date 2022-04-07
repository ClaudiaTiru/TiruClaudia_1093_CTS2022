package proxy.main;

import proxy.clase.Autobuz;
import proxy.clase.AutobuzDeNoapte;
import proxy.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz(5, 434);
        //autobuz.opresteInStatie();

        autobuz.setNrCalatori(0);
        //autobuz.opresteInStatie();

        MijlocTransport autobuzDeNoapte = new AutobuzDeNoapte((Autobuz) autobuz);
        autobuzDeNoapte.setNrCalatori(2);
        autobuzDeNoapte.opresteInStatie();

        autobuzDeNoapte.setNrCalatori(0);
        autobuzDeNoapte.opresteInStatie();

    }
}
