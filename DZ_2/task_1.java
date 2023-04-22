package DZ_2;

import java.io.File;
import java.io.FileWriter;

// 1. Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.


public class task_1 {
    public static void main(String[] args) {
    int[] arr = new int[] {5, 4, 3, 2, 1};
    String str = PrintArray(arr);
    String File_name = "DZ_2/1.txt";
    File file = new File(File_name);
    try {
        FileWriter writer = new FileWriter(file, true);
        writer.write(str);
        writer.write("\n");
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    str = PrintArray(arr);
                    writer.write(str);
                    writer.write("\n");
                }
            }
        }
        writer.close();
        System.out.println("Получилось");
    } catch (Exception e) {
        System.out.println("Что-то пошло не так");
    }}

    private static String PrintArray(int[] arr){
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < arr.length; ++k) {
            sb.append(arr[k] + " ");
        }
        return sb.toString();
    }
}
