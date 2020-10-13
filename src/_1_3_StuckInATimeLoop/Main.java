package _1_3_StuckInATimeLoop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++){
            System.out.println(i + " Abracadabra");
        }
    }
}
