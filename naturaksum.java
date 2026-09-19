import java.util.Scanner;

public class naturaksum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number");
        int num = sc.nextInt();
        System.out.println(nsum(num));
        sc.close();
    }
    public static int nsum(int a){
        int sum = 0;
        for(int i=1;i<=a;i++){
            sum+=i;
        }
    return sum;
    }
}
