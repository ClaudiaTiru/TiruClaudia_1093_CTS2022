package builderFaraSeteri.main;

import builderFaraSeteri.clase.Autobuz;
import builderFaraSeteri.clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder=new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("George");
        autobuzBuilder.setModel("Volvo");

        Autobuz autobuz=autobuzBuilder.build();
        System.out.println(autobuz.toString());
    }
}
