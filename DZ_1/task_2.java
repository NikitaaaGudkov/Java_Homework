package DZ_1;

// 2. Вывести все простые числа от 1 до 1000

public class task_2 {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 1000: ");
        System.out.printf("%d\t", 1);
        for (int number = 2; number <= 1000; ++number) {
            int divisor = 2;
            for (; divisor < number; ++divisor) {
                if(number % divisor == 0){
                    break;
                }
            }
            if(divisor == number){
                System.out.printf("%d\t", number);
            }
        }
    }
}
