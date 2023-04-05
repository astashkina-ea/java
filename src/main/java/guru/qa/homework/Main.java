package guru.qa.homework;

public class Main {
    public static void main(String[] args) {

        byte b = 126;
        b += 1;
        System.out.println("b = " + b); // 127
        b += 1;
        System.out.println("b = " + b); // -128 тк переполнение

        char с = '*';
        System.out.println("c = " + с); // *
        с += 1;
        System.out.println("c = " + с); // +
        char c1 = 0x0455;
        System.out.println("c1 = " + c1);
        char c2 = 1275;
        System.out.println("c2 = " + c2);

        short s = 32767;
        System.out.println("s = " + s);
        s += 2;
        System.out.println("s = " + s); // -32767 тк переполнение

        int i = -2147483647;
        System.out.println("i = " + i);
        i -= 2;
        System.out.println("i = " + i); // 2147483647 тк переполнение
        i %= 2; // 1
        System.out.println("i = " + i); // 1 остаток
        i *= 2;
        System.out.println("i = " + i); // 2

        long l = 9223372036854775807L;
        System.out.println("l = " + l);
        l += 1;
        System.out.println("l = " + l); // -9223372036854775808 тк переполнение

        float f = 526e-3F;
        System.out.println("f = " + f);
        f /= 3;
        System.out.println("f = " + f);

        double d = 526E-3D;
        System.out.println("d = " + d);
        d /= 3;
        System.out.println("d = " + d);

        System.out.println("int + double: " + (i + d));
        System.out.println("int - double: " + (i - d));
        System.out.println("int * double: " + (i * d));
        System.out.println("int / double: " + (i / d));
        System.out.println("int % double: " + (i % d));

        boolean bool = true;
        System.out.println(bool);
        System.out.println(!bool);
        boolean bool1 = ((3 > 2) && (4 > 2));
        System.out.println(bool1);
        boolean bool2 = ((3 > 2) || (4 > 2));
        System.out.println(bool2);

        String str = "Hello, world";
        System.out.println(str);

        int[] arr = new int[]{5, 7, 1, 1, 3};
        max(arr);

        int[] arr1 = new int[]{1, 2, 4, 7};
        int[] arr2 = new int[]{2, 5, 7, 8};
        int[] arr3 = new int[]{1, 3, 5, 9};
        sum(arr1, arr2, arr3);

    }

    static void max(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            } else if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный " + max + " Минимальный " + min);
    }

//    Есть 3 массива целых чисел A, B, C (все одинаковой длины и отсортированы).
//    Найти все пары чисел из A и B равные значениям в С.
//
//    Т.е. если
//    A [1, 2, 4, 7]
//    B [2, 5, 7, 8]
//    C [1, 3, 5, 9] то ответы 1+2=3, 1+8=9, 2+7=9, 4+5=9, 7+2=9
    static void sum(int[] arr1, int[] arr2, int[] arr3) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    if (arr1[i] + arr2[j] == arr3[k]) {
                        System.out.println(arr1[i] + "+" + arr2[j] + "=" + arr3[k]);
                    }
                }
            }
        }
    }
}