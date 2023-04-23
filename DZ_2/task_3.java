package DZ_2;

import java.io.File;
import java.io.FileWriter;

// 3* дополнительно. К калькулятору из предыдущего дз добавить логирование.

public class task_3 {
    public static void main(String[] args) {
        String File_name = "DZ_2/3.txt";
        File file = new File(File_name);
        try {
            FileWriter writer = new FileWriter(file, true);
            String result = DZ_1.task_3.SimpleCalc();
            writer.write(result);
            writer.write("\n");
            writer.close();
            System.out.println("Получилось");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
