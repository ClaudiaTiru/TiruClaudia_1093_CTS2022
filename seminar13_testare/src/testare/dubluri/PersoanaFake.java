package testare.dubluri;

import clase.persoana.IPersoana;

public class PersoanaFake implements IPersoana {
    private String sexFake;
    private String numeFake;
    public boolean CNPFake;
    private int varstaFake;

    public PersoanaFake() {
    }

    public void setVarstaFake(int varstaFake) {
        this.varstaFake = varstaFake;
    }

    public void setSexFake(String sexFake) {
        this.sexFake = sexFake;
    }

    public void setNumeFake(String numeFake) {
        this.numeFake = numeFake;
    }

    @Override
    public String getSex() {
        return sexFake;
    }

    @Override
    public int getVarsta() {
        return varstaFake;
    }

    @Override
    public boolean checkCNP() {
        return CNPFake;
    }
}
