package Patterns;

public class p1 {
    public static void main(String[] args) {
        // pattern1(5);
        pattern4(5);
    }
    static void pattern1(int n){
        for(int row =1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row = 1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print(col + " ");
            }System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row = 1;row<=2*n - 1;row++){
            if(row<=n){
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }
            }else{
                int limit = (2*n-1)-row;
                for(int col = limit;col>=1;col--){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
