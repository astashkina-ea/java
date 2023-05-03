package guru.qa.lesson;

import java.util.*;

import static java.util.Arrays.asList;

public class HumanMain {
    public static void main(String[] args) {
        String[] hobbies = new String[3];
        hobbies[0] = "Футбол";
        hobbies[1] = "Java";
        hobbies[2] = "Гражданская Оборона";

        String[] hobbiesAnother = new String[]{
                "Футбол", "Java", "Гражданская Оборона"
        };

        int length = hobbiesAnother.length;
        asList(hobbiesAnother).contains("Java");//проверка наличия "Java" в нашем массиве

        Human h1 = new Human("Test", 23, hobbies);

        int[][] intArray1 = new int[][]{
                new int[]{1, 2, 3},
                new int[]{1, 2, 3}
        };

        int[][][] intArray2 = new int[][][]{
                new int[][]{
                        new int[]{1, 2, 3}
                },
                new int[][]{
                        new int[]{1, 2, 3}
                }
        };

        //Java Collection API

        //Создание List
        List<String> hobbiesList = new ArrayList<>(); //ArrayList реализация интерфейса List. List - не имеет размера
        //запонение List
        hobbiesList.add("Футбол");
        hobbiesList.add("Java");
        hobbiesList.add("Гражданская Оборона");
        //создание List и запонение
        List<String> hobbiesListAnother = List.of(
                "Футбол", "Java", "Гражданская Оборона"
        );

        //Множество уникальных значений (может хранить в себе 2 уникальных объекта)
        Set<String> hobbiesSet = new HashSet<>(); //HashSet реализация интерфейса Set
        hobbiesSet.add("Футбол");
        hobbiesSet.add("Java");
        hobbiesSet.add("Гражданская Оборона");

        Set<String> hobbiesSetAnother = Set.of(
                "Футбол", "Java", "Гражданская Оборона"
        );

        Human dima = new Human("Дима", 33, hobbies);
        Human dima1 = new Human("Дима", 33, hobbies);

        Set<Human> humanSet = new HashSet<>();
        humanSet.add(dima);
        humanSet.add(dima1);

        dima.equals(dima1); //false тк разные адреса объектов в памяти, чтобы вохзвращал true нужно переопределить метод equals и hashCode
        Human dima3 = new Human("Дима", 33, hobbies);
        Human dima4 = dima3;
        dima.equals(dima1); //true тк разные 1 адрес объекта в памяти


        Map<String, Human> humans = new HashMap<>();
        humans.put("1234545", dima);
        humans.put("1224455", dima1);

        for (
                int i = 0;
                i < hobbies.length; i++) {
            System.out.println(hobbies[i]);
        }

        for (
                String hobby : hobbies) {
            System.out.println(hobby);
        }

        boolean arrayContainJava = false;
        int index = 0;
        while (!arrayContainJava && index < hobbies.length) {
            if (hobbies[index].equals("Java")) {
                arrayContainJava = true;
                //break; выход из цикла
                //continue; выход их текущей итерации
                //return;  выход из метода
            }
            index++;
        }

        do {
            if (hobbies[index].equals("Java")) {
                arrayContainJava = true;
            }
            index++;
        } while (!arrayContainJava && index < hobbies.length);

    }
}
