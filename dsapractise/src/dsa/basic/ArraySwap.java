package dsa.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   // int[] ar = new int[n];
        int[] ar = {31, 4, -7, 1 ,-29};
    int[] arNew = new int[n];
        for(int i = 0;i<n;i++){
       // ar[i] = sc.nextInt();

        if (i == 1) {
            arNew[4] = ar[i];
        } else if (i == 4) {
            arNew[1] = ar[i];
        }else {
            arNew[i] = ar[i];
        }
    }
        System.out.println(Arrays.toString(arNew));
}}