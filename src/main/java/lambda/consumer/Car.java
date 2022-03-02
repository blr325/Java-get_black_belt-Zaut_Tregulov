package lambda.consumer;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Car {
    private String model;
    private String color;
    private int weight;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Car(String model, String color, int weight) {
        this.model = model;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
