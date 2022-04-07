package proxy.clase;

public class Autobuz implements MijlocTransport{
    private int nrCalatori;
    private int nrLinie;

    public Autobuz(int nrCalatori, int nrLinie) {
        this.nrCalatori = nrCalatori;
        this.nrLinie = nrLinie;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul " + nrLinie + " a oprit avand " + nrCalatori + " calatori");
    }
}
