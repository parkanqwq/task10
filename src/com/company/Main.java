package com.company;


import com.company.numDirectory.NumDirectory;

import java.util.*;

public class Main {

    private static String[] words = new String[10];

    public static void main(String[] args) {

        System.out.println();
        task1();
        System.out.println();
        task2();
    }

    private static void task2() {
        NumDirectory numDirectory = new NumDirectory();
        System.out.println("Тут мы добавили людей в тел справочник, а после вызвали пару имен");
        numDirectory.add("Max", "89990151212");
        numDirectory.add("Big", "88002001232");
        numDirectory.add("Max", "89854562222");
        numDirectory.add("Big", "89325468585");
        numDirectory.add("Raul", "89254441414");
        numDirectory.get("Big");
        numDirectory.get("Raul");
    }



    private static void task1(){
        addWords();
        createSet();
        sameSizeWords();
    }

    private static void sameSizeWords() {
        Set<String> list = new LinkedHashSet<>();
        System.out.println("\nМассив уникальных слов и сколько раз они повторяются");
        ArrayList<String> arrayListAll = new ArrayList(Arrays.asList(words));
        for (int i = 0; i < words.length; i++) {
            list.add(String.valueOf(look(arrayListAll.get(i), arrayListAll)));
        }
        System.out.println(list);
    }

    private static String look(String words, ArrayList arrayList){
        int core = 0;
        String word = null;
        Iterator iter = arrayList.iterator();
        while (iter.hasNext()) {
            if (words.equals(iter.next())){
                core++;
                word = words + " - имеется " + core + " шт";
            }
        }
        return word;
    }

    private static void createSet() {
        System.out.println("Весь массив");
        System.out.println(Arrays.toString(words) + "\n");
        System.out.println("Массив где убранны повторения");
        Set set = new LinkedHashSet(Arrays.asList(words));
        System.out.println(set);
    }

    private static void addWords() {
        words[0] = "привет";
        words[1] = "хаюхай";
        words[2] = "хи";
        words[3] = "здрасти";
        words[4] = "приветики";
        words[5] = "привет";
        words[6] = "хи";
        words[7] = "хей";
        words[8] = "привет";
        words[9] = "здрасти";
    }
}
