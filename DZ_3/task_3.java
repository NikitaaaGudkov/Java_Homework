package DZ_3;

import java.util.ArrayList;
import java.util.Random;

// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = FillArrayList();
        System.out.println("Заданный массив:\t" + numbers);

        int minNumber = GetMinNumber(numbers);
        int maxNumber = GetMaxNumber(numbers);
        double averageNumber = GetAverageNumber(numbers);

        System.out.println("Минимальное число:\t" + minNumber);
        System.out.println("Максимально число:\t" + maxNumber);
        System.out.println("Среднее число:\t" + averageNumber);
    }

    public static ArrayList<Integer> FillArrayList() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < new Random().nextInt(5, 10); ++i) {
            result.add(new Random().nextInt(1, 100));
        }
        return result;
    }

    public static int GetMinNumber(ArrayList<Integer> arr) {
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); ++i) {
            if(arr.get(i) < result) {
                result = arr.get(i);
            }
        }
        return result;
    }

    public static int GetMaxNumber(ArrayList<Integer> arr) {
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); ++i) {
            if(arr.get(i) > result) {
                result = arr.get(i);
            }
        }
        return result;
    }

    public static double GetAverageNumber(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); ++i) {
            sum += arr.get(i);
        }
        double result = (double)sum / arr.size();
        return result;
    }
}
