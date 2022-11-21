package by.tms.lesson29.task2;

import java.util.*;

public class Task2Main {

    public static void main(String[] args) {

        final int MINIMUM_NAME_LENGTH = 3;
        final int MAXIMUM_NAME_LENGTH = 10;

        final int MINIMUM_AGE = 1;
        final int MAXIMUM_AGE = 100;

        final int CAPACITY = 1000;

        List<User> usersList = new ArrayList<>(CAPACITY);

        for (int i = 1; i <= 1000; i++) {
            User bufferUser = new User(Task2Utils.getRandomName(MINIMUM_NAME_LENGTH, MAXIMUM_NAME_LENGTH), Task2Utils.getRandomInteger(MINIMUM_AGE, MAXIMUM_AGE));
            usersList.add(bufferUser);
        }


        // переводим в hashset, чтобы избавиться от повторений
        Set<User> usersHashSet = new HashSet<>(usersList);

        // переводим обратно в arraylist для сортировки
        List<User> usersList2 = new ArrayList<>(usersHashSet);

        // сортировка
        Comparator<User> comparatorAgeDescending = new ComparatorAgeDescending();
        usersList2.sort(comparatorAgeDescending);


        System.out.println(usersList2.toString());

        // вывод первых 10 элементов
        for (int i = 0; i <= 9; i++) {
            System.out.println(usersList2.get(i));
        }

    }

}
