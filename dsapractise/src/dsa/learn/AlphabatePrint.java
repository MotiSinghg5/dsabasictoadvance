package dsa.learn;

public class AlphabatePrint {
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if((i==0 && j==0 )){
                    System.out.print("*");
                } else if (i==0 && j==4) {
                    System.out.print("*");
                } else if (i==1 && j==0){
                    System.out.print("*");
                } else if (i==1 && j==2) {
                    System.out.print("*");
                } else if (i==1 && j==3) {
                    System.out.print("*");
                } else if (i==1 &&j==4) {
                    System.out.print("*");
                } else if (i==2 && j==0) {
                    System.out.print("*");
                } else if (i==2 && j==2) {
                    System.out.print("*");
                } else if (i==2 && j==4) {
                    System.out.print("*");
                } else if (i==3 &&j==0 ||j==4) {
                    System.out.print("*");
                }else if (i==4 &&j==0 || j==4) {
                    System.out.print("*");
                }/*else if (i==5 &&j==0) {
                    System.out.print("*");
                }else if (i==5 &&j==5) {
                    System.out.print("*");
                }*/
                {
                    System.out.print(" ");
                }

            }
            System.out.println("");
            }
        }
    }

