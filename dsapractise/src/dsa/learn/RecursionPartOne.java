package dsa.learn;

import java.util.Scanner;

public class RecursionPartOne {
    // a function that calls itself.

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int number= scanner.nextInt();
        while (number!=0){
            System.out.print(number+",");
            number=number-1;
        }
    }

}
