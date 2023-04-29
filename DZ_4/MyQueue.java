package DZ_4;

import java.util.LinkedList;

public class MyQueue {
    LinkedList<Integer> myList;
    public MyQueue() {
        myList = task_1.GetLinkedList();
    }

    public void enqueue(int number) {
        this.myList.addLast(number);
    }

    public int dequeue() {
        int result = myList.getFirst();
        myList.removeFirst();
        return result;
    }

    public int first() {
        return myList.getFirst();
    }

    public String toString() {
        return myList.toString();
    }
}
