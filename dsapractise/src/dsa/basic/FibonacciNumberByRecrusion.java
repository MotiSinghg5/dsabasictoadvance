package dsa.basic;

import java.util.Scanner;

public class FibonacciNumberByRecrusion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fabNic=fibonacciNumb(5);
        System.out.println(fabNic);
    }

    private static int fibonacciNumb(int n) {
        if(n==0||n==1){
            return n;
        }
        else {
           int temp1= fibonacciNumb(n-1);
            int temp2= fibonacciNumb(n-2);
           return temp1+temp2;
        }
    }
}
