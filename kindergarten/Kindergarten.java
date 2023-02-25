package kindergarten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kindergarten {
    private String name;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addChild (Child child){
        if (this.registry.size() < capacity){
            registry.add(child);
            return true;
        }
        return false;
    }

    public boolean removeChild (String firstName){
        if (!registry.isEmpty()) {
            for (Child child : registry) {
                if (child.getFirstName().equals(firstName)) {
                    registry.remove(child);
                    return true;
                }
            }
        }
        return false;
    }
    public int getChildrenCount () {
        return registry.size();
    }
    public Child getChild (String firstName) {
        Child childToReturn = null;
        for (Child child : registry) {
            if (child.getFirstName().equals(firstName)){
                childToReturn = child;
            }
        }
        return childToReturn;
    }
    public String registryReport () {
        Collections.sort(registry, Comparator.comparing(Child::getAge).thenComparing(Child::getFirstName).thenComparing(Child::getLastName));

        StringBuilder sb = new StringBuilder();

        sb.append("Registered children in ").append(getName() + ":").append(System.lineSeparator());

        for (Child child : registry) {
            sb.append(child).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
