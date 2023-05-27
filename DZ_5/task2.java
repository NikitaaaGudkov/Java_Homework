/*
 Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности Имени.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task2 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<String>(List.of("Иван Иванов", "Светлана Петрова", 
        "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", 
        "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", 
        "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));
        Map<String, Integer> hashMap = new HashMap<String,Integer>();
        for (String item : employees) {
            String name = item.split(" ")[0];
            if(hashMap.containsKey(name)) {
                int counter = hashMap.get(name);
                ++counter;
                hashMap.put(name, counter);
            }
            else
            {
                hashMap.put(name, 1);
            }
        }

        Map<Integer, List<String>> treeMap = new TreeMap<Integer,List<String>>(Comparator.reverseOrder());
        for (var item : hashMap.entrySet()) {
            List<String> tempList;
            if(treeMap.containsKey(item.getValue())) {
                tempList = treeMap.get(item.getValue());
            }
            else {
                tempList = new ArrayList<>();
            }
            tempList.add(item.getKey());
            treeMap.put(item.getValue(), tempList);
        }

        for (var item : treeMap.entrySet()) {
            for (String name : item.getValue()) {
                System.out.printf("%s - %d\n", name, item.getKey());
            }
        }
    }
}
