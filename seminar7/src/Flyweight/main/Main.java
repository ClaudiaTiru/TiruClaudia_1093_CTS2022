package Flyweight.main;

import Flyweight.clase.Autobuz;
import Flyweight.clase.AutobuzLinie;
import Flyweight.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie autobuz = new Autobuz("Volvo",2008,40);
        AutobuzLinie autobuz1 = new Autobuz("Mercedes",2010,30);
        AutobuzLinie autobuz2 = new Autobuz("Volvo",2018,45);
        AutobuzLinie autobuz3 = new Autobuz("Volvo",2020,50);

        FlyweightFactory flyweightFactory = new FlyweightFactory();


        autobuz.descrie(flyweightFactory.getLinie(145));
        autobuz1.descrie(flyweightFactory.getLinie(145));
        autobuz2.descrie(flyweightFactory.getLinie(226));
        autobuz3.descrie(flyweightFactory.getLinie(168));
    }
}
