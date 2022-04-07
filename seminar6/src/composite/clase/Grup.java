package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements MijlocTransport{
    private List<MijlocTransport> mijlocTransportList;
    private String denumire;

    public Grup(String denumire) {
        this.mijlocTransportList = new ArrayList<>();
        this.denumire = denumire;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(denumire);
        for (MijlocTransport mijlocTransport:mijlocTransportList) {
            mijlocTransport.afiseazaDescriere();
        }
    }

    @Override
    public void adaugaMijlocTransport(MijlocTransport mijlocTransport) {
        mijlocTransportList.add(mijlocTransport);
    }

    @Override
    public void stergeMijlocTransport(MijlocTransport mijlocTransport) {
        mijlocTransportList.remove(mijlocTransport);
    }

    @Override
    public MijlocTransport getMijlocTransport(int index) {
        return mijlocTransportList.get(index);
    }
}