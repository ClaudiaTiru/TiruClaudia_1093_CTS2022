package factory_method.factory;

import factory_method.clase.Autobuz;
import factory_method.clase.MijlocTransport;

public class AutobuzFactory implements Factory {

    @Override
    public MijlocTransport getMijlocTransport(String numarInmatriculare) {
        return new Autobuz(numarInmatriculare);
    }
}
