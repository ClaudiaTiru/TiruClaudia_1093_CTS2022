package proxy.clase;

public class AutobuzDeNoapte implements MijlocTransport{
    private Autobuz autobuz;

    public AutobuzDeNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getNrCalatori() > 0) {
            autobuz.opresteInStatie();
        }
        else{
            System.out.println("Se retrage la autobaza");
        }
    }

    @Override
    public void setNrCalatori(int nrCalatori) {
        autobuz.setNrCalatori(nrCalatori);
    }
}
