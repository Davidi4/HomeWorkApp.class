package lesson2;

public class MethodApp {

    public static void main(String[] args) {
        System.out.println(checkSum(19, 9));
        PositiveOrNegative(4);
        System.out.println(IsPositive(-5));
        StringAndNumber("Число", 3);
       // System.out.println(CheckYear(?)); не поял как правильно написать код,еще почитаю


    }

    //№1
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //№2
    public static void PositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательно");
        }

    }

    //№3
    public static boolean IsPositive(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }


    //№4
    public static void StringAndNumber(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    //№5
    public static boolean CheckYear(int year) {
        return true;
    }


}




