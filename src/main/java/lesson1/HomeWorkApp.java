package lesson1;

public class HomeWorkApp {

    public class Main{

    }
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Bananas");
        System.out.println("Apple");
    }

public static void checkSumSign() {
    int a = 24;
    int b = 23;
    int c = a + b;
    if (c >= 0) {
        System.out.println("Сумма положительная");
    } else {
        System.out.println("Сумма отрицательная");
    }


}
    public static void printColor() {
        int value = 23;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }

    } public static void compareNumbers() {
        int a = 44;
        int b = 77;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
