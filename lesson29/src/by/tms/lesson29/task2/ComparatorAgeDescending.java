package by.tms.lesson29.task2;

import java.util.Comparator;

public class ComparatorAgeDescending implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        return user2.getAge() - user1.getAge();
    }

}
