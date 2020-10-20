package _1_7_SomeSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Either");
            return;
        }
        double half = n / 2d;
        int a = (int)Math.floor(half);
        int b = (int)Math.ceil(half);
        if (a == b)
            if (a % 2 == 1)
                System.out.println("Odd");
            else
                System.out.println("Even");
         else
            System.out.println("Either");
    }
}
