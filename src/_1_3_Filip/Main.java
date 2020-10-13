package _1_3_Filip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int reverse1 = 0, reverse2 = 0;

        while (input1 != 0) {
            reverse1 = reverse1 * 10;
            reverse1 = reverse1 + input1 % 10;
            input1 = input1 / 10;
    }
        System.out.println();
            while (input2 != 0) {
            reverse2 = reverse2 * 10;
            reverse2 = reverse2 + input2 % 10;
            input2 = input2 / 10;
        }
        if (reverse1 > reverse2) System.out.println(reverse1);
        else System.out.println(reverse2);
    }
}
