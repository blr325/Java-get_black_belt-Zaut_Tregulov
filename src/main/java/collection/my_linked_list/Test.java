package collection.my_linked_list;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(2);
        myLinkedList.add(4);
        myLinkedList.add(6);
        myLinkedList.add(8);
        System.out.println(myLinkedList);
        System.out.println("myLinkedList.get(3) = " + myLinkedList.get(2));
        myLinkedList.set(3,10);
        System.out.println(myLinkedList);
        myLinkedList.remove(3);
        System.out.println(myLinkedList);
    }
}
