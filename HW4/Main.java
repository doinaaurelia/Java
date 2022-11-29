package HW4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    // 2
    public static LinkedList<Integer> reverse(LinkedList<Integer> otherList) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int i = otherList.size() - 1; i >= 0; i--) {
            reverseList.add(otherList.get(i));
        }
        return reverseList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> newList = new LinkedList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        System.out.println("Initial list: " + newList);
        System.out.println("Reverse list: " + reverse(newList));
    }

    // 0.2

    public static void main2(String[] args) {
        Queue<Integer> newQueue = new LinkedList<>();
        newQueue.add(1);
        newQueue.add(2);
        System.out.println("Queue: " + newQueue);
    }

    // 0.1
    public static void main3(String[] args) {
        Stack<Integer> items = new Stack<>();
        items.push(1);
        items.push(2);
        items.push(3);
        System.out.println("Items: " + items);
    }

    // 2
    public static void main4() throws Exception {
        LinkedList<String> newList = new LinkedList<>();
        String str = System.console().readLine();
        if (str == "-1") {
            System.exit(0);
        }
        if (!str.contains("~")) {
            throw new Exception("Нет ~ символа");
        }
        String[] StringsNums = str.split("~");
        if (StringsNums.length != 2) {
            throw new Exception("Неверный ввод");
        }
        if (StringsNums[0] == "print") {
            System.out.println(newList.get(Integer.parseInt(StringsNums[1])));
        } else {
            newList.add(Integer.parseInt(StringsNums[1]), StringsNums[0]);
        }

    }
}
