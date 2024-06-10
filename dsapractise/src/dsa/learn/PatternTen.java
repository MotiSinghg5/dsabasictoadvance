package dsa.learn;

import java.util.Scanner;

public class PatternTen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int factorialN=0;
        int factorialDiff=0;
        int factorialr=0;

        for (int i=1;i<=n;i++){
           factorialN= factorialN*i;
        }
        System.out.println(factorialN);
        for (int i=1;i<=(n-r);i++){
            factorialDiff=factorialDiff*i;
        }
        System.out.println(factorialN/(factorialDiff));

        for (int i=1;i<=r;i++){
            factorialr=factorialr*i;
        }
        System.out.println(factorialN/(factorialDiff*factorialr));
    }
}
