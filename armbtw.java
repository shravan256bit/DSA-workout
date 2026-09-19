import java.util.ArrayList;
import java.util.Scanner;

class armbtw{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int low = in.nextInt();
        System.out.println("Enter the upper limit");
        int up = in.nextInt();
        
        System.out.println(find(low,up).toString());
        in.close();
    }
    public static ArrayList<Integer> find(int low,int up){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = low;i<up;i++){
            int temp = i;
            int rem;
            int sum = 0;
            int digits = String.valueOf(i).length();
            while(temp != 0){
                rem = temp   % 10;
                sum += Math.pow(rem,digits);
                temp/=10;
            }
            if(sum == i)
                result.add(i);
        }
        return result;
    }
}