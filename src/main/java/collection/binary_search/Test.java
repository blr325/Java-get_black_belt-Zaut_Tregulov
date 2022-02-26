package collection.binary_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2("Andrei", 12);
        Employee2 emp2 = new Employee2("Anton", 2);
        Employee2 emp3 = new Employee2("Artem", 5);
        Employee2 emp4 = new Employee2("Dmitry", 13);
        Employee2 emp5 = new Employee2("Maxim", 49);
        Employee2 emp6 = new Employee2("Denis", 94);
        Employee2 emp7 = new Employee2("Pavel", 12);
        List<Employee2> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println("employeeList = " + employeeList);
        Collections.sort(employeeList);
        System.out.println("employeeList = " + employeeList);
        int indexEmp4 = Collections.binarySearch(employeeList,emp4);
        System.out.println("indexEmp4 = " + indexEmp4);
        Collections.reverse(employeeList);
        System.out.println("employeeList = " + employeeList);
        Collections.shuffle(employeeList);
        System.out.println("employeeList = " + employeeList);


    }
}
