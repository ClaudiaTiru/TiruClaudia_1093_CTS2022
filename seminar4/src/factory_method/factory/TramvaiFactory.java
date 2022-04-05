package factory_method.factory;

import factory_method.clase.MijlocTransport;
import factory_method.clase.Tramvai;

public class TramvaiFactory implements Factory {
    @Override
    public MijlocTransport getMijlocTransport(String numarInmatriculare) {
        return new Tramvai(numarInmatriculare);
    }
}
