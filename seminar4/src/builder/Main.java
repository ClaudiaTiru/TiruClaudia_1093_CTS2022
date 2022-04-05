package builder;

import builder.clase.Autobuz;
import builder.clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumarInmatriculare("B-23-AFF");
        autobuzBuilder.setOprireCapatLinie(false);
        autobuzBuilder.setNumarLocuri(80);

        Autobuz autobuz = new AutobuzBuilder().setNumeSofer("George").setOpenDoors(true).build();

        Autobuz autobuz1 = autobuzBuilder.setNumarLinie("45").build();

        System.out.println(autobuz1);
        System.out.println(autobuz);
    }
}
