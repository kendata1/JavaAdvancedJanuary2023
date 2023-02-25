package src.DefiningClassesExercise.P07_Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemon = new ArrayList<>();
    private List<Parents> parentsList = new ArrayList<>();
    private List<Children> childrenList = new ArrayList<>();
    private Car car;

    public Person(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public List<Parents> getParentsList() {
        return parentsList;
    }

    public List<Children> getChildrenList() {
        return childrenList;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public void setParentsList(List<Parents> parentsList) {
        this.parentsList = parentsList;
    }

    public void setChildrenList(List<Children> childrenList) {
        this.childrenList = childrenList;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append("\n");
        sb.append("Company: ").append("\n");
        if (this.company != null){
            sb.append(company).append("\n");
        }
        sb.append("Car:").append("\n");
        if (car != null) {
            sb.append(car).append("\n");
        }

        sb.append("Pokemon:").append("\n");
        for (Pokemon pokemon : pokemon) {
            sb.append(pokemon).append("\n");
        }

        sb.append("Parents:").append("\n");
        for (Parents parent : parentsList) {
            sb.append(parent).append("\n");
        }

        sb.append("Children:").append("\n");
        for (Children child : childrenList) {
            sb.append(child).append("\n");
        }

        return sb.toString();
    }
}
