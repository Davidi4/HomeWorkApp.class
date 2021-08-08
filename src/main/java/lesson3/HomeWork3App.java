package lesson3;

import java.util.Arrays;


public class HomeWork3App {

    public static void main(String[] args) {

        invertArray();
        fillArray();
        numberArray();
        doubleArray();
        lenAndinitialValue(4, 7);
    }

    //№1
    public static void invertArray() {


        int[] arr = {1, 1, 0, 1, 1, 0};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;

            } else if (arr[1] == 0) {
                arr[i] = 1;
                System.out.println();
            }
        }
    }


    //№2
    public static void fillArray() {

        int[] arr = new int[100];
        for (int i = 99; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    //№3
    public static void numberArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }

            //  System.out.println(arr[i]);

            System.out.println(Arrays.toString(arr));


        }
        System.out.println();
    }

    //№4
    public static void doubleArray() {
        int counter = 1;
        int[][] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ; ");
                counter++;
            }
            System.out.println();
        }
    }


    //№5
    public static void lenAndinitialValue( int len,int initialValue ) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        System.out.println(Arrays.toString(arr));

    }

}