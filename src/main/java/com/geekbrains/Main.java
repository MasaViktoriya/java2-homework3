package com.geekbrains;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        String[] words = {"кот", "рысь", "тигр", "манул", "лев", "кот", "барс", "ягуар", "леопард", "рысь", "оцелот", "манул", "пума", "каракал", "тигр", "сервал", "манул", "гепард", "пантера", "пума"};
        System.out.println("Массив:");
        System.out.println(Arrays.toString(words));
        HashMap<String, Integer> map = new HashMap<>();
        for (String key: words) {
            Integer value = map.get(key);
            if (value == null) {
                map.put(key, 1);
            } else {
                map.put(key, ++value);
            }
        }
        System.out.println("Количество животных в массиве:");
        for(Map.Entry <String, Integer> o: map.entrySet()){
            System.out.println(o.getKey() + " - " + o.getValue());
        }
        System.out.println("\nЗадание 2.");

        Phonebook phonebook =  new Phonebook();
        phonebook.add("Алексеев", "89056784931");
        phonebook.add("Затевахин","89035432190");
        phonebook.add("Бабкина","89154652223");
        phonebook.add("Филиппова","89104132159");
        phonebook.add("Иванов","89267704747");
        phonebook.add("Иванов","89015550303");
        phonebook.display();
        phonebook.get("Бабкина");
        phonebook.get("Иванов");
    }
}
