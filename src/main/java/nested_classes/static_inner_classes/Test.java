package nested_classes.static_inner_classes;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Black","BMW",560,23.5);
        System.out.println("car = " + car);
        System.out.println(Car.getEngine());
        Car.Engine engine2 = new Car.Engine(136,6.5);
        System.out.println("engine2 = " + engine2);
    }
}
