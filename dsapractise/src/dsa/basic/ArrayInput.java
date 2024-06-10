package dsa.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //length of array size
        System.out.println(arr.length);
    }
}
