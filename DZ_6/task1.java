package DZ_6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task1 {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("Asus", 8, 500, "Windows", "Black");
        NoteBook notebook2 = new NoteBook("Apple", 16, 240, "MacOS", "Gray");
        NoteBook notebook3 = new NoteBook("Lenovo", 4, 120, "Linux", "Red");
        NoteBook notebook4 = new NoteBook("Xiaomi", 2, 1600, "Windows", "Blue");
        NoteBook notebook5 = new NoteBook("Acer", 32, 500, "Linux", "Red");
        NoteBook notebook6 = new NoteBook("Asus", 16, 1600, "Windows", "Blue");
        NoteBook notebook7 = new NoteBook("Apple", 32, 500, "MacOS", "Black");
        NoteBook notebook8 = new NoteBook("Lenovo", 2, 240, "Linux", "Gray");
        NoteBook notebook9 = new NoteBook("Xiaomi", 4, 120, "Windows", "Red");
        NoteBook notebook10 = new NoteBook("Acer", 8, 500, "Linux", "Blue");

        Set<NoteBook> noteBooks = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5, 
            notebook6, notebook7, notebook8, notebook9, notebook10));
        
        Map<Integer, String> mapNames = new HashMap<>();
        mapNames.put(1, "Asus");
        mapNames.put(2, "Apple");
        mapNames.put(3, "Lenovo");
        mapNames.put(4, "Xiaomi");
        mapNames.put(5, "Acer");

        Map<Integer, String> mapRAM = new HashMap<>();
        mapRAM.put(1, "2");
        mapRAM.put(2, "4");
        mapRAM.put(3, "8");
        mapRAM.put(4, "16");
        mapRAM.put(5, "32");

        Map<Integer, String> mapCapacityHardDisk = new HashMap<>();
        mapCapacityHardDisk.put(1, "120");
        mapCapacityHardDisk.put(2, "240");
        mapCapacityHardDisk.put(3, "500");
        mapCapacityHardDisk.put(4, "1600");

        Map<Integer, String> mapOperatingSystems = new HashMap<>();
        mapOperatingSystems.put(1, "Windows");
        mapOperatingSystems.put(2, "Linux");
        mapOperatingSystems.put(3, "MacOS");

        Map<Integer, String> mapColours = new HashMap<>();
        mapColours.put(1, "Black");
        mapColours.put(2, "Gray");
        mapColours.put(3, "Red");
        mapColours.put(4, "Blue");

        System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - Производитель\n2 - ОЗУ\n" +
            "3 - Объем ЖД\n4 - Операционная система\n5 - Цвет");
        Scanner iScanner = new Scanner(System.in);
        int firstParameter = iScanner.nextInt();
        System.out.println("Сделайте выбор по Вашему критерию: ");

        switch(firstParameter) {
            case 1: {
                for (var item : mapNames.entrySet()) {
                    System.out.printf("%d - %s\n", item.getKey(), item.getValue());
                }
                int secondParameter = iScanner.nextInt();
                for (var noteBook : noteBooks) {
                    if(noteBook.getName() == mapNames.get(secondParameter))
                    {
                        System.out.println(noteBook);
                    }
                }
                break;
            }
            case 2: {
                for (var item : mapRAM.entrySet()) {
                    System.out.printf("%d - %s\n", item.getKey(), item.getValue());
                }
                int secondParameter = iScanner.nextInt();
                for (var noteBook : noteBooks) {
                    if(noteBook.getRAM() == Integer.parseInt(mapRAM.get(secondParameter)))
                    {
                        System.out.println(noteBook);
                    }
                }
                break;
            }
            case 3: {
                for (var item : mapCapacityHardDisk.entrySet()) {
                    System.out.printf("%d - %s\n", item.getKey(), item.getValue());
                }
                int secondParameter = iScanner.nextInt();
                for (var noteBook : noteBooks) {
                    if(noteBook.getCapacityHardDisk() == Integer.parseInt(mapCapacityHardDisk.get(secondParameter)))
                    {
                        System.out.println(noteBook);
                    }
                }
                break;
            }
            case 4: {
                for (var item : mapOperatingSystems.entrySet()) {
                    System.out.printf("%d - %s\n", item.getKey(), item.getValue());
                }
                int secondParameter = iScanner.nextInt();
                for (var noteBook : noteBooks) {
                    if(noteBook.getOperatingSystem() == mapOperatingSystems.get(secondParameter))
                    {
                        System.out.println(noteBook);
                    }
                }
                break;
            }
            case 5: {
                for (var item : mapColours.entrySet()) {
                    System.out.printf("%d - %s\n", item.getKey(), item.getValue());
                }
                int secondParameter = iScanner.nextInt();
                for (var noteBook : noteBooks) {
                    if(noteBook.getColour() == mapColours.get(secondParameter))
                    {
                        System.out.println(noteBook);
                    }
                }
                break;
            }
        }
        iScanner.close();
    }
}
