package by.tms.lesson28;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Ivan", "Petrov", 45);
        User user2 = new User("Ivan", "Petrov", 45);
        User user3 = new User("Joe", "Biden", 88);
        User user4 = new User("Donald", "Trump", 5);

        System.out.println("User 1 == user 2? " + (user1 == user2));
        System.out.println("User 1 equals user 2? " + (user1.equals(user2)));

        System.out.println("User 1 hashcode == user 2 hashcode? " + (user1.hashCode() == user2.hashCode()));

        System.out.println("User 1 hashcode = " + user1.hashCode());
        System.out.println("User 2 hashcode = " + user2.hashCode());


        //////////
        System.out.println("/////////////////////////");


        System.out.println("User 3 == user 4? " + (user3 == user4));
        System.out.println("User 3 equals user 4? " + (user3.equals(user4)));

        System.out.println("User 3 hashcode == user 4 hashcode? " + (user3.hashCode() == user4.hashCode()));

        System.out.println("User 3 hashcode = " + user3.hashCode());
        System.out.println("User 4 hashcode = " + user4.hashCode());


        //////////
        System.out.println("/////////////////////////");
        System.out.println("Integer pool");

        Integer int1 = 20;
        Integer int2 = 20;
        Integer int3 = new Integer(20);

        System.out.println("int1 == int2? " + (int1 == int2));
        System.out.println("int1 equals int2? " + int1.equals(int2));
        System.out.println("int1 == int3? " + (int1 == int3));
        System.out.println("int1 equals int3? " + int1.equals(int3));

        System.out.println("/////////////////////////");

        Integer int11 = 250;
        Integer int12 = 250;
        Integer int13 = new Integer(250);

        System.out.println("int11 == int12? " + (int11 == int12));
        System.out.println("int11 equals int12? " + int11.equals(int12));
        System.out.println("int11 == int13? " + (int11 == int13));
        System.out.println("int11 equals int13? " + int11.equals(int13));


        //////////
        System.out.println("/////////////////////////");
        System.out.println("String pool");

        String str1 = "Text";
        String str2 = "Text";
        String str3 = new String("Text");

        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 == str3? " + (str1 == str3));
        System.out.println("str1 equals str3? " + str1.equals(str3));


    }

}
