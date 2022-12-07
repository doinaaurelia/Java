import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void criterionFloat(int ch, float temp, Set<Laptop> laptops) {
        switch (ch) {
            case 7:
                for (Laptop elem : laptops) {
                    if (elem.getMass() == temp) {
                        System.out.println(elem.toString());
                    }
                }
                break;
            case 8:
                for (Laptop elem : laptops) {
                    if (elem.getPrice() == temp) {
                        System.out.println(elem.toString());
                    }
                }
                break;

        }
    }

    public static void criterionInt(int ch, int temp, Set<Laptop> laptops) {
        switch (ch) {
            case 1:
                for (Laptop elem : laptops) {
                    if (elem.getRam() == temp) {
                        System.out.println(elem.toString());
                    }
                }
                break;
            case 2:
                for (Laptop elem : laptops) {
                    if (elem.getHd() == temp) {
                        System.out.println(elem.toString());
                    }
                }
                break;
            case 6:
                for (Laptop elem : laptops) {
                    if (elem.getSize() == temp) {
                        System.out.println(elem.toString());
                    }
                }
                break;
        }
    }

    public static void criterionString(int ch, String temp, Set<Laptop> laptops) {
        switch (ch) {
            case 3:
                for (Laptop elem : laptops) {
                    if (elem.getOs().equals(temp)) {
                        System.out.println(elem.toString());
                    }
                }
                break;
            case 4:
                for (Laptop elem : laptops) {
                    if (elem.getColor().equals(temp)) {
                        System.out.println(elem.toString());
                    }
                }
                break;
            case 5:
                for (Laptop elem : laptops) {
                    if (elem.getProcessor().equals(temp)) {
                        System.out.println(elem.toString());
                    }
                }
                break;
        }
    }

    public static void ask(Set<Laptop> laptops) {
        Scanner iScanner = new Scanner(System.in);
        Map<Integer, String> criterions = new HashMap<Integer, String>();
        criterions.put(1, "ОЗУ");
        criterions.put(2, "Объем ЖД");
        criterions.put(3, "Операционная система");
        criterions.put(4, "Цвет");
        criterions.put(5, "Процессор");
        criterions.put(6, "Размер");
        criterions.put(7, "Масса");
        criterions.put(8, "Цена");
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        for (Integer i : criterions.keySet()) {
            System.out.printf("%d - %s\n", i, criterions.get(i));
        }
        boolean flag = false;
        int ch = 0;
        do {
            flag = iScanner.hasNextInt();
            if (flag == true) {
                ch = iScanner.nextInt();
            }
            if (flag == false || ch < 1 || ch > 7) {
                System.out.println("Incorrect input! Try again!");
                iScanner.nextLine();
                flag = false;
            }
        } while (flag != true);

        switch (ch) {
            case 1:
            case 2:
            case 6:
                System.out.println("Введите значение данного параметра в виде целочисленного числа: ");
                int tempInt = 0;
                do {
                    flag = iScanner.hasNextInt();
                    if (flag == true) {
                        tempInt = iScanner.nextInt();
                    } else {
                        System.out.println("Incorrect input! Try again!");
                        iScanner.nextLine();
                    }
                } while (flag != true);
                Main.criterionInt(ch, tempInt, laptops);
                break;
            case 7:
            case 8:
                System.out.println("Введите значение данного параметра в виде вещественного числа: ");
                float tempFloat = 0.0f;
                do {
                    flag = iScanner.hasNextFloat();
                    if (flag == true) {
                        tempFloat = iScanner.nextFloat();
                    } else {
                        System.out.println("Incorrect input! Try again!");
                        iScanner.nextLine();
                    }
                } while (flag != true);
                Main.criterionFloat(ch, tempFloat, laptops);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Введите значение данного параметра в виде строки: ");
                String tempStr;
                tempStr = iScanner.next();
                Main.criterionString(ch, tempStr, laptops);
                break;
        }
        iScanner.close();
    }

    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        Laptop lap2 = new Laptop(16, 512, "macOs", "серый космос", "Apple M1 Pro", 13, 1.52f, 139990.0f);
        Laptop lap3 = new Laptop(8, 512, "macOs", "серый космос", "Apple M1 Pro", 14, 1.61f, 189990.0f);
        Laptop lap4 = new Laptop(16, 512, "Windows 11", "белый", "Intel Core i7-12700H", 16, 3.4f, 78650.0f);

        Set<Laptop> notebook1 = new HashSet<>();
        notebook1.add(lap1);
        notebook1.add(lap2);
        notebook1.add(lap3);
        notebook1.add(lap4);
        Main.ask(notebook1);
    }
}