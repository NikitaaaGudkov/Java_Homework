package DZ_3;

import java.util.ArrayList;
import java.util.Random;

// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = FillArrayList();
        System.out.println(numbers);

        numbers = DeleteEvenNumbers(numbers);
        System.out.println(numbers);
    }

    public static ArrayList<Integer> FillArrayList() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < new Random().nextInt(5, 10); ++i) {
            result.add(new Random().nextInt(1, 100));
        }
        return result;
    }

    public static ArrayList<Integer> DeleteEvenNumbers(ArrayList<Integer> result) {
        for (int i = result.size() - 1; i >= 0; --i) {
            if(result.get(i) % 2 == 0) {
                result.remove(i);
            }
        }
        return result;
    }
}
