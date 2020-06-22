package be.vdab;

import java.util.Random;

public class Rotary {

    public static void main(String[] args) {
        int lengthArray = enterLengthArray();
        int[] oldArray = enterNumbersArray(lengthArray);
        int[] newArray = extendArray(oldArray);
        printArrays(oldArray, newArray);
    }

    public static int enterLengthArray()    {
        Random random = new Random();
        int lengthArray = random.nextInt(10);
        return lengthArray;
    }

    public static int[] enterNumbersArray(int lengthArray) {
        Random random = new Random();
        int[] oldArray = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            oldArray[i] = random.nextInt(10);
        }
        return oldArray;
    }

    public static int[] extendArray(int[] oldArray)    {
        Random random = new Random();
        int[] newArray = new int[oldArray.length+1];
        newArray[0] =  random.nextInt(10);
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = oldArray[i-1];
        }
        return newArray;
    }

    public static void printArrays(int[] oldArray, int[] newArray)  {
        System.out.println("OLD ARRAY");
        for (int i = 0; i < oldArray.length; i++) {
            System.out.println(oldArray[i]);
        }
        System.out.println("NEW ARRAY");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

}
