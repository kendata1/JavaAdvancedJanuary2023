package src.DefiningClassesExercise.P05_CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        if (this.weight == 0){
        }
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.model).append(":").append(System.lineSeparator());
        sb.append(this.engine.getModel()).append(":").append(System.lineSeparator());
        sb.append("Power: ").append(this.engine.getPower()).append(System.lineSeparator());

        sb.append("Displacement: ");

        if (this.engine.getDisplacement() == 0){
            sb.append("n/a");
        } else {
            sb.append(this.engine.getDisplacement());
        }
        sb.append(System.lineSeparator());

        sb.append("Efficiency: ");
        if(this.engine.getEfficiency() == null) {
            sb.append("n/a");
        } else  {
            sb.append(this.engine.getEfficiency());
        }
        sb.append(System.lineSeparator());

        sb.append("Weight: ");
        if (this.weight == 0){
            sb.append("n/a");
        }else {
            sb.append(this.weight);
        }
        sb.append(System.lineSeparator());

        sb.append("Color: ");
        if (this.color == null){
            sb.append("n/a");
        } else {
            sb.append(this.color);
        }
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}
