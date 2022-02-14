package com.geekbrains;

import java.util.Map;
import java.util.TreeMap;

public class Phonebook {
    private static TreeMap<String, String> phonebook;

    Phonebook (){
        phonebook = new TreeMap<>();
    }

    public void add(String lastName, String phoneNumber){
        if (phonebook.containsKey(lastName)){
            phonebook.put(lastName, phonebook.get(lastName)+"; " + phoneNumber);
        } else {
            phonebook.put(lastName, phoneNumber);
        }
    }

    public void get(String lastName){
        System.out.println("Поиск телефона по фамилии \""+lastName+"\": "+ phonebook.get(lastName));
    }

    public void display(){
        for(Map.Entry <String, String> o: phonebook.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }
}
