package testare.dubluri;

import clase.agentie.IPachetTuristic;

public class PachetFake implements IPachetTuristic {
    private boolean rezervareFake;
    private Double pretFake;

    public PachetFake() {
    }

    public PachetFake(boolean rezervareFake, Double pretFake) {
        this.rezervareFake = rezervareFake;
        this.pretFake = pretFake;
    }

    public boolean isRezervareFake() {
        return rezervareFake;
    }

    public void setRezervareFake(boolean rezervareFake) {
        this.rezervareFake = rezervareFake;
    }

    public Double getPretFake() {
        return pretFake;
    }

    public void setPretFake(Double pretFake) {
        this.pretFake = pretFake;
    }

    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return null;
    }
}
