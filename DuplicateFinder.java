package be.vdab;

import java.util.Random;

public class DuplicateFinder {
    public static void main(String[] args) {
        int lengthArray = 10;
        int[] array = enterNumbersArray(lengthArray);
        duplicatesArray(array);
    }

    public static int[] enterNumbersArray(int lengthArray) {
        Random random = new Random();
        int[] array = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("ARRAY TO BE EXAMINED");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        return array;
    }

    public static void duplicatesArray(int[] array) {
        int amountOfDuplicates = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    amountOfDuplicates++;
                    System.out.println("Duplicate number " + amountOfDuplicates + ": " + array[j]);
                }
            }
        }
    }

}

/*
PROBLEM 1
If a certain number happens to appear more than twice in the array, it shows up to often as a duplicate number.
We need an xtra check  to know if the occurred number is already noticed as a duplicate number.
Save all the duplicates in extendable array.
Check per new duplicate if the number is already in the duplicate array.

PROBLEM 2
Apply this program to an array of strings.
 */