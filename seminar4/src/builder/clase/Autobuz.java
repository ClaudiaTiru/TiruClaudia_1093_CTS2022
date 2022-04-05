package builder.clase;

public class Autobuz {
    private String numeSofer;
    private String numarInmatriculare;
    private String numarLinie;
    private Boolean openDoors;
    private Boolean oprireCapatLinie;
    private String textDerulat;
    private Integer numarLocuri;

    public Autobuz() {
        this.numeSofer = "Doru";
        this.numarInmatriculare = "B-123-ACC";
        this.numarLinie = "45";
        this.openDoors = true;
        this.oprireCapatLinie = true;
        this.textDerulat ="text derulat";
        this.numarLocuri = 54;
    }

    //versiunea care nu mai permite sa modifici un atribut o data setat
     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

     void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

     void setNumarLinie(String numarLinie) {
        this.numarLinie = numarLinie;
    }

     void setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
    }

     void setOprireCapatLinie(Boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
    }

    void setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
    }

     void setNumarLocuri(Integer numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", numarInmatriculare='" + numarInmatriculare + '\'' +
                ", numarLinie='" + numarLinie + '\'' +
                ", openDoors=" + openDoors +
                ", oprireCapatLinie=" + oprireCapatLinie +
                ", textDerulat='" + textDerulat + '\'' +
                ", numarLocuri=" + numarLocuri +
                '}';
    }
}
