import java.util.Scanner;

public class armsstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkarm(num);
        sc.close();
    }
    public static void checkarm(int a){
        int org = a;
        int rem;
        int sum = 0;
        int digits = String.valueOf(a).length();
        for(int i=0;i<digits;i++){
            rem = a % 10;
            sum += Math.pow(rem,digits);
            a/=10;
        }
        if(sum == org)
            System.out.println("Armstrong");
        else{
            System.out.println("Not Armstrong");
        }
    }
}
