package com.company;

public class Main {

    public static void main(String[] args) {
        MyGeneric<String, Integer> myGeneric = new MyGeneric<>("Alina", 13);
        System.out.println(myGeneric.firstInfo());
        System.out.println(myGeneric.secondInfo());

        System.out.println(myGeneric.getFirst());
        System.out.println(myGeneric.getSecond());

        System.out.println(myGeneric.check());

//        Задача B (30 Points):
//Ответить на вопросы:
//Для чего нужны Generics?
//        для хранения информации, обуспечивает проверку типов во время компиляции, расширяет код
//Примеры Generic классов в Java?
//        ArrayList, LinkedList, Hashmap, HashSet, TreeSet
//Почему плохо создавать поля так: Object value; нежели T value?
//        нужно будет кастить под Object и могут возникнуть ошибки
    }
}
