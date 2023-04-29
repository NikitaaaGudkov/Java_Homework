package DZ_4;

/*
2) Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.

Пример:
[1, 2, 3, 4, 5, 6, 7]
spisok.enqueue(8)
[1, 2, 3, 4, 5, 6, 7,8]
spisok.dequeue
1
[2, 3, 4, 5, 6, 7,8]
spisok.first()
2
[2, 3, 4, 5, 6, 7,8]
 */

public class task_2 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        System.out.println("Заданная очередь: \t" + myQueue);

        int number = 24;
        myQueue.enqueue(number);
        System.out.println("Добавили в конец элемент: \t" + number);
        System.out.println("Результат: \t" + myQueue);

        int deleteElement = myQueue.dequeue();
        System.out.println("Удалили первый элемент: \t" + deleteElement);
        System.out.println("Результат: \t" + myQueue);

        int firstElement = myQueue.first();
        System.out.println("Получили первый элемент, не извлекая его: \t" + firstElement);
        System.out.println("Результат: \t" + myQueue);
    }
}
