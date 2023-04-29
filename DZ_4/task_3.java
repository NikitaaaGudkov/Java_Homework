package DZ_4;

import java.util.Scanner;
import java.util.Stack;

/*
3) В калькулятор добавьте возможность отменить последнюю операцию.
Пример
1
+
2
ответ: 3
+
4
ответ: 7
+
2
ответ: 9
-
1
Ответ 8
Отмена -> 9
Отмена -> 7
Отмена -> 3
+
2
Ответ 5
 */

public class task_3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: \t");
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(number);
        while(true) {
            int firstNumber = stack.peek();
            System.out.println("Введите операцию (+, -, *, /) для продолжения вычислений, " + 
            "слово <<Cancel>> для возврата к предыдущему результату или слово <<Exit>> для выхода из калькулятора: \t");
            String message = iScanner.next();
            if(message.equals("Exit")) {
                break;
            } else if(message.equals("Cancel")) {
                stack.pop();
                System.out.println("Предыдущий результат: \t" + stack.peek());
            } else {
                int result = 0;
                System.out.println("Введите второе число: \t");
                int secondNumber = iScanner.nextInt();
                boolean isValidOperation = true;
                switch(message) {
                    case "+": result = firstNumber + secondNumber; break;
                    case "-": result = firstNumber - secondNumber; break;
                    case "*": result = firstNumber * secondNumber; break;
                    case "/": 
                        if(secondNumber == 0) {
                            isValidOperation = false;
                            break;
                        }
                        result = firstNumber / secondNumber; break;
                    default: isValidOperation = false; break;
                }
                if(!isValidOperation) {
                    System.out.println("Ошибка при выполнении операции!!! Предыдущий результат: \t" + stack.peek());
                    continue;
                }
                stack.push(result);
                System.out.println("Результат:\t" + stack.peek());
            }
        }
        System.out.println("Результат:\t" + stack.peek());
        iScanner.close();
    }
}
