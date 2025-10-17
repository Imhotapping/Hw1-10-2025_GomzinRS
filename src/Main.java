public class Main {
    public static void main(String[] args) {

        //1 Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte a = 100;
        short b = 21200;
        int c = 155155;
        long d = 2551456;
        float x = 0.01F;
        double y = 123456789.23;
        char letter = 'a';
        boolean isThis = true;

        //2 Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        greetingByName("Roman");

        //3 Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        System.out.println( isNegative(7) );
        System.out.println( isNegative(-5) );

        //4 Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        checkNumber(6);
        checkNumber(-7);
        checkNumber(0);

        //5 Написать метод, который выводит последовательность чисел от 1000 до 0, кратных 3
        seqNumber();

    }

    public static void greetingByName(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static boolean isNegative(int number){
        return number < 0;
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static void seqNumber(){

        int i = 1000;
        while (i > 0) {
            if (i % 3 == 0)
                System.out.println(i);
            i--;
        }
    }

}