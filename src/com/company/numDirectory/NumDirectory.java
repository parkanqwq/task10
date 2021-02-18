package com.company.numDirectory;

import java.util.ArrayList;
import java.util.List;

public class NumDirectory {

    private List<Person> people = new ArrayList<>();

    public void add(String name, String num){
        if (num.length() != 11) {
            System.out.printf("Номер %s под именем %s ,не корректный, запись не произведенна\n", num, name);
            return;
        }
        people.add(new Person(name, num));
    }

    public void get(String name){
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).name.equals(name)){
                System.out.println("Name: " + people.get(i).name + ", phone: " + people.get(i).num);
            }
        }
    }


}
