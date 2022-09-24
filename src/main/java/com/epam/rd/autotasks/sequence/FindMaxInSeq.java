package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        int max = Integer.MIN_VALUE;
        String num = (new Scanner(System.in).nextLine());
        String[] numArray = num.split(" ");
        int[] numbers = new int[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            numbers[i] = Integer.parseInt(numArray[i]);
            if (numbers[i] == 0) {
                break;
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
