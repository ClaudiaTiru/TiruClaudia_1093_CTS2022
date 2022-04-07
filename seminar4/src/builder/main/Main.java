package builder.main;

import builder.clase.Autobuz;
import builder.clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumarInmatriculare("B-12-ABC");
        autobuzBuilder.setOprireCapatLinie(Boolean.FALSE);
        autobuzBuilder.setNumarLocuri(80);
        Autobuz autobuz = new AutobuzBuilder().setOpenDoors(Boolean.FALSE).build();
        Autobuz autobuz2 = autobuzBuilder.build();
        System.out.println(autobuz);
        System.out.println(autobuz2);
    }
}