package src.ExamPreparationExercise.rabbits;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    private List<Rabbit> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public List<Rabbit> getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Rabbit rabbit) {
        if (capacity > data.size()) {
            data.add(rabbit);
        }
    }

    public boolean removeRabbit(String name) {
        boolean isRemoved = false;
        for (Rabbit rabbit : this.data) {
            if (rabbit.getName().equals(name)) {
                this.data.remove(rabbit);
                isRemoved = true;
            }
        }
        return isRemoved;
    }

    public void removeSpecies (String species) {
        data.removeIf(e -> e.getSpecies().equals(species));
    }
    public Rabbit sellRabbit (String name) {
        Rabbit rabbitForSale = null;
        for (Rabbit rabbit : this.data) {
            if (rabbit.getName().equals(name)){
                rabbit.setAvailable(false);
                rabbitForSale = rabbit;
                break;
            }
        }
        return rabbitForSale;
    }
    public List<Rabbit> sellRabbitBySpecies (String species) {
        List <Rabbit> rabbitList = new ArrayList<>();
        for (Rabbit rabbit : data) {
            if(rabbit.getSpecies().equals(species)){
                rabbitList.add(rabbit);
                rabbit.setAvailable(false);
            }
        }
        return rabbitList;
    }
    public int count () {
        return data.size();
    }

    public String report () {
        StringBuilder sb = new StringBuilder();

        sb.append("Rabbits available at ").append(this.name).append(":").append(System.lineSeparator());
        for (Rabbit rabbit : data) {
            sb.append(rabbit).append(System.lineSeparator());
        }
        return sb.toString();
    }

}
