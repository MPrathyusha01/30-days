package Day7;

import java.util.LinkedList;

public class RemoveLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Dog");
        list.add("Egg");
        list.add("Fish");

        System.out.println(list);
        list.remove();
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
