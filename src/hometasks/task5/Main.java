package hometasks.task5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Володимир Іванович");
        myList.add("Андрій Миколайович");
        myList.add("Іван Федорович");
        myList.add("Роман Вікторович");
        myList.add("Руслан Андрійович");
        myList.add("Ігор Віталійович");
        myList.add("Олег Іванович");
        myList.add("Антон Андрійович");
        myList.add("Віктор Борисович");

        // Вывод елементов в цикле
        for (Object l : myList) {
            System.out.println(l);
        }

        System.out.println("\nИндекс хорошего учителя = " + myList.get(0));
        System.out.println("Индекс плохого учителя = " + myList.get(myList.size() - 1));

    }

}
