package comparable_and_comporator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<People> peoples = getPeople();
        sortPeoples(peoples);
        List<Employee> employees = getEmployees();
        sortEmployees(employees);

    }

    private static void sortEmployees(List<Employee> employees) {
        System.out.println("Массив сотрудников до сортировки");
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println("Массив сотрудников после сортировки по имени и фамилии");
        System.out.println(employees);
    }

    private static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Николай","Иванов",43));
        employees.add(new Employee("Дмитрий","Сидоров",34));
        employees.add(new Employee("Андрей","Петров",21));
        employees.add(new Employee("Андрей","Алексеев",19));
        return employees;
    }

    private static void sortPeoples(List<People> peoples) {
        System.out.println("Массив людей до сортировки");
        System.out.println(peoples);
        Collections.sort(peoples);
        System.out.println("Массив людей после сортировки по возрасту");
        System.out.println(peoples);
    }

    private static List<People> getPeople() {
        List<People> peoples = new ArrayList<>();
        peoples.add(new People("Николай","Иванов",43));
        peoples.add(new People("Дмитрий","Сидоров",34));
        peoples.add(new People("Андрей","Петров",21));
        peoples.add(new People("Андрей","Алексеев",19));
        return peoples;
    }

}
