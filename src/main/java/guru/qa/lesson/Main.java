package guru.qa.lesson;

public class Main {

    public static void main(String[] args) { //класс - это синоним тип данных

        //в классе не переменные, а поля класса. переменные внутри метода

        // Примитивные типы данных
        // 1. Целочисленные типы данных
        byte varByte = 10; //  8bit   -128 ... 127   2^(bits -1)
        short varShort = 10; //  16bit -32768 ... 32767
        int varInt = 10; //* 32bit -2147483648 ... 2147483647
        long varLong = 10L; // 64 bit -2^63 ... 2^63-1

        varInt = varByte; //преобразование меньшего к большему
        varInt = (int) varLong; //преобразование большего к меньшему (будет потеря данных, если в varLong лежит большое число)

        // 2. Числа с плавающей точкой (арифметика с этими типами данных не точная. для вычислений лучше не использовать, только для хранения данных)
        float varFloat = 1.2F; // 32bit
        double varDouble = 1.2; //* 64 bit

        // 3. Символьный тип
        char varChar = 'a';

        // 4. логический тип
        boolean varBoolean = true; //*

        //  Ссылочные (объектные)
        String s = "Hello, world!";
        Phone pixel = new Phone();
        pixel.printName();


        //  Операторы
        // 1. присвоение = (присваивает то что справа в переменную слева)
        String s1 = "Hello, world!";

        // 2. арифметические +, -, *, /, %,
        int divideResult = 7 / 3; // 2
        int residueResult = 7 % 3; // 1 (остаток)

        // 3. операторы сравнения >, <, >=, <=, !=, ==
        boolean result = "Dima".equals("Dima"); //true
        boolean result0 = "Dima" == "Dima"; //false тк разные адреса памяти, разные объекты, в которых хранится строка Dima
        boolean result1 = '3' == 3; //false разные типы

        // 4. логические операторы &, &&, |, ||, !
        // ( &&  проверяется сначала левая часть, если она false, то правая часть не проверяется)
        // ( ||  проверяется сначала левая часть, если она true, то правая часть не проверяется)
        int age = 16;
        String sex = "male";
        boolean canDrinkAlcoholAnd = age > 18 && sex.equals("male");
        boolean canDrinkAlcoholOr = age > 18 || sex.equals("male");
        boolean canDrinkAlcoholInvert = !(age > 18 && sex.equals("male"));

        String name = null;
        boolean canDrinkAlcoholByName = name != null && name.equals("Dima");

        // 5. оператор instanceof
        boolean isString = name instanceof String; //проверяем, относится ли объект к определенному типу

        // 6. тернарный оператор ? :
        String processor = "m1";
        int coreCount = processor.equals("m1")
                ? 2
                : 4;

        if (processor.equals("m1")) {
            coreCount = 2;
        } else if (processor.equals("intel")) {
            coreCount = 4;
        } else {
            coreCount = 8;
        }

        String str = null;
        //условия
        //в самих тесах не должно быть условий
        if (str != null && str.length() == 3) { //в случае одного & во втором выр-е будет NullPointerException если в
            // строке будет null, поэтому его не вычисляют
            System.out.println(str);
        }

        if (str != null && str.length() == 3) { //в случае одного & во втором выр-е будет NullPointerException если в
            // строке будет null, поэтому его не вычисляют
            System.out.println(str);
        } else {
            System.out.println("");
        }

        if (str != null && str.length() == 3) { //в случае одного & во втором выр-е будет NullPointerException если в
            // строке будет null, поэтому его не вычисляют
            System.out.println(str);
        } else if (str != null && str.length() == 3) {
            System.out.println("");
        } else{

        }

        int res = calculate(10, 20);

    }

    public static int calculate(int a, int b) { //сигнатура метода
        return a + b;
    }
}