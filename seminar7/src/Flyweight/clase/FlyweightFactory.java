package Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<Integer,Linie> linii;

    public FlyweightFactory() {
        linii= new HashMap<>();
    }

    public Linie getLinie(int nrLinie){
        if(linii.containsKey(nrLinie)){
            return linii.get(nrLinie);
        }else{
            linii.put(nrLinie,
                    new Linie(nrLinie,"primaStatie","ultimaStatie"));
            return linii.get(nrLinie);
        }
    }
}
