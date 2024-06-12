package dsa.basic;

import java.util.Scanner;

public class ArrayMaxProblems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int temp=0;
        for (int i=1;i<n;i++){
           ar[i]= sc.nextInt();
           if (temp<=ar[i]){
            temp=ar[i];
        }
    }
        System.out.println(temp);
}}
