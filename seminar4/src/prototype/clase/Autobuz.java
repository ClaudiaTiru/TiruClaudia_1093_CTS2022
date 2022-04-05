package prototype.clase;

public class Autobuz implements MijlocTransportPrototype {
    private String numeSofer;

    public Autobuz(String numeSofer) {
        super();
        this.numeSofer = numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                '}';
    }


    @Override
    public MijlocTransportPrototype copiaza() throws CloneNotSupportedException {
        return (MijlocTransportPrototype) super.clone();
    }
}
