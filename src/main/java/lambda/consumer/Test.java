package lambda.consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.ArrayList;

public class Test {
    public static ArrayList<Car> createThreeCars(Supplier<Car> supplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(supplier.get());
        }
        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = createThreeCars(() -> new Car("BMW", "Black", 2100));
        cars.forEach(System.out::println);
        System.out.println("---------------------------------");
        changeCar(cars.get(1), car -> {
            car.setModel("Mercedes");
            car.setColor("White");
            car.setWeight(1400);
        });
        changeCar(cars.get(2), car -> {
            car.setModel("Opel");
            car.setColor("Silver");
            car.setWeight(1700);
        });
        cars.forEach(System.out::println);
    }
}
