package dsa.learn;

import java.util.Scanner;

public class PatternSix {
    // even input is invalid for diamond. and space value in first row of daimond is n/2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            if (i < 3) {
                nst = nst + 2;
            } else if (i >= 3) {
                nst = nst - 2;
            }
            System.out.println("");
        }
    }
}
