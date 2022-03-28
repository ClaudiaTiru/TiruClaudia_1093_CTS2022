package simple_factory;

public class FabricaMijlocTransport {
    public static MijlocTransport getMijlocTransport(String numarInamtriculare,TipMijlocTransport tipMijlocTransport){
        switch (tipMijlocTransport){
            case Autobuz:
                return new Autobuz(numarInamtriculare);
            case Tramvai:
                return new Tramvai(numarInamtriculare);
            case Troleibuz:
                return new Troleibuz(numarInamtriculare);
            default:
                return null;
        }
    }
}
