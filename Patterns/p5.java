package Patterns;

public class p5 {
    public static void main(String[] args) {
        pattern8(9);
    }
    static void pattern5(int n){
        for(int row = 0;row<=n;row++){
            for(int col =0;col<=n-row-1;col++ ){
                System.out.print(" ");
            }
            for(int col=0;col<2*row+1;col++){
                System.out.print("*");
            }
            for(int col =0;col<=n-row-1;col++ ){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int row = 0;row<n;row++){
            for(int col = 0;col<row;col++){
                System.out.print(" ");
            }
            for(int col = 0;col<2*n-1-2*row;col++){
                System.out.print("*");
            }
            // for(int col = 0;col<row;col++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
        
    }
    static void pattern7(int n){
        for(int row=0;row<n;row++){
            if(row<5){
                for(int col=0;col<=row;col++){
                    System.out.print("* ");
                }
            }else{
                for(int col=0;col<n-row;col++){
                    System.out.print("* ");
                }
            }System.out.println();
        }
    }
    static void pattern8(int n){
        for(int row = 0;row<n;row++){
            if(row <=n/2){
                for(int col = 0;col<=n/2-row;col++){
                    System.out.print(" ");
                }
                for(int col = 0;col<2*row+1;col++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int col=0;col<=row-n/2;col++){
                    System.out.print(" ");
                }
                for(int col=0;col<=n-2*(row-n/2)-1;col++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
