package dsa.learn;

import java.util.Scanner;

public class PatternOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = 4;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(nst + " ");
                nst++;
            }
            System.out.println();
        }
    }
}
