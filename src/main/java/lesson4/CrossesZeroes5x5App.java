package lesson4;



import java.util.Random;
import java.util.Scanner;

public class CrossesZeroes5x5App {

    public static char [][] map;

    public static final int SIZE = 5;

    public static final int DOTS_TO_WIN = 5;


    public static final char DOT_EMPTY = '*';

    public static final char DOT_X = 'x';

    public static final char DOT_0 = '0';

    public static final Scanner SCANNER = new Scanner(System.in);

    public static final Random RANDOM = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Выиграл человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("Компьютр выиграл");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;


        }
    }
}

    public static void printMap() {
        //верхние координаты
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            //левые координаты
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void humanTurn() {
        int x;
        int y;
        do{
            System.out.println("Введите координаты X Y ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }
    public static boolean isCellValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        } else {
            return false;
        }
    }
    public static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(SIZE); // [0, SIZE]
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.printf("Робот ходит в точку %d %d", x + 1, y + 1);
        System.out.println();
        map[x][y] = DOT_0;

}
    public static boolean checkWin(char sym) {
        //горизонтали
        if (map[0][0] == sym && map[0][1] == sym && map[0][2] == sym && map[0][3] == sym && map[0][4] == sym) return true;
        if (map[1][0] == sym && map[1][1] == sym && map[1][2] == sym && map[1][3] == sym && map[1][4] == sym) return true;
        if (map[2][0] == sym && map[2][1] == sym && map[2][2] == sym && map[2][3] == sym && map[2][4] == sym) return true;
        if (map[3][0] == sym && map[3][1] == sym && map[3][2] == sym && map[3][3] == sym && map[3][4] == sym) return true;
        if (map[4][0] == sym && map[4][1] == sym && map[4][2] == sym && map[4][3] == sym && map[4][4] == sym) return true;
        //Вертикали
        if (map[0][0] == sym && map[1][1] == sym && map[2][0] == sym && map[3][0] == sym && map[4][0] == sym) return true;
        if (map[0][1] == sym && map[1][1] == sym && map[2][1] == sym && map[3][1] == sym && map[4][1] == sym) return true;
        if (map[0][2] == sym && map[1][2] == sym && map[2][2] == sym && map[3][2] == sym && map[4][2] == sym) return true;
        if (map[0][2] == sym && map[1][3] == sym && map[2][3] == sym && map[3][3] == sym && map[4][3] == sym) return true;
        if (map[0][2] == sym && map[1][4] == sym && map[2][4] == sym && map[3][4] == sym && map[4][4] == sym) return true;
        //Диагонали
        if (map[0][0] == sym && map[1][1] == sym && map[2][2] == sym && map[3][3] == sym && map[4][4] == sym) return true;
        if (map[0][0] == sym && map[1][1] == sym && map[2][0] == sym && map[3][1] == sym && map[4][0] == sym) return true;

        return false;
    }
}
