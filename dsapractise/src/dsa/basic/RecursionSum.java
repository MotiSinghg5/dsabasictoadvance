package dsa.basic;

public class RecursionSum {
    public static void main(String[] args) {
        int sumValue=recSum(5);
        System.out.println(sumValue);
    }

    private static int recSum(int n) {
        if(n==1){
            return 1;
        }else {
       int rec  = recSum(n-1);
       return rec+n;
        }
    }
}
