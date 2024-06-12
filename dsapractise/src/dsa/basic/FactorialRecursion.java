package dsa.basic;

import java.util.Scanner;


public class FactorialRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            int facto = factorial(n - 1);
            return facto * n;
        }

    }
}
