package State.main;

import State.clase.Autobuz;

public class Main {
    //diferenta intre State si Strategy este ca in State nu poti modifica starea din main.
    // Se modifica prin metode.
    public static void main(String[] args) {
        Autobuz a = new Autobuz(13);
        a.pleacaInCursa();
        a.intraInService();
        a.ieseDinService();
        a.ajungeLaCapatDeLinie();
        a.pleacaInCursa();
        a.intraInService();
        a.pleacaInCursa();
    }
}
