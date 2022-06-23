package hometasks.task2;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {


        ArrayList<String> myList = new ArrayList<>();

        myList.add(0, "Жираф");
        myList.add(1, "Бегемот");
        myList.add(2, "Слон");
        myList.add(3, "Пантера");
        myList.add(4, "Анаконда");
        myList.add(5, "Питон");
        myList.add(6, "Попугай");
        myList.add(7, "Баран");
        myList.add(8, "Овца");
        myList.add(9, "Коза");

        //или можно в цикле заполнить
        //но как "Животное1, Животное2...."

        // Вывод елементов в цикле
        for (Object l : myList) {
            System.out.println(l);
        }

    }

}
