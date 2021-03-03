package ru.geekbrains.lesson10;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        ArrayList <String> words = new ArrayList<>(Arrays.asList("A","B","C","D","G","B","D","S","C","A","R","C",
                "F","H","S","F","A","C"));


        Set<String> unique = new HashSet<String>(words);

        System.out.println("Заданнай массив букв");
        System.out.println(words.toString());
        System.out.println("Уникальные буквы");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости букв");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
