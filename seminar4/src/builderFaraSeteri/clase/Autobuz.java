package builderFaraSeteri.clase;

public class Autobuz {
    private String numeSofer;
    private String model;
    private Integer nrLinie;
    private Integer nrLocuri;
    private Integer nrInmatriculare;
    private Boolean opresteCapat;
    private Boolean deschideUsi;

    public Autobuz(String numeSofer, String model, Integer nrLinie, Integer nrLocuri, Integer nrInmatriculare, Boolean opresteCapat, Boolean deschideUsi) {
        this.numeSofer = numeSofer;
        this.model = model;
        this.nrLinie = nrLinie;
        this.nrLocuri = nrLocuri;
        this.nrInmatriculare = nrInmatriculare;
        this.opresteCapat = opresteCapat;
        this.deschideUsi = deschideUsi;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", model='" + model + '\'' +
                ", nrLinie=" + nrLinie +
                ", nrLocuri=" + nrLocuri +
                ", nrInmatriculare=" + nrInmatriculare +
                ", opresteCapat=" + opresteCapat +
                ", deschideUsi=" + deschideUsi +
                '}';
    }
}
