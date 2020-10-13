package _1_5_SimonSays;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String input;
            sc.nextLine();
            for (int i = 0; i < n; i++){
                input = sc.nextLine();
                if (input.startsWith("Simon says")){
                    System.out.println(input.substring(10));
                }
            }
        }
}
