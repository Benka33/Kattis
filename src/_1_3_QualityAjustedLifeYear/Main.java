package _1_3_QualityAjustedLifeYear;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int periods = 0;
        double quality = 0, time = 0, output = 0;
        periods = sc.nextInt();

        for (int i = 0; i < periods; i++){
            quality = sc.nextDouble();
            time = sc.nextDouble();
            output += quality * time;
        }
        System.out.println(output);
    }
}
