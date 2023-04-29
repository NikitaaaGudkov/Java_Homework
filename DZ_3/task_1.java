package DZ_3;

import java.util.ArrayList;
import java.util.Random;

// 1. (Дополнительно) Реализовать алгоритм сортировки слиянием

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = FillArrayList();
        System.out.println("Неотсортированный список: \t" + numbers);

        numbers = SortArrayList(numbers);
        System.out.println("Отсортированный список: \t" + numbers);
    }

    public static ArrayList<Integer> FillArrayList() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < new Random().nextInt(5, 10); ++i) {
            result.add(new Random().nextInt(1, 100));
        }
        return result;
    }

    public static ArrayList<Integer> SortArrayList(ArrayList<Integer> arr) {
        if(arr == null) {
            return null;
        } else if(arr.size() == 1) {
            return arr;
        }
        ArrayList<Integer> left = new ArrayList<Integer>();
        for (int i = 0; i < arr.size() / 2; ++i) {
            left.add(arr.get(i));
        }
        ArrayList<Integer> right = new ArrayList<Integer>();
        for (int i = arr.size() / 2; i < arr.size(); ++i) {
            right.add(arr.get(i));
        }

        left = SortArrayList(left);
        right = SortArrayList(right);

        return MergeArrayList(left, right);
    }

    public static ArrayList<Integer> MergeArrayList(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int leftIndex = 0;
        int rightIndex = 0;
        while(leftIndex != left.size() && rightIndex != right.size()) {
            if(left.get(leftIndex) < right.get(rightIndex)) {
                result.add(left.get(leftIndex));
                ++leftIndex;
            } else {
                result.add(right.get(rightIndex));
                ++rightIndex;
            }
        }
        while(leftIndex != left.size()) {
            result.add(left.get(leftIndex));
            ++leftIndex;
        }
        while(rightIndex != right.size()) {
            result.add(right.get(rightIndex));
            ++rightIndex;
        }
        return result;
    }
}
