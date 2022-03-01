package nested_classes.inner_classes;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("White","Mercedes",340,16.5);
        System.out.println("car = " + car);
        Car car2 = new Car("Blue","Opel");
        Car.Engine engine = car.new Engine(140,6.5);
    }
}
