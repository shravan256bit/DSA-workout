import java.util.Scanner;

public class tripletcheck {
    public static void main(String[] args) {
        double[] trip = new double[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers in sequence");
        for(int i = 0;i<trip.length;i++){
            trip[i] = sc.nextDouble();
        }

        check(trip);
        sc.close();
    }
    public static void check(double[] trip){
        double sum1 = Math.pow(trip[0],2) + Math.pow(trip[1],2);
        double sum2 = Math.pow(trip[2],2);
        if(sum1 == sum2){
            System.out.println("Triplet is a Pythagorean triplet");
        } else {
            System.out.println("Triplet is not a Pythagorean triplet");
        }
    }
}
