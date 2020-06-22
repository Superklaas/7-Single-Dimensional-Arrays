package be.vdab;

import java.util.Random;

public class DuplicateFinder {
    public static void main(String[] args) {
        int lengthArray = enterLengthArray();
        int[] array = enterNumbersArray(lengthArray);
        duplicatesArray(array);
    }

    public static int enterLengthArray()    {
        Random random = new Random();
        int lengthArray = random.nextInt(10);
        return lengthArray;
    }

    public static int[] enterNumbersArray(int lengthArray) {
        Random random = new Random();
        int[] array = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("ARRAY TO BE EXAMINED");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }

    public static void duplicatesArray(int[] array) {
        int amountOfEqualities = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    amountOfEqualities++;
                    System.out.println("Duplicate number " + amountOfEqualities + ": " + array[j]);
                }
            }
        }
    }

}
