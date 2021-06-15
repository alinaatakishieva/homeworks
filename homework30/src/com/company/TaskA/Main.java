package com.company.TaskA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> song = new ArrayList<>();

        song.add("Ветер с моря дул");
        song.add("Нагонял беду");
        song.add("И сказал ты мне");
        song.add("Больше не приду");

        System.out.println("Primary array: " + song);

        for (int i = 0; i < 4; i++) {
            song.add(song.get(i));
        }

        System.out.println("duplicated array" + song);

        List<String> newSong = new ArrayList<>();

        for (int i = 0; i < song.size(); i++) {
            if (song.get(i).length() >= 15);
            newSong.add(song.get(i));
            song.remove(i);
            i--;
        }

        System.out.println("more than 15 letters" + song);
        System.out.println("new Array" + newSong);
        newSong.removeIf(str -> str.equals("И сказал ты мне"));
        System.out.println("Новый список без 'И сказал ты мне' :" + newSong);

    }
}
