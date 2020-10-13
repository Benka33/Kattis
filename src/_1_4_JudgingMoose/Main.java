package _1_4_JudgingMoose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), r = sc.nextInt(), ans = 0;
        if (l == 0 && r == 0) System.out.println("Not a moose");
        else if (l == r) {
            ans = l + r;
            System.out.println("Even " + ans);
        }
        else if (l > r) {
            ans = l + l;
            System.out.println("Odd " + ans);
        }
        else {
            ans = r + r;
            System.out.println("Odd " + ans);
        }
    }
}
