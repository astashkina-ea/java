package guru.qa.lesson;

public class PointMain {

    public static void main(String[] args) {

        Point moscow = new Point(45.8343, 10.3545, "Москва");
        Point london = new Point(55.1243, 19.3545, "Лондон");
        int initArg = 42;
        moscow.setArg100(42);
        System.out.println(initArg);
        london.printSelf();

    }
}
