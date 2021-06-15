package com.company.TaskB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskB {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(50);
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(99) + 1);

        }
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        int evenCount = 0;
        int oddCount = 0;

        for (Integer integer : numbers) {
            if (integer % 2 == 0) {
                even.add(integer);
                evenCount++;
            } else {
                odd.add(integer);
                oddCount++;
            }
        }
        System.out.println("array: " + numbers);
        System.out.println(evenCount + " shtuk" + "Even numbers: " + even);
        System.out.println(oddCount + " shtuk" + "Odd numbers: " + odd);
    }
}
