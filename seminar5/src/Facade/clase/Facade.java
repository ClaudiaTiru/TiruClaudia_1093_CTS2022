package Facade.clase;

public class Facade {
    private Autobuz autobuz;

    public Facade() {
        this.autobuz = new Autobuz();
    }

    public void deschideToateUsile() {
        autobuz.deschidereUsaFata();
        autobuz.deschidereUsaMijloc();
        autobuz.deschidereUsaSpate();
    }

    public void liberToateUsile() {
        autobuz.liberUsaFata();
        autobuz.liberUsaMijloc();
        autobuz.liberUsaSpate();
    }
}
