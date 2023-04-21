package DZ_1;

import java.util.Scanner;

// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class task_1{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        int sum = 0;
        int multi = 1;
        for (int i = 1; i <= n; ++i) {
            sum += i;
            multi *= i;
        }
        System.out.printf("n-ое треугольное число = %d\n", sum);
        System.out.printf("n! = %d\n", multi);
        iScanner.close();
    }
}