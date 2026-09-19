import java.util.Scanner;
class fact{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        System.out.println(facto(num));
        in.close();
    }
    public static int facto(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * facto(n - 1);
    }
}