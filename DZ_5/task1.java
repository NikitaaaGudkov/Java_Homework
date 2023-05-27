/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
Я: 2
Иванов: 1242353, 547568
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<String, List<String>>();
        Boolean IsExit = false;
        Scanner iScanner = new Scanner(System.in);
        while(true) {
            System.out.print("Введите 1) Добавление номера; 2) Вывод всего; 3) Выход\t");
            int number = iScanner.nextInt();
            switch(number) {
                case 1: {
                    System.out.print("Введите фамилию:\t");
                    String surname = iScanner.next();
                    System.out.print("Введите номер:\t");
                    String phone = iScanner.next();
                    List<String> tempList;
                    if(phoneBook.containsKey(surname)) {
                        tempList = phoneBook.get(surname);
                    }
                    else {
                        tempList = new ArrayList<String>();
                    }
                    tempList.add(phone);
                    phoneBook.put(surname, tempList);
                    break;
                }
                case 2: {
                    for (var item : phoneBook.entrySet()) {
                        String result = "";
                        result += item.getKey() + ": ";
                        for (String telephone : item.getValue()) {
                            result += telephone + ", ";
                        }
                        result = result.substring(0, result.length() - ", ".length());
                        System.out.printf("%s\n", result);
                    }
                    break;
                }
                case 3: {
                    IsExit = true;
                    break;
                }
            }
            if(IsExit) {
                break;
            }
        }
        iScanner.close();
    }
}
