package _1_3_Pot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0, number = 0, powerTo = 0, answer = 0;
        input = sc.nextInt();
        for (int i = 0; i < input; i++){
            number = sc.nextInt();
            powerTo = number % 10;
            number = number / 10;
            answer += Math.pow(number, powerTo);
        }
        System.out.println(answer);
    }
}
