package collection.tree_map;

import java.util.Map;
import java.util.TreeMap;

public class Methods {
    public static void main(String[] args) {
        Student st1 = new Student("Андрей",23);
        Student st2 = new Student("Максим",26);
        Student st3 = new Student("Денис",21);
        Student st4 = new Student("Владимир",28);
        Student st5 = new Student("Андрей",21);
        TreeMap<Student,String> studentFromCity = new TreeMap<>();
        studentFromCity.put(st1,"Лида");
        studentFromCity.put(st2,"Гродно");
        studentFromCity.put(st3,"Брест");
        studentFromCity.put(st4,"Минск");
        studentFromCity.put(st5,"Витебск");
        for (Map.Entry<Student, String> entry : studentFromCity.entrySet()) {
            System.out.println(entry.getKey() + " из города " + entry.getValue());
        }
        System.out.println("studentFromCity.descendingMap() = " + studentFromCity.descendingMap());
        System.out.println("studentFromCity.descendingKeySet() = " + studentFromCity.descendingKeySet());
        System.out.println("studentFromCity.tailMap(st3) = " + studentFromCity.tailMap(st3));
        System.out.println("studentFromCity.headMap(st3) = " + studentFromCity.headMap(st3));
        System.out.println("studentFromCity.lastEntry() = " + studentFromCity.lastEntry());
        System.out.println("studentFromCity.firstEntry() = " + studentFromCity.firstEntry());
        System.out.println("studentFromCity.lastKey() = " + studentFromCity.lastKey());
        System.out.println("studentFromCity.firstKey() = " + studentFromCity.firstKey());


    }
}
