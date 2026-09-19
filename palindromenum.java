import java.util.Scanner;

public class palindromenum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        checkpal(num);
        
    in.close();    
    }
    public static void checkpal(int a){
        String str = String.valueOf(a);
        int len = str.length();
        boolean isPal = true;
        for(int i=0;i<=len/2;i++){
            if(!(str.charAt(i) == str.charAt(len-1-i))){
                isPal = false;
            }
        }
        if(isPal){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
