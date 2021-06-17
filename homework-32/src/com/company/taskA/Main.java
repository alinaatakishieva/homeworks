package com.company.taskA;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> arrayList = new ArrayList<>();
        LinkedList<Cat> linkedList = new LinkedList<>();
        for (int i = 1; i <= 1000000; i++) {
            arrayList.add(new Cat(i));
            linkedList.add(new Cat(i));
        }


        long differenceAddToMid = Cat.add100CatsToTheMiddle(arrayList, "arraylist")
                - Cat.add100CatsToTheMiddle(linkedList, "linked list");

        System.out.println();

        long differenceAddToBeginEnd = Cat.add100CatsToBeginEnd(arrayList, "arraylist")
                - Cat.add100CatsToBeginEnd(linkedList, "linked list");

        System.out.println();

        long differenceGetMidLast = Cat.getMidLastElement(arrayList, "arraylist")
                - Cat.getMidLastElement(linkedList, "linked list");

        System.out.println();


        long differenceRemoveBeginMid = Cat.removeFromTheBeginMid(arrayList, "arraylist")
                - Cat.removeFromTheBeginMid(linkedList, "linked list");

        System.out.println();

        System.out.println("difference of adding 100 cats to the middle between arraylist and linked list "
                + differenceAddToMid);
        System.out.println("difference of adding 100 cats to the begin and end between arraylist and linked list "
                + differenceAddToBeginEnd);
        System.out.println("difference of getting last and mid element between arraylist and linked list "
                + differenceGetMidLast);
        System.out.println("difference of removing begin and mid element between arraylist and linked list "
                + differenceRemoveBeginMid);
    }
}
