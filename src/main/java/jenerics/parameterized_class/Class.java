package jenerics.parameterized_class;

public class Class<V1,V2>{
    private V1 value1;
    private V2 value2;

    public Class(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public void info(){
        System.out.println("Значение 1 - " + value1 + "\nЗначение 2 - " + value2 );
    }

    public void setValue1(V1 value1) {
        this.value1 = value1;
    }

    public void setValue2(V2 value2) {
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
