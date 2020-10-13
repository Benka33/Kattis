package _1_4_SpeedLimit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s, t, temp = 0, ans = 0;
        do {
            n = sc.nextInt();
            if (n == -1) {
                System.exit(0);
            } else {
                for (int i =0; i < n; i++) {
                    s = sc.nextInt();
                    t = sc.nextInt();
                    ans += s * (t - temp);
                    temp = t;
                }
                System.out.println(ans + " miles");
                ans = 0;
                temp = 0;
            }
        } while (n != -1);
    }
}
