package clase;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String nume;
    private IngrijitorZOO ingrijitorZOO;
    private List<Animal> animalList;

    public ZOO(String nume, IngrijitorZOO ingrijitorZOO) {
        this.nume = nume;
        this.ingrijitorZOO = ingrijitorZOO;
        this.animalList = new ArrayList<>();
    }

    public void adaugareAnimal(Animal animal) {
        this.animalList.add(animal);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZOO getIngrijitorZOO() {
        return ingrijitorZOO;
    }

    public void setIngrijitorZOO(IngrijitorZOO ingrijitorZOO) {
        this.ingrijitorZOO = ingrijitorZOO;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void hranesteAnimale(String mancare) {
        for (Animal animal : this.animalList)
            this.ingrijitorZOO.hranesteAnimal(animal, mancare);
    }
}
