package lesson5;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik","Grey",  3);

        cat.info();
        Cat cat2 = new Cat("Barsik", "Black", 4);
        cat2.info();
        System.out.println(cat.getName());

        Cat cat3 = new Cat("Dark grey", 3 );
        cat3.info();




    }
}
