package builderFaraSeteri.clase;

public class AutobuzBuilder implements  Builder{
    private String numeSofer;
    private String model;
    private Integer nrLinie;
    private Integer nrLocuri;
    private Integer nrInmatriculare;
    private Boolean opresteCapat;
    private Boolean deschideUsi;


    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilder setNrLinie(Integer nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilder setNrLocuri(Integer nrLocuri) {
        this.nrLocuri = nrLocuri;
        return this;
    }

    public AutobuzBuilder setNrInmatriculare(Integer nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        return this;
    }

    public AutobuzBuilder setOpresteCapat(Boolean opresteCapat) {
        this.opresteCapat = opresteCapat;
        return this;
    }

    public AutobuzBuilder setDeschideUsi(Boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
        return this;
    }
    @Override
    public Autobuz build() {
        Autobuz autobuz = new Autobuz(this.numeSofer,this.model,this.nrLinie,this.nrLocuri,this.nrInmatriculare,this.opresteCapat,this.deschideUsi);
        return autobuz;
    }
}
