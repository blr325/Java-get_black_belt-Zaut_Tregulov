package collection.list_iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Polindrom {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        System.out.println("list = " + list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (!isPalindrome) {
            System.out.println("Не полиндром");
        } else System.out.println("Полиндром");
    }
}
