// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

public class HW3 {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        Random r = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        logger.info("Initial array");
        for (int i = 0; i < 15; i++) {
            numbers.add(i, r.nextInt(10));
        }
        logger.info(numbers.toString());
        ArrayList<Integer> numb_even = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            if (numbers.get(i) % 2 == 0) {
                numb_even.add(numbers.get(i));
            }
        }
        numbers.removeAll(numb_even);
        logger.info("New array");
        logger.info(numbers.toString());
    }

}

// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и
// среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

public class HW3 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getAnonymousLogger();
        Random r = new Random();
        int max = -10;
        int min = 10;
        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i, (int) (Math.pow(-1.0, i)) * r.nextInt(10));
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
            sum += numbers.get(i);
        }
        StringBuilder str = new StringBuilder();
        str.append("Initial array: ");
        str.append(numbers.toString());
        str.append("\nMinimum: ");
        str.append(min);
        str.append("\nMaximum: ");
        str.append(max);
        str.append("\nAverage: ");
        str.append(sum / 10.0);
        logger.info(str.toString());
    }
}

// 3. Написать простой класс ТелефонныйСправочник, который хранит в себе список
// фамилий и телефонных номеров. В этот телефонный справочник с помощью метода
// add() можно добавлять записи. С помощью метода get() искать номер телефона по
// фамилии. Следует учесть, что под одной фамилией может быть несколько
// телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
// выводиться все телефоны.
