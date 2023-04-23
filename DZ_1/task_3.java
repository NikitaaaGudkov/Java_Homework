package DZ_1;

import java.util.Scanner;

// 3. Реализовать простой калькулятор

public class task_3 {

    public static void main(String[] args) {
        
        String result = SimpleCalc();
        System.out.printf(result + "\n");
    }

    public static String SimpleCalc() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int first_number = iScanner.nextInt();

        System.out.printf("Введите операцию: ");
        String operation = iScanner.next();

        System.out.printf("Введите второе число: ");
        int second_number = iScanner.nextInt();
        iScanner.close();
        String result = "";
        switch(operation){
            case "+": {
                result = Integer.toString(first_number + second_number);
                break;
            }
            case "-": {
                result = Integer.toString(first_number - second_number);
                break;
            }
            case "*": {
                result = Integer.toString(first_number * second_number);
                break;
            }
            case "/": {
                if(second_number == 0){
                    return "Ошибка! Нельзя делить на ноль!";
                }
                else{
                    result = Integer.toString(first_number / second_number);
                }
                break;
            }
        }
        return first_number + " " + operation + " " + second_number + " = " + result;
    }
}
