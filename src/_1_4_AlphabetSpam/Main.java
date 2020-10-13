package _1_4_AlphabetSpam;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        double whiteSpace = 0, lower = 0, upper = 0, symbols = 0;

        for (int i = 0; i < length; i++){

            if (input.charAt(i) == '_') whiteSpace++;

            else if (Character.isUpperCase(input.charAt(i))) upper++;

            else if (Character.isLowerCase(input.charAt(i))) lower++;

            else symbols++;
        }

        System.out.println(whiteSpace / length + "\n" + lower / length + "\n" + upper / length + "\n" + symbols / length);

    }
}
