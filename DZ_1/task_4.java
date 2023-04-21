package DZ_1;

import java.util.Scanner;

// 4. * Дополнительно: +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
//Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
//Под знаками вопросов - одна и та же цифра Ввод: 2? + ?5 = 69 Вывод: 24 + 45 = 69

public class task_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите уравнение: ");
        String equation = iScanner.nextLine();
        iScanner.close();
        int index_plus = equation.indexOf("+");
        String q_str = equation.substring(0, index_plus - 1);
        q_str = q_str.trim();
        int index_equal = equation.indexOf("=");
        String w_str = equation.substring(index_plus + 1, index_equal - 1);
        w_str = w_str.trim();
        String e_str = equation.substring(index_equal + 1);
        e_str = e_str.trim();
        int i = 0;
        for (; i <= 9; ++i) {
            String q_temp_str = q_str.replace("?", Integer.toString(i));
            String w_temp_str = w_str.replace("?", Integer.toString(i));
            String e_temp_str = e_str.replace("?", Integer.toString(i));
            int q = Integer.parseInt(q_temp_str);
            int w = Integer.parseInt(w_temp_str);
            int e = Integer.parseInt(e_temp_str);
            if(q + w == e){
                System.out.printf("Вывод: %d + %d = %d \n", q, w, e);
                break;
            }
        }
        if(i == 10){
            System.out.print("Вывод: Нет решений :( \n");
        }
    }
}
