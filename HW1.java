
// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class HW1 {
    public static void Task1(String[] args) {
        int n = 0;
        boolean flag = false;

        Scanner iScanner = new Scanner(System.in);
        do {
            System.out.printf("Input integer number n: ");
            flag = iScanner.hasNextInt(); 
            if (flag == true) {
                n = iScanner.nextInt();
            } else {
                System.out.println("Incorrect input! Try again!");
                iScanner.nextLine(); 
            }
        } while (flag != true);
        iScanner.close();
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            fact *= i;
        }
        System.out.printf("Для n = %d: sum = %d, fact = %d\n", n, sum, fact);
    }

}

    //3. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void Task3 (int a){
        if(a<0){
            System.out.println("Число отрицательное.");
        }
        else {
            System.out.println("Число положительное.");
        }
    }

    //4. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean Task4(int a){
        if(a<0){
            return true;
        } else {
            return false;
        }
    }

    
    // 7. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1,
    // 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на
    // 0;

    public static void Task7(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    // 8. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
    // его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void Task8(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    // 9. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void Task6 (String[] args) {
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxMas = mas.length;
        for (int i = 0; i < maxMas; i++) {
            if (mas[i] < 6)
                mas[i] = mas[i] * 2;
        }
        for (int i = 0; i < maxMas; i++) {
            System.out.print(i + "-" + mas[i] + " ");
        }
    }

    // 10. Создать квадратный двумерный целочисленный массив, и с помощью цикла
    // заполнить его диагональные элементы единицами (можно только одну из
    // диагоналей, если обе сложно).

    public static void Task10() {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 11. Написать метод, принимающий на вход два аргумента: len и initialValue, и
    // возвращающий одномерный массив типа int длиной len, каждая ячейка которого
    // равна initialValue;

    public static void Task11(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    // 12 Задать одномерный массив и найти в нем минимальный и максимальный элементы

public static void Task12( int[] arr){
    int max = arr[0];
    int min = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    System.out.println(max);
    System.out.println(min);
}

