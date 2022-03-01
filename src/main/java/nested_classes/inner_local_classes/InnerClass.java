package nested_classes.inner_local_classes;

public class InnerClass {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21,5);
    }
}

class Math {
    public void getResult(int dividend, int divisor) {
        class Division {
            int getQuotient() {
                return dividend / divisor;
            }

            int getModulo() {
                return dividend % divisor;
            }
        }
        Division division = new Division();
        System.out.println("Делимое = " + dividend + "\nДелитель = " + divisor +
                "\nЧастное = " + division.getQuotient() + "\nОстаток = " + division.getModulo());
    }
}


