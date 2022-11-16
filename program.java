public class program {
    static public void main(String[] args) {
        String s = "2";
        System.out.println(s);

        float f = 1,34f; //для этого типа всегда нужен суффикс f

        double d = 2.34; // для дабл не обязательно

        char ch = "f"; // если в чар написать цифры, то им будет соответствовать символ

        boolean flag1 = 123 <= 234;

        String msg = "Hello world";

        System.out.println(msg); //Hello world

        var i = 123; // когда не знаем тип переменной, пишем var

        int y = 123;
        System.out.println(Integer.MIN_VALUE); // Чтобы получить больше функций, нужно писать классы-обертки (полное слово для переменной или с большой буквы)

        String s = "qwer";
        s.charAt(1) // это даст второй символ

        int a = 123;
        a++; //повышает на 1 (инкремент)
        System.out.println(a); // если хотим сразу повысить на 1 в печати, то писать так: ++a

        int[] arr = new int[10]; // массивы
        arr[3] = 13; // присвоить другое значение
        System.out.println(arr[3]);

        //взять данные у пользователя 

        import java.until.Scanner
        public class program {
            public static void main(String[] args) {
                Scanner iScanner = new Scanner(System.in);
                System.out.printf("name: ");
                String name = iScanner.nextLine();
                System.out.printf("Привет, %s!", name);
                iScanner.close();
            }

        }

        // Форматирование
        String s = "qwe";
        int a = 123;
        String q = a + a;
        System.out.println(q); //qwe123

       //Получение данных после запятой
       float pi = 3.1415f;
        System.out.printf("%f\n", pi);    // 3,141500
        System.out.printf("%.2f\n", pi);  // 3,14
        System.out.printf("%.3f\n", pi);  // 3,141
        System.out.printf("%e\n", pi);    // 3,141500e+00
        System.out.printf("%.2e\n", pi);  // 3,14e+00
        System.out.printf("%.3e\n", pi);  // 3,141e+00

        //описание функции
        public static void main(String[] args) { //обязательно static писать
            sayHi()
        }

        //Оператор ?
        int a = 1;
        int b = 2;
        int min = a < b ? a : b; //если условие верно, то выполняется элемент до двоеточия (a), если неверно - то после (b)

        // continue - возвращается и выполняет то же условие, пока оно true
        // break - завершается, когда оно true
    } 

} 

