package com.company.taskB;

import java.io.FileWriter;
import java.io.IOException;

public class MainB {
    public static void main(String[] args) throws IOException {
        SongB song = new SongB("Perfect", "falk pop", "Ed Sheeran", "I found a love for me\n" +
                "        Darling, just dive right in and follow my lead\n" +
                "        Well, I found a girl, beautiful and sweet\n" +
                "        Oh, I never knew you were the someone waiting for me\n" +
                "        'Cause we were just kids when we fell in love\n" +
                "        Not knowing what it was\n" +
                "        I will not give you up this time\n" +
                "        But darling, just kiss me slow,\n" +
                "        your heart is all I own\n" +
                "        And in your eyes you're holding mine …");



        FileWriter fileWriter = new FileWriter(song.getName() + ".txt");
        fileWriter.write(song.toString());
        fileWriter.close();

    }
}
