package comparable_and_comporator.comparator;

import comparable_and_comporator.comparable.People;

import java.util.Comparator;

public class AgeComparator implements Comparator<People> {
    @Override
    public int compare(People people1, People people2) {
        return people1.getAge() - people2.getAge();
    }
}
