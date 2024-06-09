package dsa.basic;

import java.util.Scanner;

public class FactorsCountSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= (n / i); i++) {
            if (n % i == 0) {
                if (i == (n / i)) {
                    count = count + 1;
                } else {
                    count = count + 2;
                }
            }
        }
        System.out.println(count);
    }
}
