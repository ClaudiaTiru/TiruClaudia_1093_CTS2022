package Memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuze {
    private List<MementoAutobuz> mementoAutobuzList;

    public ManagerAutobuze() {
        this.mementoAutobuzList = new ArrayList<>();
    }

    public  void adaugaMementoAutobuz(MementoAutobuz mementoAutobuz){
        mementoAutobuzList.add(mementoAutobuz);
    }

    public MementoAutobuz getMementoAutobuz(int index){
      return  mementoAutobuzList.get(index);
    }
}
