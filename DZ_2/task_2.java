package DZ_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// Дана строка (получение через обычный текстовый файл!!!)
//"фамилия":"Иванов","оценка":"5","предмет":"Математика"
//"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class task_2 {
    public static void main(String[] args) {
        String file_name = "DZ_2/2.txt";
        File file = new File(file_name);
        try(BufferedReader br =  new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while(true){
                line = br.readLine();
                if(line == null){
                    break;
                }
                String[] items = line.replace("\"", "").split("[:,]");
                sb.append("Студент ");
                sb.append(items[1]);
                sb.append(" получил ");
                sb.append(items[3]);
                sb.append(" по предмету ");
                sb.append(items[5]);
                sb.append("\n");
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
