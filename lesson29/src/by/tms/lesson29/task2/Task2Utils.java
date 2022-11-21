package by.tms.lesson29.task2;

public class Task2Utils {

    // метод для генерации случайных int
    public static int getRandomInteger (int minNumber, int maxNumber) {
        double randomDouble = Math.random();

        randomDouble = Math.round(randomDouble * ((double)maxNumber - (double)minNumber) + (double)minNumber);
        return (int) randomDouble;
    }


    // метод для генерации случайных букв
    public static char getRandomChar () {

        final int ALPHABET_LENGTH = 26;

        String lettersArray = "abcdefghijklmnopqrstuvwxyz";

        return lettersArray.charAt(getRandomInteger(0, ALPHABET_LENGTH-1));
    }



    // метод для генерации случайного имени
    public static String getRandomName (int minLength, int maxLength) {

        String generatedName = "";

        int num = getRandomInteger(minLength, maxLength);

        for (int i=1; i<=num; i++) {

            if (generatedName.equals("")) {
                generatedName = Character.toString(getRandomChar());
            } else {
                generatedName = generatedName.concat(Character.toString(getRandomChar()));
            }


        }
        return generatedName;

    }



}
