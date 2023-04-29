package DZ_4;

import java.util.LinkedList;
import java.util.Random;

// 1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = GetLinkedList();
        System.out.println("Заданный список: \t" + myList);

        LinkedList<Integer> reverseList = ReverseLinkedList(myList);
        System.out.println("Перевёрнутый список: \t" + reverseList);
    }

    public static LinkedList<Integer> GetLinkedList() {
        LinkedList<Integer> result = new LinkedList<Integer>();
        for (int i = 0; i < new Random().nextInt(5, 10); i++) {
            result.add(new Random().nextInt(1, 10));
        }
        return result;
    }

    public static LinkedList<Integer> ReverseLinkedList(LinkedList<Integer> myList) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        for (Integer number : myList) {
            result.addFirst(number);
        }
        return result;
    }
}
