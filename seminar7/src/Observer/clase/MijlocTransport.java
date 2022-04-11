package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class MijlocTransport {
    private int numarAutobuz;
    private List<ICalator> lista;

    public MijlocTransport(int numarAutobuz, List<ICalator> lista) {
        this.numarAutobuz = numarAutobuz;
        this.lista = new ArrayList<>();
    }

    public void adaugaCalator(ICalator calator){
        lista.add(calator);
    }

    public void stergeCalator(ICalator calator){
        lista.remove(calator);
    }

    public void trimiteMesaj(String mesaj){
        for(ICalator calator: lista){
            calator.primireMesaj(mesaj);
        }
    }

    public void trimiteMesajPlecareCapatLinie(){
        trimiteMesaj("autobuzul cu numarul: "+ numarAutobuz + "  a plecat din capatul de linie");
    }
}
