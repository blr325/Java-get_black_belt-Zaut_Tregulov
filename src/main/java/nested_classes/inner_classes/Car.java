package nested_classes.inner_classes;

public class Car {
    private String color;
    private final String MODEL;
    private static String typeFuel = "benzine";
    private Engine engine;

    public Car(String color, String model, int enginePower, double fuelConsumption) {
        this.color = color;
        this.MODEL = model;
        engine = this.new Engine(enginePower, fuelConsumption);
    }

    public Car(String color, String MODEL) {
        this.color = color;
        this.MODEL = MODEL;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + MODEL + '\'' +
                '}';
    }

    class Engine {
        private int enginePower;
        private double fuelConsumption;

        public Engine(int enginePower, double fuelConsumption) {
            this.enginePower = enginePower;
            this.fuelConsumption = fuelConsumption;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "enginePower=" + enginePower +
                    ", fuelConsumption=" + fuelConsumption +
                    ", type of fuel='" + typeFuel + '\'' +
                    '}';
        }

    }
}
