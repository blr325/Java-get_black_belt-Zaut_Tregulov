package collection.binary_search;

public class Employee2 implements Comparable<Employee2> {
    private String name;
    private int ID;

    public Employee2(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int compareTo(Employee2 otherEmployee) {
        int result = this.ID - otherEmployee.getID();
        if (result == 0) {
            result = this.name.compareTo(otherEmployee.getName());
        }
        return result;
    }
}
