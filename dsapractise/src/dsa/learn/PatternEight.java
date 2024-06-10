package dsa.learn;

import java.util.Scanner;

public class PatternEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n / 2;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= number; k++) {
                System.out.print(k);
            }
            if (i <= n / 2) {
                nsp = nsp - 1;
                number = number + 1;
            } else {
                nsp = nsp + 1;
                number = number - 1;
            }
            System.out.println("");
        }
    }

    public  PatternEight() {

    }
}
