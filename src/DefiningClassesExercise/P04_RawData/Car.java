package src.DefiningClassesExercise.P04_RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tires tires;

    public static class Engine {
        private int speed;
        private int power;

        public int getPower() {
            return power;
        }

        public Engine(int speed, int power) {
            this.speed = speed;
            this.power = power;


        }
    }
    public static class Cargo {
        private int weight;
        private String type;

        public String getType() {
            return type;
        }

        public Cargo(int weight, String type) {
            this.weight = weight;
            this.type = type;
        }
    }
    public static class Tires{
        private double tire1Pressure;
        private int tire1Age;
        private double tire2Pressure;
        private int tire2Age;
        private double tire3Pressure;
        private int tire3Age;
        private double tire4Pressure;
        private int tire4Age;

        public Tires(double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age, double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age) {
            this.tire1Pressure = tire1Pressure;
            this.tire1Age = tire1Age;
            this.tire2Pressure = tire2Pressure;
            this.tire2Age = tire2Age;
            this.tire3Pressure = tire3Pressure;
            this.tire3Age = tire3Age;
            this.tire4Pressure = tire4Pressure;
            this.tire4Age = tire4Age;
        }

        public double getTire1Pressure() {
            return tire1Pressure;
        }

        public double getTire2Pressure() {
            return tire2Pressure;
        }

        public double getTire3Pressure() {
            return tire3Pressure;
        }

        public double getTire4Pressure() {
            return tire4Pressure;
        }

        public boolean isFragile () {
            boolean isFragile = false;
            if (getTire1Pressure() < 1 || getTire2Pressure() < 1 || getTire3Pressure() < 1 || getTire4Pressure() < 1){
                isFragile = true;
            }
            return isFragile;
        }
    }

    public Car(String model, Engine engine, Cargo cargo, Tires tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tires getTires() {
        return tires;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
