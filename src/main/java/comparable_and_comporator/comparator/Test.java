package comparable_and_comporator.comparator;

import comparable_and_comporator.comparable.People;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<People> peoples = getPeople();
        sortPeoples(peoples);
    }

    private static void sortPeoples(List<People> peoples) {
        System.out.println("Массив людей до сортировки");
        System.out.println(peoples);
        peoples.sort(new AgeComparator());
        System.out.println("Массив людей после сортировки по возрасту");
        System.out.println(peoples);
        peoples.sort((o1, o2) -> {
            int name = o1.getName().compareTo(o2.getName());
            if (name == 0) {
                return o1.getSurName().compareTo(o2.getSurName());
            } else return name;
        });
        System.out.println("Массив людей после сортировки по имени и фамилии");
        System.out.println(peoples);
    }

    private static List<People> getPeople() {
        List<People> peoples = new ArrayList<>();
        peoples.add(new People("Николай", "Иванов", 43));
        peoples.add(new People("Дмитрий", "Сидоров", 34));
        peoples.add(new People("Андрей", "Петров", 21));
        peoples.add(new People("Андрей", "Алексеев", 19));
        return peoples;
    }
}
