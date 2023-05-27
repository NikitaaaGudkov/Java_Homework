/*
На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
0x000000
0000x000
00x00000
 */

import java.util.ArrayList;
import java.util.List;

/*
    Введём условное обозначение ячеек шахматного поля:
    0 - ячейка не занята и не бьётся ни одним ферзём
    1 - ячейка не занята, но бьётся хотя бы одним ферзём
    9 - ячейка занята ферзём
 */

public class task3 {
    static List<int[][]> result = new ArrayList<int[][]>();
    public static void main(String[] args) {
        int[][] chessBoard = new int[8][8];
        GetVariants(chessBoard, 0);
        for (var item : result) {
            PrintMatrix(item);
            System.out.println();
        }
        System.out.println(result.size());
    }

    // Получаем все возможные варианты расположения ферзей и записываем их в List<int[][]> result.
    static void GetVariants(int[][] matrix, int i) {
        if(i == 8)
        {
            result.add(matrix);
            return;
        }
        for (int j = 0; j < matrix.length; ++j)
        {
            int[][] copyMatrix = CopyMatrix(matrix);
            if(CheckMatrix(copyMatrix, i, j))
            {
                copyMatrix = FillMatrix(copyMatrix, i, j);
                GetVariants(copyMatrix, i + 1);
            }
        }
    }

    // Глубокое копирование двумерного массива.
    static int[][] CopyMatrix(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j < matrix[i].length; ++j) {
                result[i][j] = matrix[i][j];
            } 
        }
        return result;
    }

    // Вывод шахматной доски на консоль.
    static void PrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i)
        {
            for (int j = 0; j < matrix[0].length; ++j)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Проверка, является ли возможным поставить ферзя в конкретную ячейку поля.
    static Boolean CheckMatrix(int[][] matrix, int rowPosition, int columnPosition) {
        if(rowPosition < matrix.length && columnPosition < matrix[0].length)
        {
            return matrix[rowPosition][columnPosition] == 0;
        }
        return false;
    }

    // Заполнение матрицы. Ставим 9 в ячейку, куда поставили ферзя, и уже от неё расставляем 1 на все клетки, которые бьёт эта новая фигура.
    static int[][] FillMatrix(int[][] matrix, int rowPosition, int columnPosition) {
        matrix[rowPosition][columnPosition] = 9;
        for (int i = 0; i < matrix.length; ++i)
        {
            if (matrix[i][columnPosition] == 0)
            {
                matrix[i][columnPosition] = 1;
            }
        }

        for (int j = 0; j < matrix[0].length; ++j)
        {
            if (matrix[rowPosition][j] == 0)
            {
                matrix[rowPosition][j] = 1;
            }
        }

        int row = rowPosition;
        int col = columnPosition;
        while(row >= 0 && col >= 0)
        {
            if (matrix[row][col] == 0)
            {
                matrix[row][col] = 1;
            }
            --row;
            --col;
        }

        row = rowPosition;
        col = columnPosition;
        while (row < matrix.length && col < matrix[0].length)
        {
            if (matrix[row][col] == 0)
            {
                matrix[row][col] = 1;
            }
            ++row;
            ++col;
        }

        row = rowPosition;
        col = columnPosition;
        while (row >= 0 && col < matrix[0].length)
        {
            if (matrix[row][col] == 0)
            {
                matrix[row][col] = 1;
            }
            --row;
            ++col;
        }

        row = rowPosition;
        col = columnPosition;
        while (row < matrix.length && col >= 0)
        {
            if (matrix[row][col] == 0)
            {
                matrix[row][col] = 1;
            }
            ++row;
            --col;
        }
        return matrix;
    }
}
