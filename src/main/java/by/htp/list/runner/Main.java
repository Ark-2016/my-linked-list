package by.htp.list.runner;

import by.htp.list.entity.MyLinkedList;

/**
 * Created by Ark on 29.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add((new String("apple")));
        list.add((new String("byte")));
        list.add((new String("desk")));
        list.add((new String("table")));
        printOut(list);

        System.out.println("\t" + list.get(1));

        list.set("code", 2);
        printOut(list);

        list.insert("byte", 1);
        printOut(list);

        list.remove(1);
        printOut(list);

        list.remove(3);
        printOut(list);

        list.remove(0);
        printOut(list);
    }

    private static void printOut(MyLinkedList<String> list) {
        for(int i = 0; i < list.getSize(); ++i) {
            System.out.print("\t" + list.get(i));
        }
        System.out.println();
    }
}
