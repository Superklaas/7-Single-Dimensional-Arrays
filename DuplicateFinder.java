package be.vdab;

import java.util.Arrays;
import java.util.Random;

public class DuplicateFinder {
    public static void main(String[] args) {
        int lengthArray = 10;
        int[] array = enterNumbersArray(lengthArray); // Create random array
        printArray(array); // Print random array
        int[] allDuplicates = findAllDuplicates(array); // Find duplicates in array and put them in a new array
        printDistinctDuplicates(allDuplicates); // Print the distinct duplicates in the newly created duplicates array
    }

    public static int[] enterNumbersArray(int lengthArray) {
        Random random = new Random();
        int[] array = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("ARRAY TO BE EXAMINED");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    public static int[] findAllDuplicates(int[] array) {
        int amountOfDuplicates = 0;
        int[] duplicates = new int[amountOfDuplicates];
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    amountOfDuplicates++;
                    int[] duplicatesTemp = new int[amountOfDuplicates];
                    duplicatesTemp[amountOfDuplicates-1]=array[j];
                    for (int k = 0; k < amountOfDuplicates-1; k++) {
                        duplicatesTemp[k] = duplicates[k];
                    }
                    duplicates = duplicatesTemp;
                }
            }
        }
        System.out.print("ALL DUPLICATES\n");
        for (int l = 0; l < amountOfDuplicates; l++) {
            System.out.print(duplicates[l] + " ");
        }
        return duplicates;
    }

    public static void printDistinctDuplicates(int[] array) {
        System.out.println("\nDISTINCT DUPLICATES");
        for(int i=0;i<array.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(array[i] == array[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(array[i]+" ");
            }
        }
    }
}

/*
PROBLEM 2
Apply this program to an array of strings.
 */