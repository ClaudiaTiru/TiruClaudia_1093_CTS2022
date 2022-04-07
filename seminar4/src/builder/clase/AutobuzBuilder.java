package builder.clase;

public class AutobuzBuilder implements Builder{
    private Autobuz autobuz;

    public AutobuzBuilder() {
        autobuz = new Autobuz();
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setNumarInmatriculare(String numarInmatriculare) {
        this.autobuz.setNumarInmatriculare(numarInmatriculare);
        return this;
    }

    public AutobuzBuilder setNumarLinie(String numarLinie) {
        this.autobuz.setNumarLinie(numarLinie);
        return this;
    }


    public AutobuzBuilder setOpenDoors(Boolean openDoors) {
        this.autobuz.setOpenDoors(openDoors);
        return this;
    }

    public AutobuzBuilder setOprireCapatLinie(Boolean oprireCapatLinie) {
        this.autobuz.setOprireCapatLinie(oprireCapatLinie);
        return this;
    }

    public AutobuzBuilder setTextulDerulat(String textulDerulat) {
        this.autobuz.setTextulDerulat(textulDerulat);
        return this;
    }

    public AutobuzBuilder setNumarLocuri(int numarLocuri) {
        this.autobuz.setNumarLocuri(numarLocuri);
        return this;
    }

    @Override
    public Autobuz build() {
        return autobuz;
    }
}