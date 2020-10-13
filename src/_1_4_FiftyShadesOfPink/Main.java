package _1_4_FiftyShadesOfPink;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = 0, answer = 0;
        String buttons;
        iterations = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < iterations; i++){
            buttons = sc.nextLine();
            buttons = buttons.toLowerCase();
            if (buttons.contains("pink") || buttons.contains("rose")){
                answer++;
            }
        }
        if (answer != 0){
            System.out.println(answer);
        } else {
            System.out.println("I must watch Star Wars with my daughter");
        }
    }
}
