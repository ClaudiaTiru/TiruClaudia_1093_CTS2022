package factory_method.factory;

import factory_method.clase.MijlocTransport;

public interface Factory {
    public MijlocTransport getMijlocTransport(String numarInmatriculare);


}
