package factory_method.factory;

import factory_method.clase.MijlocTransport;
import factory_method.clase.Troleibuz;

public class TroleibuzFactory implements Factory {
    @Override
    public MijlocTransport getMijlocTransport(String numarInmatriculare) {
        return new Troleibuz(numarInmatriculare);
    }
}
