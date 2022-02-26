package collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employeeList1 = new LinkedList<>();
        employeeList1.add(new Employee("Николай", "Иванов", 43));
        employeeList1.add(new Employee("Дмитрий", "Сидоров", 34));
        employeeList1.add(new Employee("Андрей", "Петров", 21));
        employeeList1.add(new Employee("Андрей", "Алексеев", 19));
        LinkedList<Employee> employeeList2 = new LinkedList<>(employeeList1);
        System.out.println("employeeList1 = " + employeeList1);
        System.out.println("employeeList2 = " + employeeList2);
        employeeList2.addFirst(new Employee("Максим", "Хохлов", 29));
        employeeList2.addLast(new Employee("Петр", "Петров", 34));
        System.out.println("employeeList2 = " + employeeList2);
        System.out.println("employeeList2.getFirst() = " + employeeList2.getFirst());
        System.out.println("employeeList2.getLast() = " + employeeList2.getLast());
    }

}
