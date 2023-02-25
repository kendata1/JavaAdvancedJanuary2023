package src.DefiningClassesExercise.P07_Google;

public class Car {
    private String model;
    private String carSpeed;

    public Car(String model, String carSpeed) {
        this.model = model;
        this.carSpeed = carSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getCarSpeed() {
        return carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.model,this.carSpeed);
    }
}
