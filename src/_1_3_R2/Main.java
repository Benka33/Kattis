package _1_3_R2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s, r1, r2, diff = 0;
        r1 = scanner.nextInt();
        s = scanner.nextInt();

        if (r1 < s){
            while (r1 < s){
                diff++;
                r1++;
            }
            r2 = s + diff;
            System.out.println(r2);
        } else if (r1 > s){
                while (r1 > s){
                diff--;
                r1--;
            }
                r2 = s + diff;
            System.out.println(r2);
        } else {
            r2 = r1;
            System.out.println(r2);
        }
    }
}
